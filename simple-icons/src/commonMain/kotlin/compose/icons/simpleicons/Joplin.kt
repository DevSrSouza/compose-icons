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

public val SimpleIcons.Joplin: ImageVector
    get() {
        if (_joplin != null) {
            return _joplin!!
        }
        _joplin = Builder(name = "Joplin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.969f, 0.0f)
                horizontalLineToRelative(-8.904f)
                curveToRelative(-0.084f, 0.0f, -0.152f, 0.068f, -0.152f, 0.152f)
                verticalLineToRelative(2.827f)
                curveToRelative(0.0f, 0.095f, 0.077f, 0.172f, 0.172f, 0.172f)
                horizontalLineToRelative(1.221f)
                curveToRelative(0.493f, 0.0f, 0.894f, 0.38f, 0.937f, 0.863f)
                verticalLineToRelative(13.378f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.017f, 0.363f)
                lineToRelative(-0.05f, 0.282f)
                curveToRelative(-0.011f, 0.044f, -0.02f, 0.089f, -0.033f, 0.132f)
                curveToRelative(-0.081f, 0.258f, -0.208f, 0.497f, -0.384f, 0.708f)
                curveToRelative(-0.007f, 0.007f, -0.015f, 0.014f, -0.021f, 0.021f)
                curveToRelative(-0.054f, 0.063f, -0.11f, 0.123f, -0.172f, 0.18f)
                curveToRelative(-0.063f, 0.057f, -0.13f, 0.11f, -0.2f, 0.16f)
                curveToRelative(-0.498f, 0.353f, -1.169f, 0.508f, -1.918f, 0.436f)
                curveToRelative(-0.955f, -0.089f, -1.903f, -0.523f, -2.669f, -1.22f)
                curveToRelative(-0.765f, -0.696f, -1.242f, -1.558f, -1.34f, -2.427f)
                curveToRelative(-0.089f, -0.778f, 0.144f, -1.462f, 0.655f, -1.927f)
                curveToRelative(0.002f, -0.001f, 0.003f, -0.002f, 0.004f, -0.003f)
                curveToRelative(0.02f, -0.018f, 0.041f, -0.033f, 0.062f, -0.05f)
                curveToRelative(0.366f, -0.307f, 0.842f, -0.493f, 1.387f, -0.544f)
                curveToRelative(0.006f, 0.0f, 0.012f, -0.001f, 0.017f, -0.002f)
                lineToRelative(0.298f, -0.014f)
                lineToRelative(0.35f, 0.017f)
                curveToRelative(0.008f, 0.0f, 0.016f, 0.002f, 0.024f, 0.003f)
                curveToRelative(0.499f, 0.05f, 0.993f, 0.199f, 1.462f, 0.425f)
                curveToRelative(0.01f, 0.0f, 0.022f, 0.003f, 0.036f, 0.011f)
                curveToRelative(0.143f, 0.079f, 0.17f, -0.005f, 0.174f, -0.061f)
                verticalLineToRelative(-4.256f)
                curveToRelative(0.0f, -0.122f, -0.085f, -0.23f, -0.203f, -0.256f)
                curveToRelative(-2.527f, -0.556f, -5.005f, 0.022f, -6.754f, 1.615f)
                curveToRelative(-1.528f, 1.389f, -2.267f, 3.395f, -2.027f, 5.502f)
                curveToRelative(0.213f, 1.876f, 1.176f, 3.679f, 2.712f, 5.076f)
                curveToRelative(1.497f, 1.362f, 3.402f, 2.213f, 5.368f, 2.399f)
                curveToRelative(0.271f, 0.025f, 0.543f, 0.038f, 0.809f, 0.038f)
                curveToRelative(1.877f, 0.0f, 3.619f, -0.644f, 4.905f, -1.814f)
                curveToRelative(1.218f, -1.109f, 1.948f, -2.632f, 2.055f, -4.288f)
                lineToRelative(0.01f, -10.866f)
                horizontalLineToRelative(0.001f)
                verticalLineToRelative(-2.955f)
                curveToRelative(0.011f, -0.513f, 0.429f, -0.926f, 0.945f, -0.926f)
                horizontalLineToRelative(1.221f)
                curveToRelative(0.095f, 0.0f, 0.172f, -0.077f, 0.172f, -0.172f)
                verticalLineToRelative(-2.827f)
                curveToRelative(0.0f, -0.084f, -0.068f, -0.152f, -0.152f, -0.152f)
                close()
            }
        }
        .build()
        return _joplin!!
    }

private var _joplin: ImageVector? = null
