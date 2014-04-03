package graduation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jiangyukun
 * @since 2014-03-30 22:28
 */
@Entity
@Table(name = "GRA_PERMISSION")
public class Permission extends IdEntity {
	private String name;
	private String remark;

	@Column(name = "PERMISSION_NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "REMARK")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
