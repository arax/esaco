package it.infn.mw.esaco.service;

/***
 * 
 * Interface that provides the current time.
 *
 */
@FunctionalInterface
public interface TimeProvider {

  /***
   * Return the current time, in milliseconds, from the Epoch.
   * 
   * @return Current timestamp
   */
  long currentTimeMillis();

}
