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

public val SimpleIcons.Swagger: ImageVector
    get() {
        if (_swagger != null) {
            return _swagger!!
        }
        _swagger = Builder(name = "Swagger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.616f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.616f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.144f)
                curveToRelative(5.995f, 0.0f, 10.856f, 4.86f, 10.856f, 10.856f)
                curveToRelative(0.0f, 5.995f, -4.86f, 10.856f, -10.856f, 10.856f)
                curveToRelative(-5.996f, 0.0f, -10.856f, -4.86f, -10.856f, -10.856f)
                curveTo(1.144f, 6.004f, 6.004f, 1.144f, 12.0f, 1.144f)
                close()
                moveTo(8.37f, 5.868f)
                arcToRelative(6.707f, 6.707f, 0.0f, false, false, -0.423f, 0.005f)
                curveToRelative(-0.983f, 0.056f, -1.573f, 0.517f, -1.735f, 1.472f)
                curveToRelative(-0.115f, 0.665f, -0.096f, 1.348f, -0.143f, 2.017f)
                curveToRelative(-0.013f, 0.35f, -0.05f, 0.697f, -0.115f, 1.038f)
                curveToRelative(-0.134f, 0.609f, -0.397f, 0.798f, -1.016f, 0.83f)
                arcToRelative(2.65f, 2.65f, 0.0f, false, false, -0.244f, 0.042f)
                verticalLineToRelative(1.463f)
                curveToRelative(1.126f, 0.055f, 1.278f, 0.452f, 1.37f, 1.629f)
                curveToRelative(0.033f, 0.429f, -0.013f, 0.858f, 0.015f, 1.287f)
                curveToRelative(0.018f, 0.406f, 0.073f, 0.808f, 0.156f, 1.2f)
                curveToRelative(0.259f, 1.075f, 1.307f, 1.435f, 2.575f, 1.218f)
                verticalLineToRelative(-1.283f)
                curveToRelative(-0.203f, 0.0f, -0.383f, 0.005f, -0.558f, 0.0f)
                curveToRelative(-0.43f, -0.013f, -0.591f, -0.12f, -0.632f, -0.535f)
                curveToRelative(-0.056f, -0.535f, -0.042f, -1.08f, -0.075f, -1.62f)
                curveToRelative(-0.064f, -1.001f, -0.175f, -1.988f, -1.153f, -2.625f)
                curveToRelative(0.503f, -0.37f, 0.868f, -0.812f, 0.983f, -1.398f)
                curveToRelative(0.083f, -0.41f, 0.134f, -0.821f, 0.166f, -1.237f)
                curveToRelative(0.028f, -0.415f, -0.023f, -0.84f, 0.014f, -1.25f)
                curveToRelative(0.06f, -0.665f, 0.102f, -0.937f, 0.9f, -0.91f)
                curveToRelative(0.12f, 0.0f, 0.235f, -0.017f, 0.369f, -0.027f)
                verticalLineToRelative(-1.31f)
                curveToRelative(-0.16f, 0.0f, -0.31f, -0.004f, -0.454f, -0.006f)
                close()
                moveTo(15.963f, 5.877f)
                arcToRelative(4.247f, 4.247f, 0.0f, false, false, -0.813f, 0.06f)
                verticalLineToRelative(1.274f)
                curveToRelative(0.245f, 0.0f, 0.434f, 0.0f, 0.623f, 0.005f)
                curveToRelative(0.328f, 0.004f, 0.577f, 0.13f, 0.61f, 0.494f)
                curveToRelative(0.032f, 0.332f, 0.031f, 0.669f, 0.064f, 1.006f)
                curveToRelative(0.065f, 0.669f, 0.101f, 1.347f, 0.217f, 2.007f)
                curveToRelative(0.102f, 0.544f, 0.475f, 0.95f, 0.941f, 1.283f)
                curveToRelative(-0.817f, 0.549f, -1.057f, 1.333f, -1.098f, 2.215f)
                curveToRelative(-0.023f, 0.604f, -0.037f, 1.213f, -0.069f, 1.822f)
                curveToRelative(-0.028f, 0.554f, -0.222f, 0.734f, -0.78f, 0.748f)
                curveToRelative(-0.157f, 0.004f, -0.31f, 0.018f, -0.484f, 0.028f)
                verticalLineToRelative(1.305f)
                curveToRelative(0.327f, 0.0f, 0.627f, 0.019f, 0.927f, 0.0f)
                curveToRelative(0.932f, -0.055f, 1.495f, -0.507f, 1.68f, -1.412f)
                curveToRelative(0.078f, -0.498f, 0.124f, -1.0f, 0.138f, -1.504f)
                curveToRelative(0.032f, -0.461f, 0.028f, -0.927f, 0.074f, -1.384f)
                curveToRelative(0.069f, -0.715f, 0.397f, -1.01f, 1.112f, -1.057f)
                arcToRelative(0.972f, 0.972f, 0.0f, false, false, 0.199f, -0.046f)
                verticalLineToRelative(-1.463f)
                curveToRelative(-0.12f, -0.014f, -0.204f, -0.027f, -0.291f, -0.032f)
                curveToRelative(-0.536f, -0.023f, -0.804f, -0.203f, -0.937f, -0.71f)
                arcToRelative(5.146f, 5.146f, 0.0f, false, true, -0.152f, -0.993f)
                curveToRelative(-0.037f, -0.618f, -0.033f, -1.241f, -0.074f, -1.86f)
                curveToRelative(-0.08f, -1.192f, -0.794f, -1.753f, -1.887f, -1.786f)
                close()
                moveTo(9.073f, 11.157f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, false, -0.083f, 1.684f)
                horizontalLineToRelative(0.055f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, false, 0.877f, -0.78f)
                verticalLineToRelative(-0.046f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, false, -0.83f, -0.858f)
                close()
                moveTo(11.984f, 11.157f)
                arcToRelative(0.808f, 0.808f, 0.0f, false, false, -0.834f, 0.78f)
                curveToRelative(0.0f, 0.027f, 0.0f, 0.05f, 0.004f, 0.078f)
                curveToRelative(0.0f, 0.503f, 0.342f, 0.826f, 0.859f, 0.826f)
                curveToRelative(0.507f, 0.0f, 0.826f, -0.332f, 0.826f, -0.853f)
                curveToRelative(-0.005f, -0.503f, -0.342f, -0.836f, -0.855f, -0.831f)
                close()
                moveTo(14.947f, 11.157f)
                arcToRelative(0.861f, 0.861f, 0.0f, false, false, -0.876f, 0.835f)
                curveToRelative(0.0f, 0.47f, 0.378f, 0.849f, 0.849f, 0.849f)
                horizontalLineToRelative(0.009f)
                curveToRelative(0.425f, 0.074f, 0.853f, -0.337f, 0.881f, -0.83f)
                curveToRelative(0.023f, -0.457f, -0.392f, -0.854f, -0.863f, -0.854f)
                close()
            }
        }
        .build()
        return _swagger!!
    }

private var _swagger: ImageVector? = null
