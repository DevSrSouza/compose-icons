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

public val SimpleIcons.ElasticCloud: VectorAsset
    get() {
        if (_elasticCloud != null) {
            return _elasticCloud!!
        }
        _elasticCloud = VectorAssetBuilder(name = "ElasticCloud", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.62f, 19.46f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, true, -9.32f, 4.48f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, true, -9.32f, -4.48f)
                arcTo(11.95f, 11.95f, 0.0f, false, true, 13.3f, 15.0f)
                curveToRelative(3.76f, 0.0f, 7.14f, 1.76f, 9.32f, 4.48f)
                close()
                moveTo(10.32f, 12.0f)
                curveToRelative(0.0f, -1.52f, 1.25f, -2.99f, 2.62f, -2.99f)
                horizontalLineToRelative(0.42f)
                curveToRelative(3.91f, 0.0f, 7.1f, -1.76f, 9.29f, -4.48f)
                arcTo(12.05f, 12.05f, 0.0f, false, false, 13.3f, 0.05f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, -9.32f, 4.48f)
                arcTo(11.83f, 11.83f, 0.0f, false, false, 1.35f, 12.0f)
                curveToRelative(0.0f, 1.94f, 0.45f, 3.76f, 1.29f, 5.38f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, 7.85f, -4.45f)
                curveToRelative(-0.09f, -0.3f, -0.18f, -0.63f, -0.18f, -0.93f)
                close()
            }
        }
        .build()
        return _elasticCloud!!
    }

private var _elasticCloud: VectorAsset? = null
