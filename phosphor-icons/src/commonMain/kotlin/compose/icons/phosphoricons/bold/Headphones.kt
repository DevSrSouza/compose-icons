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

public val BoldGroup.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.5f, 59.3f)
                arcTo(107.1f, 107.1f, 0.0f, false, false, 128.7f, 28.0f)
                arcTo(107.9f, 107.9f, 0.0f, false, false, 20.0f, 136.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(64.0f, 220.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(92.0f, 152.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(44.8f, 124.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 52.0f)
                horizontalLineToRelative(0.8f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, 83.8f, 72.0f)
                lineTo(193.5f, 124.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(237.5f, 136.0f)
                arcTo(107.5f, 107.5f, 0.0f, false, false, 205.5f, 59.3f)
                close()
                moveTo(64.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 148.0f)
                close()
                moveTo(213.5f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(189.5f, 152.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(20.0f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
