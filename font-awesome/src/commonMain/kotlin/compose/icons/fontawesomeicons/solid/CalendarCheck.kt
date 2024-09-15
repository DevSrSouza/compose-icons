package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) {
            return _calendarCheck!!
        }
        _calendarCheck = Builder(name = "CalendarCheck", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(436.0f, 160.0f)
                lineTo(12.0f, 160.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -5.37f, -12.0f, -12.0f)
                verticalLineToRelative(-36.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(48.0f)
                lineTo(96.0f, 12.0f)
                curveToRelative(0.0f, -6.63f, 5.37f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(128.0f)
                lineTo(288.0f, 12.0f)
                curveToRelative(0.0f, -6.63f, 5.37f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 6.63f, -5.37f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 192.0f)
                horizontalLineToRelative(424.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(260.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(0.0f, 204.0f)
                curveToRelative(0.0f, -6.63f, 5.37f, -12.0f, 12.0f, -12.0f)
                close()
                moveTo(345.3f, 287.95f)
                lineToRelative(-28.17f, -28.4f)
                curveToRelative(-4.67f, -4.7f, -12.27f, -4.74f, -16.97f, -0.07f)
                lineTo(194.12f, 364.67f)
                lineToRelative(-45.98f, -46.35f)
                curveToRelative(-4.67f, -4.7f, -12.27f, -4.74f, -16.97f, -0.07f)
                lineToRelative(-28.4f, 28.17f)
                curveToRelative(-4.7f, 4.67f, -4.74f, 12.27f, -0.07f, 16.97f)
                lineToRelative(82.6f, 83.27f)
                curveToRelative(4.67f, 4.7f, 12.27f, 4.74f, 16.97f, 0.07f)
                lineToRelative(142.95f, -141.8f)
                curveToRelative(4.7f, -4.67f, 4.74f, -12.27f, 0.07f, -16.97f)
                close()
            }
        }
        .build()
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
