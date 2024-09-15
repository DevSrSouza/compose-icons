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

public val LineAwesomeIcons.JediOrder: ImageVector
    get() {
        if (_jediOrder != null) {
            return _jediOrder!!
        }
        _jediOrder = Builder(name = "JediOrder", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.486f, 3.0f)
                curveTo(15.486f, 3.0f, 15.174f, 14.95f, 15.045f, 19.854f)
                lineTo(13.293f, 17.293f)
                lineTo(14.42f, 20.389f)
                lineTo(10.928f, 20.896f)
                lineTo(14.42f, 21.404f)
                lineTo(13.07f, 24.049f)
                lineTo(14.994f, 22.029f)
                curveTo(14.894f, 25.867f, 14.871f, 26.811f, 14.871f, 26.811f)
                curveTo(14.871f, 26.811f, 6.258f, 22.811f, 11.045f, 13.973f)
                curveTo(11.045f, 13.973f, 5.075f, 7.382f, 10.482f, 3.332f)
                curveTo(10.482f, 3.332f, 1.249f, 8.907f, 7.107f, 18.48f)
                curveTo(7.107f, 18.48f, 2.264f, 13.75f, 4.797f, 8.969f)
                curveTo(4.797f, 8.969f, 0.407f, 15.161f, 5.758f, 21.973f)
                curveTo(5.758f, 21.973f, 4.296f, 21.076f, 3.002f, 17.639f)
                curveTo(3.002f, 17.639f, 3.944f, 27.865f, 15.387f, 27.998f)
                lineTo(15.615f, 27.998f)
                curveTo(27.051f, 27.866f, 28.0f, 17.641f, 28.0f, 17.641f)
                curveTo(26.683f, 21.072f, 25.217f, 21.975f, 25.217f, 21.975f)
                curveTo(30.567f, 15.163f, 26.176f, 8.971f, 26.176f, 8.971f)
                curveTo(28.709f, 13.758f, 23.865f, 18.482f, 23.865f, 18.482f)
                curveTo(29.723f, 8.914f, 20.49f, 3.336f, 20.49f, 3.336f)
                curveTo(25.896f, 7.392f, 19.928f, 13.975f, 19.928f, 13.975f)
                curveTo(24.715f, 22.812f, 16.102f, 26.813f, 16.102f, 26.813f)
                curveTo(16.102f, 26.813f, 16.08f, 25.869f, 15.979f, 22.031f)
                curveTo(16.219f, 22.282f, 17.902f, 24.051f, 17.902f, 24.051f)
                lineTo(16.553f, 21.406f)
                lineTo(20.047f, 20.898f)
                lineTo(16.553f, 20.391f)
                lineTo(17.68f, 17.295f)
                lineTo(15.928f, 19.855f)
                curveTo(15.804f, 14.961f, 15.492f, 3.1f, 15.486f, 3.0f)
                close()
            }
        }
        .build()
        return _jediOrder!!
    }

private var _jediOrder: ImageVector? = null
