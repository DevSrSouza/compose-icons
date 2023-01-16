package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.FormTextboxPassword: ImageVector
    get() {
        if (_formTextboxPassword != null) {
            return _formTextboxPassword!!
        }
        _formTextboxPassword = Builder(name = "FormTextboxPassword", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.5f)
                curveTo(16.95f, 22.0f, 16.0f, 21.55f, 16.0f, 21.0f)
                curveTo(16.0f, 21.55f, 15.05f, 22.0f, 14.5f, 22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.5f)
                curveTo(15.05f, 2.0f, 16.0f, 2.45f, 16.0f, 3.0f)
                curveTo(16.0f, 2.45f, 16.95f, 2.0f, 17.5f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 5.0f)
                verticalLineTo(7.0f)
                moveTo(2.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                moveTo(20.0f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                moveTo(8.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 12.0f)
                moveTo(13.0f, 10.89f)
                curveTo(12.39f, 10.33f, 11.44f, 10.38f, 10.88f, 11.0f)
                curveTo(10.32f, 11.6f, 10.37f, 12.55f, 11.0f, 13.11f)
                curveTo(11.55f, 13.63f, 12.43f, 13.63f, 13.0f, 13.11f)
                verticalLineTo(10.89f)
                close()
            }
        }
        .build()
        return _formTextboxPassword!!
    }

private var _formTextboxPassword: ImageVector? = null
