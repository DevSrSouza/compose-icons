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

public val FilledGroup.ClipboardClock: ImageVector
    get() {
        if (_clipboardClock != null) {
            return _clipboardClock!!
        }
        _clipboardClock = Builder(name = "ClipboardClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.375f, 13.6201f)
                curveTo(11.375f, 13.9648f, 11.6548f, 14.2451f, 12.0f, 14.2451f)
                lineTo(12.0625f, 14.2422f)
                lineTo(12.125f, 14.2451f)
                horizontalLineTo(13.375f)
                curveTo(13.7202f, 14.2451f, 14.0f, 13.9648f, 14.0f, 13.6201f)
                curveTo(14.0f, 13.2754f, 13.7202f, 12.9951f, 13.375f, 12.9951f)
                horizontalLineTo(12.625f)
                verticalLineTo(11.3701f)
                curveTo(12.625f, 11.0254f, 12.3452f, 10.7451f, 12.0f, 10.7451f)
                curveTo(11.6548f, 10.7451f, 11.375f, 11.0254f, 11.375f, 11.3701f)
                verticalLineTo(13.6201f)
                close()
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
                moveTo(12.0f, 8.25f)
                curveTo(14.6235f, 8.25f, 16.75f, 10.377f, 16.75f, 13.0f)
                curveTo(16.75f, 15.623f, 14.6235f, 17.75f, 12.0f, 17.75f)
                curveTo(9.3765f, 17.75f, 7.25f, 15.623f, 7.25f, 13.0f)
                curveTo(7.25f, 10.377f, 9.3765f, 8.25f, 12.0f, 8.25f)
                close()
            }
        }
        .build()
        return _clipboardClock!!
    }

private var _clipboardClock: ImageVector? = null
