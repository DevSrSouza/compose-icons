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

public val SimpleIcons.Feedly: VectorAsset
    get() {
        if (_feedly != null) {
            return _feedly!!
        }
        _feedly = VectorAssetBuilder(name = "Feedly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.86f, 1.989f)
                arcToRelative(2.609f, 2.609f, 0.0f, false, false, -3.726f, 0.0f)
                lineTo(0.768f, 11.527f)
                arcToRelative(2.729f, 2.729f, 0.0f, false, false, 0.0f, 3.795f)
                lineToRelative(6.684f, 6.808f)
                arcToRelative(2.618f, 2.618f, 0.0f, false, false, 1.74f, 0.664f)
                horizontalLineToRelative(5.613f)
                arcToRelative(2.616f, 2.616f, 0.0f, false, false, 1.872f, -0.791f)
                lineToRelative(6.554f, -6.675f)
                arcToRelative(2.726f, 2.726f, 0.0f, false, false, 0.0f, -3.795f)
                lineToRelative(-9.37f, -9.544f)
                close()
                moveTo(13.6f, 19.411f)
                lineToRelative(-0.935f, 0.95f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, -0.268f, 0.114f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, true, -0.247f, -0.096f)
                lineToRelative(-0.954f, -0.97f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, 0.0f, -0.542f)
                lineToRelative(1.337f, -1.36f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.531f, 0.0f)
                lineToRelative(1.337f, 1.361f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, 0.0f, 0.543f)
                close()
                moveTo(13.6f, 13.7f)
                lineToRelative(-3.737f, 3.808f)
                arcToRelative(0.374f, 0.374f, 0.0f, false, true, -0.268f, 0.111f)
                horizontalLineToRelative(-0.799f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, true, -0.25f, -0.093f)
                lineToRelative(-0.951f, -0.97f)
                arcToRelative(0.391f, 0.391f, 0.0f, false, true, 0.0f, -0.544f)
                lineToRelative(4.139f, -4.214f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, 0.531f, 0.0f)
                lineToRelative(1.337f, 1.362f)
                arcToRelative(0.386f, 0.386f, 0.0f, false, true, 0.0f, 0.54f)
                close()
                moveTo(13.6f, 7.993f)
                lineToRelative(-6.54f, 6.66f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, -0.268f, 0.113f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(0.373f, 0.373f, 0.0f, false, true, -0.249f, -0.094f)
                lineTo(4.79f, 13.7f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, true, 0.0f, -0.54f)
                lineToRelative(6.943f, -7.07f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, 0.531f, 0.0f)
                lineToRelative(1.337f, 1.36f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, 0.0f, 0.543f)
                close()
            }
        }
        .build()
        return _feedly!!
    }

private var _feedly: VectorAsset? = null
