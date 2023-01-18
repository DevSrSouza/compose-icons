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

public val LightGroup.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 132.5f)
                lineToRelative(-72.0f, 64.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.5f, -0.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.5f, -8.5f)
                lineTo(103.0f, 128.0f)
                lineTo(36.0f, 68.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.0f, -9.0f)
                lineToRelative(72.0f, 64.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 9.0f)
                close()
                moveTo(216.0f, 186.0f)
                horizontalLineTo(120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
