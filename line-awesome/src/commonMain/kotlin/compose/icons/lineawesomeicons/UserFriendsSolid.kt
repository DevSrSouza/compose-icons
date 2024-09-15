package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.UserFriendsSolid: ImageVector
    get() {
        if (_userFriendsSolid != null) {
            return _userFriendsSolid!!
        }
        _userFriendsSolid = Builder(name = "UserFriendsSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                curveTo(5.699f, 7.0f, 3.0f, 9.699f, 3.0f, 13.0f)
                curveTo(3.0f, 14.984f, 3.977f, 16.75f, 5.469f, 17.844f)
                curveTo(2.832f, 19.152f, 1.0f, 21.863f, 1.0f, 25.0f)
                lineTo(3.0f, 25.0f)
                curveTo(3.0f, 21.676f, 5.676f, 19.0f, 9.0f, 19.0f)
                curveTo(12.324f, 19.0f, 15.0f, 21.676f, 15.0f, 25.0f)
                lineTo(17.0f, 25.0f)
                curveTo(17.0f, 21.676f, 19.676f, 19.0f, 23.0f, 19.0f)
                curveTo(26.324f, 19.0f, 29.0f, 21.676f, 29.0f, 25.0f)
                lineTo(31.0f, 25.0f)
                curveTo(31.0f, 21.863f, 29.168f, 19.152f, 26.531f, 17.844f)
                curveTo(28.023f, 16.75f, 29.0f, 14.984f, 29.0f, 13.0f)
                curveTo(29.0f, 9.699f, 26.301f, 7.0f, 23.0f, 7.0f)
                curveTo(19.699f, 7.0f, 17.0f, 9.699f, 17.0f, 13.0f)
                curveTo(17.0f, 14.984f, 17.977f, 16.75f, 19.469f, 17.844f)
                curveTo(18.012f, 18.566f, 16.789f, 19.707f, 16.0f, 21.125f)
                curveTo(15.211f, 19.707f, 13.988f, 18.566f, 12.531f, 17.844f)
                curveTo(14.023f, 16.75f, 15.0f, 14.984f, 15.0f, 13.0f)
                curveTo(15.0f, 9.699f, 12.301f, 7.0f, 9.0f, 7.0f)
                close()
                moveTo(9.0f, 9.0f)
                curveTo(11.223f, 9.0f, 13.0f, 10.777f, 13.0f, 13.0f)
                curveTo(13.0f, 15.223f, 11.223f, 17.0f, 9.0f, 17.0f)
                curveTo(6.777f, 17.0f, 5.0f, 15.223f, 5.0f, 13.0f)
                curveTo(5.0f, 10.777f, 6.777f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(23.0f, 9.0f)
                curveTo(25.223f, 9.0f, 27.0f, 10.777f, 27.0f, 13.0f)
                curveTo(27.0f, 15.223f, 25.223f, 17.0f, 23.0f, 17.0f)
                curveTo(20.777f, 17.0f, 19.0f, 15.223f, 19.0f, 13.0f)
                curveTo(19.0f, 10.777f, 20.777f, 9.0f, 23.0f, 9.0f)
                close()
            }
        }
        .build()
        return _userFriendsSolid!!
    }

private var _userFriendsSolid: ImageVector? = null
