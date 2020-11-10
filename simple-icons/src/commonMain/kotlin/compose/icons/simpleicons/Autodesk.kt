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

public val SimpleIcons.Autodesk: VectorAsset
    get() {
        if (_autodesk != null) {
            return _autodesk!!
        }
        _autodesk = VectorAssetBuilder(name = "Autodesk", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.574f, 1.0203f)
                curveToRelative(-0.097f, -0.097f, -0.291f, -0.582f, -0.971f, -0.582f)
                horizontalLineToRelative(-6.7038f)
                reflectiveCurveToRelative(0.971f, 0.097f, 1.36f, 1.068f)
                curveToRelative(0.0f, 0.0f, 1.069f, 2.5269f, 2.0399f, 4.9558f)
                curveToRelative(2.8179f, 6.6068f, 7.1898f, 17.099f, 7.1898f, 17.099f)
                horizontalLineToRelative(6.5108f)
                curveToRelative(0.097f, -0.097f, -9.3267f, -22.443f, -9.4247f, -22.54f)
                close()
                moveTo(5.7333f, 1.8953f)
                lineTo(0.3895f, 14.5263f)
                curveToRelative(-0.292f, 0.875f, -0.098f, 1.9439f, 1.457f, 1.9439f)
                horizontalLineToRelative(4.1779f)
                lineToRelative(3.6919f, -8.8417f)
                curveToRelative(-1.166f, -2.9149f, -2.1359f, -5.2478f, -2.1359f, -5.2478f)
                curveToRelative(-0.097f, -0.292f, -0.389f, -1.069f, -0.972f, -1.069f)
                curveToRelative(-0.583f, 0.0f, -0.777f, 0.486f, -0.874f, 0.583f)
                close()
                moveTo(5.6353f, 17.5383f)
                horizontalLineToRelative(-4.4689f)
                curveToRelative(-0.777f, 0.0f, -1.166f, -0.486f, -1.166f, -0.486f)
                curveToRelative(0.777f, 1.36f, 3.0119f, 5.6358f, 3.0119f, 5.6358f)
                curveToRelative(0.389f, 0.486f, 0.777f, 0.777f, 1.36f, 0.777f)
                curveToRelative(1.263f, 0.0f, 3.2069f, -1.263f, 3.2069f, -1.263f)
                lineToRelative(7.4808f, -4.6639f)
                close()
            }
        }
        .build()
        return _autodesk!!
    }

private var _autodesk: VectorAsset? = null
