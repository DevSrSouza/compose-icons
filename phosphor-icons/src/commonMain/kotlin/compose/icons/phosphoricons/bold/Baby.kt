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

public val BoldGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(108.1f, 108.1f, 0.0f, true, false, 0.2f, 0.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 105.5f, 47.1f)
                curveTo(100.1f, 60.8f, 100.0f, 71.3f, 100.0f, 72.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                arcToRelative(27.5f, 27.5f, 0.0f, false, false, 14.0f, -3.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -20.7f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -2.0f, 0.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.9f)
                curveToRelative(0.0f, -0.8f, 0.6f, -13.8f, 9.9f, -27.9f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(92.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 92.0f, 144.0f)
                close()
                moveTo(180.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 128.0f)
                close()
                moveTo(164.5f, 161.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -3.3f, 16.6f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, -66.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.3f, -20.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 39.8f, 0.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 164.5f, 161.4f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
