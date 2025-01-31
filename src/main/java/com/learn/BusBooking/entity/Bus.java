package com.learn.BusBooking.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {

		@Id
		@GeneratedValue
		
		private String id;
		
		@Column(nullable = false)
		private  String busName;
		
		@Column(nullable = false)
		private String source;
		
		@Column(nullable = false) 
		private String destination;
		
		private LocalDateTime departure;
		
		private LocalDateTime arrival;

}
