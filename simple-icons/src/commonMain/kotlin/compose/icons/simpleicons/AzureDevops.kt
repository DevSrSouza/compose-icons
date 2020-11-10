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

public val SimpleIcons.AzureDevops: VectorAsset
    get() {
        if (_azureDevops != null) {
            return _azureDevops!!
        }
        _azureDevops = VectorAssetBuilder(name = "AzureDevops", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.899f)
                lineToRelative(2.247f, -2.966f)
                lineToRelative(8.405f, -3.416f)
                lineTo(10.652f, 0.045f)
                lineToRelative(7.37f, 5.393f)
                lineTo(2.966f, 8.36f)
                verticalLineToRelative(8.224f)
                lineTo(0.0f, 15.73f)
                close()
                moveTo(24.0f, 4.449f)
                verticalLineToRelative(14.652f)
                lineTo(18.247f, 24.0f)
                lineToRelative(-9.303f, -3.056f)
                lineTo(8.944f, 24.0f)
                lineToRelative(-5.978f, -7.416f)
                lineToRelative(15.057f, 1.798f)
                lineTo(18.023f, 5.438f)
                close()
            }
        }
        .build()
        return _azureDevops!!
    }

private var _azureDevops: VectorAsset? = null
