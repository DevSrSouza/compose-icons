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

public val SimpleIcons.Osano: VectorAsset
    get() {
        if (_osano != null) {
            return _osano!!
        }
        _osano = VectorAssetBuilder(name = "Osano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.091f)
                arcTo(5.909f, 5.909f, 0.0f, true, false, 17.909f, 12.0f)
                arcTo(5.91f, 5.91f, 0.0f, false, false, 12.0f, 6.091f)
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _osano!!
    }

private var _osano: VectorAsset? = null
