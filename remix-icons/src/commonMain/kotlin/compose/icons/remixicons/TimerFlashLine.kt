package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.TimerFlashLine: ImageVector
    get() {
        if (_timerFlashLine != null) {
            return _timerFlashLine!!
        }
        _timerFlashLine = Builder(name = "TimerFlashLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.382f, 5.968f)
                arcTo(8.962f, 8.962f, 0.0f, false, true, 12.0f, 4.0f)
                curveToRelative(2.125f, 0.0f, 4.078f, 0.736f, 5.618f, 1.968f)
                lineToRelative(1.453f, -1.453f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.453f, 1.453f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -14.064f, 0.0f)
                lineTo(3.515f, 5.93f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.453f, 1.453f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, -14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, 14.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-5.0f, 6.5f)
                lineTo(11.0f, 14.0f)
                lineTo(8.0f, 14.0f)
                lineToRelative(5.0f, -6.505f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(8.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 3.0f)
                lineTo(8.0f, 1.0f)
                close()
            }
        }
        .build()
        return _timerFlashLine!!
    }

private var _timerFlashLine: ImageVector? = null
