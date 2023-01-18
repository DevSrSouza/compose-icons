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

public val RemixIcons.TimerFlashFill: ImageVector
    get() {
        if (_timerFlashFill != null) {
            return _timerFlashFill!!
        }
        _timerFlashFill = Builder(name = "TimerFlashFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.0f, 12.0f)
                verticalLineTo(7.495f)
                lineTo(8.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.5f)
                lineToRelative(5.0f, -6.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(8.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _timerFlashFill!!
    }

private var _timerFlashFill: ImageVector? = null
