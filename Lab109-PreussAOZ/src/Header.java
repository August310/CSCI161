/**
 *
 * @author August Preuss
 * @version 4/25/2025
 * A class to get the header of the html file til it hits the hidden variables section
 * 
 */
public class Header {
    /**
     * This method is used to return the start of the html file up until we reach the hidden variables section that we want to edit
     * @return, a string of the html header section
     */
    public static String getHeader(){
        return """
                <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
        
	<title>Calculate the Value of Your Paper Savings Bond(s)</title>
	<meta name="BPD.source" content="BC_savings_start.tpl" />
	<link type="text/css" rel="stylesheet" media="screen" href="/BC/css/bc_all.css" />
	
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	<link type="text/css" rel="stylesheet" media="screen" href="/BC/css/gw_td_null.css" />
	<link type="text/css" rel="stylesheet" media="screen" href="/BC/css/gw_indiv_screen.css" />
	<link type="text/css" rel="stylesheet" media="print" href="/BC/css/gw_indiv_print.css" />
	<link type="text/css" rel="stylesheet" media="all" href="/BC/css/gw_td_fontsize76.css" title="76" />
    
    <link rel="alternate" type="application/rss+xml" title="Treasury Offering Announcements" href="/TA_WS/securities/announced?format=rss&days=14"/>
    <link rel="alternate" type="application/rss+xml" title="Treasury Auction Results" href="/TA_WS/securities/auctioned?format=rss&days=14"/>
    <link rel="alternate" type="application/rss+xml" title="Monthly Statement of the Public Debt" href="/rss/mspd.xml"/> 
    <link rel="alternate" type="application/rss+xml" title="Savings Bonds Pro Updates" href="/rss/sbpro.xml"/> 
    <link rel="alternate" type="application/rss+xml" title="Savings Bonds Wizard Updates" href="/rss/wizard.xml"/>
</head>
	

<body id="indiv" onLoad="document.SBCForm.IssueDate.focus()">

<div id="container">

	<!-- BEGIN HEADER -->
	<div id="header">

		<!-- BEGIN LOGO -->
		<div id="logo">
			<a href="/tdhome.htm"><img src="/BC/images/gw/td_logo.gif" width="232" height="50" alt="TreasuryDirect Logo" /></a>
		</div>
		<!-- END LOGO -->

		<!-- BEGIN TYPE NAVIGATION -->
		<div id="typenav">
			<ul id="investortype">
				<li>You are in:</li>
				<li><strong>&#8250; Individual</strong></li>
				<li>&nbsp;|&nbsp;</li>
				<li><a href="/instit/instit.htm" title="Institutional">Institutional</a></li>
				<li>&nbsp;|&nbsp;</li>
				<li><a href="/govt/govt.htm">Government</a></li>
			</ul>
		</div>
		<!-- END TYPE NAVIGATION -->

		<!-- BEGIN SEARCH BOX -->
		<div id="searchbox">
			<form id="gs" method="get" action="http://search.treas.gov/search">
				<fieldset>
					<label for="q">Search: </label>
					<input type="text" name="q" id="q" size="25" maxlength="256" value="" />
					<input name="btnG" value="Search" class="button" type="image" src="/BC/images/gw/go.gif" alt="Go" />
					<input type="hidden" name="sort" value="date:D:L:d1" />
					<input type="hidden" name="output" value="xml_no_dtd" />
					<input type="hidden" name="ie" value="UTF-8" />
					<input type="hidden" name="oe" value="UTF-8" />
					<input type="hidden" name="client" value="BPD-treasurydirect" />
					<input type="hidden" name="proxystylesheet" value="BPD-treasurydirect" />
					<input type="hidden" name="site" value="BPD-treasurydirect" />
				</fieldset>
			</form>
		</div>
		<!-- END SEARCH BOX -->

		<!-- BEGIN UTILITY NAVIGATION -->
		<div id="utilitynav">
			<ul>
				<li><a href="/maillist/maillist.htm">Mailing Lists</a></li>
				<li>&nbsp;|&nbsp;</li>
				<li><a href="/about.htm">About</a></li>
				<li>&nbsp;|&nbsp;</li>
				<li><a href="/news/news.htm">News</a></li>
				<li>&nbsp;|&nbsp;</li>
				<li><a href="/sitemap.htm">Sitemap</a></li>
				<li>&nbsp;|&nbsp;</li>
				<li><a href="/email.htm">Contact Us</a></li>
				<li>&nbsp;|&nbsp;</li>
				<li><a href="/indiv/research/faq/faq.htm">FAQs</a></li>
				<li>&nbsp;|&nbsp;</li>
				<li><a href="/indiv/help/help.htm">Help</a></li>
			</ul>
		</div>
		<!-- END UTILITY NAVIGATION -->

	</div>
	<!-- END HEADER -->

	<!-- BEGIN PERSISTENT NAVIGATION -->
	<div id="persistentnav">
		<ul>
			<li class="singleline"><a class="nonactive" href="/indiv/myaccount/myaccount.htm">My Accounts</a></li>
			<li class="doubleline"><a class="nonactive" href="/indiv/products/products.htm">Treasury Securities<br />&amp; Programs</a></li>
			<li class="singleline"><a class="nonactive" href="/indiv/research/research.htm">Research Center</a></li>
			<li class="singleline"><a class="nonactive" href="/indiv/planning/planning.htm">Planning &amp; Giving</a></li>
			<li class="singleline"><a class="active"    href="/indiv/tools/tools.htm">Tools</a></li>
			<li class="singleline"><a class="nonactive" href="/indiv/forms/forms.htm">Forms</a></li>
		</ul>
	</div>
	<!-- END PERSISTENT NAVIGATION -->
	<div id="contentwrap">

<!-- BEGIN BREADCRUMBNAV -->
	<div id="breadcrumbnav">
		<ul id="breadcrumb">
			<li><a href="/tdhome.htm">Home</a></li>
			<li>&#8250;</li>
			<li><a href="/indiv/indiv.htm">Individual</a></li>
			<li>&#8250;</li>
			<li><a href="/indiv/tools/tools.htm">Tools</a></li>
			<li>&#8250;</li>
			<li>Calculate the Value of Your Paper Savings Bond(s)</li>
		</ul>
	</div>
	<!-- END BREADCRUMBNAV -->


<!-- BEGIN LOCALNAV -->
<div id="localnav">
	
	<h1>TOOLS</h1>
	<div id="verticalline">
		<ul>
			<li class="closed"><a href="/indiv/tools/tools_savingsbondcalc.htm">Savings Bond Calculator</a></li>
			<li class="closed"><a href="/indiv/tools/tools_savingsbondwizard.htm">Savings Bond Wizard</a></li>
			<li class="closed"><a href="/indiv/tools/tools_savingsbondvalues.htm">Savings Bond Value Files</a></li>
			<li class="closed"><a href="/indiv/tools/trssitesb.htm">Savings Bond FRB Locator</a></li>
			<li class="closed"><a href="/indiv/tools/trssitetd.htm">Treasury Bills, Notes, Bonds, &amp; TIPS FRB Locator</a></li>  
			<li class="closed"><a href="/indiv/tools/tools_treasuryhunt.htm">Treasury Hunt</a></li>
			<li class="closed"><a href="/indiv/tools/tools_estimationcalc.htm">Estimation Calculators</a></li>
			<li class="closed"><div><a href="/indiv/tools/tools_redemptiontables.htm">Redemption Tables</a></li>
			<li class="closed"><a href="/indiv/tools/tools_video.htm">Videos</a></li>
			<li class="closedlast"><a href="/indiv/tools/tools_teachers.htm">For Teachers</a></li>

		</ul>
	</div>
	<noscript>
		<div id="acsialert"><p><img src="/BC/images/alertmessage.gif" width="16" height="16" alt="Exclamation Point" />We're pleased to hear from our customers regarding their satisfaction with our website. Although your browser settings don't allow you to view the website survey we're conducting, please <a href="mailto:oadmin@fiscal.treasury.gov">e-mail</a> your comments.</p></div>
	</noscript>

</div>
<!-- END LOCALNAV -->

<!-- BEGIN CONTENT -->
<div id="content">

	

	<h1>Calculate the Value of Your Paper Savings Bond(s)</h1>

	<form name="SBCForm" method="post" action="https://treasurydirect.gov/BC/SBCPrice">

	<div class="colwrap">
	
			<p>The Savings Bond Calculator <strong>WILL</strong>:</p>
			 <ul>
				 <li>Calculate the value of a paper bond based on the series, denomination, and issue date entered. (To calculate a value, you don't need to enter a serial number.  However, if you plan to save an inventory of bonds, you may want to enter serial numbers.)</li>
				 <li>Store savings bond information you enter so you can view or update it later. <a href="https://treasurydirect.gov/indiv/help/bc/bc_savings_help.htm" target="_blank" class="save">HOW TO SAVE YOUR INVENTORY</a></li>
			 </ul>
			 <p>The Savings Bond Calculator <strong>WILL NOT</strong>:</p>
			 <ul>
			 	 <li>Give correct values for electronic bonds.  <strong>The Calculator is for paper bonds only.</strong>  For values of your electronic bonds, log in to your TreasuryDirect account.</li>
				 <li>Verify whether or not you own bonds.</li>
				 <li>Guarantee the serial number you enter is valid.</li>
				 <li>Guarantee a bond is eligible to be cashed.</li>
				 <li>Create a savings bond based on information you enter.</li>
			 </ul>
			 
			 <p>Beware of internet scams with a picture of this site claiming that you can enter your birth certificate number to access bonds owed to you.  Those claims are false, and attempts to defraud the government can be prosecuted.     See <a href="https://www.treasurydirect.gov/instit/statreg/fraud/birth-certificate-bonds.htm">https://www.treasurydirect.gov/instit/statreg/fraud/birth-certificate-bonds.htm</a>.</p>
			 <div class="col1">
					<table class="entry">
						<tr>
							<th colspan="5">SAVINGS BOND CALCULATOR (paper bonds only)</th>
						</tr>
						<tr class="altrow1">
							<td colspan="4" class="ls"><strong>Value as of:</strong></td>
							<td rowspan="4" class="rs"><a href="/indiv/tools/tools_savingsbondcalc_instructions.htm" target="_blank"><img src="/BC/images/gw/icon_help.gif" alt="Savings Bond Calculator Help" /></a></td>
						</tr>
						<tr class="altrow1">
							<td colspan="1" class="ls"><input type="text" name="RedemptionDate" size="20" maxlength="7" value="04/2025" /></td>
							<td colspan="3"><div class="buttons"><input class="info" type="submit" name="btnUpdate.x" value="UPDATE" /></div></td>
						</tr>
						<tr class="altrow1">
							<td class="ls"><strong>Series:</strong></td>
							<td><strong>Denomination:</strong></td>
							<td><strong>Bond Serial Number:</strong></td>
							<td><strong>Issue Date (MM/YYYY):</strong></td>
						</tr>
						<tr class="altrow1">
						<td class="ls">
							<select name="Series">
								<option selected value="EE">EE Bonds</option>
								<option value="I">I Bonds</option>
								<option value="E">E Bonds</option>
								<option value="SN">Savings Notes</option>
							</select>
						</td>
						<td>
							<select name="Denomination">
								<option value="10">$10</option>
								<option value="25">$25</option>
								<option selected="selected" value="50">$50</option>
								<option value="75">$75</option>
								<option value="100">$100</option>
								<option value="200">$200</option>
								<option value="500">$500</option>
								<option value="1000">$1,000</option>
								<option value="5000">$5,000</option>
								<option value="10000">$10,000</option>
							</select>
						</td>
						<td><input type="text" name="SerialNumber" size="14" maxlength="13" value="" /></td>
						<td><input type="text" name="IssueDate" size="8" maxlength="7" value="" /></td>
					</tr>
					</table>  
				<div class="buttons"><input class="action" type="submit" name="btnAdd.x" value="CALCULATE" />
				<a href="https://treasurydirect.gov/indiv/help/bc/bc_savings_help.htm" target="_blank" class="save">HOW TO SAVE YOUR INVENTORY</a></div>  
					
			</div>
			<div class="col2">
				<fieldset class="calc1">
					<legend>Instructions</legend>
					<p><a href="http://www.treasurydirect.gov/indiv/tools/tools_savingsbondcalc_instructions.htm" target="_blank">How to Use the Savings Bond Calculator</a></p>
				</fieldset>
			</div>
		
		</div>

		
		<br class="clrall" />

		<!-- Hidden Variables -->
		<fieldset class="hdn">
               """;
    }
}
