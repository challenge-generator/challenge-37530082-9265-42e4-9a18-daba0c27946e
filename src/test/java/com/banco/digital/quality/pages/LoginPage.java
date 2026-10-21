package com.banco.digital.quality.pages;

import net.serenitybdd.screenplay.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Page Object del flujo de autenticación del banco digital.
 * Proporciona localizadores únicos y métodos descriptivos para el login.
 * 
 * SUPERFICIE DE PRACTICA: El estudiante debe completar los localizadores
 * y métodos necesarios para ejecutar el caso de prueba funcional.
 */
public class LoginPage {

    public static final Target CAMPO_USUARIO = Target.the("Campo de usuario")
            .locatedBy("#username");

    public static final Target CAMPO_CONTRASENA = Target.the("Campo de contraseña")
            .locatedBy("#password");

    public static final Target BOTON_INGRESAR = Target.the("Botón de ingresar")
            .locatedBy("#loginButton");

    public static final Target MENSAJE_ERROR = Target.the("Mensaje de error")
            .locatedBy(".error-message");

    public static final Target LINK_OLVIDO_CONTRASENA = Target.the("Link de olvido de contraseña")
            .locatedBy("a.forgot-password");

    public static void iniciarSesionCon(String usuario, String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(usuario).into(CAMPO_USUARIO),
                Enter.theValue(contrasena).into(CAMPO_CONTRASENA),
                Click.on(BOTON_INGRESAR)
        );
    }

    public static void ingresarUsuario(String usuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(usuario).into(CAMPO_USUARIO)
        );
    }

    public static void ingresarContrasena(String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(contrasena).into(CAMPO_CONTRASENA)
        );
    }

    public static void clicEnIngresar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BOTON_INGRESAR)
        );
    }

    public static boolean estaPresenteElMensajeDeError() {
        return MENSAJE_ERROR.resolveFor(OnStage.theActorInTheSpotlight()).isPresent();
    }

    public static String obtenerTextoDelMensajeDeError() {
        return MENSAJE_ERROR.resolveFor(OnStage.theActorInTheSpotlight()).getText();
    }
}