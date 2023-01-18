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

public val RemixIcons.AlarmWarningFill: ImageVector
    get() {
        if (_alarmWarningFill != null) {
            return _alarmWarningFill!!
        }
        _alarmWarningFill = Builder(name = "AlarmWarningFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(12.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(19.778f, 4.808f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.12f, 2.121f)
                lineToRelative(-1.415f, -1.414f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(2.808f, 6.222f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.121f, 2.12f)
                lineTo(4.93f, 8.344f)
                lineTo(2.808f, 6.222f)
                close()
            }
        }
        .build()
        return _alarmWarningFill!!
    }

private var _alarmWarningFill: ImageVector? = null
