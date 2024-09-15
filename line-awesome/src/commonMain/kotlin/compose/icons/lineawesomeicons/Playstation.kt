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

public val LineAwesomeIcons.Playstation: ImageVector
    get() {
        if (_playstation != null) {
            return _playstation!!
        }
        _playstation = Builder(name = "Playstation", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.938f, 6.0f)
                lineTo(12.938f, 24.75f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 10.344f)
                curveTo(17.0f, 9.93f, 17.047f, 9.645f, 17.219f, 9.469f)
                curveTo(17.391f, 9.23f, 17.57f, 9.211f, 17.813f, 9.313f)
                curveTo(18.402f, 9.484f, 18.656f, 9.98f, 18.656f, 10.844f)
                lineTo(18.656f, 17.156f)
                curveTo(19.973f, 17.777f, 21.168f, 17.844f, 22.031f, 17.188f)
                curveTo(22.934f, 16.566f, 23.406f, 15.441f, 23.406f, 13.781f)
                curveTo(23.406f, 12.055f, 23.078f, 10.742f, 22.313f, 9.875f)
                curveTo(21.621f, 8.941f, 20.398f, 8.184f, 18.594f, 7.563f)
                curveTo(16.344f, 6.836f, 14.461f, 6.32f, 12.938f, 6.0f)
                close()
                moveTo(11.688f, 17.344f)
                lineTo(10.875f, 17.594f)
                lineTo(5.844f, 19.406f)
                lineTo(4.969f, 19.75f)
                curveTo(3.652f, 20.305f, 2.965f, 20.887f, 3.0f, 21.406f)
                curveTo(3.07f, 22.168f, 3.941f, 22.711f, 5.5f, 23.125f)
                curveTo(7.523f, 23.672f, 9.586f, 23.781f, 11.688f, 23.469f)
                lineTo(11.688f, 21.344f)
                lineTo(10.875f, 21.656f)
                lineTo(10.0f, 22.0f)
                lineTo(8.531f, 22.281f)
                lineTo(7.156f, 22.094f)
                curveTo(6.879f, 21.918f, 6.824f, 21.734f, 7.0f, 21.563f)
                curveTo(7.172f, 21.457f, 7.41f, 21.324f, 7.688f, 21.219f)
                lineTo(8.625f, 20.875f)
                lineTo(11.688f, 19.813f)
                close()
                moveTo(23.344f, 18.344f)
                curveTo(22.969f, 18.328f, 22.582f, 18.355f, 22.219f, 18.375f)
                curveTo(20.871f, 18.402f, 19.5f, 18.641f, 18.063f, 19.094f)
                lineTo(18.063f, 21.594f)
                lineTo(20.906f, 20.594f)
                lineTo(22.375f, 20.094f)
                curveTo(22.375f, 20.094f, 22.938f, 19.949f, 23.344f, 19.844f)
                curveTo(23.965f, 19.68f, 24.625f, 19.906f, 24.625f, 19.906f)
                curveTo(25.004f, 19.941f, 25.18f, 20.074f, 25.25f, 20.25f)
                curveTo(25.32f, 20.457f, 25.082f, 20.637f, 24.563f, 20.813f)
                lineTo(23.281f, 21.313f)
                lineTo(18.063f, 23.188f)
                lineTo(18.063f, 25.625f)
                lineTo(20.5f, 24.75f)
                lineTo(26.344f, 22.688f)
                lineTo(27.063f, 22.375f)
                curveTo(28.449f, 21.855f, 29.07f, 21.285f, 29.0f, 20.594f)
                curveTo(28.965f, 19.934f, 28.199f, 19.418f, 26.813f, 18.969f)
                curveTo(25.645f, 18.578f, 24.469f, 18.387f, 23.344f, 18.344f)
                close()
            }
        }
        .build()
        return _playstation!!
    }

private var _playstation: ImageVector? = null
