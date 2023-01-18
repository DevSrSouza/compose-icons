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

public val RegularGroup.ClipboardTask: ImageVector
    get() {
        if (_clipboardTask != null) {
            return _clipboardTask!!
        }
        _clipboardTask = Builder(name = "ClipboardTask", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0303f, 11.0303f)
                curveTo(17.3232f, 10.7374f, 17.3232f, 10.2626f, 17.0303f, 9.9697f)
                curveTo(16.7374f, 9.6768f, 16.2626f, 9.6768f, 15.9697f, 9.9697f)
                lineTo(11.0f, 14.9393f)
                lineTo(9.0303f, 12.9697f)
                curveTo(8.7374f, 12.6768f, 8.2626f, 12.6768f, 7.9697f, 12.9697f)
                curveTo(7.6768f, 13.2626f, 7.6768f, 13.7374f, 7.9697f, 14.0303f)
                lineTo(10.4697f, 16.5303f)
                curveTo(10.7626f, 16.8232f, 11.2374f, 16.8232f, 11.5303f, 16.5303f)
                lineTo(17.0303f, 11.0303f)
                close()
                moveTo(15.994f, 4.0845f)
                curveTo(15.9093f, 2.9191f, 14.937f, 2.0f, 13.75f, 2.0f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2.0f, 8.1384f, 2.8747f, 8.0138f, 3.9994f)
                lineTo(6.25f, 4.0f)
                curveTo(5.0074f, 4.0f, 4.0f, 5.0074f, 4.0f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4.0f, 20.9926f, 5.0074f, 22.0f, 6.25f, 22.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 22.0f, 20.0f, 20.9926f, 20.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20.0f, 5.0074f, 18.9926f, 4.0f, 17.75f, 4.0f)
                lineTo(15.9862f, 3.9994f)
                curveTo(15.9893f, 4.0276f, 15.9919f, 4.056f, 15.994f, 4.0845f)
                close()
                moveTo(15.9948f, 4.096f)
                lineTo(16.0f, 4.25f)
                curveTo(16.0f, 4.1982f, 15.9983f, 4.1469f, 15.9948f, 4.096f)
                close()
                moveTo(10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.53f, 6.5f, 15.2174f, 6.1031f, 15.621f, 5.5002f)
                lineTo(17.75f, 5.5f)
                curveTo(18.1642f, 5.5f, 18.5f, 5.8358f, 18.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(18.5f, 20.1642f, 18.1642f, 20.5f, 17.75f, 20.5f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 20.5f, 5.5f, 20.1642f, 5.5f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(5.5f, 5.8358f, 5.8358f, 5.5f, 6.25f, 5.5f)
                lineTo(8.379f, 5.5002f)
                curveTo(8.7827f, 6.1031f, 9.47f, 6.5f, 10.25f, 6.5f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 3.5f, 14.5f, 3.8358f, 14.5f, 4.25f)
                curveTo(14.5f, 4.6642f, 14.1642f, 5.0f, 13.75f, 5.0f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 5.0f, 9.5f, 4.6642f, 9.5f, 4.25f)
                curveTo(9.5f, 3.8358f, 9.8358f, 3.5f, 10.25f, 3.5f)
                close()
            }
        }
        .build()
        return _clipboardTask!!
    }

private var _clipboardTask: ImageVector? = null
