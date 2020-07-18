## Part 1: Test it with SQL

Select column_name as 'Column Name', data_type as 'Data Type'
From information_schema.columns
Where table_name = 'job'; 

## Part 2: Test it with SQL

Select `name` 
From techjobs.employer
where `location` = " St.Louis City";

## Part 3: Test it with SQL

DROP TABLE `job`;

## Part 4: Test it with SQL

select `name`, `description` 
from skill
INNER JOIN job_skills
ON skill.id = job_skills.skills_id;