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

public val SimpleIcons.Yahoo: VectorAsset
    get() {
        if (_yahoo != null) {
            return _yahoo!!
        }
        _yahoo = VectorAssetBuilder(name = "Yahoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.86f, 1.56f)
                lineTo(14.27f, 11.87f)
                horizontalLineTo(19.4f)
                lineTo(24.0f, 1.56f)
                horizontalLineTo(18.86f)
                moveTo(0.0f, 6.71f)
                lineTo(5.15f, 18.27f)
                lineTo(3.3f, 22.44f)
                horizontalLineTo(7.83f)
                lineTo(14.69f, 6.71f)
                horizontalLineTo(10.19f)
                lineTo(7.39f, 13.44f)
                lineTo(4.62f, 6.71f)
                horizontalLineTo(0.0f)
                moveTo(15.62f, 12.87f)
                curveTo(13.95f, 12.87f, 12.71f, 14.12f, 12.71f, 15.58f)
                curveTo(12.71f, 17.0f, 13.91f, 18.19f, 15.5f, 18.19f)
                curveTo(17.18f, 18.19f, 18.43f, 16.96f, 18.43f, 15.5f)
                curveTo(18.43f, 14.03f, 17.23f, 12.87f, 15.62f, 12.87f)
                close()
            }
        }
        .build()
        return _yahoo!!
    }

private var _yahoo: VectorAsset? = null
