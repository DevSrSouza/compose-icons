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

public val LineAwesomeIcons.GrinTears: ImageVector
    get() {
        if (_grinTears != null) {
            return _grinTears!!
        }
        _grinTears = Builder(name = "GrinTears", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.87f, 3.0f, 3.067f, 8.772f, 3.006f, 15.889f)
                curveTo(3.58f, 15.659f, 4.259f, 15.427f, 5.041f, 15.197f)
                curveTo(5.454f, 9.506f, 10.205f, 5.0f, 16.0f, 5.0f)
                curveTo(21.795f, 5.0f, 26.546f, 9.506f, 26.959f, 15.197f)
                curveTo(27.741f, 15.427f, 28.42f, 15.659f, 28.994f, 15.889f)
                curveTo(28.933f, 8.772f, 23.13f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(9.0f, 16.0f)
                lineTo(14.0f, 16.0f)
                lineTo(14.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(18.0f, 16.0f)
                lineTo(23.0f, 16.0f)
                lineTo(23.0f, 14.0f)
                lineTo(18.0f, 14.0f)
                close()
                moveTo(6.0f, 17.0f)
                curveTo(6.0f, 17.0f, 3.03f, 17.835f, 2.441f, 18.424f)
                curveTo(1.852f, 19.013f, 1.852f, 19.97f, 2.441f, 20.559f)
                curveTo(3.03f, 21.148f, 3.987f, 21.148f, 4.576f, 20.559f)
                curveTo(5.165f, 19.97f, 6.0f, 17.0f, 6.0f, 17.0f)
                close()
                moveTo(26.0f, 17.0f)
                curveTo(26.0f, 17.0f, 26.835f, 19.97f, 27.424f, 20.559f)
                curveTo(28.013f, 21.148f, 28.97f, 21.148f, 29.559f, 20.559f)
                curveTo(30.148f, 19.97f, 30.148f, 19.013f, 29.559f, 18.424f)
                curveTo(28.97f, 17.835f, 26.0f, 17.0f, 26.0f, 17.0f)
                close()
                moveTo(9.0f, 19.0f)
                curveTo(9.0f, 19.0f, 10.61f, 24.0f, 16.0f, 24.0f)
                curveTo(21.39f, 24.0f, 23.0f, 19.0f, 23.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                close()
                moveTo(6.428f, 21.4f)
                curveTo(6.282f, 21.633f, 6.134f, 21.829f, 5.99f, 21.973f)
                curveTo(5.669f, 22.294f, 5.296f, 22.541f, 4.891f, 22.715f)
                curveTo(7.172f, 26.475f, 11.291f, 29.0f, 16.0f, 29.0f)
                curveTo(20.709f, 29.0f, 24.828f, 26.475f, 27.109f, 22.715f)
                curveTo(26.704f, 22.541f, 26.331f, 22.295f, 26.01f, 21.973f)
                curveTo(25.865f, 21.828f, 25.718f, 21.632f, 25.572f, 21.4f)
                curveTo(23.681f, 24.738f, 20.103f, 27.0f, 16.0f, 27.0f)
                curveTo(11.897f, 27.0f, 8.319f, 24.738f, 6.428f, 21.4f)
                close()
            }
        }
        .build()
        return _grinTears!!
    }

private var _grinTears: ImageVector? = null
