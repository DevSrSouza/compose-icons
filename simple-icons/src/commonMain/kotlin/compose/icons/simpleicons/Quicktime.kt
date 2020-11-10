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

public val SimpleIcons.Quicktime: VectorAsset
    get() {
        if (_quicktime != null) {
            return _quicktime!!
        }
        _quicktime = VectorAssetBuilder(name = "Quicktime", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 18.63f, 22.0f)
                lineTo(20.61f, 23.97f)
                horizontalLineTo(23.75f)
                lineTo(24.0f, 23.72f)
                verticalLineTo(20.57f)
                lineTo(22.0f, 18.59f)
                arcTo(11.94f, 11.94f, 0.0f, false, false, 24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                moveTo(12.0f, 4.2f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 18.95f, 15.53f)
                lineTo(13.7f, 10.27f)
                arcTo(2.4f, 2.4f, 0.0f, true, false, 10.3f, 13.67f)
                lineTo(15.57f, 18.93f)
                arcTo(7.76f, 7.76f, 0.0f, false, true, 12.0f, 19.8f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 12.0f, 4.2f)
                close()
            }
        }
        .build()
        return _quicktime!!
    }

private var _quicktime: VectorAsset? = null
