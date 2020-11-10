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

public val SimpleIcons.XPack: VectorAsset
    get() {
        if (_xPack != null) {
            return _xPack!!
        }
        _xPack = VectorAssetBuilder(name = "XPack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7f, 19.55f)
                lineToRelative(5.88f, -5.89f)
                lineToRelative(3.35f, 3.36f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, true, 0.0f, 5.05f)
                lineToRelative(-0.83f, 0.83f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, true, -5.05f, 0.0f)
                close()
                moveTo(22.92f, 1.9f)
                lineToRelative(-0.83f, -0.83f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, -5.05f, 0.0f)
                lineTo(12.0f, 6.12f)
                lineTo(6.95f, 1.07f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, -5.05f, 0.0f)
                lineToRelative(-0.83f, 0.83f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 0.0f, 5.05f)
                lineTo(6.12f, 12.0f)
                lineToRelative(-5.05f, 5.05f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 0.0f, 5.05f)
                lineToRelative(0.83f, 0.83f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 5.05f, 0.0f)
                lineTo(12.0f, 17.88f)
                lineToRelative(3.68f, -3.68f)
                lineToRelative(2.2f, -2.2f)
                lineToRelative(5.05f, -5.05f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 0.0f, -5.05f)
                close()
            }
        }
        .build()
        return _xPack!!
    }

private var _xPack: VectorAsset? = null
