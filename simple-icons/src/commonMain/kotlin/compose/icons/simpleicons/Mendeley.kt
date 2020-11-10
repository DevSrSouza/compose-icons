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

public val SimpleIcons.Mendeley: VectorAsset
    get() {
        if (_mendeley != null) {
            return _mendeley!!
        }
        _mendeley = VectorAssetBuilder(name = "Mendeley", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.973f, 9.191f)
                horizontalLineToRelative(0.019f)
                arcToRelative(2.349f, 2.349f, 0.0f, false, true, 1.5f, 4.155f)
                arcToRelative(1.803f, 1.803f, 0.0f, false, true, -0.854f, 0.451f)
                arcToRelative(2.342f, 2.342f, 0.0f, false, true, -0.647f, 0.092f)
                horizontalLineToRelative(-0.019f)
                curveToRelative(-0.224f, 0.0f, -0.441f, -0.033f, -0.647f, -0.092f)
                arcToRelative(1.808f, 1.808f, 0.0f, false, true, -0.854f, -0.451f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -0.849f, -1.806f)
                arcToRelative(2.352f, 2.352f, 0.0f, false, true, 2.351f, -2.349f)
                moveToRelative(-9.948f, 9.45f)
                curveToRelative(1.262f, 0.158f, 2.382f, -0.76f, 2.501f, -2.052f)
                arcToRelative(2.438f, 2.438f, 0.0f, false, false, -0.213f, -1.233f)
                curveToRelative(-1.768f, -3.879f, 6.955f, -3.968f, 5.481f, -0.307f)
                lineToRelative(-0.01f, 0.016f)
                curveToRelative(-0.697f, 1.115f, -0.319f, 2.563f, 0.839f, 3.232f)
                curveToRelative(0.426f, 0.248f, 0.898f, 0.35f, 1.359f, 0.33f)
                curveToRelative(0.461f, 0.02f, 0.933f, -0.082f, 1.359f, -0.33f)
                curveToRelative(1.158f, -0.67f, 1.536f, -2.117f, 0.839f, -3.232f)
                lineToRelative(-0.01f, -0.016f)
                curveToRelative(-1.474f, -3.661f, 7.25f, -3.572f, 5.48f, 0.307f)
                arcToRelative(2.44f, 2.44f, 0.0f, false, false, -0.212f, 1.233f)
                curveToRelative(0.12f, 1.292f, 1.239f, 2.21f, 2.502f, 2.052f)
                arcToRelative(2.339f, 2.339f, 0.0f, false, false, 1.421f, -0.735f)
                reflectiveCurveToRelative(0.587f, -0.487f, 0.578f, -1.729f)
                curveToRelative(-0.008f, -1.013f, -0.578f, -1.574f, -0.578f, -1.574f)
                arcToRelative(2.206f, 2.206f, 0.0f, false, false, -1.81f, -0.644f)
                curveToRelative(-1.619f, -0.036f, -1.859f, -1.304f, -1.402f, -3.694f)
                curveToRelative(0.168f, -0.424f, 0.241f, -0.878f, 0.226f, -1.332f)
                arcToRelative(3.408f, 3.408f, 0.0f, false, false, -2.125f, -3.287f)
                curveToRelative(-0.039f, -0.017f, -0.078f, -0.03f, -0.118f, -0.046f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, -0.134f, -0.046f)
                arcToRelative(3.407f, 3.407f, 0.0f, false, false, -3.994f, 1.449f)
                curveToRelative(-0.815f, 0.895f, -1.184f, 1.438f, -2.022f, 1.438f)
                curveToRelative(-0.797f, 0.0f, -1.208f, -0.543f, -2.022f, -1.438f)
                arcToRelative(3.404f, 3.404f, 0.0f, false, false, -4.127f, -1.404f)
                curveToRelative(-0.04f, 0.016f, -0.079f, 0.029f, -0.119f, 0.046f)
                arcTo(3.407f, 3.407f, 0.0f, false, false, 3.59f, 8.932f)
                curveToRelative(-0.016f, 0.454f, 0.058f, 0.908f, 0.225f, 1.332f)
                curveToRelative(0.457f, 2.391f, 0.217f, 3.658f, -1.401f, 3.694f)
                curveToRelative(-0.793f, -0.085f, -1.385f, 0.242f, -1.983f, 0.841f)
                curveToRelative(-0.6f, 0.598f, -0.55f, 2.2f, 0.0f, 2.899f)
                curveToRelative(0.399f, 0.509f, 0.94f, 0.861f, 1.594f, 0.943f)
            }
        }
        .build()
        return _mendeley!!
    }

private var _mendeley: VectorAsset? = null
