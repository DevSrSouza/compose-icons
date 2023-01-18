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

public val BoldGroup.Prohibit: ImageVector
    get() {
        if (_prohibit != null) {
            return _prohibit!!
        }
        _prohibit = Builder(name = "Prohibit", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.2f, 203.4f)
                arcTo(107.9f, 107.9f, 0.0f, false, false, 52.6f, 50.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.0f, 0.8f)
                lineToRelative(-0.8f, 1.0f)
                arcTo(107.9f, 107.9f, 0.0f, false, false, 203.4f, 205.2f)
                lineToRelative(1.0f, -0.8f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(83.4f, 83.4f, 0.0f, false, true, -16.8f, 50.3f)
                lineTo(77.7f, 60.7f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 212.0f, 128.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcTo(83.1f, 83.1f, 0.0f, false, true, 60.8f, 77.7f)
                lineTo(178.3f, 195.2f)
                arcTo(83.1f, 83.1f, 0.0f, false, true, 128.0f, 212.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 44.0f, 128.0f)
                close()
            }
        }
        .build()
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
