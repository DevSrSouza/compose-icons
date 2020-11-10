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

public val SimpleIcons.Visa: VectorAsset
    get() {
        if (_visa != null) {
            return _visa!!
        }
        _visa = VectorAssetBuilder(name = "Visa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.445f, 8.623f)
                curveToRelative(-0.387f, -0.146f, -0.99f, -0.301f, -1.74f, -0.301f)
                curveToRelative(-1.92f, 0.0f, -3.275f, 0.968f, -3.285f, 2.355f)
                curveToRelative(-0.012f, 1.02f, 0.964f, 1.594f, 1.701f, 1.936f)
                curveToRelative(0.757f, 0.35f, 1.01f, 0.57f, 1.008f, 0.885f)
                curveToRelative(-0.005f, 0.477f, -0.605f, 0.693f, -1.162f, 0.693f)
                curveToRelative(-0.766f, 0.0f, -1.186f, -0.107f, -1.831f, -0.375f)
                lineToRelative(-0.239f, -0.111f)
                lineToRelative(-0.271f, 1.598f)
                curveToRelative(0.466f, 0.195f, 1.306f, 0.362f, 2.175f, 0.375f)
                curveToRelative(2.041f, 0.0f, 3.375f, -0.961f, 3.391f, -2.439f)
                curveToRelative(0.016f, -0.813f, -0.51f, -1.43f, -1.621f, -1.938f)
                curveToRelative(-0.674f, -0.33f, -1.094f, -0.551f, -1.094f, -0.886f)
                curveToRelative(0.0f, -0.296f, 0.359f, -0.612f, 1.109f, -0.612f)
                curveToRelative(0.645f, -0.01f, 1.096f, 0.129f, 1.455f, 0.273f)
                lineToRelative(0.18f, 0.081f)
                lineToRelative(0.271f, -1.544f)
                lineToRelative(-0.047f, 0.01f)
                close()
                moveTo(22.428f, 8.453f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.467f, 0.0f, -0.816f, 0.127f, -1.021f, 0.591f)
                lineToRelative(-2.885f, 6.534f)
                horizontalLineToRelative(2.041f)
                lineToRelative(0.408f, -1.07f)
                lineToRelative(2.49f, 0.002f)
                curveToRelative(0.061f, 0.25f, 0.24f, 1.068f, 0.24f, 1.068f)
                lineTo(24.0f, 15.578f)
                lineToRelative(-1.572f, -7.125f)
                close()
                moveTo(9.66f, 8.393f)
                horizontalLineToRelative(1.943f)
                lineToRelative(-1.215f, 7.129f)
                lineTo(8.444f, 15.522f)
                lineTo(9.66f, 8.391f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(4.721f, 12.322f)
                lineToRelative(0.202f, 0.99f)
                lineToRelative(1.901f, -4.859f)
                horizontalLineToRelative(2.059f)
                lineToRelative(-3.061f, 7.115f)
                lineTo(3.768f, 15.568f)
                lineToRelative(-1.68f, -6.026f)
                curveToRelative(-0.035f, -0.103f, -0.078f, -0.173f, -0.18f, -0.237f)
                curveTo(1.34f, 9.008f, 0.705f, 8.766f, 0.0f, 8.598f)
                lineToRelative(0.025f, -0.15f)
                horizontalLineToRelative(3.131f)
                curveToRelative(0.424f, 0.016f, 0.766f, 0.15f, 0.883f, 0.604f)
                lineToRelative(0.682f, 3.273f)
                verticalLineToRelative(-0.003f)
                close()
                moveTo(20.029f, 13.049f)
                lineToRelative(0.775f, -1.994f)
                curveToRelative(-0.01f, 0.02f, 0.16f, -0.412f, 0.258f, -0.68f)
                lineToRelative(0.133f, 0.615f)
                lineToRelative(0.449f, 2.057f)
                horizontalLineToRelative(-1.615f)
                verticalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _visa!!
    }

private var _visa: VectorAsset? = null
