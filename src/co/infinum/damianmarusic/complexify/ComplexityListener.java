package co.infinum.damianmarusic.complexify;

/**
 * Created by Damian Marusic on 28.07.15..
 */
public interface ComplexityListener {

	/**
	 * Callback listener
	 *
	 * @param isValid true if password is valid, false otherwise
	 * @param complexity Number form range [0.0, 100.0] where greater number represnets greater complexity
	 */
	void onSuccess(boolean isValid, double complexity);
}
