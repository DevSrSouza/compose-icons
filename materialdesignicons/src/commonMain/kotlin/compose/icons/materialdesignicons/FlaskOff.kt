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

public val MaterialDesignIcons.FlaskOff: ImageVector
    get() {
        if (_flaskOff != null) {
            return _flaskOff!!
        }
        _flaskOff = Builder(name = "FlaskOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(7.9f, 9.8f)
                lineTo(3.5f, 17.4f)
                curveTo(3.2f, 17.8f, 3.0f, 18.4f, 3.0f, 19.0f)
                curveTo(3.0f, 20.7f, 4.3f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(18.6f, 22.0f, 19.2f, 21.8f, 19.6f, 21.5f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4f, 20.0f, 5.0f, 19.6f, 5.0f, 19.0f)
                curveTo(5.0f, 18.8f, 5.1f, 18.6f, 5.2f, 18.4f)
                lineTo(9.0f, 11.9f)
                lineTo(14.0f, 17.0f)
                lineTo(14.6f, 16.4f)
                lineTo(18.0f, 20.0f)
                curveTo(18.1f, 20.0f, 18.0f, 20.0f, 18.0f, 20.0f)
                moveTo(8.0f, 4.8f)
                verticalLineTo(4.0f)
                curveTo(8.0f, 2.9f, 8.9f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1f, 2.0f, 16.0f, 2.9f, 16.0f, 4.0f)
                verticalLineTo(5.0f)
                curveTo(16.0f, 5.6f, 15.6f, 6.0f, 15.0f, 6.0f)
                verticalLineTo(7.8f)
                lineTo(20.4f, 17.2f)
                lineTo(8.0f, 4.8f)
                close()
            }
        }
        .build()
        return _flaskOff!!
    }

private var _flaskOff: ImageVector? = null
