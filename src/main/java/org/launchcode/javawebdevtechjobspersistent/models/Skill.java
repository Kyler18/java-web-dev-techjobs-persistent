package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
        @Size(min = 10, max = 1000)
        private String description;

        @ManyToMany(mappedBy = "skills")
        private List<Job> job = new ArrayList<>();

        public Skill(){};

        public String getDescription() {
                return description;
        }

        public List<Job> getJob() {
                return job;
        }

        public void setJob(List<Job> job) {
                this.job = job;
        }

        public void setDescription(String description) {
                this.description = description;
        }
}