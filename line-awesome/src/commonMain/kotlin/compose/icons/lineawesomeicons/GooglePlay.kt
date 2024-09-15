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

public val LineAwesomeIcons.GooglePlay: ImageVector
    get() {
        if (_googlePlay != null) {
            return _googlePlay!!
        }
        _googlePlay = Builder(name = "GooglePlay", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 3.0f)
                curveTo(7.676f, 2.992f, 7.609f, 3.027f, 7.531f, 3.031f)
                curveTo(7.465f, 3.035f, 7.41f, 3.02f, 7.344f, 3.031f)
                curveTo(7.332f, 3.031f, 7.324f, 3.031f, 7.313f, 3.031f)
                curveTo(7.281f, 3.031f, 7.25f, 3.031f, 7.219f, 3.031f)
                curveTo(7.109f, 3.055f, 7.004f, 3.098f, 6.906f, 3.156f)
                curveTo(6.801f, 3.211f, 6.703f, 3.285f, 6.625f, 3.375f)
                curveTo(6.234f, 3.703f, 6.0f, 4.211f, 6.0f, 4.688f)
                lineTo(6.0f, 27.469f)
                curveTo(6.0f, 27.961f, 6.219f, 28.555f, 6.75f, 28.844f)
                curveTo(6.789f, 28.863f, 6.836f, 28.859f, 6.875f, 28.875f)
                curveTo(6.906f, 28.887f, 6.938f, 28.898f, 6.969f, 28.906f)
                curveTo(7.445f, 29.066f, 7.941f, 28.973f, 8.313f, 28.75f)
                curveTo(8.324f, 28.75f, 8.332f, 28.75f, 8.344f, 28.75f)
                curveTo(8.773f, 28.488f, 17.75f, 23.0f, 17.75f, 23.0f)
                lineTo(22.531f, 20.125f)
                curveTo(22.531f, 20.125f, 26.586f, 17.672f, 27.125f, 17.344f)
                curveTo(27.582f, 17.066f, 28.008f, 16.539f, 28.0f, 15.906f)
                curveTo(27.992f, 15.273f, 27.555f, 14.805f, 27.125f, 14.563f)
                curveTo(26.988f, 14.484f, 25.785f, 13.762f, 24.688f, 13.094f)
                curveTo(23.637f, 12.453f, 22.715f, 11.898f, 22.625f, 11.844f)
                curveTo(22.594f, 11.82f, 22.563f, 11.801f, 22.531f, 11.781f)
                lineTo(17.75f, 8.875f)
                curveTo(17.75f, 8.875f, 9.051f, 3.598f, 8.531f, 3.281f)
                curveTo(8.301f, 3.145f, 8.027f, 3.031f, 7.75f, 3.0f)
                close()
                moveTo(8.0f, 6.094f)
                lineTo(17.438f, 15.938f)
                lineTo(8.0f, 25.781f)
                close()
                moveTo(12.813f, 8.219f)
                curveTo(14.578f, 9.289f, 16.719f, 10.594f, 16.719f, 10.594f)
                lineTo(20.406f, 12.844f)
                lineTo(18.813f, 14.5f)
                close()
                moveTo(22.156f, 13.906f)
                curveTo(22.539f, 14.141f, 22.891f, 14.348f, 23.656f, 14.813f)
                curveTo(24.492f, 15.32f, 25.074f, 15.645f, 25.563f, 15.938f)
                curveTo(24.645f, 16.492f, 22.902f, 17.566f, 22.188f, 18.0f)
                lineTo(20.219f, 15.938f)
                close()
                moveTo(18.813f, 17.406f)
                lineTo(20.406f, 19.063f)
                lineTo(16.719f, 21.313f)
                curveTo(16.719f, 21.313f, 14.527f, 22.629f, 12.781f, 23.688f)
                close()
            }
        }
        .build()
        return _googlePlay!!
    }

private var _googlePlay: ImageVector? = null
