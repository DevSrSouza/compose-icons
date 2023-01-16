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

public val MaterialDesignIcons.RadioOff: ImageVector
    get() {
        if (_radioOff != null) {
            return _radioOff!!
        }
        _radioOff = Builder(name = "RadioOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(3.0f, 6.27f)
                curveTo(2.4f, 6.61f, 2.0f, 7.26f, 2.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(18.73f)
                lineTo(20.73f, 24.0f)
                lineTo(22.0f, 22.72f)
                lineTo(2.28f, 3.0f)
                lineTo(1.0f, 4.27f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(8.83f)
                lineTo(16.47f, 2.83f)
                lineTo(15.71f, 1.0f)
                lineTo(6.59f, 4.76f)
                lineTo(9.82f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.82f)
                lineTo(22.0f, 20.18f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.9f, 21.11f, 6.0f, 20.0f, 6.0f)
                moveTo(4.0f, 8.0f)
                horizontalLineTo(4.73f)
                lineTo(8.73f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                moveTo(7.0f, 14.0f)
                curveTo(8.66f, 14.0f, 10.0f, 15.34f, 10.0f, 17.0f)
                curveTo(10.0f, 18.66f, 8.66f, 20.0f, 7.0f, 20.0f)
                curveTo(5.34f, 20.0f, 4.0f, 18.66f, 4.0f, 17.0f)
                curveTo(4.0f, 15.34f, 5.34f, 14.0f, 7.0f, 14.0f)
                close()
            }
        }
        .build()
        return _radioOff!!
    }

private var _radioOff: ImageVector? = null
