package mil.nga.tiff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * File Directories
 * 
 * @author osbornb
 */
public class FileDirectories {

	/**
	 * File directories
	 */
	private final List<FileDirectory> fileDirectories = new ArrayList<>();

	/**
	 * Constructor
	 */
	public FileDirectories() {

	}

	/**
	 * Constructor
	 * 
	 * @param fileDirectory
	 *            file directory
	 */
	public FileDirectories(FileDirectory fileDirectory) {
		this.fileDirectories.add(fileDirectory);
	}

	/**
	 * Constructor
	 * 
	 * @param fileDirectories
	 *            file directories
	 */
	public FileDirectories(List<FileDirectory> fileDirectories) {
		this.fileDirectories.addAll(fileDirectories);
	}

	/**
	 * Add a file directory
	 * 
	 * @param fileDirectory
	 *            file directory
	 */
	public void add(FileDirectory fileDirectory) {
		fileDirectories.add(fileDirectory);
	}

	/**
	 * Get the file directories
	 * 
	 * @return file directories
	 */
	public List<FileDirectory> getFileDirectories() {
		return Collections.unmodifiableList(fileDirectories);
	}

	/**
	 * Get the default, first, or only file directory
	 * 
	 * @return file directory
	 */
	public FileDirectory getFileDirectory() {
		return getFileDirectory(0);
	}

	/**
	 * Get the file directory at the index
	 * 
	 * @param index
	 *            index
	 * @return file directory
	 */
	public FileDirectory getFileDirectory(int index) {
		return fileDirectories.get(index);
	}

}
