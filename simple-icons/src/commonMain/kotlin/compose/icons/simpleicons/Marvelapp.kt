package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Marvelapp: ImageVector
    get() {
        if (_marvelapp != null) {
            return _marvelapp!!
        }
        _marvelapp = Builder(name = "Marvelapp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.339f, 8.13f)
                curveToRelative(1.373f, 0.0f, -1.162f, 7.076f, -0.845f, 10.138f)
                curveToRelative(0.317f, 3.063f, 3.696f, 2.218f, 3.485f, 0.423f)
                curveToRelative(-0.423f, -3.063f, 1.69f, -12.672f, 3.696f, -12.672f)
                curveToRelative(1.478f, 0.0f, -1.69f, 6.547f, -1.056f, 10.665f)
                curveToRelative(0.422f, 2.64f, 4.012f, 1.901f, 3.59f, 0.106f)
                curveToRelative(-1.162f, -5.386f, 2.64f, -10.56f, 2.112f, -14.361f)
                curveTo(21.11f, 0.845f, 20.159f, 0.0f, 19.209f, 0.0f)
                curveToRelative(-3.379f, 0.0f, -6.125f, 6.97f, -6.125f, 6.97f)
                reflectiveCurveToRelative(0.423f, -3.908f, -2.428f, -4.119f)
                curveTo(6.643f, 2.64f, 2.525f, 12.777f, 2.63f, 21.964f)
                curveToRelative(0.106f, 2.957f, 3.696f, 2.429f, 3.485f, 0.106f)
                curveToRelative(-0.211f, -4.12f, 2.112f, -13.94f, 4.225f, -13.94f)
                close()
            }
        }
        .build()
        return _marvelapp!!
    }

private var _marvelapp: ImageVector? = null
