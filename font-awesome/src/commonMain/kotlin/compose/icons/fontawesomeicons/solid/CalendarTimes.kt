package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CalendarTimes: ImageVector
    get() {
        if (_calendarTimes != null) {
            return _calendarTimes!!
        }
        _calendarTimes = Builder(name = "CalendarTimes", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(436.0f, 160.0f)
                lineTo(12.0f, 160.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-36.0f)
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
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 192.0f)
                horizontalLineToRelative(424.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(260.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 204.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                close()
                moveTo(269.3f, 352.0f)
                lineToRelative(48.1f, -48.1f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(-28.3f, -28.3f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17.0f, 0.0f)
                lineTo(224.0f, 306.7f)
                lineToRelative(-48.1f, -48.1f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17.0f, 0.0f)
                lineToRelative(-28.3f, 28.3f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0.0f, 17.0f)
                lineToRelative(48.1f, 48.1f)
                lineToRelative(-48.1f, 48.1f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0.0f, 17.0f)
                lineToRelative(28.3f, 28.3f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17.0f, 0.0f)
                lineToRelative(48.1f, -48.1f)
                lineToRelative(48.1f, 48.1f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17.0f, 0.0f)
                lineToRelative(28.3f, -28.3f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0.0f, -17.0f)
                lineTo(269.3f, 352.0f)
                close()
            }
        }
        .build()
        return _calendarTimes!!
    }

private var _calendarTimes: ImageVector? = null
