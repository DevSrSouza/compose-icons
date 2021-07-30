package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.CalendarTimes: ImageVector
    get() {
        if (_calendarTimes != null) {
            return _calendarTimes!!
        }
        _calendarTimes = Builder(name = "CalendarTimes", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(311.7f, 374.7f)
                lineToRelative(-17.0f, 17.0f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17.0f, 0.0f)
                lineTo(224.0f, 337.9f)
                lineToRelative(-53.7f, 53.7f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17.0f, 0.0f)
                lineToRelative(-17.0f, -17.0f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(53.7f, -53.7f)
                lineToRelative(-53.7f, -53.7f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(17.0f, -17.0f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17.0f, 0.0f)
                lineToRelative(53.7f, 53.7f)
                lineToRelative(53.7f, -53.7f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17.0f, 0.0f)
                lineToRelative(17.0f, 17.0f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0.0f, 17.0f)
                lineTo(257.9f, 304.0f)
                lineToRelative(53.7f, 53.7f)
                curveToRelative(4.8f, 4.7f, 4.8f, 12.3f, 0.1f, 17.0f)
                close()
                moveTo(448.0f, 112.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(48.0f)
                lineTo(96.0f, 12.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(128.0f)
                lineTo(288.0f, 12.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(400.0f, 458.0f)
                lineTo(400.0f, 160.0f)
                lineTo(48.0f, 160.0f)
                verticalLineToRelative(298.0f)
                curveToRelative(0.0f, 3.3f, 2.7f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(340.0f)
                curveToRelative(3.3f, 0.0f, 6.0f, -2.7f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _calendarTimes!!
    }

private var _calendarTimes: ImageVector? = null
