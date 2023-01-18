package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) {
            return _calendarCheck!!
        }
        _calendarCheck = Builder(name = "CalendarCheck", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(188.0f, 28.0f)
                lineTo(188.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(92.0f, 28.0f)
                lineTo(92.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 52.0f)
                lineTo(204.0f, 76.0f)
                lineTo(52.0f, 76.0f)
                lineTo(52.0f, 52.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 100.0f)
                lineTo(204.0f, 100.0f)
                lineTo(204.0f, 204.0f)
                close()
                moveTo(172.7f, 119.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -0.5f, 16.9f)
                lineToRelative(-46.6f, 44.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.3f, 3.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.2f, -3.3f)
                lineToRelative(-25.4f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.4f, -17.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 16.9f, -0.4f)
                lineToRelative(17.1f, 16.2f)
                lineToRelative(38.5f, -36.2f)
                arcTo(11.8f, 11.8f, 0.0f, false, true, 172.7f, 119.8f)
                close()
            }
        }
        .build()
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
