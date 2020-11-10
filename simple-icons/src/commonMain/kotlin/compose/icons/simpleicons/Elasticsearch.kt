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

public val SimpleIcons.Elasticsearch: VectorAsset
    get() {
        if (_elasticsearch != null) {
            return _elasticsearch!!
        }
        _elasticsearch = VectorAssetBuilder(name = "Elasticsearch", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.27f, 15.58f)
                lineTo(1.61f, 15.58f)
                arcTo(11.81f, 11.81f, 0.0f, false, true, 1.07f, 12.0f)
                curveToRelative(0.0f, -1.25f, 0.18f, -2.45f, 0.54f, -3.58f)
                horizontalLineToRelative(15.86f)
                arcTo(3.57f, 3.57f, 0.0f, false, true, 21.05f, 12.0f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, true, -3.55f, 3.58f)
                close()
                moveTo(10.82f, 16.78f)
                lineTo(2.05f, 16.78f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 4.39f, 5.18f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 13.0f, 23.93f)
                curveToRelative(4.15f, 0.0f, 7.78f, -2.12f, 9.93f, -5.3f)
                arcToRelative(6.08f, 6.08f, 0.0f, false, false, -4.35f, -1.86f)
                close()
                moveTo(18.58f, 7.23f)
                curveToRelative(1.7f, 0.0f, 3.25f, -0.72f, 4.35f, -1.85f)
                arcTo(11.96f, 11.96f, 0.0f, false, false, 2.05f, 7.23f)
                horizontalLineToRelative(8.74f)
                close()
            }
        }
        .build()
        return _elasticsearch!!
    }

private var _elasticsearch: VectorAsset? = null
