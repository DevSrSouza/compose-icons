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

public val RegularGroup.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) {
            return _calendarCheck!!
        }
        _calendarCheck = Builder(name = "CalendarCheck", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 64.0f)
                horizontalLineToRelative(-48.0f)
                lineTo(352.0f, 12.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                lineTo(160.0f, 64.0f)
                lineTo(160.0f, 12.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                lineTo(48.0f, 64.0f)
                curveTo(21.49f, 64.0f, 0.0f, 85.49f, 0.0f, 112.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(448.0f, 112.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(394.0f, 464.0f)
                lineTo(54.0f, 464.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(48.0f, 160.0f)
                horizontalLineToRelative(352.0f)
                verticalLineToRelative(298.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                close()
                moveTo(341.151f, 263.35f)
                lineTo(198.842f, 404.519f)
                curveToRelative(-4.705f, 4.667f, -12.303f, 4.637f, -16.971f, -0.068f)
                lineToRelative(-75.091f, -75.699f)
                curveToRelative(-4.667f, -4.705f, -4.637f, -12.303f, 0.068f, -16.971f)
                lineToRelative(22.719f, -22.536f)
                curveToRelative(4.705f, -4.667f, 12.303f, -4.637f, 16.97f, 0.069f)
                lineToRelative(44.104f, 44.461f)
                lineToRelative(111.072f, -110.181f)
                curveToRelative(4.705f, -4.667f, 12.303f, -4.637f, 16.971f, 0.068f)
                lineToRelative(22.536f, 22.718f)
                curveToRelative(4.667f, 4.705f, 4.636f, 12.303f, -0.069f, 16.97f)
                close()
            }
        }
        .build()
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
