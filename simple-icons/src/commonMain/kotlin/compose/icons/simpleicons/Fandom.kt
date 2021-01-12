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

public val SimpleIcons.Fandom: VectorAsset
    get() {
        if (_fandom != null) {
            return _fandom!!
        }
        _fandom = VectorAssetBuilder(name = "Fandom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.192f, 11.317f)
                curveToRelative(0.0f, 0.2f, -0.08f, 0.392f, -0.222f, 0.533f)
                lineToRelative(-9.28f, 9.306f)
                arcToRelative(0.686f, 0.686f, 0.0f, false, true, -0.512f, 0.224f)
                arcToRelative(0.743f, 0.743f, 0.0f, false, true, -0.534f, -0.225f)
                lineToRelative(-0.654f, -0.614f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, true, -0.007f, -0.41f)
                lineToRelative(10.713f, -10.72f)
                curveToRelative(0.182f, -0.182f, 0.497f, -0.054f, 0.497f, 0.201f)
                verticalLineToRelative(1.706f)
                close()
                moveTo(10.288f, 18.335f)
                lineToRelative(-0.532f, 0.475f)
                arcToRelative(0.445f, 0.445f, 0.0f, false, true, -0.604f, -0.014f)
                lineToRelative(-7.065f, -6.897f)
                arcToRelative(0.918f, 0.918f, 0.0f, false, true, -0.277f, -0.66f)
                lineTo(1.81f, 9.952f)
                curveToRelative(0.0f, -0.464f, 0.566f, -0.698f, 0.9f, -0.371f)
                lineToRelative(7.499f, 7.322f)
                curveToRelative(0.13f, 0.13f, 0.35f, 0.396f, 0.35f, 0.717f)
                curveToRelative(0.0f, 0.205f, -0.047f, 0.495f, -0.27f, 0.717f)
                close()
                moveTo(3.973f, 4.987f)
                lineToRelative(2.431f, -2.402f)
                arcToRelative(0.292f, 0.292f, 0.0f, false, true, 0.41f, 0.0f)
                lineToRelative(8.139f, 8.045f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, true, 0.0f, 3.12f)
                lineToRelative(-2.43f, 2.401f)
                arcToRelative(0.293f, 0.293f, 0.0f, false, true, -0.408f, 0.0f)
                lineToRelative(-8.14f, -8.047f)
                arcToRelative(2.172f, 2.172f, 0.0f, false, true, -0.65f, -1.56f)
                curveToRelative(0.0f, -0.59f, 0.23f, -1.144f, 0.648f, -1.557f)
                close()
                moveTo(13.605f, 6.362f)
                lineToRelative(2.54f, -2.51f)
                arcToRelative(2.241f, 2.241f, 0.0f, false, true, 1.897f, -0.623f)
                curveToRelative(0.5f, 0.068f, 0.956f, 0.326f, 1.313f, 0.679f)
                lineToRelative(2.571f, 2.542f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, true, 0.0f, 0.406f)
                lineToRelative(-3.91f, 3.867f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, true, -0.41f, 0.0f)
                lineToRelative(-4.001f, -3.956f)
                arcToRelative(0.285f, 0.285f, 0.0f, false, true, 0.0f, -0.405f)
                close()
                moveTo(23.7f, 5.885f)
                lineTo(18.04f, 0.19f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, -0.852f, -0.002f)
                lineToRelative(-4.493f, 4.485f)
                arcToRelative(0.898f, 0.898f, 0.0f, false, true, -1.262f, 0.002f)
                lineTo(6.94f, 0.237f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, -0.842f, -0.002f)
                lineTo(0.31f, 5.871f)
                curveToRelative(-0.2f, 0.194f, -0.31f, 0.458f, -0.31f, 0.733f)
                verticalLineToRelative(5.34f)
                curveToRelative(0.0f, 0.271f, 0.11f, 0.534f, 0.305f, 0.726f)
                lineToRelative(11.277f, 11.145f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, 0.846f, 0.0f)
                lineTo(23.696f, 12.67f)
                curveToRelative(0.194f, -0.193f, 0.304f, -0.455f, 0.304f, -0.727f)
                lineTo(24.0f, 6.606f)
                curveToRelative(0.0f, -0.27f, -0.106f, -0.529f, -0.298f, -0.72f)
                close()
            }
        }
        .build()
        return _fandom!!
    }

private var _fandom: VectorAsset? = null
