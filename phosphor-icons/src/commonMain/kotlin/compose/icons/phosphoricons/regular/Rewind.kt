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

public val RegularGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.7f, 56.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -16.4f, 0.6f)
                lineTo(124.0f, 113.3f)
                lineTo(124.0f, 70.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 99.3f, 57.2f)
                lineTo(10.1f, 114.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, 27.0f)
                lineToRelative(89.2f, 57.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 124.0f, 185.3f)
                lineTo(124.0f, 142.7f)
                lineToRelative(87.3f, 56.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 236.0f, 185.3f)
                lineTo(236.0f, 70.7f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 227.7f, 56.6f)
                close()
                moveTo(108.0f, 185.3f)
                lineTo(18.8f, 128.0f)
                horizontalLineToRelative(0.0f)
                lineTo(108.0f, 70.7f)
                close()
                moveTo(220.0f, 185.3f)
                lineTo(130.8f, 128.0f)
                horizontalLineToRelative(0.0f)
                lineTo(220.0f, 70.7f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
