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

public val SimpleIcons.ElasticStack: VectorAsset
    get() {
        if (_elasticStack != null) {
            return _elasticStack!!
        }
        _elasticStack = VectorAssetBuilder(name = "ElasticStack", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.07f, 2.45f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 2.45f, 0.07f)
                horizontalLineToRelative(19.1f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.38f, 2.38f)
                verticalLineToRelative(4.78f)
                horizontalLineTo(0.07f)
                close()
                moveTo(0.07f, 16.77f)
                horizontalLineTo(11.4f)
                verticalLineToRelative(7.16f)
                horizontalLineTo(2.45f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, true, -2.38f, -2.32f)
                close()
                moveTo(12.6f, 16.77f)
                horizontalLineToRelative(11.33f)
                verticalLineToRelative(4.78f)
                curveToRelative(0.0f, 1.28f, -1.1f, 2.38f, -2.38f, 2.38f)
                horizontalLineTo(12.6f)
                close()
                moveTo(0.07f, 8.42f)
                horizontalLineToRelative(23.86f)
                verticalLineToRelative(7.16f)
                horizontalLineTo(0.07f)
                close()
            }
        }
        .build()
        return _elasticStack!!
    }

private var _elasticStack: VectorAsset? = null
