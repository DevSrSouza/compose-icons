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

public val SimpleIcons.AzurePipelines: VectorAsset
    get() {
        if (_azurePipelines != null) {
            return _azurePipelines!!
        }
        _azurePipelines = VectorAssetBuilder(name = "AzurePipelines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.8f, 18.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.8f)
                lineTo(1.8f, 22.2f)
                close()
                moveTo(23.0f, 0.0f)
                horizontalLineToRelative(-8.93f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.67f, 0.89f)
                lineTo(9.0f, 5.99f)
                lineTo(1.0f, 5.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(5.5f)
                lineToRelative(3.5f, 3.61f)
                lineToRelative(1.2f, -1.29f)
                lineToRelative(1.5f, 1.5f)
                lineTo(5.0f, 17.53f)
                lineToRelative(1.48f, 1.48f)
                lineToRelative(1.22f, -1.22f)
                lineToRelative(1.5f, 1.51f)
                lineTo(8.0f, 20.5f)
                lineToRelative(3.5f, 3.5f)
                lineTo(17.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                lineToRelative(5.11f, -3.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 9.92f)
                lineTo(24.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(18.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _azurePipelines!!
    }

private var _azurePipelines: VectorAsset? = null
