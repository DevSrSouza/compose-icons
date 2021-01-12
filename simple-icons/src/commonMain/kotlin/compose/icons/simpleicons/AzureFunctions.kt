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

public val SimpleIcons.AzureFunctions: VectorAsset
    get() {
        if (_azureFunctions != null) {
            return _azureFunctions!!
        }
        _azureFunctions = VectorAssetBuilder(name = "AzureFunctions", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.537f, 0.904f)
                lineTo(6.602f, 12.04f)
                lineToRelative(4.798f, 0.037f)
                lineToRelative(-3.748f, 11.018f)
                verticalLineToRelative(0.002f)
                lineTo(17.996f, 8.39f)
                horizontalLineToRelative(-5.022f)
                lineTo(17.847f, 0.903f)
                horizontalLineToRelative(-3.824f)
                close()
                moveTo(6.903f, 4.91f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, false, -0.412f, 0.17f)
                lineTo(0.155f, 11.285f)
                arcToRelative(0.682f, 0.682f, 0.0f, false, false, 0.0f, 0.865f)
                lineToRelative(6.448f, 6.396f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 0.824f, 0.0f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, false, 0.0f, -0.865f)
                lineToRelative(-5.436f, -5.53f)
                arcToRelative(0.641f, 0.641f, 0.0f, false, true, 0.0f, -0.865f)
                lineToRelative(5.324f, -5.344f)
                arcToRelative(0.574f, 0.574f, 0.0f, false, false, 0.0f, -0.865f)
                arcToRelative(0.586f, 0.586f, 0.0f, false, false, -0.412f, -0.169f)
                close()
                moveTo(17.096f, 4.91f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, false, -0.412f, 0.17f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, false, 0.0f, 0.864f)
                lineToRelative(5.435f, 5.343f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, 0.0f, 0.866f)
                lineToRelative(-5.548f, 5.53f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 0.0f, 0.865f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 0.824f, 0.0f)
                lineToRelative(6.45f, -6.396f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.0f, -0.865f)
                lineToRelative(-6.337f, -6.208f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, false, -0.412f, -0.169f)
                close()
            }
        }
        .build()
        return _azureFunctions!!
    }

private var _azureFunctions: VectorAsset? = null
