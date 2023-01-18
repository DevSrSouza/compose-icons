package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) {
            return _numberCircleSeven!!
        }
        _numberCircleSeven = Builder(name = "NumberCircleSeven", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(161.7f, 77.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 1.7f, 10.8f)
                lineToRelative(-32.0f, 96.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 120.0f, 192.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -3.8f, -0.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.6f, -15.2f)
                lineTo(135.4f, 96.0f)
                lineTo(104.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 161.7f, 77.0f)
                close()
            }
        }
        .build()
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
