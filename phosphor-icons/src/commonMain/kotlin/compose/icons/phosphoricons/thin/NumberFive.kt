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

public val ThinGroup.NumberFive: ImageVector
    get() {
        if (_numberFive != null) {
            return _numberFive!!
        }
        _numberFive = Builder(name = "NumberFive", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.4f, 125.6f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, -85.2f, 84.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                arcToRelative(52.5f, 52.5f, 0.0f, false, false, 73.9f, 0.0f)
                arcToRelative(51.9f, 51.9f, 0.0f, false, false, 0.0f, -73.6f)
                arcToRelative(52.5f, 52.5f, 0.0f, false, false, -73.9f, 0.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -4.6f, 0.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.1f, -4.2f)
                lineTo(91.7f, 31.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -3.4f)
                horizontalLineTo(176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(99.1f)
                lineTo(85.7f, 118.5f)
                arcToRelative(60.5f, 60.5f, 0.0f, false, true, 76.7f, 7.1f)
                close()
            }
        }
        .build()
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
