package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Kong: ImageVector
    get() {
        if (_kong != null) {
            return _kong!!
        }
        _kong = Builder(name = "Kong", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.88f, 18.96f)
                horizontalLineToRelative(4.405f)
                lineToRelative(2.286f, 2.876f)
                lineToRelative(-0.393f, 0.979f)
                horizontalLineToRelative(-5.69f)
                lineToRelative(0.139f, -0.979f)
                lineToRelative(-1.341f, -2.117f)
                lineToRelative(0.594f, -0.759f)
                close()
                moveTo(11.032f, 6.328f)
                lineTo(13.392f, 6.324f)
                lineTo(24.0f, 18.97f)
                lineToRelative(-0.824f, 3.845f)
                horizontalLineToRelative(-4.547f)
                lineToRelative(0.283f, -1.083f)
                lineTo(9.0f, 9.912f)
                lineToRelative(2.032f, -3.584f)
                close()
                moveTo(15.202f, 1.184f)
                lineTo(20.134f, 5.06f)
                lineTo(19.502f, 5.711f)
                lineTo(20.357f, 6.902f)
                verticalLineToRelative(1.273f)
                lineToRelative(-2.458f, 2.004f)
                lineToRelative(-4.135f, -4.884f)
                horizontalLineToRelative(-2.407f)
                lineToRelative(0.969f, -1.777f)
                lineToRelative(2.876f, -2.334f)
                close()
                moveTo(4.852f, 13.597f)
                lineToRelative(3.44f, -2.989f)
                lineToRelative(4.565f, 5.494f)
                lineToRelative(-1.296f, 2.012f)
                horizontalLineToRelative(-4.21f)
                lineToRelative(-2.912f, 3.822f)
                lineToRelative(-0.665f, 0.879f)
                lineTo(0.0f, 22.815f)
                verticalLineToRelative(-4.689f)
                lineToRelative(3.517f, -4.529f)
                horizontalLineToRelative(1.335f)
                close()
            }
        }
        .build()
        return _kong!!
    }

private var _kong: ImageVector? = null
