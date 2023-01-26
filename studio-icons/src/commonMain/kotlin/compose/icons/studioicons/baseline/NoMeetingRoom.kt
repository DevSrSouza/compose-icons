package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NoMeetingRoom: ImageVector
    get() {
        if (_noMeetingRoom != null) {
            return _noMeetingRoom!!
        }
        _noMeetingRoom = Builder(name = "NoMeetingRoom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(9.73f, 9.73f)
                lineTo(20.46f, 23.0f)
                lineTo(14.0f, 16.54f)
                lineTo(14.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 7.54f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(1.27f, -1.27f)
                lineTo(11.0f, 11.0f)
                close()
                moveTo(14.0f, 11.49f)
                lineTo(5.51f, 3.0f)
                lineTo(14.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(12.49f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(17.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.49f)
                close()
            }
        }
        .build()
        return _noMeetingRoom!!
    }

private var _noMeetingRoom: ImageVector? = null
