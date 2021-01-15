package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.908f, 24.0f)
                lineTo(3.804f, 24.0f)
                curveToRelative(-0.664f, 0.0f, -1.086f, -0.529f, -0.936f, -1.18f)
                lineToRelative(0.149f, -0.674f)
                horizontalLineToRelative(2.071f)
                curveToRelative(0.666f, 0.0f, 1.336f, -0.533f, 1.482f, -1.182f)
                lineToRelative(1.064f, -4.592f)
                curveToRelative(0.15f, -0.648f, 0.816f, -1.18f, 1.48f, -1.18f)
                horizontalLineToRelative(0.883f)
                curveToRelative(3.789f, 0.0f, 6.734f, -0.779f, 8.84f, -2.34f)
                reflectiveCurveToRelative(3.16f, -3.6f, 3.16f, -6.135f)
                curveToRelative(0.0f, -1.125f, -0.195f, -2.055f, -0.588f, -2.789f)
                curveToRelative(0.0f, -0.016f, -0.016f, -0.031f, -0.016f, -0.046f)
                lineToRelative(0.135f, 0.075f)
                curveToRelative(0.75f, 0.465f, 1.32f, 1.064f, 1.711f, 1.814f)
                curveToRelative(0.404f, 0.75f, 0.598f, 1.68f, 0.598f, 2.791f)
                curveToRelative(0.0f, 2.535f, -1.049f, 4.574f, -3.164f, 6.135f)
                curveToRelative(-2.1f, 1.545f, -5.055f, 2.324f, -8.834f, 2.324f)
                horizontalLineToRelative(-0.9f)
                curveToRelative(-0.66f, 0.0f, -1.334f, 0.525f, -1.484f, 1.186f)
                lineTo(8.39f, 22.812f)
                curveToRelative(-0.149f, 0.645f, -0.81f, 1.17f, -1.47f, 1.17f)
                lineTo(6.908f, 24.0f)
                close()
                moveTo(4.231f, 21.305f)
                lineTo(1.126f, 21.305f)
                curveToRelative(-0.663f, 0.0f, -1.084f, -0.529f, -0.936f, -1.18f)
                lineTo(4.563f, 1.182f)
                curveTo(4.714f, 0.529f, 5.378f, 0.0f, 6.044f, 0.0f)
                horizontalLineToRelative(6.465f)
                curveToRelative(1.395f, 0.0f, 2.609f, 0.098f, 3.648f, 0.289f)
                curveToRelative(1.035f, 0.189f, 1.92f, 0.519f, 2.684f, 0.99f)
                curveToRelative(0.736f, 0.465f, 1.322f, 1.072f, 1.697f, 1.818f)
                curveToRelative(0.389f, 0.748f, 0.584f, 1.68f, 0.584f, 2.797f)
                curveToRelative(0.0f, 2.535f, -1.051f, 4.574f, -3.164f, 6.119f)
                curveToRelative(-2.1f, 1.561f, -5.056f, 2.326f, -8.836f, 2.326f)
                horizontalLineToRelative(-0.883f)
                curveToRelative(-0.66f, 0.0f, -1.328f, 0.524f, -1.478f, 1.169f)
                lineTo(5.7f, 20.097f)
                curveToRelative(-0.149f, 0.646f, -0.817f, 1.172f, -1.485f, 1.172f)
                lineToRelative(0.016f, 0.036f)
                close()
                moveTo(11.677f, 3.936f)
                horizontalLineToRelative(-1.014f)
                curveToRelative(-0.666f, 0.0f, -1.332f, 0.529f, -1.48f, 1.178f)
                lineToRelative(-0.93f, 4.02f)
                curveToRelative(-0.15f, 0.648f, 0.27f, 1.179f, 0.93f, 1.179f)
                horizontalLineToRelative(0.766f)
                curveToRelative(1.664f, 0.0f, 2.97f, -0.343f, 3.9f, -1.021f)
                curveToRelative(0.929f, -0.686f, 1.395f, -1.654f, 1.395f, -2.912f)
                curveToRelative(0.0f, -0.83f, -0.301f, -1.445f, -0.9f, -1.84f)
                curveToRelative(-0.6f, -0.404f, -1.5f, -0.605f, -2.686f, -0.605f)
                lineToRelative(0.019f, 0.001f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
