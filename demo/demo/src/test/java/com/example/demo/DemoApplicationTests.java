package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Mock SubmissionService submissionService;
	@Mock SubmissionForm submissionForm;
	@Test
	void contextLoads() {
	}

	@Test
	public void testpostSubmission(){

		Mockito.when(submissionService.postSubmission(submissionForm)).thenReturn(submissionForm);
	}

	@Test
	public void testgetSubmissionFormById(){

		Mockito.when(submissionService.getSubmissionFormById("1")).thenReturn(submissionForm);
	}

	@Test
	public void testgetAllSubmissions(){
		List<SubmissionForm> submissionFormList = new ArrayList<>();
		Mockito.when(submissionService.getallSubmissions()).thenReturn(submissionFormList);
	}

	@Test
	public void testEditSubmission(){

		Mockito.when(submissionService.editSubmission(submissionForm)).thenReturn(submissionForm);
	}
	@Test
	public void testdeleteSubmission(){

		List<SubmissionForm> submissionFormList = new ArrayList<>();
		Mockito.when(submissionService.deleteSubmission("2")).thenReturn(submissionFormList);
	}
}
