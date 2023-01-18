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

public val RegularGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(104.1f, 104.1f, 0.0f, true, false, 0.1f, 0.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 112.5f, 41.4f)
                curveTo(104.1f, 57.7f, 104.0f, 71.3f, 104.0f, 72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                curveToRelative(0.0f, -0.1f, 0.3f, -15.6f, 11.9f, -31.9f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(92.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 140.0f)
                close()
                moveTo(176.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 128.0f)
                close()
                moveTo(161.2f, 163.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -2.2f, 11.1f)
                arcToRelative(56.3f, 56.3f, 0.0f, false, true, -62.0f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -2.2f, -11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.1f, -2.3f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, false, 44.2f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 161.2f, 163.6f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
