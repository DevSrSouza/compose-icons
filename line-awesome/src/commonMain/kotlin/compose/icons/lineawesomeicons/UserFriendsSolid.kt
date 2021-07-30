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
                curveTo(5.6992f, 7.0f, 3.0f, 9.6992f, 3.0f, 13.0f)
                curveTo(3.0f, 14.9844f, 3.9766f, 16.75f, 5.4688f, 17.8438f)
                curveTo(2.832f, 19.1523f, 1.0f, 21.8633f, 1.0f, 25.0f)
                lineTo(3.0f, 25.0f)
                curveTo(3.0f, 21.6758f, 5.6758f, 19.0f, 9.0f, 19.0f)
                curveTo(12.3242f, 19.0f, 15.0f, 21.6758f, 15.0f, 25.0f)
                lineTo(17.0f, 25.0f)
                curveTo(17.0f, 21.6758f, 19.6758f, 19.0f, 23.0f, 19.0f)
                curveTo(26.3242f, 19.0f, 29.0f, 21.6758f, 29.0f, 25.0f)
                lineTo(31.0f, 25.0f)
                curveTo(31.0f, 21.8633f, 29.168f, 19.1523f, 26.5313f, 17.8438f)
                curveTo(28.0234f, 16.75f, 29.0f, 14.9844f, 29.0f, 13.0f)
                curveTo(29.0f, 9.6992f, 26.3008f, 7.0f, 23.0f, 7.0f)
                curveTo(19.6992f, 7.0f, 17.0f, 9.6992f, 17.0f, 13.0f)
                curveTo(17.0f, 14.9844f, 17.9766f, 16.75f, 19.4688f, 17.8438f)
                curveTo(18.0117f, 18.5664f, 16.7891f, 19.707f, 16.0f, 21.125f)
                curveTo(15.2109f, 19.707f, 13.9883f, 18.5664f, 12.5313f, 17.8438f)
                curveTo(14.0234f, 16.75f, 15.0f, 14.9844f, 15.0f, 13.0f)
                curveTo(15.0f, 9.6992f, 12.3008f, 7.0f, 9.0f, 7.0f)
                close()
                moveTo(9.0f, 9.0f)
                curveTo(11.2227f, 9.0f, 13.0f, 10.7773f, 13.0f, 13.0f)
                curveTo(13.0f, 15.2227f, 11.2227f, 17.0f, 9.0f, 17.0f)
                curveTo(6.7773f, 17.0f, 5.0f, 15.2227f, 5.0f, 13.0f)
                curveTo(5.0f, 10.7773f, 6.7773f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(23.0f, 9.0f)
                curveTo(25.2227f, 9.0f, 27.0f, 10.7773f, 27.0f, 13.0f)
                curveTo(27.0f, 15.2227f, 25.2227f, 17.0f, 23.0f, 17.0f)
                curveTo(20.7773f, 17.0f, 19.0f, 15.2227f, 19.0f, 13.0f)
                curveTo(19.0f, 10.7773f, 20.7773f, 9.0f, 23.0f, 9.0f)
                close()
            }
        }
        .build()
        return _userFriendsSolid!!
    }

private var _userFriendsSolid: ImageVector? = null
