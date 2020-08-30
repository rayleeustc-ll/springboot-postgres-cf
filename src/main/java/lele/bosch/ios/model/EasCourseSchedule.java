package lele.bosch.ios.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eas_course_schedule")
public class EasCourseSchedule extends Model<EasCourseSchedule> {

    private static final long serialVersionUID = 1L;

    @TableId("schedule_id")
	private Integer scheduleId;
	@TableField("school_year")
	private Integer schoolYear;
	private Integer semaster;
	@TableField("course_code")
	private String courseCode;
	@TableField("course_name")
	private String courseName;
	private String credit;
	@TableField("academy_code")
	private String academyCode;
	@TableField("academy_name")
	private String academyName;
	@TableField("classroom_code")
	private String classroomCode;
	@TableField("classroom_name")
	private String classroomName;
	private String classcode;
	private String weeks;
	private String weekly;
	private String classes;
	private String teachercode;
	private String teachername;
	@TableField("weeks_analyse")
	private String weeksAnalyse;



	public static final String SCHEDULE_ID = "schedule_id";

	public static final String SCHOOL_YEAR = "school_year";

	public static final String SEMASTER = "semaster";

	public static final String COURSE_CODE = "course_code";

	public static final String COURSE_NAME = "course_name";

	public static final String CREDIT = "credit";

	public static final String ACADEMY_CODE = "academy_code";

	public static final String ACADEMY_NAME = "academy_name";

	public static final String CLASSROOM_CODE = "classroom_code";

	public static final String CLASSROOM_NAME = "classroom_name";

	public static final String CLASSCODE = "classcode";

	public static final String WEEKS = "weeks";

	public static final String WEEKLY = "weekly";

	public static final String CLASSES = "classes";

	public static final String TEACHERCODE = "teachercode";

	public static final String TEACHERNAME = "teachername";

	public static final String WEEKS_ANALYSE = "weeks_analyse";

	@Override
	protected Serializable pkVal() {
		return this.scheduleId;
	}

}
