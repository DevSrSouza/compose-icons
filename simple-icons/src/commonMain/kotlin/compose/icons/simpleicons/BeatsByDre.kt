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

public val SimpleIcons.BeatsByDre: VectorAsset
    get() {
        if (_beatsByDre != null) {
            return _beatsByDre!!
        }
        _beatsByDre = VectorAssetBuilder(name = "BeatsByDre", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0098f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.5996f, 0.5527f)
                verticalLineToRelative(6.6465f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 6.0098f, 12.0f)
                lineTo(6.0098f, 1.6016f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 6.0f, -1.6016f)
                close()
                moveTo(12.1602f, 8.4023f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 8.4102f, 12.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 3.5996f, 3.5996f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 0.1504f, -7.1973f)
                close()
            }
        }
        .build()
        return _beatsByDre!!
    }

private var _beatsByDre: VectorAsset? = null
