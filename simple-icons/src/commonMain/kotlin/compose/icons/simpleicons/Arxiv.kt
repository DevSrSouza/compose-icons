package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Arxiv: VectorAsset
    get() {
        if (_arxiv != null) {
            return _arxiv!!
        }
        _arxiv = VectorAssetBuilder(name = "Arxiv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 15.404f)
                lineToRelative(-1.894f, -4.967f)
                horizontalLineToRelative(1.411f)
                lineToRelative(1.39f, 3.582f)
                lineToRelative(1.379f, -3.582f)
                horizontalLineToRelative(0.96f)
                lineToRelative(-1.92f, 4.967f)
                close()
                moveTo(16.298f, 9.6f)
                lineTo(16.298f, 8.48f)
                horizontalLineToRelative(1.34f)
                lineTo(17.638f, 9.6f)
                close()
                moveTo(16.298f, 15.408f)
                verticalLineToRelative(-4.971f)
                horizontalLineToRelative(1.34f)
                verticalLineToRelative(4.967f)
                close()
                moveTo(9.333f, 15.405f)
                lineToRelative(2.146f, -3.3f)
                lineTo(9.43f, 8.707f)
                horizontalLineToRelative(1.627f)
                lineToRelative(1.364f, 2.254f)
                lineTo(13.9f, 8.707f)
                horizontalLineToRelative(1.12f)
                lineToRelative(-2.046f, 3.156f)
                lineToRelative(2.126f, 3.537f)
                horizontalLineToRelative(-1.622f)
                lineToRelative(-1.45f, -2.4f)
                lineToRelative(-1.557f, 2.4f)
                lineTo(9.333f, 15.4f)
                close()
                moveTo(5.987f, 15.405f)
                verticalLineToRelative(-4.968f)
                horizontalLineToRelative(1.338f)
                verticalLineToRelative(0.937f)
                curveToRelative(0.344f, -0.7f, 0.875f, -1.051f, 1.585f, -1.051f)
                arcToRelative(1.401f, 1.401f, 0.0f, false, true, 0.248f, 0.026f)
                verticalLineToRelative(1.194f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.53f, -0.102f)
                curveToRelative(-0.537f, 0.0f, -0.968f, 0.267f, -1.303f, 0.8f)
                verticalLineToRelative(3.164f)
                close()
                moveTo(2.959f, 14.869f)
                quadToRelative(-0.664f, 0.65f, -1.437f, 0.65f)
                arcToRelative(1.473f, 1.473f, 0.0f, false, true, -1.06f, -0.398f)
                arcToRelative(1.376f, 1.376f, 0.0f, false, true, -0.406f, -1.03f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, true, 0.659f, -1.271f)
                quadToRelative(0.657f, -0.447f, 1.884f, -0.448f)
                horizontalLineToRelative(0.355f)
                verticalLineToRelative(-0.453f)
                quadToRelative(0.0f, -0.772f, -0.88f, -0.772f)
                arcToRelative(3.305f, 3.305f, 0.0f, false, false, -1.587f, 0.443f)
                verticalLineToRelative(-0.922f)
                arcToRelative(5.016f, 5.016f, 0.0f, false, true, 1.808f, -0.345f)
                quadToRelative(1.953f, 0.0f, 1.951f, 1.55f)
                verticalLineToRelative(2.206f)
                curveToRelative(0.0f, 0.39f, 0.123f, 0.58f, 0.376f, 0.58f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.174f, -0.02f)
                lineToRelative(0.032f, 0.751f)
                arcToRelative(2.745f, 2.745f, 0.0f, false, true, -0.751f, 0.13f)
                curveToRelative(-0.552f, 0.0f, -0.902f, -0.216f, -1.06f, -0.65f)
                horizontalLineToRelative(-0.054f)
                close()
                moveTo(2.959f, 14.149f)
                verticalLineToRelative(-1.01f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.866f, 0.0f, -1.297f, 0.274f, -1.297f, 0.815f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 0.64f, 0.648f)
                curveToRelative(0.329f, 0.004f, 0.647f, -0.15f, 0.977f, -0.453f)
                close()
            }
        }
        .build()
        return _arxiv!!
    }

private var _arxiv: VectorAsset? = null
