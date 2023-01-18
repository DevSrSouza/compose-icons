package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ClockPause: ImageVector
    get() {
        if (_clockPause != null) {
            return _clockPause!!
        }
        _clockPause = Builder(name = "ClockPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 13.5f)
                horizontalLineTo(11.75f)
                curveTo(11.7036f, 13.5f, 11.6583f, 13.4958f, 11.6142f, 13.4877f)
                curveTo(12.4823f, 14.5927f, 13.0f, 15.9859f, 13.0f, 17.5f)
                curveTo(13.0f, 19.2316f, 12.3229f, 20.805f, 11.2191f, 21.9699f)
                curveTo(11.4768f, 21.9899f, 11.7372f, 22.0f, 12.0f, 22.0f)
                curveTo(17.522f, 22.0f, 22.0f, 17.522f, 22.0f, 12.0f)
                curveTo(22.0f, 6.478f, 17.522f, 2.0f, 12.0f, 2.0f)
                curveTo(6.478f, 2.0f, 2.0f, 6.478f, 2.0f, 12.0f)
                curveTo(2.0f, 12.2628f, 2.0101f, 12.5232f, 2.0301f, 12.7809f)
                curveTo(3.195f, 11.6771f, 4.7684f, 11.0f, 6.5f, 11.0f)
                curveTo(8.2478f, 11.0f, 9.8344f, 11.6898f, 11.0025f, 12.812f)
                curveTo(11.0009f, 12.7916f, 11.0f, 12.7709f, 11.0f, 12.75f)
                verticalLineTo(6.75f)
                curveTo(11.0f, 6.336f, 11.336f, 6.0f, 11.75f, 6.0f)
                curveTo(12.164f, 6.0f, 12.5f, 6.336f, 12.5f, 6.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 12.0f, 16.5f, 12.336f, 16.5f, 12.75f)
                curveTo(16.5f, 13.164f, 16.164f, 13.5f, 15.75f, 13.5f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 9.5376f, 23.0f, 6.5f, 23.0f)
                curveTo(3.4624f, 23.0f, 1.0f, 20.5376f, 1.0f, 17.5f)
                curveTo(1.0f, 14.4624f, 3.4624f, 12.0f, 6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                close()
                moveTo(4.5f, 14.5f)
                curveTo(4.2239f, 14.5f, 4.0f, 14.7239f, 4.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 20.2761f, 4.2239f, 20.5f, 4.5f, 20.5f)
                curveTo(4.7761f, 20.5f, 5.0f, 20.2761f, 5.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 14.7239f, 4.7761f, 14.5f, 4.5f, 14.5f)
                close()
                moveTo(8.5f, 14.5f)
                curveTo(8.2239f, 14.5f, 8.0f, 14.7239f, 8.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(8.0f, 20.2761f, 8.2239f, 20.5f, 8.5f, 20.5f)
                curveTo(8.7761f, 20.5f, 9.0f, 20.2761f, 9.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 14.7239f, 8.7761f, 14.5f, 8.5f, 14.5f)
                close()
            }
        }
        .build()
        return _clockPause!!
    }

private var _clockPause: ImageVector? = null
