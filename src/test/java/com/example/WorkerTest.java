package com.example;

import org.example.Project;
import org.example.Worker;
import org.junit.jupiter.api.Test;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void testWorkerCreation() {
        Project project = new Project("Project X", 101);
        Worker worker = new Worker("John Doe", 30, 50000, true, 'M', Collections.singletonList(project));
        assertEquals("John Doe", worker.getName());
        assertEquals(30, worker.getAge());
        assertEquals(50000, worker.getSalary());
        assertTrue(worker.isFullTime());
        assertEquals('M', worker.getGender());
        assertEquals(1, worker.getProjects().size());
        assertEquals("Project X", worker.getProjects().get(0).getProjectName());
    }
}
