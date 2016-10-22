create table user(
    id number(18) identity,
    login varchar2(50) not null,
    password_hash varchar2(50),

    constraint uq_login unique(login),
    constraint req_login check (login not null)
)