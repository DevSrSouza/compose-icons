package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) {
            return _numberCircleEight!!
        }
        _numberCircleEight = Builder(name = "NumberCircleEight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(142.4f, 123.7f)
                arcToRelative(41.2f, 41.2f, 0.0f, false, false, 4.0f, -3.3f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -36.8f, 0.0f)
                arcToRelative(41.2f, 41.2f, 0.0f, false, false, 4.0f, 3.3f)
                arcToRelative(25.8f, 25.8f, 0.0f, false, false, -6.8f, 5.1f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 42.4f, 0.0f)
                arcTo(25.8f, 25.8f, 0.0f, false, false, 142.4f, 123.7f)
                close()
                moveTo(115.3f, 114.7f)
                arcTo(17.9f, 17.9f, 0.0f, true, true, 128.0f, 120.0f)
                arcTo(17.9f, 17.9f, 0.0f, false, true, 115.3f, 114.7f)
                close()
                moveTo(143.6f, 165.6f)
                arcTo(22.2f, 22.2f, 0.0f, true, true, 150.0f, 150.0f)
                arcTo(22.2f, 22.2f, 0.0f, false, true, 143.6f, 165.6f)
                close()
            }
        }
        .build()
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
