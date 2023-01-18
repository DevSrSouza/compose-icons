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

public val BoldGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 84.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 164.0f, 84.0f)
                close()
                moveTo(164.0f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 44.0f)
                close()
                moveTo(249.6f, 193.9f)
                lineTo(197.2f, 105.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.4f, 0.0f)
                lineTo(146.5f, 133.0f)
                lineTo(109.2f, 69.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.4f, 0.0f)
                lineTo(1.7f, 193.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 212.0f)
                lineTo(239.3f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.3f, -18.1f)
                close()
                moveTo(92.0f, 87.7f)
                lineTo(108.7f, 116.0f)
                lineTo(75.3f, 116.0f)
                close()
                moveTo(33.0f, 188.0f)
                lineToRelative(28.2f, -48.0f)
                horizontalLineToRelative(61.6f)
                lineToRelative(13.3f, 22.7f)
                horizontalLineToRelative(0.1f)
                lineTo(151.0f, 188.0f)
                close()
                moveTo(178.9f, 188.0f)
                lineTo(160.4f, 156.6f)
                lineTo(180.0f, 123.5f)
                lineTo(218.2f, 188.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
