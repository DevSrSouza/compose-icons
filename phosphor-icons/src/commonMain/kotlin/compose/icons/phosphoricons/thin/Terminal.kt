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

public val ThinGroup.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 128.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -1.3f, 3.0f)
                lineToRelative(-72.0f, 64.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.7f, 1.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -3.0f, -1.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.3f, -5.7f)
                lineTo(106.0f, 128.0f)
                lineTo(37.3f, 67.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.4f, -6.0f)
                lineToRelative(72.0f, 64.0f)
                arcTo(4.3f, 4.3f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(216.0f, 188.0f)
                lineTo(120.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
