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

public val SimpleIcons.Mcdonalds: VectorAsset
    get() {
        if (_mcdonalds != null) {
            return _mcdonalds!!
        }
        _mcdonalds = VectorAssetBuilder(name = "Mcdonalds", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.243f, 3.006f)
                curveToRelative(2.066f, 0.0f, 3.742f, 8.714f, 3.742f, 19.478f)
                horizontalLineTo(24.0f)
                curveToRelative(0.0f, -11.588f, -3.042f, -20.968f, -6.766f, -20.968f)
                curveToRelative(-2.127f, 0.0f, -4.007f, 2.81f, -5.248f, 7.227f)
                curveToRelative(-1.241f, -4.416f, -3.121f, -7.227f, -5.231f, -7.227f)
                curveTo(3.031f, 1.516f, 0.0f, 10.888f, 0.0f, 22.476f)
                horizontalLineToRelative(3.014f)
                curveToRelative(0.0f, -10.763f, 1.658f, -19.47f, 3.724f, -19.47f)
                curveToRelative(2.066f, 0.0f, 3.741f, 8.05f, 3.741f, 17.98f)
                horizontalLineToRelative(2.997f)
                curveToRelative(0.0f, -9.93f, 1.684f, -17.98f, 3.75f, -17.98f)
                close()
            }
        }
        .build()
        return _mcdonalds!!
    }

private var _mcdonalds: VectorAsset? = null
