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

public val SimpleIcons.Zillow: VectorAsset
    get() {
        if (_zillow != null) {
            return _zillow!!
        }
        _zillow = VectorAssetBuilder(name = "Zillow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.381f, 18.056f)
                curveToRelative(-7.43f, 0.445f, -15.51f, 3.135f, -16.362f, 3.51f)
                lineToRelative(0.989f, -2.789f)
                curveToRelative(2.521f, -1.166f, 8.775f, -3.469f, 16.486f, -4.019f)
                curveToRelative(-0.15f, 0.57f, -0.961f, 2.671f, -1.125f, 3.285f)
                lineToRelative(0.012f, 0.013f)
                close()
                moveTo(20.03f, 10.547f)
                reflectiveCurveToRelative(-0.363f, 0.765f, -0.709f, 1.814f)
                curveToRelative(-2.954f, 0.18f, -7.635f, 1.154f, -9.915f, 1.98f)
                curveToRelative(1.186f, -1.08f, 8.686f, -8.61f, 8.686f, -8.61f)
                curveTo(20.985f, 7.71f, 24.0f, 10.155f, 24.0f, 10.155f)
                lineToRelative(-3.97f, 0.395f)
                verticalLineToRelative(-0.003f)
                close()
                moveTo(2.48f, 10.877f)
                curveToRelative(1.647f, -0.75f, 6.265f, -2.146f, 10.685f, -3.181f)
                curveToRelative(0.0f, 0.0f, -8.497f, 7.845f, -10.859f, 10.275f)
                lineToRelative(1.95f, -5.28f)
                curveToRelative(-1.516f, 0.225f, -2.184f, 0.315f, -4.256f, 0.75f)
                lineToRelative(2.479f, -2.551f)
                lineToRelative(0.001f, -0.013f)
                close()
                moveTo(13.08f, 2.445f)
                curveToRelative(0.734f, 0.359f, 3.45f, 2.205f, 4.419f, 2.888f)
                curveToRelative(-3.096f, 0.074f, -9.135f, 1.409f, -11.652f, 2.25f)
                curveToRelative(2.065f, -1.568f, 5.903f, -4.53f, 7.233f, -5.148f)
                verticalLineToRelative(0.01f)
                close()
            }
        }
        .build()
        return _zillow!!
    }

private var _zillow: VectorAsset? = null
