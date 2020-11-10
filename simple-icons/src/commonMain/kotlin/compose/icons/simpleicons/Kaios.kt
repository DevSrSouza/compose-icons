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

public val SimpleIcons.Kaios: VectorAsset
    get() {
        if (_kaios != null) {
            return _kaios!!
        }
        _kaios = VectorAssetBuilder(name = "Kaios", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.47f, 0.0f)
                arcToRelative(2.81f, 2.81f, 0.0f, false, false, -2.84f, 2.78f)
                verticalLineToRelative(18.43f)
                arcTo(2.8f, 2.8f, 0.0f, false, false, 4.47f, 24.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 2.85f, -2.78f)
                lineTo(7.32f, 2.78f)
                arcTo(2.83f, 2.83f, 0.0f, false, false, 4.47f, 0.0f)
                close()
                moveTo(13.87f, 8.54f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -3.89f, -0.66f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, false, -0.68f, 3.8f)
                lineToRelative(8.0f, 11.15f)
                arcToRelative(2.81f, 2.81f, 0.0f, false, false, 3.88f, 0.66f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, false, 0.74f, -3.72f)
                lineToRelative(-0.06f, -0.09f)
                lineToRelative(-7.98f, -11.14f)
                close()
                moveTo(17.52f, 7.36f)
                arcToRelative(3.71f, 3.71f, 0.0f, false, false, 3.74f, -3.67f)
                arcTo(3.71f, 3.71f, 0.0f, false, false, 17.52f, 0.02f)
                arcToRelative(3.71f, 3.71f, 0.0f, false, false, -3.75f, 3.67f)
                arcToRelative(3.71f, 3.71f, 0.0f, false, false, 3.75f, 3.67f)
                close()
            }
        }
        .build()
        return _kaios!!
    }

private var _kaios: VectorAsset? = null
