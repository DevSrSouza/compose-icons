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

public val LineAwesomeIcons.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.086f, 5.0f, 27.0f, 9.914f, 27.0f, 16.0f)
                curveTo(27.0f, 22.086f, 22.086f, 27.0f, 16.0f, 27.0f)
                curveTo(9.914f, 27.0f, 5.0f, 22.086f, 5.0f, 16.0f)
                curveTo(5.0f, 9.914f, 9.914f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(13.25f, 8.0f, 11.0f, 10.25f, 11.0f, 13.0f)
                curveTo(11.0f, 14.516f, 11.707f, 15.863f, 12.781f, 16.781f)
                curveTo(10.531f, 17.949f, 9.0f, 20.301f, 9.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                curveTo(11.0f, 20.227f, 13.227f, 18.0f, 16.0f, 18.0f)
                curveTo(18.773f, 18.0f, 21.0f, 20.227f, 21.0f, 23.0f)
                lineTo(23.0f, 23.0f)
                curveTo(23.0f, 20.301f, 21.469f, 17.949f, 19.219f, 16.781f)
                curveTo(20.293f, 15.863f, 21.0f, 14.516f, 21.0f, 13.0f)
                curveTo(21.0f, 10.25f, 18.75f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(17.668f, 10.0f, 19.0f, 11.332f, 19.0f, 13.0f)
                curveTo(19.0f, 14.668f, 17.668f, 16.0f, 16.0f, 16.0f)
                curveTo(14.332f, 16.0f, 13.0f, 14.668f, 13.0f, 13.0f)
                curveTo(13.0f, 11.332f, 14.332f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
