-- ADMIN (Top Level)
INSERT INTO users (username, email, phone, password, first_name, last_name, role, status, manager_id, created_at, updated_at)
VALUES
('adminuser', 'admin@crm.com', '9990001111', 'admin123', 'Ravi', 'Sharma', 'ADMIN', 'ACTIVE', NULL, NOW(), NOW());

-- Manager 1
INSERT INTO users (username, email, phone, password, first_name, last_name, role, status, manager_id, created_at, updated_at)
VALUES
('manager_anuj', 'anuj@crm.com', '9990002222', 'manager123', 'Anuj', 'Singh', 'USER', 'ACTIVE', 1, NOW(), NOW());

-- Manager 2
INSERT INTO users (username, email, phone, password, first_name, last_name, role, status, manager_id, created_at, updated_at)
VALUES
('manager_sonal', 'sonal@crm.com', '9990003333', 'manager123', 'Sonal', 'Verma', 'USER', 'ACTIVE', 1, NOW(), NOW());

-- Employees under Manager 1
INSERT INTO users (username, email, phone, password, first_name, last_name, role, status, manager_id, created_at, updated_at)
VALUES
('emp_rahul', 'rahul@crm.com', '9990004444', 'emp123', 'Rahul', 'Yadav', 'USER', 'ACTIVE', 2, NOW(), NOW()),
('emp_kavya', 'kavya@crm.com', '9990005555', 'emp123', 'Kavya', 'Gupta', 'USER', 'ACTIVE', 2, NOW(), NOW());

-- Employees under Manager 2
INSERT INTO users (username, email, phone, password, first_name, last_name, role, status, manager_id, created_at, updated_at)
VALUES
('emp_vivek', 'vivek@crm.com', '9990006666', 'emp123', 'Vivek', 'Mehta', 'USER', 'ACTIVE', 3, NOW(), NOW()),
('emp_neha', 'neha@crm.com', '9990007777', 'emp123', 'Neha', 'Kapoor', 'USER', 'ACTIVE', 3, NOW(), NOW());







-- Insert CLIENT COMPANY records

INSERT into client_company (company_name, company_address, description, email, phone, status, created_at, updated_at)
VALUES
('Copper wale pvt ltd', 'rohini market, bada bazar, kolkata, west-bengal', 'Specializes in exporting copper products', 'ceo@copperwale.com', '9990004444', 'ACTIVE', NOW(), NOW()),
('Sona chandi pvt ltd', 'chorapunji market, GP,  New Delhi', 'Specializes in exporting silver and gold', 'ceo@sonachandi.com', '9990004444', 'CLOSED', NOW(), NOW()),
('ABD pvt ltd', 'raja chawk, jaipur, Rajasthan', 'Cricket products', 'cric@abd.com', '9990004444', 'ACTIVE', NOW(), NOW()),
('Pipes pvt ltd', 'pune, Maharashtra', 'Specializes in exporting plumbing products', 'ceo@plumber.com', '9990004444', 'BLACK_LISTED', NOW(), NOW());




-- Insert CLIENT records
INSERT INTO client (full_name, email, phone, status, source, description, assigned_to_user, client_company, created_at, updated_at)
VALUES
('Rohan Verma', 'rohan.verma@a.com', '9876543210', 'NEW', 'WEBSITE', 'Interested in CRM demo', 1, 1, NOW(), NOW()),
('Priya Sharma', 'priya.sharma@b.com', '9988776655', 'ACTIVE', 'REFERRAL', 'Requested pricing details', 2, 1, NOW(), NOW()),
('Amit Singh', 'amit.singh@c.com', '9123456789', 'CLOSED', 'LINKEDIN', 'Closed the deal successfully', 1, 2, NOW(), NOW()),
('Sneha Kapoor', 'sneha.kapoor@a.com', '9001234567', 'NEW', 'SOCIAL_MEDIA', 'Asked about onboarding process', 3, 3, NOW(), NOW()),
('Rahul Mehta', 'rahul.mehta@d.com', '9090909090', 'LOST', 'COLD_CALL', 'Not interested at the moment', 2, 4, NOW(), NOW());
