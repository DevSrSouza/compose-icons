package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NoMeetingRoom: ImageVector
    get() {
        if (_noMeetingRoom != null) {
            return _noMeetingRoom!!
        }
        _noMeetingRoom = Builder(name = "NoMeetingRoom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.88f)
                lineToRelative(2.0f, 2.0f)
                lineTo(19.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(6.12f, 3.0f)
                lineTo(14.0f, 10.88f)
                close()
                moveTo(12.0f, 11.71f)
                lineTo(12.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.29f)
                lineTo(2.41f, 2.13f)
                lineTo(1.0f, 3.54f)
                lineToRelative(4.0f, 4.0f)
                lineTo(5.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-4.46f)
                lineTo(20.46f, 23.0f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _noMeetingRoom!!
    }

private var _noMeetingRoom: ImageVector? = null
