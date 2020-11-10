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

public val SimpleIcons.PrDotCo: VectorAsset
    get() {
        if (_prDotCo != null) {
            return _prDotCo!!
        }
        _prDotCo = VectorAssetBuilder(name = "PrDotCo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 4.67f)
                curveToRelative(1.876f, 0.0f, 3.7518f, 0.7157f, 5.1832f, 2.1468f)
                lineToRelative(0.0167f, 0.0167f)
                lineToRelative(0.0053f, 0.0055f)
                lineToRelative(0.0014f, 0.0015f)
                lineToRelative(0.0016f, 0.0014f)
                curveToRelative(0.9304f, 0.9393f, 1.5546f, 2.0673f, 1.873f, 3.2602f)
                lineToRelative(1.7906f, -1.7905f)
                curveToRelative(0.7157f, -0.7157f, 1.8761f, -0.7157f, 2.5916f, 0.0f)
                curveToRelative(0.7157f, 0.7155f, 0.7157f, 1.8758f, 0.0f, 2.5913f)
                lineToRelative(-6.2802f, 6.2803f)
                curveToRelative(-1.4314f, 1.4314f, -3.3073f, 2.1468f, -5.1832f, 2.1468f)
                curveToRelative(-1.8758f, 0.0f, -3.7517f, -0.7154f, -5.1831f, -2.1468f)
                curveToRelative(-0.9442f, -0.9442f, -1.5768f, -2.0816f, -1.898f, -3.285f)
                lineTo(3.128f, 15.6887f)
                curveToRelative(-0.7154f, 0.716f, -1.8758f, 0.716f, -2.5915f, 0.0f)
                curveToRelative(-0.7153f, -0.7155f, -0.7153f, -1.8758f, 0.0f, -2.5915f)
                lineToRelative(6.2478f, -6.2477f)
                arcToRelative(4.8688f, 4.8688f, 0.0f, false, true, 0.0324f, -0.0326f)
                horizontalLineToRelative(2.0E-4f)
                horizontalLineToRelative(-2.0E-4f)
                horizontalLineToRelative(2.0E-4f)
                curveTo(8.248f, 5.3857f, 10.1239f, 4.67f, 11.9999f, 4.67f)
                close()
                moveTo(14.5916f, 14.5916f)
                curveToRelative(1.431f, -1.4312f, 1.431f, -3.752f, 0.0f, -5.1832f)
                curveToRelative(-1.4314f, -1.4312f, -3.7521f, -1.4312f, -5.1833f, 0.0f)
                verticalLineToRelative(2.0E-4f)
                curveToRelative(-1.4314f, 1.431f, -1.4314f, 3.752f, 0.0f, 5.1832f)
                curveToRelative(1.4312f, 1.4312f, 3.7517f, 1.431f, 5.1831f, 0.0f)
                horizontalLineToRelative(2.0E-4f)
                close()
            }
        }
        .build()
        return _prDotCo!!
    }

private var _prDotCo: VectorAsset? = null
