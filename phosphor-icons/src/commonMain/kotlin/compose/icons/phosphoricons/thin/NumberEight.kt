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

public val ThinGroup.NumberEight: ImageVector
    get() {
        if (_numberEight != null) {
            return _numberEight!!
        }
        _numberEight = Builder(name = "NumberEight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.2f, 132.9f)
                arcTo(66.2f, 66.2f, 0.0f, false, false, 150.0f, 119.0f)
                arcToRelative(53.1f, 53.1f, 0.0f, false, false, 16.6f, -10.7f)
                arcToRelative(49.6f, 49.6f, 0.0f, false, false, 0.0f, -73.3f)
                arcToRelative(57.2f, 57.2f, 0.0f, false, false, -77.2f, 0.0f)
                arcToRelative(49.6f, 49.6f, 0.0f, false, false, 0.0f, 73.3f)
                arcTo(53.1f, 53.1f, 0.0f, false, false, 106.0f, 119.0f)
                arcToRelative(66.2f, 66.2f, 0.0f, false, false, -23.2f, 13.9f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, 0.0f, 85.5f)
                arcToRelative(66.8f, 66.8f, 0.0f, false, false, 90.4f, 0.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, 0.0f, -85.5f)
                close()
                moveTo(94.8f, 102.5f)
                arcToRelative(41.7f, 41.7f, 0.0f, false, true, 0.0f, -61.6f)
                arcToRelative(49.2f, 49.2f, 0.0f, false, true, 66.4f, 0.0f)
                arcToRelative(41.7f, 41.7f, 0.0f, false, true, 0.0f, 61.6f)
                arcToRelative(49.5f, 49.5f, 0.0f, false, true, -66.4f, 0.0f)
                close()
                moveTo(167.7f, 212.6f)
                arcToRelative(58.9f, 58.9f, 0.0f, false, true, -79.4f, 0.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 0.0f, -73.9f)
                arcToRelative(58.9f, 58.9f, 0.0f, false, true, 79.4f, 0.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 0.0f, 73.9f)
                close()
            }
        }
        .build()
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
