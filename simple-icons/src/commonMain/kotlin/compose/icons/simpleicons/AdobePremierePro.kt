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

public val SimpleIcons.AdobePremierePro: VectorAsset
    get() {
        if (_adobePremierePro != null) {
            return _adobePremierePro!!
        }
        _adobePremierePro = VectorAssetBuilder(name = "AdobePremierePro", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.297f, 5.778f)
                curveToRelative(0.0f, -0.066f, 0.016f, -0.116f, 0.099f, -0.116f)
                curveToRelative(0.643f, -0.033f, 1.584f, -0.05f, 2.574f, -0.05f)
                curveToRelative(2.772f, 0.0f, 3.976f, 1.519f, 3.976f, 3.466f)
                curveToRelative(0.0f, 2.54f, -1.838f, 3.63f, -4.099f, 3.63f)
                curveToRelative(-0.379f, 0.0f, -0.511f, -0.017f, -0.775f, -0.017f)
                verticalLineToRelative(3.843f)
                curveToRelative(0.0f, 0.083f, -0.033f, 0.116f, -0.116f, 0.116f)
                lineTo(6.412f, 16.65f)
                curveToRelative(-0.082f, 0.0f, -0.115f, -0.033f, -0.115f, -0.116f)
                close()
                moveTo(8.072f, 11.091f)
                curveToRelative(0.231f, 0.016f, 0.412f, 0.016f, 0.808f, 0.016f)
                curveToRelative(1.172f, 0.0f, 2.268f, -0.412f, 2.268f, -1.996f)
                curveToRelative(0.0f, -1.27f, -0.783f, -1.914f, -2.119f, -1.914f)
                curveToRelative(-0.396f, 0.0f, -0.776f, 0.016f, -0.957f, 0.033f)
                close()
                moveTo(14.472f, 10.183f)
                curveToRelative(0.0f, -0.115f, 0.0f, -0.412f, -0.05f, -0.973f)
                curveToRelative(0.0f, -0.083f, 0.012f, -0.1f, 0.078f, -0.132f)
                arcToRelative(10.42f, 10.42f, 0.0f, false, true, 3.656f, -0.693f)
                curveToRelative(0.083f, 0.0f, 0.116f, 0.016f, 0.116f, 0.099f)
                verticalLineToRelative(1.452f)
                curveToRelative(0.0f, 0.082f, -0.027f, 0.099f, -0.11f, 0.099f)
                curveToRelative(-0.626f, -0.033f, -1.544f, 0.05f, -1.89f, 0.198f)
                verticalLineToRelative(6.301f)
                curveToRelative(0.0f, 0.083f, -0.033f, 0.116f, -0.116f, 0.116f)
                horizontalLineToRelative(-1.569f)
                curveToRelative(-0.082f, 0.0f, -0.115f, -0.033f, -0.115f, -0.116f)
                close()
                moveTo(0.0f, 0.3f)
                verticalLineToRelative(23.4f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.3f)
                close()
                moveTo(1.0f, 1.3f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(21.4f)
                lineTo(1.0f, 22.7f)
                close()
            }
        }
        .build()
        return _adobePremierePro!!
    }

private var _adobePremierePro: VectorAsset? = null
