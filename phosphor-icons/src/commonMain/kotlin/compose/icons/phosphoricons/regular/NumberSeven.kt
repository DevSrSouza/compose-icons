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

public val RegularGroup.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) {
            return _numberSeven!!
        }
        _numberSeven = Builder(name = "NumberSeven", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.6f, 42.5f)
                lineToRelative(-64.0f, 192.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 112.0f, 240.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -2.5f, -0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.1f, -10.1f)
                lineTo(164.9f, 48.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 6.5f, 3.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 183.6f, 42.5f)
                close()
            }
        }
        .build()
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
