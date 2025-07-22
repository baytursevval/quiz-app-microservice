INSERT INTO question (question_title, option1, option2, option3, option4, right_answer, difficultylevel, category) VALUES
-- Java Soruları
('Which keyword is used to create a subclass in Java?', 'super', 'extends', 'implements', 'final', 'extends', 'easy', 'java'),
('What is the output of: int x = 5; System.out.println(x++);', '6', '4', '5', 'Compilation error', '5', 'medium', 'java'),
('Which design pattern is used by Spring''s ApplicationContext?', 'Singleton', 'Factory', 'Observer', 'Builder', 'Factory', 'hard', 'java'),
('What is the default value of a boolean variable in Java?', 'true', 'false', 'null', '0', 'false', 'easy', 'java'),
('What is the size of an int in Java?', '8 bits', '16 bits', '32 bits', '64 bits', '32 bits', 'medium', 'java'),

-- Python Soruları
('Which keyword is used to define a function in Python?', 'func', 'define', 'function', 'def', 'def', 'easy', 'python'),
('What is the output of: print(type([]))?', '<class ''list''>', '<list>', '<class ''array''>', '<type ''list''>', '<class ''list''>', 'medium', 'python'),
('Which data type is immutable in Python?', 'list', 'set', 'dictionary', 'tuple', 'tuple', 'medium', 'python'),
('Which of the following about Python GIL is true?', 'Allows true parallelism', 'Prevents multiple processes', 'One thread at a time', 'Improves performance', 'One thread at a time', 'hard', 'python'),
('What does the // operator do in Python?', 'Normal division', 'Floor division', 'Modulus', 'Exponentiation', 'Floor division', 'easy', 'python');