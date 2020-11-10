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

public val SimpleIcons.GoogleAdsense: VectorAsset
    get() {
        if (_googleAdsense != null) {
            return _googleAdsense!!
        }
        _googleAdsense = VectorAssetBuilder(name = "GoogleAdsense", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.842f, 1.375f)
                arcToRelative(3.958f, 3.958f, 0.0f, false, false, -0.352f, 0.01f)
                arcToRelative(3.935f, 3.935f, 0.0f, false, false, -3.133f, 1.933f)
                arcToRelative(4.233f, 4.233f, 0.0f, false, false, -0.134f, 0.254f)
                lineToRelative(-3.67f, 6.28f)
                arcToRelative(4.63f, 4.63f, 0.0f, false, false, -0.227f, 0.386f)
                lineToRelative(-2.263f, 3.907f)
                arcToRelative(4.847f, 4.847f, 0.0f, false, true, 2.468f, -0.36f)
                arcToRelative(4.765f, 4.765f, 0.0f, false, true, 1.858f, 0.617f)
                arcTo(4.981f, 4.981f, 0.0f, false, true, 8.81f, 18.08f)
                lineToRelative(2.306f, -3.969f)
                arcToRelative(3.753f, 3.753f, 0.0f, false, false, 0.227f, -0.384f)
                lineToRelative(3.67f, -6.282f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, -1.284f, -5.549f)
                arcToRelative(3.958f, 3.958f, 0.0f, false, false, -1.888f, -0.521f)
                close()
                moveTo(20.202f, 7.928f)
                arcToRelative(3.894f, 3.894f, 0.0f, false, false, -3.458f, 1.937f)
                lineToRelative(-3.889f, 6.719f)
                arcToRelative(3.874f, 3.874f, 0.0f, false, false, 1.424f, 5.3f)
                arcToRelative(3.894f, 3.894f, 0.0f, false, false, 5.313f, -1.42f)
                lineToRelative(3.888f, -6.718f)
                arcToRelative(3.875f, 3.875f, 0.0f, false, false, -1.423f, -5.299f)
                arcToRelative(3.894f, 3.894f, 0.0f, false, false, -1.856f, -0.52f)
                close()
                moveTo(3.818f, 14.758f)
                arcTo(3.987f, 3.987f, 0.0f, false, false, 0.721f, 16.46f)
                lineToRelative(-0.065f, 0.11f)
                curveToRelative(-0.043f, 0.066f, -0.096f, 0.123f, -0.136f, 0.193f)
                curveToRelative(-1.08f, 1.887f, -0.418f, 4.253f, 1.453f, 5.343f)
                curveToRelative(1.87f, 1.09f, 4.305f, 0.395f, 5.384f, -1.494f)
                curveToRelative(0.028f, -0.047f, 0.04f, -0.098f, 0.065f, -0.146f)
                lineToRelative(0.004f, -0.006f)
                curveToRelative(0.96f, -1.86f, 0.278f, -4.13f, -1.543f, -5.191f)
                arcToRelative(3.792f, 3.792f, 0.0f, false, false, -1.666f, -0.51f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, false, -0.399f, -0.002f)
                close()
            }
        }
        .build()
        return _googleAdsense!!
    }

private var _googleAdsense: VectorAsset? = null
