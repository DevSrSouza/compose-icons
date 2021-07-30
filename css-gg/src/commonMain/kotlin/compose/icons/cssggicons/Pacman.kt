package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Pacman: ImageVector
    get() {
        if (_pacman != null) {
            return _pacman!!
        }
        _pacman = Builder(name = "Pacman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0636f, 8.0f)
                curveTo(14.6159f, 8.0f, 15.0636f, 7.5523f, 15.0636f, 7.0f)
                curveTo(15.0636f, 6.4477f, 14.6159f, 6.0f, 14.0636f, 6.0f)
                curveTo(13.5113f, 6.0f, 13.0636f, 6.4477f, 13.0636f, 7.0f)
                curveTo(13.0636f, 7.5523f, 13.5113f, 8.0f, 14.0636f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 3.0f)
                curveTo(15.1523f, 3.0f, 17.1281f, 3.7555f, 18.6768f, 5.0158f)
                lineTo(20.124f, 6.463f)
                lineTo(18.8288f, 7.7582f)
                lineTo(18.828f, 7.7574f)
                lineTo(14.5854f, 12.0f)
                lineTo(18.2236f, 15.6383f)
                lineTo(18.2224f, 15.6396f)
                lineTo(20.1273f, 17.5445f)
                lineTo(18.7144f, 18.9575f)
                lineTo(18.7122f, 18.9553f)
                curveTo(17.1583f, 20.2329f, 15.1687f, 21.0f, 13.0f, 21.0f)
                curveTo(8.0294f, 21.0f, 4.0f, 16.9706f, 4.0f, 12.0f)
                curveTo(4.0f, 7.0294f, 8.0294f, 3.0f, 13.0f, 3.0f)
                close()
                moveTo(11.7569f, 12.0f)
                lineTo(17.2893f, 17.5323f)
                curveTo(16.1044f, 18.4523f, 14.6162f, 19.0f, 13.0f, 19.0f)
                curveTo(9.134f, 19.0f, 6.0f, 15.866f, 6.0f, 12.0f)
                curveTo(6.0f, 8.134f, 9.134f, 5.0f, 13.0f, 5.0f)
                curveTo(14.6162f, 5.0f, 16.1045f, 5.5477f, 17.2893f, 6.4677f)
                lineTo(11.7569f, 12.0f)
                close()
            }
        }
        .build()
        return _pacman!!
    }

private var _pacman: ImageVector? = null
