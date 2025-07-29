CREATE TABLE users (
    id UUID PRIMARY KEY,
    name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(150),
    phone VARCHAR(20),
    register_date TIMESTAMP,
    user_state_enum VARCHAR(50)
);
