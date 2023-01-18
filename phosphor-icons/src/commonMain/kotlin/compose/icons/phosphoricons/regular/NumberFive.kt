package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.NumberFive: ImageVector
    get() {
        if (_numberFive != null) {
            return _numberFive!!
        }
        _numberFive = Builder(name = "NumberFive", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.2f, 122.7f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 0.0f, 90.6f)
                arcToRelative(64.5f, 64.5f, 0.0f, false, true, -90.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.2f, -11.4f)
                arcToRelative(48.4f, 48.4f, 0.0f, false, false, 68.3f, 0.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 119.8f, 120.0f)
                arcToRelative(48.3f, 48.3f, 0.0f, false, false, -34.2f, 14.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.5f, -7.0f)
                lineTo(87.8f, 30.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 95.7f, 24.0f)
                horizontalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(102.5f)
                lineTo(91.0f, 110.8f)
                arcToRelative(63.0f, 63.0f, 0.0f, false, true, 28.8f, -6.8f)
                arcTo(64.4f, 64.4f, 0.0f, false, true, 165.2f, 122.7f)
                close()
            }
        }
        .build()
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
