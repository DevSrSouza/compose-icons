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

public val SimpleIcons.Tensorflow: VectorAsset
    get() {
        if (_tensorflow != null) {
            return _tensorflow!!
        }
        _tensorflow = VectorAssetBuilder(name = "Tensorflow", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.6f, 12.0f)
                lineToRelative(0.1f, 4.7f)
                lineToRelative(-3.1f, -1.8f)
                verticalLineToRelative(6.7f)
                lineTo(12.5f, 24.0f)
                verticalLineTo(0.0f)
                lineToRelative(10.2f, 5.9f)
                verticalLineToRelative(5.3f)
                lineToRelative(-6.1f, -3.6f)
                verticalLineToRelative(2.7f)
                close()
                moveTo(1.3f, 5.9f)
                lineTo(11.5f, 0.0f)
                verticalLineToRelative(24.0f)
                lineToRelative(-4.1f, -2.4f)
                verticalLineToRelative(-14.0f)
                lineToRelative(-6.1f, 3.6f)
                close()
            }
        }
        .build()
        return _tensorflow!!
    }

private var _tensorflow: VectorAsset? = null
