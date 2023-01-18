package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ClockPause: ImageVector
    get() {
        if (_clockPause != null) {
            return _clockPause!!
        }
        _clockPause = Builder(name = "ClockPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.478f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.478f, 2.0f, 12.0f)
                curveTo(2.0f, 12.2628f, 2.0101f, 12.5232f, 2.0301f, 12.7809f)
                curveTo(2.5138f, 12.3226f, 3.0679f, 11.9379f, 3.6745f, 11.6446f)
                curveTo(3.8613f, 7.2138f, 7.5241f, 3.667f, 12.0f, 3.667f)
                curveTo(16.595f, 3.667f, 20.333f, 7.405f, 20.333f, 12.0f)
                curveTo(20.333f, 16.4759f, 16.7862f, 20.1387f, 12.3554f, 20.3255f)
                curveTo(12.0621f, 20.9321f, 11.6774f, 21.4863f, 11.2191f, 21.97f)
                curveTo(11.4768f, 21.9899f, 11.7372f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.522f, 22.0f, 12.0f)
                close()
                moveTo(6.5f, 23.0f)
                curveTo(9.5376f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 9.5376f, 12.0f, 6.5f, 12.0f)
                curveTo(3.4624f, 12.0f, 1.0f, 14.4624f, 1.0f, 17.5f)
                curveTo(1.0f, 20.5376f, 3.4624f, 23.0f, 6.5f, 23.0f)
                close()
                moveTo(5.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(5.0f, 20.2761f, 4.7761f, 20.5f, 4.5f, 20.5f)
                curveTo(4.2239f, 20.5f, 4.0f, 20.2761f, 4.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 14.7239f, 4.2239f, 14.5f, 4.5f, 14.5f)
                curveTo(4.7761f, 14.5f, 5.0f, 14.7239f, 5.0f, 15.0f)
                close()
                moveTo(9.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(9.0f, 20.2761f, 8.7761f, 20.5f, 8.5f, 20.5f)
                curveTo(8.2239f, 20.5f, 8.0f, 20.2761f, 8.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(8.0f, 14.7239f, 8.2239f, 14.5f, 8.5f, 14.5f)
                curveTo(8.7761f, 14.5f, 9.0f, 14.7239f, 9.0f, 15.0f)
                close()
                moveTo(11.75f, 6.0f)
                curveTo(12.1295f, 6.0f, 12.4435f, 6.2823f, 12.4931f, 6.6483f)
                lineTo(12.5f, 6.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 12.0f, 16.5f, 12.336f, 16.5f, 12.75f)
                curveTo(16.5f, 13.1295f, 16.2177f, 13.4435f, 15.8517f, 13.4931f)
                lineTo(15.75f, 13.5f)
                horizontalLineTo(11.75f)
                curveTo(11.3705f, 13.5f, 11.0565f, 13.2177f, 11.0069f, 12.8517f)
                lineTo(11.0f, 12.75f)
                verticalLineTo(6.75f)
                curveTo(11.0f, 6.336f, 11.336f, 6.0f, 11.75f, 6.0f)
                close()
            }
        }
        .build()
        return _clockPause!!
    }

private var _clockPause: ImageVector? = null
