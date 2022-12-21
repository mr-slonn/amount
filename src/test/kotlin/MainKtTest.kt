import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getCommissionVisaMin() {

        val amount: Int = 100;
        val typeCard: String = "Visa";
        val resul = getCommission(
            typeCard,
            sum = amount
        );
        assertEquals(35, resul);
    }

    @Test
    fun getCommissionMirMin() {

        val amount: Int = 100;
        val typeCard: String = "Мир";
        val resul = getCommission(
            typeCard,
            sum = amount
        );
        assertEquals(35, resul);
    }

    @Test
    fun getCommissionVisa() {

        val amount: Int = 8000;
        val typeCard: String = "Visa";
        val resul = getCommission(
            typeCard,
            sum = amount
        );
        assertEquals(60, resul);
    }

    @Test
    fun getCommissionMir() {

        val amount: Int = 8000;
        val typeCard: String = "Мир";
        val resul = getCommission(
            typeCard,
            sum = amount
        );
        assertEquals(60, resul);
    }

    @Test
    fun getCommissionVKPay() {

        val amount: Int = 8000;
        val typeCard: String = "VK Pay";
        val resul = getCommission(
            typeCard,
            sum = amount
        );
        assertEquals(0, resul);
    }

    @Test
    fun getCommissionMastercardZero() {

        val amount: Int = 8000;
        val typeCard: String = "Mastercard";
        val allSum: Int = 4000;
        val resul = getCommission(
            typeCard,
            allSum,
            amount
        );
        assertEquals(0, resul);
    }

    @Test
    fun getCommissionMaestroZero() {

        val amount: Int = 59900;
        val typeCard: String = "Maestro";
        val allSum: Int = 4000;
        val resul = getCommission(
            typeCard,
            allSum,
            amount
        );
        assertEquals(0, resul);
    }

    @Test
    fun getCommissionMastercardZero1() {

        val amount: Int = 1;
        val typeCard: String = "Mastercard";
        val allSum: Int = 1;
        val resul = getCommission(
            typeCard,
            allSum,
            amount
        );
        assertEquals(20, resul);
    }

    @Test
    fun getCommissionMaestroZero1() {

        val amount: Int = 1;
        val typeCard: String = "Maestro";
        val allSum: Int = 1;
        val resul = getCommission(
            typeCard,
            allSum,
            amount
        );
        assertEquals(20, resul);
    }

    @Test
    fun getCommissionMastercard() {

        val amount: Int = 59900;
        val typeCard: String = "Mastercard";
        val allSum: Int = 200000;
        val resul = getCommission(
            typeCard,
            allSum,
            amount
        );
        assertEquals(379, resul);
    }

    @Test
    fun getCommissionMaestro() {

        val amount: Int = 59900;
        val typeCard: String = "Maestro";
        val allSum: Int = 200000;
        val resul = getCommission(
            typeCard,
            allSum,
            amount
        );
        assertEquals(379, resul);
    }

    @Test
    fun getCommissionNoCard() {

        val amount: Int = 59900;
        val typeCard: String = "No Name Card";
        val resul = getCommission(
            typeCard,
            sum = amount
        );
        assertEquals(0, resul);
    }
}