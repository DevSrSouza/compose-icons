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

public val LineAwesomeIcons.PennyArcade: ImageVector
    get() {
        if (_pennyArcade != null) {
            return _pennyArcade!!
        }
        _pennyArcade = Builder(name = "PennyArcade", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.688f, 7.006f)
                curveTo(23.526f, 6.991f, 23.36f, 7.004f, 23.195f, 7.047f)
                curveTo(19.681f, 7.973f, 21.258f, 7.557f, 16.414f, 8.836f)
                curveTo(15.975f, 8.952f, 15.624f, 9.272f, 15.471f, 9.695f)
                curveTo(7.214f, 8.952f, 0.0f, 10.953f, 0.0f, 14.553f)
                curveTo(0.0f, 16.207f, 1.534f, 17.866f, 4.045f, 19.262f)
                lineTo(4.133f, 20.145f)
                curveTo(3.549f, 20.367f, 3.183f, 20.945f, 3.242f, 21.561f)
                lineTo(3.457f, 23.756f)
                curveTo(3.527f, 24.463f, 4.13f, 25.001f, 4.848f, 25.0f)
                curveTo(5.107f, 25.0f, 4.697f, 25.088f, 10.975f, 23.432f)
                curveTo(11.604f, 23.266f, 12.031f, 22.69f, 12.004f, 22.049f)
                curveTo(22.834f, 24.295f, 32.103f, 21.754f, 31.998f, 17.861f)
                curveTo(31.999f, 16.47f, 30.89f, 14.572f, 27.1f, 12.701f)
                lineTo(24.826f, 7.805f)
                curveTo(24.612f, 7.346f, 24.172f, 7.051f, 23.688f, 7.006f)
                close()
                moveTo(23.555f, 8.373f)
                lineTo(26.889f, 15.557f)
                lineTo(27.93f, 15.281f)
                lineTo(28.145f, 17.477f)
                lineTo(22.717f, 18.908f)
                lineTo(22.521f, 16.959f)
                lineTo(23.266f, 16.762f)
                lineTo(22.936f, 16.037f)
                lineTo(20.047f, 16.799f)
                lineTo(19.842f, 17.664f)
                lineTo(20.803f, 17.41f)
                lineTo(21.006f, 19.363f)
                lineTo(15.361f, 20.848f)
                lineTo(15.139f, 18.654f)
                lineTo(16.189f, 18.379f)
                lineTo(17.844f, 12.135f)
                lineTo(16.984f, 12.359f)
                lineTo(16.775f, 10.162f)
                curveTo(21.443f, 8.928f, 20.026f, 9.302f, 23.555f, 8.373f)
                close()
                moveTo(13.168f, 11.27f)
                curveTo(16.001f, 11.214f, 16.375f, 14.817f, 15.295f, 16.426f)
                curveTo(14.681f, 17.265f, 13.78f, 17.856f, 12.758f, 18.09f)
                lineTo(11.66f, 18.379f)
                lineTo(9.24f, 19.016f)
                lineTo(9.363f, 20.18f)
                lineTo(10.391f, 19.906f)
                lineTo(10.615f, 22.105f)
                lineTo(4.85f, 23.625f)
                lineTo(4.635f, 21.428f)
                lineTo(5.637f, 21.162f)
                lineTo(5.08f, 15.504f)
                lineTo(4.074f, 15.77f)
                lineTo(3.855f, 13.572f)
                curveTo(12.763f, 11.225f, 12.366f, 11.281f, 13.168f, 11.27f)
                close()
                moveTo(21.096f, 11.471f)
                curveTo(20.871f, 12.431f, 21.027f, 11.77f, 20.342f, 14.695f)
                lineTo(22.328f, 14.172f)
                curveTo(21.21f, 11.722f, 21.463f, 12.274f, 21.096f, 11.471f)
                close()
                moveTo(11.082f, 13.943f)
                curveTo(10.99f, 13.951f, 10.893f, 13.966f, 10.791f, 13.994f)
                curveTo(9.781f, 14.261f, 10.225f, 14.146f, 8.809f, 14.518f)
                lineTo(9.031f, 16.799f)
                curveTo(10.44f, 16.424f, 10.063f, 16.524f, 10.773f, 16.338f)
                curveTo(12.757f, 15.884f, 12.465f, 13.832f, 11.082f, 13.943f)
                close()
            }
        }
        .build()
        return _pennyArcade!!
    }

private var _pennyArcade: ImageVector? = null
