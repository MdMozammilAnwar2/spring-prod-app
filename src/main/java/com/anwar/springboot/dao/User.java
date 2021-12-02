/**
 * 
 */
package com.anwar.springboot.dao;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author MD MOZAMMIL ANWAR
 *
 */
@Data
@AllArgsConstructor
public class User {

		private String name;
		private Integer followers;
		private Integer following;
		private Date accountCreatedDate; 
}
