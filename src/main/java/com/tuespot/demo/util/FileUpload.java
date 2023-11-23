package com.tuespot.demo.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.DatatypeConverter;

import com.tuespot.demo.customException.InvalidFileFormatException;

public class FileUpload {
	public static String uploadFile(String file, String fileUploadUrl) throws InvalidFileFormatException {

		 

		String fileName = null;

 

		String[] strings = file.split(",");

		System.err.println(strings.toString());

		String extension;

		switch (strings[0]) {// check image's extension

		case "data:image/jpeg;base64":

			extension = "jpeg";

			break;

		case "data:image/png;base64":

			extension = "png";

			break;

		case "data:image/jpg;base64":

			extension = "jpg";

			break;

		default:// should write cases for more images types

			extension = "invalid";

			break;

		}

 

		/**

		 * check file format

		 */

		if (extension.equalsIgnoreCase("jpeg") || extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {

			// convert base64 string to binary data

 

			byte[] data = DatatypeConverter.parseBase64Binary(strings[1]);

			String modifyFile = "studentProfile" + System.currentTimeMillis() + "." + extension;

			// String upload_dir_file = env.getProperty("file.local.path");

			String path = fileUploadUrl + modifyFile;

			fileName = modifyFile;

//			studentDetailEntity.setUploadPhoto(modifyFile);

			File file1 = new File(path);

			try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file1))) {

				outputStream.write(data);

			} catch (Exception e) {

				e.printStackTrace();

			}

		} else {

			throw new InvalidFileFormatException("Only jpg, jpeg and png extensions are valid");

		}

 

		return fileName;

 

	}

	

	

	

	// images upload method

		public static String uploadFileWithoutOtpCompany(String file, String fileUploadUrl) throws InvalidFileFormatException {

 

			String fileName = null;

 

			String[] strings = file.split(",");

			String extension;

			

			System.err.println(strings[0].toString());

			

			switch (strings[0]) {// check image's extension

			case "data:image/jpeg;base64":

				extension = "jpeg";

				break;

			case "data:image/png;base64":

				extension = "png";

				break;

			case "data:image/jpg;base64":

				extension = "jpg";

				break;

			default:// should write cases for more images types

				extension = "invalid";

				break;

			}

 

			/**

			 * check file format

			 */

			if (extension.equalsIgnoreCase("jpeg") || extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {

				// convert base64 string to binary data

 

				byte[] data = DatatypeConverter.parseBase64Binary(strings[1]);

				String modifyFile = "studentProfile" + System.currentTimeMillis() + "." + extension;

				// String upload_dir_file = env.getProperty("file.local.path");

				String path = fileUploadUrl + modifyFile;

				fileName = modifyFile;

//				studentDetailEntity.setUploadPhoto(modifyFile);

				File file1 = new File(path);

				try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file1))) {

					outputStream.write(data);

				} catch (Exception e) {

					e.printStackTrace();

				}

			} else {

				throw new InvalidFileFormatException("Only jpg, jpeg and png extensions are valid");

			}

 

			return fileName;

 

		}

 

	

	

	// Resume upload method

	public static String uploadResume(String file, String fileUploadUrl) throws InvalidFileFormatException {

 

		String fileName = null;

 

		String[] strings = file.split(",");

		String extension;

		switch (strings[0]) {// check image's extension

		case "data:application/pdf;base64":

			extension = "pdf";

			break;

		case "data:application/vnd.openxmlformats-officedocument.wordprocessingml.document;base64":

			extension = "docx";

			break;

			

		default:// should write cases for more images types

			extension = "invalid";

			break;

		}

 

		/**

		 * check file format

		 */

		if (extension.equalsIgnoreCase("pdf") || extension.equalsIgnoreCase("docx")) {

			// convert base64 string to binary data

 

			byte[] data = DatatypeConverter.parseBase64Binary(strings[1]);

			String modifyFile = "studentProfile" + System.currentTimeMillis() + "." + extension;

			// String upload_dir_file = env.getProperty("file.local.path");

			String path = fileUploadUrl + modifyFile;

			fileName = modifyFile;

//			studentDetailEntity.setUploadPhoto(modifyFile);

			File file1 = new File(path);

			try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file1))) {

				outputStream.write(data);

			} catch (Exception e) {

				e.printStackTrace();

			}

		} else {

			throw new InvalidFileFormatException("Only pdf and docx extensions are valid");

		}

 

		return fileName;

 

	}

}
