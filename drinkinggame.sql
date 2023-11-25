CREATE TABLE felhasznalok (
    user_id INT PRIMARY KEY,
    nev VARCHAR(255) NOT NULL,
    felelsz_teljesites INT DEFAULT 0,
    mersz_teljesites INT DEFAULT 0,
    ivott INT DEFAULT 0
);

CREATE TABLE kerdesek (
    kerdes_id INT PRIMARY KEY AUTO_INCREMENT,
    kerdes_text TEXT NOT NULL,
    kerdes_tipus VARCHAR(10) NOT NULL
);

INSERT INTO kerdesek (kerdes_text, kerdes_tipus) VALUES
    ('Mi a legőszintébb véleményed a barátod új frizurájáról?', 'felelsz'),
    ('Mondj el egy olyan személyes élményt, amit még senkinek sem mondtál el.', 'felelsz'),
    ('Ha lenne egy napod, amikor bármit megtehetsz a következmények nélkül, mit csinálnál?', 'felelsz'),
    ('Kivel cserélnéd el az életed egy napra, és miért?', 'felelsz'),
    ('Ha meghívhatnál egy híres embert egy vacsorára, ki lenne az, és miért választanád őt?', 'felelsz'),
    ('Mi az a dolog, amit a leginkább megbántál az életedben?', 'felelsz'),
    ('Mi a legviccesebb dolog, amit valaha is láttál vagy tapasztaltál?', 'felelsz'),
    ('Mondj el valamit magadról, amit a legtöbben nem tudnak rólad.', 'felelsz'),
    ('Ha lehetne egy tulajdonságot eldobni, mi lenne az, és miért?', 'felelsz'),
    ('Mitől félsz a legjobban az életedben?', 'felelsz'),
    ('Ha a jövődből láthatnál egy rövid részletet, mit szeretnél látni?', 'felelsz'),
    ('Ha egy napig állat lehetnél, milyen állat lennél, és miért?', 'felelsz'),
    ('Melyik szuperképességet választanád: láthatatlanság vagy időutazás?', 'felelsz'),
    ('Milyen szokásodat próbáltad már megváltoztatni, de nem sikerült?', 'felelsz'),
    ('Milyen titkos képességgel rendelkezel, amit senki sem tud rólad?', 'felelsz'),
    ('Hívj fel egy barátodat, és mondj neki valami vicceset úgy, mintha más lennél.', 'mersz'),
	('Utánozd el egy másik játékos táncstílusát egy percig.', 'mersz'),
	('Mondj el egy vicces anekdotát a csoport előtt, és próbálj meg mindenkit nevetésre késztetni.', 'mersz'),
	('Húzz egy vicces arcot, és készíts egy szelfit róla.', 'mersz'),
	('Táncolj egy olyan zenére, amit a csoport választ.', 'mersz'),
	('Beszélj egy idegen nyelven, amit senki sem ért a csoportban.', 'mersz'),
	('Próbálj meg egy pohár vizet vagy italt felhajtani fejjel lefelé.', 'mersz'),
	('Ismételd el egy másik játékos mondanivalóját egy tréfás hangon.', 'mersz'),
	('Utánozd el egy másik játékos hangját és beszédstílusát.', 'mersz'),
	('Vegyél fel egy vicces táncot, és mutasd be a csoportnak.', 'mersz'),
	('Kérj meg egy véletlenszerű embert, hogy táncoljon veled egy kicsit.', 'mersz'),
	('Énekelj egy kedvenc dalt a csoport előtt a legszenvedélyesebben, ahogyan csak tudsz.', 'mersz'),
	('Próbálj meg egy vicces arcot vágni, és tartsd azt egy percig.', 'mersz'),
	('Táncolj egy olyan stílusban, amit a csoport kiválaszt.', 'mersz'),
	('Mutass be egy abszurd színjátékot egy rövid jelenettel.', 'mersz');
    