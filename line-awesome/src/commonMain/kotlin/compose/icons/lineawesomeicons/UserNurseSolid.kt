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

public val LineAwesomeIcons.UserNurseSolid: ImageVector
    get() {
        if (_userNurseSolid != null) {
            return _userNurseSolid!!
        }
        _userNurseSolid = Builder(name = "UserNurseSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.156f, 4.0f)
                lineTo(10.0f, 4.813f)
                lineTo(9.0f, 10.438f)
                lineTo(9.0f, 14.0f)
                lineTo(9.094f, 14.0f)
                curveTo(9.383f, 15.992f, 10.496f, 17.73f, 12.094f, 18.813f)
                curveTo(8.527f, 20.344f, 6.0f, 23.883f, 6.0f, 28.0f)
                lineTo(8.0f, 28.0f)
                curveTo(8.0f, 25.469f, 9.172f, 23.215f, 11.0f, 21.75f)
                lineTo(11.0f, 22.406f)
                lineTo(11.281f, 22.719f)
                lineTo(15.281f, 26.719f)
                lineTo(16.0f, 27.406f)
                lineTo(16.719f, 26.719f)
                lineTo(20.719f, 22.719f)
                lineTo(21.0f, 22.406f)
                lineTo(21.0f, 21.75f)
                curveTo(22.828f, 23.215f, 24.0f, 25.469f, 24.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                curveTo(26.0f, 23.883f, 23.473f, 20.344f, 19.906f, 18.813f)
                curveTo(21.504f, 17.73f, 22.617f, 15.992f, 22.906f, 14.0f)
                lineTo(23.0f, 14.0f)
                lineTo(23.0f, 10.438f)
                lineTo(22.0f, 4.813f)
                lineTo(21.844f, 4.0f)
                close()
                moveTo(11.844f, 6.0f)
                lineTo(20.156f, 6.0f)
                lineTo(21.0f, 10.781f)
                lineTo(21.0f, 12.0f)
                lineTo(11.0f, 12.0f)
                lineTo(11.0f, 10.781f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 10.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(11.094f, 14.0f)
                lineTo(20.906f, 14.0f)
                curveTo(20.441f, 16.285f, 18.426f, 18.0f, 16.0f, 18.0f)
                curveTo(13.574f, 18.0f, 11.559f, 16.285f, 11.094f, 14.0f)
                close()
                moveTo(16.0f, 20.0f)
                curveTo(17.059f, 20.0f, 18.074f, 20.191f, 19.0f, 20.563f)
                lineTo(19.0f, 21.563f)
                lineTo(16.0f, 24.563f)
                lineTo(13.0f, 21.563f)
                lineTo(13.0f, 20.563f)
                curveTo(13.926f, 20.191f, 14.941f, 20.0f, 16.0f, 20.0f)
                close()
            }
        }
        .build()
        return _userNurseSolid!!
    }

private var _userNurseSolid: ImageVector? = null
