package mil.nga.crs.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import mil.nga.crs.wkt.CRSWriter;

/**
 * Axis
 * 
 * @author osbornb
 */
public class Axis implements Identifiable {

	/**
	 * Logger
	 */
	private static final Logger logger = Logger.getLogger(Axis.class.getName());

	/**
	 * Name
	 */
	private String name = null;

	/**
	 * Abbreviation
	 */
	private String abbreviation = null;

	/**
	 * Axis Direction
	 */
	private AxisDirectionType direction = null;

	/**
	 * Meridian
	 */
	private Double meridian = null;

	/**
	 * Meridian Text
	 */
	private String meridianText = null;

	/**
	 * Meridian (Angle) Unit
	 */
	private Unit meridianUnit = null;

	/**
	 * Bearing
	 */
	private Double bearing = null;

	/**
	 * Bearing Text
	 */
	private String bearingText = null;

	/**
	 * Order
	 */
	private Integer order = null;

	/**
	 * Unit
	 */
	private Unit unit = null;

	/**
	 * Identifiers
	 */
	private List<Identifier> identifiers = null;

	/**
	 * Constructor
	 */
	public Axis() {

	}

	/**
	 * Constructor
	 * 
	 * @param name
	 *            name
	 * @param direction
	 *            axis direction
	 */
	public Axis(String name, AxisDirectionType direction) {
		setName(name);
		setDirection(direction);
	}

	/**
	 * Get the name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Has a name
	 * 
	 * @return true if has name
	 */
	public boolean hasName() {
		return getName() != null;
	}

	/**
	 * Set the name
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the abbreviation
	 * 
	 * @return abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * Has an abbreviation
	 * 
	 * @return true if has abbreviation
	 */
	public boolean hasAbbreviation() {
		return getAbbreviation() != null;
	}

	/**
	 * Set the abbreviation
	 * 
	 * @param abbreviation
	 *            abbreviation
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/**
	 * Get the direction
	 * 
	 * @return direction type
	 */
	public AxisDirectionType getDirection() {
		return direction;
	}

	/**
	 * Set the direction
	 * 
	 * @param direction
	 *            direction type
	 */
	public void setDirection(AxisDirectionType direction) {
		this.direction = direction;
	}

	/**
	 * Get the meridian
	 * 
	 * @return meridian
	 */
	public Double getMeridian() {
		return meridian;
	}

	/**
	 * Get the meridian text
	 * 
	 * @return meridian text
	 */
	public String getMeridianText() {
		return meridianText;
	}

	/**
	 * Has a meridian
	 * 
	 * @return true if has meridian
	 */
	public boolean hasMeridian() {
		return getMeridian() != null;
	}

	/**
	 * Set the meridian
	 * 
	 * @param meridian
	 *            meridian
	 */
	public void setMeridian(Double meridian) {
		this.meridian = meridian;
		this.meridianText = meridian != null ? String.valueOf(meridian) : null;
	}

	/**
	 * Set the meridian
	 * 
	 * @param meridian
	 *            meridian
	 */
	public void setMeridian(String meridian) {
		this.meridianText = meridian;
		this.meridian = meridian != null ? Double.parseDouble(meridian) : null;
	}

	/**
	 * Get the meridian (angle) unit
	 * 
	 * @return meridian (angle) unit
	 */
	public Unit getMeridianUnit() {
		return meridianUnit;
	}

	/**
	 * Set the meridian (angle) unit
	 * 
	 * @param meridianUnit
	 *            meridian (angle) unit
	 */
	public void setMeridianUnit(Unit meridianUnit) {
		this.meridianUnit = meridianUnit;
	}

	/**
	 * Get the bearing
	 * 
	 * @return bearing
	 */
	public Double getBearing() {
		return bearing;
	}

	/**
	 * Get the bearing text
	 * 
	 * @return bearing text
	 */
	public String getBearingText() {
		return bearingText;
	}

	/**
	 * Has a bearing
	 * 
	 * @return true if has bearing
	 */
	public boolean hasBearing() {
		return getBearing() != null;
	}

	/**
	 * Set the bearing
	 * 
	 * @param bearing
	 *            bearing
	 */
	public void setBearing(Double bearing) {
		this.bearing = bearing;
		this.bearingText = bearing != null ? String.valueOf(bearing) : null;
	}

	/**
	 * Set the bearing
	 * 
	 * @param bearing
	 *            bearing text
	 */
	public void setBearing(String bearing) {
		this.bearingText = bearing;
		this.bearing = bearing != null ? Double.parseDouble(bearing) : null;
	}

	/**
	 * Get the order
	 * 
	 * @return order
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * Has an order
	 * 
	 * @return true if has order
	 */
	public boolean hasOrder() {
		return getOrder() != null;
	}

	/**
	 * Set the order
	 * 
	 * @param order
	 *            order
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * Get the unit
	 * 
	 * @return unit
	 */
	public Unit getUnit() {
		return unit;
	}

	/**
	 * Has a unit
	 * 
	 * @return true if has unit
	 */
	public boolean hasUnit() {
		return getUnit() != null;
	}

	/**
	 * Set the unit
	 * 
	 * @param unit
	 *            unit
	 */
	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Identifier> getIdentifiers() {
		return identifiers;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean hasIdentifiers() {
		return identifiers != null && !identifiers.isEmpty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int numIdentifiers() {
		return identifiers != null ? identifiers.size() : 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identifier getIdentifier(int index) {
		return identifiers.get(index);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addIdentifier(Identifier identifier) {
		if (this.identifiers == null) {
			this.identifiers = new ArrayList<>();
		}
		this.identifiers.add(identifier);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addIdentifiers(List<Identifier> identifiers) {
		if (this.identifiers == null) {
			this.identifiers = new ArrayList<>();
		}
		this.identifiers.addAll(identifiers);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abbreviation == null) ? 0 : abbreviation.hashCode());
		result = prime * result + ((bearing == null) ? 0 : bearing.hashCode());
		result = prime * result
				+ ((direction == null) ? 0 : direction.hashCode());
		result = prime * result
				+ ((identifiers == null) ? 0 : identifiers.hashCode());
		result = prime * result
				+ ((meridian == null) ? 0 : meridian.hashCode());
		result = prime * result
				+ ((meridianUnit == null) ? 0 : meridianUnit.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Axis other = (Axis) obj;
		if (abbreviation == null) {
			if (other.abbreviation != null)
				return false;
		} else if (!abbreviation.equals(other.abbreviation))
			return false;
		if (bearing == null) {
			if (other.bearing != null)
				return false;
		} else if (!bearing.equals(other.bearing))
			return false;
		if (direction != other.direction)
			return false;
		if (identifiers == null) {
			if (other.identifiers != null)
				return false;
		} else if (!identifiers.equals(other.identifiers))
			return false;
		if (meridian == null) {
			if (other.meridian != null)
				return false;
		} else if (!meridian.equals(other.meridian))
			return false;
		if (meridianUnit == null) {
			if (other.meridianUnit != null)
				return false;
		} else if (!meridianUnit.equals(other.meridianUnit))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		String value = null;
		CRSWriter writer = new CRSWriter();
		try {
			writer.write(this);
			value = writer.toString();
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write axis as a string", e);
			value = super.toString();
		} finally {
			writer.close();
		}
		return value;
	}

}
