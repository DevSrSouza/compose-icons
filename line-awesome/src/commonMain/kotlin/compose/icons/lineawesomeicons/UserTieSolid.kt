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

public val LineAwesomeIcons.UserTieSolid: ImageVector
    get() {
        if (_userTieSolid != null) {
            return _userTieSolid!!
        }
        _userTieSolid = Builder(name = "UserTieSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(12.1445f, 4.0f, 9.0f, 7.1445f, 9.0f, 11.0f)
                curveTo(9.0f, 13.3789f, 10.2109f, 15.4844f, 12.0313f, 16.75f)
                curveTo(7.9258f, 18.3516f, 5.0f, 22.3516f, 5.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                curveTo(7.0f, 22.6016f, 10.1914f, 18.9258f, 14.375f, 18.1563f)
                lineTo(15.0f, 20.0f)
                lineTo(17.0f, 20.0f)
                lineTo(17.625f, 18.1563f)
                curveTo(21.8086f, 18.9258f, 25.0f, 22.6016f, 25.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                curveTo(27.0f, 22.3516f, 24.0742f, 18.3516f, 19.9688f, 16.75f)
                curveTo(21.7891f, 15.4844f, 23.0f, 13.3789f, 23.0f, 11.0f)
                curveTo(23.0f, 7.1445f, 19.8555f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(18.7734f, 6.0f, 21.0f, 8.2266f, 21.0f, 11.0f)
                curveTo(21.0f, 13.7734f, 18.7734f, 16.0f, 16.0f, 16.0f)
                curveTo(13.2266f, 16.0f, 11.0f, 13.7734f, 11.0f, 11.0f)
                curveTo(11.0f, 8.2266f, 13.2266f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(15.0f, 21.0f)
                lineTo(14.0f, 27.0f)
                lineTo(18.0f, 27.0f)
                lineTo(17.0f, 21.0f)
                close()
            }
        }
        .build()
        return _userTieSolid!!
    }

private var _userTieSolid: ImageVector? = null
