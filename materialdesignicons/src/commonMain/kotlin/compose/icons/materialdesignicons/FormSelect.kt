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

public val MaterialDesignIcons.FormSelect: ImageVector
    get() {
        if (_formSelect != null) {
            return _formSelect!!
        }
        _formSelect = Builder(name = "FormSelect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                horizontalLineTo(18.0f)
                lineTo(16.5f, 7.0f)
                lineTo(15.0f, 5.0f)
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 2.0f, 21.0f, 2.9f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 21.11f, 20.11f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 22.0f, 3.0f, 21.11f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 2.9f, 3.9f, 2.0f, 5.0f, 2.0f)
                moveTo(5.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                moveTo(7.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                moveTo(7.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _formSelect!!
    }

private var _formSelect: ImageVector? = null
