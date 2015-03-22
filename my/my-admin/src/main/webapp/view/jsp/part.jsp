<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
     <h4 class="modal-title">分配权限</h4>
</div>
<div class="modal-body">
 <div class="padd">
			<h6>Input Boxs</h6>
			<hr />
			<!-- Form starts.  -->
			<form class="form-horizontal" role="form">
				<div class="form-group">
					<label class="col-lg-4 control-label">名称</label>
					<div class="col-lg-8">
						<input type="text" class="form-control" placeholder="名称">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-4 control-label">类型</label>
					<div class="col-lg-8">
						<select class="form-control">
							<option value="0">菜单</option>
							<option value="1">按钮</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-4 control-label">链接</label>
					<div class="col-lg-8">
						<input type="password" class="form-control" placeholder="链接">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-4 control-label">描述</label>
					<div class="col-lg-8">
						<textarea class="form-control" rows="3" placeholder="描述"></textarea>
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-4 control-label">Checkbox</label>
					<div class="col-lg-8">
						<label class="checkbox-inline"> <input type="checkbox" id="inlineCheckbox1" value="option1"> 1
						</label> <label class="checkbox-inline"> <input type="checkbox" id="inlineCheckbox2" value="option2"> 2
						</label> <label class="checkbox-inline"> <input type="checkbox" id="inlineCheckbox3" value="option3"> 3
						</label>
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-4 control-label">Radio Box</label>
					<div class="col-lg-8">
						<div class="radio">
							<label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked> Option one is this and that&mdash;be sure to include
								why it's great
							</label>
						</div>
						<div class="radio">
							<label> <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2"> Option two can be something else and selecting it will deselect
								option one
							</label>
						</div>
					</div>
				</div>
				<hr />
				<div class="form-group">
					<div class="col-lg-offset-1 col-lg-9">
						<button type="button" class="btn btn-default">Default</button>
						<button type="button" class="btn btn-primary">Primary</button>
						<button type="button" class="btn btn-success">Success</button>
						<button type="button" class="btn btn-info">Info</button>
						<button type="button" class="btn btn-warning">Warning</button>
						<button type="button" class="btn btn-danger">Danger</button>
					</div>
				</div>
			</form>
		</div>
		</div>
<div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            <button type="button" class="btn btn-primary submit" data-target="#authModal">提交更改</button>
</div>
