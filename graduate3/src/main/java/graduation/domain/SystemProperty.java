package graduation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jiangyukun
 * @since 2014-03-30 23:54
 */
@Entity
@Table(name = "GRA_SYSTEM_PROPERTY")
public class SystemProperty extends IdEntity {
	private String key;
	private String value;

	@Column(name = "KEY")
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "VALUE")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
