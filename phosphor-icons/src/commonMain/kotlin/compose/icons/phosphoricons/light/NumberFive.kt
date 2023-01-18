package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.NumberFive: ImageVector
    get() {
        if (_numberFive != null) {
            return _numberFive!!
        }
        _numberFive = Builder(name = "NumberFive", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.8f, 124.2f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, true, -88.0f, 87.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.4f, -8.6f)
                arcToRelative(50.3f, 50.3f, 0.0f, false, false, 71.1f, 0.0f)
                arcToRelative(49.7f, 49.7f, 0.0f, false, false, 0.0f, -70.6f)
                arcToRelative(50.3f, 50.3f, 0.0f, false, false, -71.1f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -6.9f, 1.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.2f, -6.3f)
                lineTo(89.7f, 31.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -5.0f)
                horizontalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(100.8f)
                lineTo(88.3f, 114.5f)
                arcToRelative(62.4f, 62.4f, 0.0f, false, true, 75.5f, 9.7f)
                close()
            }
        }
        .build()
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
