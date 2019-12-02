package pers.wyj.smartteaching.model;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description  Generated by groovy script
 * @Author  wuyangjun
 * @Date 2019-11-27 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="report" )
public class ReportEntity  implements Serializable {

	private static final long serialVersionUID =  4422261818002029803L;

	/**
	 * 报告唯一ID
	 */
   	@Column(name = "id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 报告得分
	 */
   	@Column(name = "report_score" )
	private Long reportScore;

	/**
	 * 报告评价
	 */
   	@Column(name = "report_evaluation" )
	private String reportEvaluation;

	/**
	 * 报告支持的文件格式
	 */
   	@Column(name = "report_format" )
	private String reportFormat;

	/**
	 * 对应的文件ID
	 */
   	@Column(name = "file_id" )
	private Long fileId;

	/**
	 * 对应作业ID
	 */
   	@Column(name = "homework_id" )
	private Long homeworkId;

}