/**
 *
 * @author August Preuss
 * @version 4/25/2025
 * a class to get the footer of the html file
 * 
 */
public class Footer {
    
    /**
     * This method is used to return the end of the html file right after the hidden variables section
     * @return, a String of the entire footer of the html file
     */
    public static String getFooter(){
        return """
              
        <!-- Hidden Variables -->

	</form>
               
      
</div>
<!-- END CONTENT -->

<!-- BEGIN RIGHT -->
<div id="right">

</div>
<!-- END RIGHT -->

</div>
<!-- BEGIN FOOTER -->
<div id="footer">

<ul>
	<li><a href="/foia.htm">Freedom of Information Act</a></li>
	<li>|</li>
	<li><a href="/law_and_guidance.htm">Law &amp; Guidance</a></li>
	<li>|</li>
	<li><a href="/privacy.htm">Privacy &amp; Legal Notices</a></li>
	<li>|</li>
	<li><a href="/terms.htm">Website Terms &amp; Conditions</a></li>
	<li>|</li>
    <li><a href="/webapis/webapisindex.htm">Web API Documentation</a></li>
    <li>|</li>
	<li><a href="/viewers.htm">Plug-ins &amp; Viewers</a></li>
	<li>|</li>
	<li><a href="/accessibility.htm">Accessibility</a></li>
	<li>|</li>
	<li><a href="/data_quality.htm">Data Quality</a></li>
</ul>

<p><a href="http://www.fiscal.treasury.gov/">U.S. Department of the Treasury, Bureau of the Fiscal Service</a></p>
</div>
<!-- END FOOTER -->

</div>

</body>
</html>

               """;
    }
    
}
