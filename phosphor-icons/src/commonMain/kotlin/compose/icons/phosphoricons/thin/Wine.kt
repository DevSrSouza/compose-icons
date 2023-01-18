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

public val ThinGroup.Wine: ImageVector
    get() {
        if (_wine != null) {
            return _wine!!
        }
        _wine = Builder(name = "Wine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.9f, 111.1f)
                lineTo(179.8f, 22.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 20.0f)
                lineTo(80.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 2.9f)
                lineTo(50.1f, 111.1f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, false, 1.3f, 19.5f)
                arcTo(84.4f, 84.4f, 0.0f, false, false, 124.0f, 179.9f)
                lineTo(124.0f, 228.0f)
                lineTo(88.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 228.0f)
                lineTo(132.0f, 179.9f)
                arcToRelative(84.4f, 84.4f, 0.0f, false, false, 72.6f, -49.3f)
                arcTo(28.4f, 28.4f, 0.0f, false, false, 205.9f, 111.1f)
                close()
                moveTo(83.0f, 28.0f)
                horizontalLineToRelative(90.0f)
                lineToRelative(22.7f, 76.7f)
                curveToRelative(-10.4f, 5.2f, -33.3f, 12.0f, -65.9f, -4.3f)
                curveToRelative(-29.6f, -14.8f, -52.2f, -12.2f, -66.0f, -7.2f)
                close()
                moveTo(197.3f, 127.3f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -138.6f, 0.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -0.9f, -13.9f)
                lineToRelative(3.0f, -10.3f)
                curveToRelative(11.3f, -5.6f, 33.7f, -11.4f, 65.4f, 4.5f)
                curveToRelative(16.6f, 8.3f, 31.0f, 11.1f, 42.9f, 11.1f)
                arcToRelative(67.0f, 67.0f, 0.0f, false, false, 28.8f, -6.2f)
                lineToRelative(0.3f, 0.9f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 197.3f, 127.3f)
                close()
            }
        }
        .build()
        return _wine!!
    }

private var _wine: ImageVector? = null
