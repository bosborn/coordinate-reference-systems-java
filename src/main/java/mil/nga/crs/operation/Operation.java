package mil.nga.crs.operation;

import mil.nga.crs.CRSType;
import mil.nga.crs.CommonCRS;
import mil.nga.crs.CoordinateReferenceSystem;

/**
 * Common Operation
 * 
 * @author osbornb
 */
public abstract class Operation extends CommonCRS {

	/**
	 * Operation Version
	 */
	private String version = null;

	/**
	 * Source Coordinate Reference System
	 */
	private CoordinateReferenceSystem source = null;

	/**
	 * Coordinate operation accuracy
	 */
	private Double accuracy;

	/**
	 * Coordinate operation accuracy Text
	 */
	private String accuracyText;

	/**
	 * Constructor
	 * 
	 * @param type
	 *            crs operation type
	 */
	public Operation(CRSType type) {
		super(type);
	}

	/**
	 * Constructor
	 * 
	 * @param name
	 *            name
	 * @param type
	 *            crs operation type
	 * @param source
	 *            source crs
	 */
	public Operation(String name, CRSType type,
			CoordinateReferenceSystem source) {
		super(name, type);
		setSource(source);
	}

	/**
	 * Get the operation version
	 * 
	 * @return operation version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Has an operation version
	 * 
	 * @return true if has operation version
	 */
	public boolean hasVersion() {
		return getVersion() != null;
	}

	/**
	 * Set the operation version
	 * 
	 * @param version
	 *            operation version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Get the source coordinate reference system
	 * 
	 * @return source crs
	 */
	public CoordinateReferenceSystem getSource() {
		return source;
	}

	/**
	 * Set the source coordinate reference system
	 * 
	 * @param source
	 *            source crs
	 */
	public void setSource(CoordinateReferenceSystem source) {
		this.source = source;
	}

	/**
	 * Get the coordinate operation accuracy
	 * 
	 * @return coordinate operation accuracy
	 */
	public Double getAccuracy() {
		return accuracy;
	}

	/**
	 * Get the coordinate operation accuracy text
	 * 
	 * @return coordinate operation accuracy text
	 * @since 1.1.0
	 */
	public String getAccuracyText() {
		return accuracyText;
	}

	/**
	 * Has a coordinate operation accuracy
	 * 
	 * @return true if has coordinate operation accuracy
	 */
	public boolean hasAccuracy() {
		return getAccuracy() != null;
	}

	/**
	 * Set the coordinate operation accuracy
	 * 
	 * @param accuracy
	 *            coordinate operation accuracy
	 */
	public void setAccuracy(Double accuracy) {
		this.accuracy = accuracy;
		this.accuracyText = accuracy != null ? String.valueOf(accuracy) : null;
	}

	/**
	 * Set the coordinate operation accuracy
	 * 
	 * @param accuracy
	 *            coordinate operation accuracy
	 * @since 1.1.0
	 */
	public void setAccuracy(String accuracy) {
		this.accuracyText = accuracy;
		this.accuracy = accuracy != null ? Double.parseDouble(accuracy) : null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((accuracy == null) ? 0 : accuracy.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operation other = (Operation) obj;
		if (accuracy == null) {
			if (other.accuracy != null)
				return false;
		} else if (!accuracy.equals(other.accuracy))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

}
