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

public val BoldGroup.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 136.0f)
                lineTo(116.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(240.2f, 214.0f)
                arcTo(27.5f, 27.5f, 0.0f, false, true, 216.0f, 228.0f)
                lineTo(40.0f, 228.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -24.2f, -42.0f)
                lineToRelative(88.0f, -152.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, true, 48.4f, 0.0f)
                lineToRelative(88.0f, 152.0f)
                arcTo(27.5f, 27.5f, 0.0f, false, true, 240.2f, 214.0f)
                close()
                moveTo(219.4f, 198.0f)
                lineTo(131.5f, 46.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -7.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(36.6f, 198.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.0f, 4.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.4f, 2.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.4f, -2.0f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 219.4f, 198.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _warning!!
    }

private var _warning: ImageVector? = null
