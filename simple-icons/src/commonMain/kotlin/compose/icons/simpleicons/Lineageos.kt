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

public val SimpleIcons.Lineageos: VectorAsset
    get() {
        if (_lineageos != null) {
            return _lineageos!!
        }
        _lineageos = VectorAssetBuilder(name = "Lineageos", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6453f, 12.0573f)
                arcToRelative(2.404f, 2.404f, 0.0f, false, false, -1.803f, 0.7993f)
                lineToRelative(-0.1382f, -0.054f)
                arcToRelative(17.801f, 17.801f, 0.0f, false, false, -2.8667f, -0.8594f)
                arcToRelative(4.8078f, 4.8078f, 0.0f, false, false, -9.6156f, 0.0f)
                horizontalLineToRelative(-0.1322f)
                arcToRelative(17.7469f, 17.7469f, 0.0f, false, false, -2.7645f, 0.8353f)
                lineToRelative(-0.1382f, 0.0541f)
                arcToRelative(2.404f, 2.404f, 0.0f, true, false, 0.5589f, 1.0697f)
                arcToRelative(16.599f, 16.599f, 0.0f, false, true, 2.5782f, -0.7752f)
                arcToRelative(4.8078f, 4.8078f, 0.0f, false, false, 9.3572f, 0.0f)
                arcToRelative(16.557f, 16.557f, 0.0f, false, true, 2.5782f, 0.7692f)
                arcToRelative(2.404f, 2.404f, 0.0f, true, false, 2.3859f, -1.839f)
                close()
                moveTo(2.414f, 15.6633f)
                arcToRelative(1.202f, 1.202f, 0.0f, true, true, 1.202f, -1.202f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, true, -1.202f, 1.202f)
                close()
                moveTo(12.0296f, 15.6633f)
                arcToRelative(3.6059f, 3.6059f, 0.0f, true, true, 3.6059f, -3.606f)
                arcToRelative(3.6059f, 3.6059f, 0.0f, false, true, -3.6059f, 3.606f)
                close()
                moveTo(21.6453f, 15.6633f)
                arcToRelative(1.202f, 1.202f, 0.0f, true, true, 1.202f, -1.202f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, true, -1.202f, 1.202f)
                close()
                moveTo(13.8326f, 12.0573f)
                arcToRelative(1.803f, 1.803f, 0.0f, true, true, -1.803f, -1.8029f)
                arcToRelative(1.803f, 1.803f, 0.0f, false, true, 1.803f, 1.803f)
                close()
            }
        }
        .build()
        return _lineageos!!
    }

private var _lineageos: VectorAsset? = null
