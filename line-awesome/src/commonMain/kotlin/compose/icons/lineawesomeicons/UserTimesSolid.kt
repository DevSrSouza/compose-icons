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

public val LineAwesomeIcons.UserTimesSolid: ImageVector
    get() {
        if (_userTimesSolid != null) {
            return _userTimesSolid!!
        }
        _userTimesSolid = Builder(name = "UserTimesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.145f, 2.0f, 5.0f, 5.145f, 5.0f, 9.0f)
                curveTo(5.0f, 11.41f, 6.23f, 13.551f, 8.094f, 14.813f)
                curveTo(4.527f, 16.344f, 2.0f, 19.883f, 2.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                curveTo(4.0f, 19.57f, 7.57f, 16.0f, 12.0f, 16.0f)
                curveTo(13.375f, 16.0f, 14.656f, 16.359f, 15.781f, 16.969f)
                curveTo(14.672f, 18.344f, 14.0f, 20.102f, 14.0f, 22.0f)
                curveTo(14.0f, 26.406f, 17.594f, 30.0f, 22.0f, 30.0f)
                curveTo(26.406f, 30.0f, 30.0f, 26.406f, 30.0f, 22.0f)
                curveTo(30.0f, 17.594f, 26.406f, 14.0f, 22.0f, 14.0f)
                curveTo(20.254f, 14.0f, 18.629f, 14.574f, 17.313f, 15.531f)
                curveTo(16.871f, 15.254f, 16.391f, 15.02f, 15.906f, 14.813f)
                curveTo(17.77f, 13.551f, 19.0f, 11.41f, 19.0f, 9.0f)
                curveTo(19.0f, 5.145f, 15.855f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(14.773f, 4.0f, 17.0f, 6.227f, 17.0f, 9.0f)
                curveTo(17.0f, 11.773f, 14.773f, 14.0f, 12.0f, 14.0f)
                curveTo(9.227f, 14.0f, 7.0f, 11.773f, 7.0f, 9.0f)
                curveTo(7.0f, 6.227f, 9.227f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveTo(25.324f, 16.0f, 28.0f, 18.676f, 28.0f, 22.0f)
                curveTo(28.0f, 25.324f, 25.324f, 28.0f, 22.0f, 28.0f)
                curveTo(18.676f, 28.0f, 16.0f, 25.324f, 16.0f, 22.0f)
                curveTo(16.0f, 18.676f, 18.676f, 16.0f, 22.0f, 16.0f)
                close()
                moveTo(19.719f, 18.281f)
                lineTo(18.281f, 19.719f)
                lineTo(20.563f, 22.0f)
                lineTo(18.281f, 24.281f)
                lineTo(19.719f, 25.719f)
                lineTo(22.0f, 23.438f)
                lineTo(24.281f, 25.719f)
                lineTo(25.719f, 24.281f)
                lineTo(23.438f, 22.0f)
                lineTo(25.719f, 19.719f)
                lineTo(24.281f, 18.281f)
                lineTo(22.0f, 20.563f)
                close()
            }
        }
        .build()
        return _userTimesSolid!!
    }

private var _userTimesSolid: ImageVector? = null
