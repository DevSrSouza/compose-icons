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

public val FilledGroup.ClipboardTask: ImageVector
    get() {
        if (_clipboardTask != null) {
            return _clipboardTask!!
        }
        _clipboardTask = Builder(name = "ClipboardTask", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 2.0f)
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
                curveTo(15.8616f, 2.8747f, 14.9079f, 2.0f, 13.75f, 2.0f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 3.5f, 14.5f, 3.8358f, 14.5f, 4.25f)
                curveTo(14.5f, 4.6642f, 14.1642f, 5.0f, 13.75f, 5.0f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 5.0f, 9.5f, 4.6642f, 9.5f, 4.25f)
                curveTo(9.5f, 3.8358f, 9.8358f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(17.0303f, 11.0303f)
                lineTo(11.5303f, 16.5303f)
                curveTo(11.2374f, 16.8232f, 10.7626f, 16.8232f, 10.4697f, 16.5303f)
                lineTo(7.9697f, 14.0303f)
                curveTo(7.6768f, 13.7374f, 7.6768f, 13.2626f, 7.9697f, 12.9697f)
                curveTo(8.2626f, 12.6768f, 8.7374f, 12.6768f, 9.0303f, 12.9697f)
                lineTo(11.0f, 14.9393f)
                lineTo(15.9697f, 9.9697f)
                curveTo(16.2626f, 9.6768f, 16.7374f, 9.6768f, 17.0303f, 9.9697f)
                curveTo(17.3232f, 10.2626f, 17.3232f, 10.7374f, 17.0303f, 11.0303f)
                close()
            }
        }
        .build()
        return _clipboardTask!!
    }

private var _clipboardTask: ImageVector? = null
