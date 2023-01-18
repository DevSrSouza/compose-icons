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

public val BoldGroup.Needle: ImageVector
    get() {
        if (_needle != null) {
            return _needle!!
        }
        _needle = Builder(name = "Needle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.1f, 40.9f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, -62.2f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -3.4f, 6.4f)
                curveToRelative(-7.1f, 41.7f, -70.2f, 112.4f, -94.0f, 136.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(23.7f, -23.7f, 94.5f, -86.9f, 136.2f, -94.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.4f, -3.4f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, 0.0f, -62.2f)
                close()
                moveTo(198.1f, 86.1f)
                lineTo(176.7f, 107.6f)
                curveToRelative(-14.8f, 3.3f, -32.4f, 11.4f, -52.5f, 24.2f)
                curveToRelative(12.8f, -20.1f, 20.9f, -37.7f, 24.2f, -52.5f)
                lineToRelative(21.5f, -21.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, true, true, 28.2f, 28.2f)
                close()
            }
        }
        .build()
        return _needle!!
    }

private var _needle: ImageVector? = null
