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

public val LineAwesomeIcons.SpinnerSolid: ImageVector
    get() {
        if (_spinnerSolid != null) {
            return _spinnerSolid!!
        }
        _spinnerSolid = Builder(name = "SpinnerSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.344f, 3.0f, 13.0f, 4.344f, 13.0f, 6.0f)
                curveTo(13.0f, 7.656f, 14.344f, 9.0f, 16.0f, 9.0f)
                curveTo(17.656f, 9.0f, 19.0f, 7.656f, 19.0f, 6.0f)
                curveTo(19.0f, 4.344f, 17.656f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(8.938f, 6.438f)
                curveTo(7.559f, 6.438f, 6.438f, 7.559f, 6.438f, 8.938f)
                curveTo(6.438f, 10.316f, 7.559f, 11.438f, 8.938f, 11.438f)
                curveTo(10.316f, 11.438f, 11.438f, 10.316f, 11.438f, 8.938f)
                curveTo(11.438f, 7.559f, 10.316f, 6.438f, 8.938f, 6.438f)
                close()
                moveTo(23.063f, 7.938f)
                curveTo(22.512f, 7.938f, 22.063f, 8.387f, 22.063f, 8.938f)
                curveTo(22.063f, 9.488f, 22.512f, 9.938f, 23.063f, 9.938f)
                curveTo(23.613f, 9.938f, 24.063f, 9.488f, 24.063f, 8.938f)
                curveTo(24.063f, 8.387f, 23.613f, 7.938f, 23.063f, 7.938f)
                close()
                moveTo(6.0f, 13.75f)
                curveTo(4.758f, 13.75f, 3.75f, 14.758f, 3.75f, 16.0f)
                curveTo(3.75f, 17.242f, 4.758f, 18.25f, 6.0f, 18.25f)
                curveTo(7.242f, 18.25f, 8.25f, 17.242f, 8.25f, 16.0f)
                curveTo(8.25f, 14.758f, 7.242f, 13.75f, 6.0f, 13.75f)
                close()
                moveTo(26.0f, 14.75f)
                curveTo(25.309f, 14.75f, 24.75f, 15.309f, 24.75f, 16.0f)
                curveTo(24.75f, 16.691f, 25.309f, 17.25f, 26.0f, 17.25f)
                curveTo(26.691f, 17.25f, 27.25f, 16.691f, 27.25f, 16.0f)
                curveTo(27.25f, 15.309f, 26.691f, 14.75f, 26.0f, 14.75f)
                close()
                moveTo(8.938f, 21.063f)
                curveTo(7.832f, 21.063f, 6.938f, 21.957f, 6.938f, 23.063f)
                curveTo(6.938f, 24.168f, 7.832f, 25.063f, 8.938f, 25.063f)
                curveTo(10.043f, 25.063f, 10.938f, 24.168f, 10.938f, 23.063f)
                curveTo(10.938f, 21.957f, 10.043f, 21.063f, 8.938f, 21.063f)
                close()
                moveTo(23.063f, 21.563f)
                curveTo(22.234f, 21.563f, 21.563f, 22.234f, 21.563f, 23.063f)
                curveTo(21.563f, 23.891f, 22.234f, 24.563f, 23.063f, 24.563f)
                curveTo(23.891f, 24.563f, 24.563f, 23.891f, 24.563f, 23.063f)
                curveTo(24.563f, 22.234f, 23.891f, 21.563f, 23.063f, 21.563f)
                close()
                moveTo(16.0f, 24.25f)
                curveTo(15.035f, 24.25f, 14.25f, 25.035f, 14.25f, 26.0f)
                curveTo(14.25f, 26.965f, 15.035f, 27.75f, 16.0f, 27.75f)
                curveTo(16.965f, 27.75f, 17.75f, 26.965f, 17.75f, 26.0f)
                curveTo(17.75f, 25.035f, 16.965f, 24.25f, 16.0f, 24.25f)
                close()
            }
        }
        .build()
        return _spinnerSolid!!
    }

private var _spinnerSolid: ImageVector? = null
