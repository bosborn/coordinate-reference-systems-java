package mil.nga.crs.engineering;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import mil.nga.crs.CRSType;
import mil.nga.crs.common.ReferenceFrame;
import mil.nga.crs.wkt.CRSWriter;

/**
 * Engineering Datum
 * 
 * @author osbornb
 */
public class EngineeringDatum extends ReferenceFrame {

	/**
	 * Logger
	 */
	private static final Logger logger = Logger
			.getLogger(EngineeringDatum.class.getName());

	/**
	 * Constructor
	 */
	public EngineeringDatum() {
		super(CRSType.ENGINEERING);
	}

	/**
	 * Constructor
	 * 
	 * @param name
	 *            name
	 */
	public EngineeringDatum(String name) {
		super(name, CRSType.ENGINEERING);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return super.hashCode();
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
			logger.log(Level.WARNING,
					"Failed to write engineering datum as a string", e);
			value = super.toString();
		} finally {
			writer.close();
		}
		return value;
	}

}