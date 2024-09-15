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

public val LineAwesomeIcons.PhoneSolid: ImageVector
    get() {
        if (_phoneSolid != null) {
            return _phoneSolid!!
        }
        _phoneSolid = Builder(name = "PhoneSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.656f, 3.0f)
                curveTo(8.133f, 3.0f, 7.617f, 3.188f, 7.188f, 3.531f)
                lineTo(7.125f, 3.563f)
                lineTo(7.094f, 3.594f)
                lineTo(3.969f, 6.813f)
                lineTo(4.0f, 6.844f)
                curveTo(3.035f, 7.734f, 2.738f, 9.066f, 3.156f, 10.219f)
                curveTo(3.16f, 10.227f, 3.152f, 10.242f, 3.156f, 10.25f)
                curveTo(4.004f, 12.676f, 6.172f, 17.359f, 10.406f, 21.594f)
                curveTo(14.656f, 25.844f, 19.402f, 27.926f, 21.75f, 28.844f)
                lineTo(21.781f, 28.844f)
                curveTo(22.996f, 29.25f, 24.313f, 28.961f, 25.25f, 28.156f)
                lineTo(28.406f, 25.0f)
                curveTo(29.234f, 24.172f, 29.234f, 22.734f, 28.406f, 21.906f)
                lineTo(24.344f, 17.844f)
                lineTo(24.313f, 17.781f)
                curveTo(23.484f, 16.953f, 22.016f, 16.953f, 21.188f, 17.781f)
                lineTo(19.188f, 19.781f)
                curveTo(18.465f, 19.434f, 16.742f, 18.543f, 15.094f, 16.969f)
                curveTo(13.457f, 15.406f, 12.621f, 13.609f, 12.313f, 12.906f)
                lineTo(14.313f, 10.906f)
                curveTo(15.152f, 10.066f, 15.168f, 8.668f, 14.281f, 7.844f)
                lineTo(14.313f, 7.813f)
                lineTo(14.219f, 7.719f)
                lineTo(10.219f, 3.594f)
                lineTo(10.188f, 3.563f)
                lineTo(10.125f, 3.531f)
                curveTo(9.695f, 3.188f, 9.18f, 3.0f, 8.656f, 3.0f)
                close()
                moveTo(8.656f, 5.0f)
                curveTo(8.73f, 5.0f, 8.805f, 5.035f, 8.875f, 5.094f)
                lineTo(12.875f, 9.188f)
                lineTo(12.969f, 9.281f)
                curveTo(12.961f, 9.273f, 13.027f, 9.379f, 12.906f, 9.5f)
                lineTo(10.406f, 12.0f)
                lineTo(9.938f, 12.438f)
                lineTo(10.156f, 13.063f)
                curveTo(10.156f, 13.063f, 11.305f, 16.137f, 13.719f, 18.438f)
                lineTo(13.938f, 18.625f)
                curveTo(16.262f, 20.746f, 19.0f, 21.906f, 19.0f, 21.906f)
                lineTo(19.625f, 22.188f)
                lineTo(22.594f, 19.219f)
                curveTo(22.766f, 19.047f, 22.734f, 19.047f, 22.906f, 19.219f)
                lineTo(27.0f, 23.313f)
                curveTo(27.172f, 23.484f, 27.172f, 23.422f, 27.0f, 23.594f)
                lineTo(23.938f, 26.656f)
                curveTo(23.477f, 27.051f, 22.988f, 27.133f, 22.406f, 26.938f)
                curveTo(20.141f, 26.047f, 15.738f, 24.113f, 11.813f, 20.188f)
                curveTo(7.855f, 16.23f, 5.789f, 11.742f, 5.031f, 9.563f)
                curveTo(4.879f, 9.156f, 4.988f, 8.555f, 5.344f, 8.25f)
                lineTo(5.406f, 8.188f)
                lineTo(8.438f, 5.094f)
                curveTo(8.508f, 5.035f, 8.582f, 5.0f, 8.656f, 5.0f)
                close()
            }
        }
        .build()
        return _phoneSolid!!
    }

private var _phoneSolid: ImageVector? = null
