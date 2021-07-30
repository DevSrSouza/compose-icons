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

public val SimpleIcons.Zerply: ImageVector
    get() {
        if (_zerply != null) {
            return _zerply!!
        }
        _zerply = Builder(name = "Zerply", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.779f, 18.746f)
                curveToRelative(-0.747f, 0.714f, -1.562f, 1.017f, -2.543f, 1.017f)
                curveToRelative(-1.32f, 0.0f, -3.322f, -0.61f, -4.846f, -1.66f)
                curveToRelative(-1.629f, -1.119f, -3.765f, -2.237f, -5.562f, -2.271f)
                curveToRelative(1.323f, -1.798f, 3.39f, -3.628f, 5.322f, -5.798f)
                curveToRelative(0.713f, -0.78f, 4.983f, -5.7f, 5.73f, -6.586f)
                curveToRelative(0.54f, -0.645f, 0.813f, -1.424f, 0.813f, -2.205f)
                curveToRelative(0.0f, -0.3f, -0.033f, -0.585f, -0.101f, -0.855f)
                curveToRelative(-2.035f, 0.405f, -3.561f, 0.601f, -6.001f, 0.601f)
                curveToRelative(-2.677f, 0.015f, -4.607f, -0.314f, -5.73f, -0.989f)
                curveToRelative(-0.78f, 1.018f, -1.56f, 2.373f, -1.56f, 3.12f)
                curveToRelative(0.0f, 0.948f, 0.918f, 1.728f, 3.189f, 1.728f)
                curveToRelative(0.746f, 0.0f, 1.965f, -0.034f, 3.66f, -0.169f)
                curveToRelative(-3.492f, 4.5f, -6.949f, 8.16f, -9.016f, 10.47f)
                curveToRelative(-0.713f, 0.781f, -1.121f, 1.83f, -1.121f, 2.881f)
                curveToRelative(0.0f, 0.405f, 0.075f, 0.81f, 0.18f, 1.185f)
                curveToRelative(0.645f, -0.104f, 1.291f, -0.179f, 1.965f, -0.179f)
                curveToRelative(1.395f, 0.0f, 2.79f, 0.299f, 4.081f, 0.839f)
                curveTo(11.805f, 21.014f, 14.205f, 24.0f, 16.921f, 24.0f)
                curveToRelative(2.204f, 0.0f, 4.065f, -1.741f, 4.065f, -4.036f)
                curveToRelative(0.0f, -0.404f, -0.061f, -0.825f, -0.195f, -1.229f)
                lineToRelative(-0.012f, 0.011f)
                close()
            }
        }
        .build()
        return _zerply!!
    }

private var _zerply: ImageVector? = null
