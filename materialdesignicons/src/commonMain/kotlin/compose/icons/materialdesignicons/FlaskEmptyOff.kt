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

public val MaterialDesignIcons.FlaskEmptyOff: ImageVector
    get() {
        if (_flaskEmptyOff != null) {
            return _flaskEmptyOff!!
        }
        _flaskEmptyOff = Builder(name = "FlaskEmptyOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(19.6f, 21.5f)
                curveTo(19.1f, 21.8f, 18.6f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3f, 22.0f, 3.0f, 20.7f, 3.0f, 19.0f)
                curveTo(3.0f, 18.4f, 3.2f, 17.8f, 3.5f, 17.4f)
                lineTo(7.9f, 9.8f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(15.0f, 7.8f)
                verticalLineTo(6.0f)
                curveTo(15.6f, 6.0f, 16.0f, 5.6f, 16.0f, 5.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 2.9f, 15.1f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 2.0f, 8.0f, 2.9f, 8.0f, 4.0f)
                verticalLineTo(4.8f)
                lineTo(20.4f, 17.2f)
                lineTo(15.0f, 7.8f)
                close()
            }
        }
        .build()
        return _flaskEmptyOff!!
    }

private var _flaskEmptyOff: ImageVector? = null
