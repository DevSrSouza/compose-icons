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

public val LineAwesomeIcons.UserCircleSolid: ImageVector
    get() {
        if (_userCircleSolid != null) {
            return _userCircleSolid!!
        }
        _userCircleSolid = Builder(name = "UserCircleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                curveTo(22.0859f, 5.0f, 27.0f, 9.9141f, 27.0f, 16.0f)
                curveTo(27.0f, 22.0859f, 22.0859f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9141f, 27.0f, 5.0f, 22.0859f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9141f, 9.9141f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(13.25f, 8.0f, 11.0f, 10.25f, 11.0f, 13.0f)
                curveTo(11.0f, 14.5156f, 11.707f, 15.8633f, 12.7813f, 16.7813f)
                curveTo(10.5313f, 17.9492f, 9.0f, 20.3008f, 9.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                curveTo(11.0f, 20.2266f, 13.2266f, 18.0f, 16.0f, 18.0f)
                curveTo(18.7734f, 18.0f, 21.0f, 20.2266f, 21.0f, 23.0f)
                lineTo(23.0f, 23.0f)
                curveTo(23.0f, 20.3008f, 21.4688f, 17.9492f, 19.2188f, 16.7813f)
                curveTo(20.293f, 15.8633f, 21.0f, 14.5156f, 21.0f, 13.0f)
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
        return _userCircleSolid!!
    }

private var _userCircleSolid: ImageVector? = null
