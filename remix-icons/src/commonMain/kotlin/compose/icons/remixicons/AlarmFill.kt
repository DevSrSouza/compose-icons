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

public val RemixIcons.AlarmFill: ImageVector
    get() {
        if (_alarmFill != null) {
            return _alarmFill!!
        }
        _alarmFill = Builder(name = "AlarmFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 0.0f, -18.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.0f, 18.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(1.747f, 6.282f)
                lineToRelative(3.535f, -3.535f)
                lineToRelative(1.415f, 1.414f)
                lineTo(3.16f, 7.697f)
                lineTo(1.747f, 6.282f)
                close()
                moveTo(18.717f, 2.747f)
                lineToRelative(3.536f, 3.535f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(-3.536f, -3.536f)
                lineToRelative(1.415f, -1.414f)
                close()
            }
        }
        .build()
        return _alarmFill!!
    }

private var _alarmFill: ImageVector? = null
