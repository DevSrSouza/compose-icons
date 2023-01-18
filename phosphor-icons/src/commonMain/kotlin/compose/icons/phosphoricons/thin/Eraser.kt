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

public val ThinGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 211.8f)
                lineTo(120.7f, 211.8f)
                lineToRelative(98.1f, -98.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.3f)
                lineTo(173.6f, 40.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.3f, 0.0f)
                lineTo(88.7f, 96.7f)
                horizontalLineToRelative(0.0f)
                lineTo(32.2f, 153.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.3f)
                lineToRelative(37.0f, 37.1f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 2.9f, 1.1f)
                lineTo(216.0f, 219.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(150.9f, 45.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(45.3f, 45.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 0.0f, 16.9f)
                lineToRelative(-53.8f, 53.8f)
                lineTo(97.2f, 99.5f)
                close()
                moveTo(109.4f, 211.8f)
                lineTo(73.7f, 211.8f)
                lineTo(37.8f, 175.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(53.8f, -53.7f)
                lineToRelative(62.2f, 62.2f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
