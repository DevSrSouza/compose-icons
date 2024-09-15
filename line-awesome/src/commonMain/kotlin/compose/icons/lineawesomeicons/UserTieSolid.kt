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
                curveTo(12.145f, 4.0f, 9.0f, 7.145f, 9.0f, 11.0f)
                curveTo(9.0f, 13.379f, 10.211f, 15.484f, 12.031f, 16.75f)
                curveTo(7.926f, 18.352f, 5.0f, 22.352f, 5.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                curveTo(7.0f, 22.602f, 10.191f, 18.926f, 14.375f, 18.156f)
                lineTo(15.0f, 20.0f)
                lineTo(17.0f, 20.0f)
                lineTo(17.625f, 18.156f)
                curveTo(21.809f, 18.926f, 25.0f, 22.602f, 25.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                curveTo(27.0f, 22.352f, 24.074f, 18.352f, 19.969f, 16.75f)
                curveTo(21.789f, 15.484f, 23.0f, 13.379f, 23.0f, 11.0f)
                curveTo(23.0f, 7.145f, 19.855f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(18.773f, 6.0f, 21.0f, 8.227f, 21.0f, 11.0f)
                curveTo(21.0f, 13.773f, 18.773f, 16.0f, 16.0f, 16.0f)
                curveTo(13.227f, 16.0f, 11.0f, 13.773f, 11.0f, 11.0f)
                curveTo(11.0f, 8.227f, 13.227f, 6.0f, 16.0f, 6.0f)
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
