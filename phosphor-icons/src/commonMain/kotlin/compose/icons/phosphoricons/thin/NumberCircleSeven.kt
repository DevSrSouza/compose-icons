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

public val ThinGroup.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) {
            return _numberCircleSeven!!
        }
        _numberCircleSeven = Builder(name = "NumberCircleSeven", defaultWidth = 256.0.dp,
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
                moveTo(155.2f, 81.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.6f, 3.6f)
                lineToRelative(-32.0f, 96.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 120.0f, 184.0f)
                lineToRelative(-1.3f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.5f, -5.1f)
                lineTo(146.5f, 88.0f)
                lineTo(104.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(3.7f, 3.7f, 0.0f, false, true, 155.2f, 81.7f)
                close()
            }
        }
        .build()
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
