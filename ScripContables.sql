--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.9
-- Dumped by pg_dump version 9.4.9
-- Started on 2017-11-28 20:29:05 CST

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 174 (class 1259 OID 16404)
-- Name: cuenta; Type: TABLE; Schema: public; Owner: contador; Tablespace: 
--

CREATE TABLE cuenta (
    id_cuenta integer NOT NULL,
    nombre_cuenta character varying(45) NOT NULL,
    descripcion_cuenta character varying,
    id_cuenta_padre integer,
    tipo_cuenta character varying
);


ALTER TABLE cuenta OWNER TO contador;

--
-- TOC entry 173 (class 1259 OID 16402)
-- Name: cuenta_id_cuenta_seq; Type: SEQUENCE; Schema: public; Owner: contador
--

CREATE SEQUENCE cuenta_id_cuenta_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE cuenta_id_cuenta_seq OWNER TO contador;

--
-- TOC entry 2061 (class 0 OID 0)
-- Dependencies: 173
-- Name: cuenta_id_cuenta_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: contador
--

ALTER SEQUENCE cuenta_id_cuenta_seq OWNED BY cuenta.id_cuenta;


--
-- TOC entry 176 (class 1259 OID 16419)
-- Name: libro_diario; Type: TABLE; Schema: public; Owner: contador; Tablespace: 
--

CREATE TABLE libro_diario (
    id_libro_diario integer NOT NULL,
    total numeric(9,2),
    fecha date,
    concepto text,
    tipo_libro_diario boolean
);


ALTER TABLE libro_diario OWNER TO contador;

--
-- TOC entry 175 (class 1259 OID 16417)
-- Name: libro_diario_id_libro_diario_seq; Type: SEQUENCE; Schema: public; Owner: contador
--

CREATE SEQUENCE libro_diario_id_libro_diario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE libro_diario_id_libro_diario_seq OWNER TO contador;

--
-- TOC entry 2062 (class 0 OID 0)
-- Dependencies: 175
-- Name: libro_diario_id_libro_diario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: contador
--

ALTER SEQUENCE libro_diario_id_libro_diario_seq OWNED BY libro_diario.id_libro_diario;


--
-- TOC entry 178 (class 1259 OID 16428)
-- Name: transaccion; Type: TABLE; Schema: public; Owner: contador; Tablespace: 
--

CREATE TABLE transaccion (
    id_transaccion integer NOT NULL,
    id_libro_diario integer,
    id_cuenta integer,
    cargo numeric(9,2),
    tipo_valor boolean NOT NULL,
    abono numeric(9,2)
);


ALTER TABLE transaccion OWNER TO contador;

--
-- TOC entry 177 (class 1259 OID 16426)
-- Name: transaccion_id_transaccion_seq; Type: SEQUENCE; Schema: public; Owner: contador
--

CREATE SEQUENCE transaccion_id_transaccion_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE transaccion_id_transaccion_seq OWNER TO contador;

--
-- TOC entry 2063 (class 0 OID 0)
-- Dependencies: 177
-- Name: transaccion_id_transaccion_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: contador
--

ALTER SEQUENCE transaccion_id_transaccion_seq OWNED BY transaccion.id_transaccion;


--
-- TOC entry 1930 (class 2604 OID 16407)
-- Name: id_cuenta; Type: DEFAULT; Schema: public; Owner: contador
--

ALTER TABLE ONLY cuenta ALTER COLUMN id_cuenta SET DEFAULT nextval('cuenta_id_cuenta_seq'::regclass);


--
-- TOC entry 1931 (class 2604 OID 16422)
-- Name: id_libro_diario; Type: DEFAULT; Schema: public; Owner: contador
--

ALTER TABLE ONLY libro_diario ALTER COLUMN id_libro_diario SET DEFAULT nextval('libro_diario_id_libro_diario_seq'::regclass);


--
-- TOC entry 1932 (class 2604 OID 16431)
-- Name: id_transaccion; Type: DEFAULT; Schema: public; Owner: contador
--

ALTER TABLE ONLY transaccion ALTER COLUMN id_transaccion SET DEFAULT nextval('transaccion_id_transaccion_seq'::regclass);


--
-- TOC entry 2052 (class 0 OID 16404)
-- Dependencies: 174
-- Data for Name: cuenta; Type: TABLE DATA; Schema: public; Owner: contador
--

INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (9, 'activo no se', 'derrrrrrrrtg', 1, NULL);
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (10, 'pasivos asaber que', 'esta es otra pueba', 2, NULL);
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (13, 'dfdf', 'nelson', 1, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (12, 'modificacion', 'sdsd', 1, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (43, 'pasivos xdsd', 'prueba', 3, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (5, 'Pasivos corrientes', 'pasivos corrientes de la empresa', 2, 'Rubro');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (6, 'Pasivos no corrientes', 'descripcion de pasivos x2', 3, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (7, 'holi', 'modificacion', 1, 'Rubro');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (3, 'Activos corrientes', '""', 1, NULL);
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (8, 'activos corrientes', '""', 1, NULL);
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (45, 'activos', 'jsdkwsf', 3, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (1, 'ACTIVOS', '""', 1, NULL);
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (2, 'PASIVOS', 'Descripcion', 2, NULL);
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (11, 'prueba final', 'final', 1, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (47, 'gjh', 'ghjjkk', 2, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (4, 'Activos no corrientes', 'hola mundo', 1, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (48, 'marta', 'gordis', 1, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (49, 'wdsf', 'efdsfds', 5, 'Subcuenta');
INSERT INTO cuenta (id_cuenta, nombre_cuenta, descripcion_cuenta, id_cuenta_padre, tipo_cuenta) VALUES (50, 'hola', 'dfdsf', 1, 'Subcuenta');


--
-- TOC entry 2064 (class 0 OID 0)
-- Dependencies: 173
-- Name: cuenta_id_cuenta_seq; Type: SEQUENCE SET; Schema: public; Owner: contador
--

SELECT pg_catalog.setval('cuenta_id_cuenta_seq', 50, true);


--
-- TOC entry 2054 (class 0 OID 16419)
-- Dependencies: 176
-- Data for Name: libro_diario; Type: TABLE DATA; Schema: public; Owner: contador
--

INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (6, 23.00, NULL, '213212312', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (7, 45.00, NULL, 'sefsd', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (8, 45.00, NULL, 'sefsd', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (9, 65.00, NULL, 'fgjk', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (10, 65.00, NULL, 'fgjk', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (11, 65.00, NULL, 'fgjk', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (12, 76.00, NULL, 'ghj', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (13, 500.00, NULL, 'sdfdsf', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (14, 550.00, NULL, 'gfdsdfsd', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (15, 500.00, NULL, 'dfgfsd', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (16, 500.00, NULL, 'dfgfsd', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (17, 50.00, NULL, 'dfvdsf', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (18, 60.00, NULL, 'jhgfds', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (19, 50.00, NULL, 'gfds', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (20, 50.00, NULL, 'gfds', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (21, 50.00, NULL, 'grfds', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (22, 60.00, NULL, 'fghjk', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (23, 80.00, NULL, 'jk', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (24, 50.00, NULL, 'hgfds', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (25, 150.00, NULL, 'jkkkk', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (26, 60.00, NULL, 'k', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (27, 50.00, NULL, 'hgfds', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (28, 150.00, NULL, 'hgfds', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (29, 50.00, NULL, 'kfgkfd', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (30, 50.00, NULL, 'fgds', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (31, 50.00, NULL, 'kkkk', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (32, 50.00, NULL, 'ghjk', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (33, 12.00, NULL, 'fsdsd', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (34, 2.00, NULL, 'fgds', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (35, 50.00, NULL, 'fghjk', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (36, 25.00, NULL, 'fghjk', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (37, 33.00, NULL, 'gfdsf', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (38, 110.00, NULL, 'yfd', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (39, 50.00, NULL, 'hjkksadmsak', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (40, 60.00, NULL, 'jk', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (41, 60.00, NULL, 'jkk', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (42, 50.00, NULL, 'hgfds', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (43, 50.00, NULL, 'hgfds', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (44, 50.00, NULL, 'hgfdgsd', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (45, 50.00, NULL, 'dfghj', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (46, 60.00, '2017-11-25', 'hola mundo', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (47, 75.00, '2017-11-26', 'fgdfgdgfdg', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (48, 545.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (49, 55.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (50, 500.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (51, 500.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (52, 55.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (53, 45.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (54, 500.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (55, 10.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (56, 55.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (57, 45.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (2, 5000.00, NULL, 'Holi', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (5, 23.00, NULL, '213212312', false);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (4, 654.00, NULL, 'jhgf', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (3, 50.00, NULL, 'jkhgfd', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (1, 5000.00, NULL, 'holi', true);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (59, 10.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (60, 500.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (61, 500.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (58, 45.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (62, 10.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (63, 50.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (64, 4.00, NULL, '', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (65, 2.00, '2017-11-01', 'yt', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (66, 4.00, '2017-11-02', 'hokasa', NULL);
INSERT INTO libro_diario (id_libro_diario, total, fecha, concepto, tipo_libro_diario) VALUES (67, 50.00, '2017-11-16', 'compra de articulos de oficina', NULL);


--
-- TOC entry 2065 (class 0 OID 0)
-- Dependencies: 175
-- Name: libro_diario_id_libro_diario_seq; Type: SEQUENCE SET; Schema: public; Owner: contador
--

SELECT pg_catalog.setval('libro_diario_id_libro_diario_seq', 67, true);


--
-- TOC entry 2056 (class 0 OID 16428)
-- Dependencies: 178
-- Data for Name: transaccion; Type: TABLE DATA; Schema: public; Owner: contador
--

INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (15, 45, 43, 50.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (16, 45, 43, 0.00, false, 50.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (17, 46, 12, 60.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (18, 46, 12, 0.00, false, 60.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (19, 47, 6, 75.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (20, 47, 6, 0.00, false, 75.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (21, 48, 5, 500.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (22, 48, 12, 0.00, false, 500.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (23, 48, 49, 45.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (24, 48, 5, 0.00, false, 25.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (25, 48, 47, 0.00, false, 20.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (26, 49, 9, 55.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (27, 49, 5, 0.00, false, 25.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (28, 49, 12, 0.00, false, 30.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (29, 50, 12, 500.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (30, 50, 43, 0.00, false, 500.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (31, 51, 5, 500.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (32, 51, 12, 0.00, false, 400.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (33, 51, 5, 0.00, false, 100.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (34, 52, 12, 55.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (35, 52, 10, 0.00, false, 45.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (36, 52, 12, 0.00, false, 10.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (37, 53, 13, 45.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (38, 53, 12, 0.00, false, 35.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (39, 53, 5, 0.00, false, 10.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (40, 54, 12, 500.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (41, 54, 13, 0.00, false, 500.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (42, 55, 9, 0.00, false, 10.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (43, 55, 13, 10.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (44, 56, 10, 55.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (45, 56, 12, 0.00, false, 55.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (46, 57, 10, 45.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (47, 57, 5, 0.00, false, 45.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (48, 63, 13, 50.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (49, 63, 10, 0.00, false, 50.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (50, 64, 9, 0.00, false, 4.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (51, 64, 12, 4.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (52, 65, 13, 2.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (53, 65, 12, 0.00, false, 2.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (54, 66, 10, 4.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (55, 66, 12, 0.00, false, 4.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (56, 67, 9, 50.00, false, 0.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (57, 67, 5, 0.00, false, 35.00);
INSERT INTO transaccion (id_transaccion, id_libro_diario, id_cuenta, cargo, tipo_valor, abono) VALUES (58, 67, 12, 0.00, false, 15.00);


--
-- TOC entry 2066 (class 0 OID 0)
-- Dependencies: 177
-- Name: transaccion_id_transaccion_seq; Type: SEQUENCE SET; Schema: public; Owner: contador
--

SELECT pg_catalog.setval('transaccion_id_transaccion_seq', 58, true);


--
-- TOC entry 1934 (class 2606 OID 16437)
-- Name: cuentas_pkey; Type: CONSTRAINT; Schema: public; Owner: contador; Tablespace: 
--

ALTER TABLE ONLY cuenta
    ADD CONSTRAINT cuentas_pkey PRIMARY KEY (id_cuenta);


--
-- TOC entry 1936 (class 2606 OID 16439)
-- Name: libro_diario_pkey; Type: CONSTRAINT; Schema: public; Owner: contador; Tablespace: 
--

ALTER TABLE ONLY libro_diario
    ADD CONSTRAINT libro_diario_pkey PRIMARY KEY (id_libro_diario);


--
-- TOC entry 1938 (class 2606 OID 16441)
-- Name: transaccion_pkey; Type: CONSTRAINT; Schema: public; Owner: contador; Tablespace: 
--

ALTER TABLE ONLY transaccion
    ADD CONSTRAINT transaccion_pkey PRIMARY KEY (id_transaccion);


--
-- TOC entry 1939 (class 2606 OID 16452)
-- Name: cuenta_id_cuenta_padre_fkey; Type: FK CONSTRAINT; Schema: public; Owner: contador
--

ALTER TABLE ONLY cuenta
    ADD CONSTRAINT cuenta_id_cuenta_padre_fkey FOREIGN KEY (id_cuenta_padre) REFERENCES cuenta(id_cuenta) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 1940 (class 2606 OID 16457)
-- Name: transaccion_id_cuenta_fkey; Type: FK CONSTRAINT; Schema: public; Owner: contador
--

ALTER TABLE ONLY transaccion
    ADD CONSTRAINT transaccion_id_cuenta_fkey FOREIGN KEY (id_cuenta) REFERENCES cuenta(id_cuenta) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 1941 (class 2606 OID 16462)
-- Name: transaccion_id_libro_diario_fkey; Type: FK CONSTRAINT; Schema: public; Owner: contador
--

ALTER TABLE ONLY transaccion
    ADD CONSTRAINT transaccion_id_libro_diario_fkey FOREIGN KEY (id_libro_diario) REFERENCES libro_diario(id_libro_diario) ON UPDATE CASCADE ON DELETE CASCADE;


-- Completed on 2017-11-28 20:29:06 CST

--
-- PostgreSQL database dump complete
--

