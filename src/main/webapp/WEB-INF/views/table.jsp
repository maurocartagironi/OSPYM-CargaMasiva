<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="/afiliados-tramites-padron/resources/core/js/pagination.min.js"></script>
<script src="/afiliados-tramites-padron/resources/core/js/floating.scroll.js"></script>

<div id="loading"><div role="status" class="spinner-border spinner-border"><span class="sr-only">Loading...</span></div></div>
<div id="error-table" class="alert alert-info my-4"><spring:message code="error.tabla.datos.no.encontrados" /></div>
<div id="content-table">
		<div class="checkbox-all">
			<label class="control control-checkbox">
		        <spring:message code="label.select.all" />
		            <input type="checkbox" id="check-all-afiliados" />
		        <span class="control-indicator"></span>
		    </label>
		</div>
	<div class="search-table-outter wrapper" id="content-table-child">
		<table id="table-preview" class="table table-striped table-hover table-sm search-table inner" style="display:none">
			<thead>
		    	<tr>
		      		<th style="padding-left: 40px"></th>
					<% for(int i = 1; i <= 23; i++) { %>
						<c:set var="index" ><%=i %></c:set>
						<th><spring:message code="label.table.${index}" /></th>
					<% } %>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<tr>
		      		<td>&nbsp;</td>
					<% for(int i = 0; i < 23; i++) { %>
						<td></td>
					<% } %>
					<td></td>
				</tr>
		  	</tbody>
		</table>
	</div>
	<div class="row">
		<div class="col-md-12 align-middle text-left mt-2">
        	<div class="pr-1 float-left">
				<button type="button" class="btn btn-primary btn-lg btn-search btn-form" id="ingreso-masivo" onclick="window.location.href = 'solicitudes/cargaMasiva'"><spring:message code="button.ingreso.masivo" /></button>
			</div>
            <div class="pl-1 float-left">
     			<button type="button" class="btn btn-primary btn-lg btn-search btn-form" id="confirmar"><spring:message code="button.confirmar" /></button>
				<div id="loading-confirmar"><div role="status" class="spinner-border spinner-border"><span class="sr-only">Loading...</span></div></div>
			</div>
			
			<div class="pl-1 float-right">
     			<button type="button" class="btn btn-primary btn-lg btn-search btn-form" id="exportar"><spring:message code="button.exportar" /></button>
				<div id="loading-exportar"><div role="status" class="spinner-border spinner-border"><span class="sr-only">Loading...</span></div></div>
			</div>
			
     	</div>
    </div>
    <div id="error-confirmar" class="alert alert-danger my-4"></div>
    <div id="success-confirmar" class="alert alert-success my-4"></div>
</div>