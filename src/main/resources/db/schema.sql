CREATE TABLE IF NOT EXISTS feedback (
                                        id BIGSERIAL PRIMARY KEY,
                                        name VARCHAR(255),
    good VARCHAR(500),
    bad VARCHAR(500),
    suggestions VARCHAR(500),
    next_trip VARCHAR(25),
    trip_when VARCHAR(50)
    );
