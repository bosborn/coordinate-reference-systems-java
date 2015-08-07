package mil.nga.geopackage.extension;

import mil.nga.geopackage.GeoPackageConstants;
import mil.nga.geopackage.GeoPackageException;
import mil.nga.wkb.geom.GeometryType;

/**
 * Geometry Extensions utility methods and constants
 * 
 * @author osbornb
 */
public class GeometryExtensions {

	/**
	 * Determine if the geometry type is an extension
	 * 
	 * @param geometryType
	 * @return
	 */
	public static boolean isExtension(GeometryType geometryType) {
		return geometryType.getCode() > GeometryType.GEOMETRYCOLLECTION
				.getCode();
	}

	/**
	 * Determine if the geometry type is a GeoPackage extension
	 * 
	 * @param geometryType
	 * @return true if a GeoPackage extension, false if user-defined
	 */
	public static boolean isGeoPackageExtension(GeometryType geometryType) {
		return geometryType.getCode() >= GeometryType.CIRCULARSTRING.getCode()
				&& geometryType.getCode() <= GeometryType.SURFACE.getCode();
	}

	/**
	 * Get the extension name of a GeoPackage extension Geometry
	 * 
	 * @param geometryType
	 * @return
	 */
	public static String getExtensionName(GeometryType geometryType) {

		if (!isExtension(geometryType)) {
			throw new GeoPackageException(GeometryType.class.getSimpleName()
					+ " is not an extension: " + geometryType.getName());
		}

		if (!isGeoPackageExtension(geometryType)) {
			throw new GeoPackageException(
					GeometryType.class.getSimpleName()
							+ " is not a GeoPackage extension, User-Defined requires an author: "
							+ geometryType.getName());
		}

		String extensionName = GeoPackageConstants.GEO_PACKAGE_EXTENSION_AUTHOR
				+ Extensions.EXTENSION_NAME_DIVIDER
				+ GeoPackageConstants.GEOMETRY_EXTENSION_PREFIX
				+ Extensions.EXTENSION_NAME_DIVIDER + geometryType.getName();

		return extensionName;
	}

	/**
	 * Get the extension name of a extension Geometry, either user-defined or
	 * GeoPackage extension
	 * 
	 * @param author
	 * @param geometryType
	 * @return
	 */
	public static String getExtensionName(String author,
			GeometryType geometryType) {

		if (!isExtension(geometryType)) {
			throw new GeoPackageException(GeometryType.class.getSimpleName()
					+ " is not an extension: " + geometryType.getName());
		}

		String extensionName = (isGeoPackageExtension(geometryType) ? GeoPackageConstants.GEO_PACKAGE_EXTENSION_AUTHOR
				: author)
				+ Extensions.EXTENSION_NAME_DIVIDER
				+ GeoPackageConstants.GEOMETRY_EXTENSION_PREFIX
				+ Extensions.EXTENSION_NAME_DIVIDER + geometryType.getName();

		return extensionName;
	}

}
