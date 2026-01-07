# Coffee-Machine-Simulator-with-Java-V-1.0

![Java](https://img.shields.io/badge/Java-17+-orange)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue)
![Status](https://img.shields.io/badge/Project-Educational-success)

---

## 📖 Overview
**Coffee Machine Simulator** è un progetto console sviluppato in **Java** che simula il comportamento di una macchina del caffè reale.

Il programma consente all’utente di interagire con la macchina tramite comandi testuali, gestendo risorse limitate, controllo dello stato e vincoli operativi come la **necessità di pulizia dopo un certo numero di utilizzi**.

Il progetto è stato realizzato con l’obiettivo di applicare i principi fondamentali della **programmazione orientata agli oggetti (OOP)**.

---

## 👤 Author
**Vincenzo Cavallaro**  
*Studente di Ingegneria Informatica*

---

## 🎯 Objectives
- Applicare i concetti base della programmazione OOP
- Gestire correttamente lo stato di un sistema
- Separare la logica di controllo dalla logica applicativa
- Simulare un sistema reale con vincoli e condizioni

---

## 🕹️ Available Actions

| Command     | Description |
|------------|-------------|
| `buy`       | Acquista un caffè |
| `fill`      | Ricarica le risorse della macchina |
| `take`      | Preleva il denaro |
| `remaining` | Mostra lo stato attuale |
| `clean`     | Pulisce la macchina |
| `exit`      | Termina il programma |

---

## ☕ Coffee Types

| Coffee       | Water (ml) | Milk (ml) | Beans (g) | Price ($) |
|--------------|------------|-----------|-----------|-----------|
| Espresso     | 250        | 0         | 16        | 4         |
| Latte        | 350        | 75        | 20        | 7         |
| Cappuccino   | 200        | 100       | 12        | 6         |

---

## 🚨 Resource Management
Prima di preparare un caffè, la macchina verifica la disponibilità di **tutte le risorse necessarie**.

Se anche **una sola risorsa** non è sufficiente, la preparazione viene annullata e viene mostrato un messaggio di errore esplicativo, ad esempio:

Sorry, not enough water!

yaml
Copia codice

Le risorse **non vengono modificate** in caso di errore.

---

## 🧼 Cleaning System
- Ogni caffè preparato incrementa un contatore interno
- Dopo **10 caffè**, la macchina **richiede pulizia**
- Finché non viene eseguito il comando `clean`, non è possibile acquistare altri caffè
- Dopo la pulizia, la macchina torna completamente operativa

Messaggio visualizzato:
I need cleaning!


---

## 🧱 Project Structure

machine/
├── CoffeeMachine.java
│ └── Gestisce input utente e flusso principale
└── Machine.java
└── Gestisce stato e logica della macchina


### CoffeeMachine
- Contiene il `main`
- Gestisce il menu e le azioni dell’utente
- Delega la logica all’oggetto `Machine`

### Machine
- Incapsula lo stato della macchina
- Espone metodi dedicati:
  - `buy()`
  - `fill()`
  - `take()`
  - `remaining()`
  - `clean()`

---

## 🧠 Concepts Applied
- Object-Oriented Programming
- Encapsulation
- State management
- Input validation
- Separation of concerns

---

## ▶️ How to Run

```bash
javac machine/CoffeeMachine.java
java machine.CoffeeMachine
🚀 Possible Extensions
Aggiunta di nuovi tipi di caffè

Interfaccia grafica (JavaFX / Swing)

Persistenza dello stato su file

Test automatici

📌 Notes
Questo progetto è pensato come esercizio didattico ma riflette problemi reali di progettazione software, come la gestione dello stato e dei vincoli operativi.
