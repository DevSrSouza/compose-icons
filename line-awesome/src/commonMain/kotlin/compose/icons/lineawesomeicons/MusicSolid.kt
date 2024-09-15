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

public val LineAwesomeIcons.MusicSolid: ImageVector
    get() {
        if (_musicSolid != null) {
            return _musicSolid!!
        }
        _musicSolid = Builder(name = "MusicSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.0f, 3.781f)
                lineTo(25.813f, 4.031f)
                lineTo(9.813f, 7.031f)
                lineTo(9.0f, 7.156f)
                lineTo(9.0f, 20.563f)
                curveTo(8.406f, 20.215f, 7.734f, 20.0f, 7.0f, 20.0f)
                curveTo(4.801f, 20.0f, 3.0f, 21.801f, 3.0f, 24.0f)
                curveTo(3.0f, 26.199f, 4.801f, 28.0f, 7.0f, 28.0f)
                curveTo(9.199f, 28.0f, 11.0f, 26.199f, 11.0f, 24.0f)
                lineTo(11.0f, 12.813f)
                lineTo(25.0f, 10.188f)
                lineTo(25.0f, 17.563f)
                curveTo(24.406f, 17.215f, 23.734f, 17.0f, 23.0f, 17.0f)
                curveTo(20.801f, 17.0f, 19.0f, 18.801f, 19.0f, 21.0f)
                curveTo(19.0f, 23.199f, 20.801f, 25.0f, 23.0f, 25.0f)
                curveTo(25.199f, 25.0f, 27.0f, 23.199f, 27.0f, 21.0f)
                close()
                moveTo(25.0f, 6.188f)
                lineTo(25.0f, 8.188f)
                lineTo(11.0f, 10.813f)
                lineTo(11.0f, 8.813f)
                close()
                moveTo(23.0f, 19.0f)
                curveTo(24.117f, 19.0f, 25.0f, 19.883f, 25.0f, 21.0f)
                curveTo(25.0f, 22.117f, 24.117f, 23.0f, 23.0f, 23.0f)
                curveTo(21.883f, 23.0f, 21.0f, 22.117f, 21.0f, 21.0f)
                curveTo(21.0f, 19.883f, 21.883f, 19.0f, 23.0f, 19.0f)
                close()
                moveTo(7.0f, 22.0f)
                curveTo(8.117f, 22.0f, 9.0f, 22.883f, 9.0f, 24.0f)
                curveTo(9.0f, 25.117f, 8.117f, 26.0f, 7.0f, 26.0f)
                curveTo(5.883f, 26.0f, 5.0f, 25.117f, 5.0f, 24.0f)
                curveTo(5.0f, 22.883f, 5.883f, 22.0f, 7.0f, 22.0f)
                close()
            }
        }
        .build()
        return _musicSolid!!
    }

private var _musicSolid: ImageVector? = null
