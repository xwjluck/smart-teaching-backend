package pers.wyj.smartteaching.model;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

/**
 * @Description  Generated by groovy script
 * @Author  wuyangjun
 * @Date 2019-11-27 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="class_student" )
public class ClassStudentEntity  implements Serializable {

	private static final long serialVersionUID =  2218262469036497324L;

	/**
	 * 班级中学生唯一ID
	 */
   	@Column(name = "id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 班级ID
	 */
   	@Column(name = "class_id" )
	private Long classId;

	/**
	 * 学生ID
	 */
   	@Column(name = "student_id" )
	private Long studentId;

	/**
	 * 加入时间
	 */
   	@Column(name = "join_time" )
	private Date joinTime;

}
