package org.isetn.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Matiere {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long matiereId;
	    private String matiereName;
	    private double matiereCoef;
	    private double matiereNbh;
	    
		public Matiere(String matiereName) {
			super();
			this.matiereName = matiereName;
		}
	    


}
