package pers.wyj.smartteaching.model;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pers.wyj.smartteaching.common.FileType;

import java.util.Date;

/**
 * @Description  Generated by groovy script
 * @Author  wuyangjun
 * @Date 2019-11-28 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="file" )
public class FileEntity  implements Serializable {

	private static final long serialVersionUID =  7663907785313501672L;

	/**
	 * 文件唯一ID
	 */
   	@Column(name = "id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 文件名
	 */
   	@Column(name = "file_name" )
	private String fileName;

	/**
	 * 文件扩展名
	 */
   	@Column(name = "file_extend_name" )
	private String fileExtendName;

	/**
	 * 文件状态
	 */
   	@Column(name = "file_status" )
	private Long fileStatus;

	/**
	 * 文件上传者ID
	 */
   	@Column(name = "author_id" )
	private Long authorId;

	/**
	 * 文件保存路径
	 */
   	@Column(name = "file_save_path" )
	private String fileSavePath;

	/**
	 * 文件标签
	 */
   	@Column(name = "file_tags" )
	private String fileTags;

	/**
	 * 文件下载次数
	 */
   	@Column(name = "file_download_times" )
	private Long fileDownloadTimes;

	/**
	 * 文件失效时间
	 */
   	@Column(name = "file_timeout" )
	private Date fileTimeout;

	/**
	 * 文件类型（0：资源，1：作业，2：报告）
	 */
   	@Column(name = "file_type" )
	@Enumerated(value = EnumType.ORDINAL)
	private FileType fileType;

	/**
	 * 文件上传时间
	 */
	@Column(name = "file_upload_time")
	private Date fileUploadTime;
}
