package com.cts.pension.disbursement.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ProcessPensionResponse {
	private int processPensionStatusCode;

	@Override
	public String toString() {
		return "ProcessPensionResponse [processPensionStatusCode=" + processPensionStatusCode + "]";
	}

	public ProcessPensionResponse(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}

	public ProcessPensionResponse() {
		
	}

	public int getProcessPensionStatusCode() {
		return processPensionStatusCode;
	}

	public void setProcessPensionStatusCode(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}
	
	
	
	
}