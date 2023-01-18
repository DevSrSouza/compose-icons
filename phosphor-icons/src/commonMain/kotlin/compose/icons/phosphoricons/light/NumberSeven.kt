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

public val LightGroup.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) {
            return _numberSeven!!
        }
        _numberSeven = Builder(name = "NumberSeven", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.7f, 41.9f)
                lineToRelative(-64.0f, 192.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 112.0f, 238.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -1.9f, -0.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -3.8f, -7.6f)
                lineTo(167.7f, 46.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.7f, 7.9f)
                close()
            }
        }
        .build()
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
