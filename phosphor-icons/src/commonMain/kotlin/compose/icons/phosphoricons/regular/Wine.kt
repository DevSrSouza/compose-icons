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

public val RegularGroup.Wine: ImageVector
    get() {
        if (_wine != null) {
            return _wine!!
        }
        _wine = Builder(name = "Wine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.7f, 110.0f)
                lineToRelative(-26.0f, -88.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 16.0f)
                lineTo(80.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.7f, 5.7f)
                lineTo(46.3f, 110.0f)
                arcToRelative(31.5f, 31.5f, 0.0f, false, false, 1.5f, 22.2f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 120.0f, 183.6f)
                lineTo(120.0f, 224.0f)
                lineTo(88.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 224.0f)
                lineTo(136.0f, 183.6f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 72.2f, -51.4f)
                arcTo(31.5f, 31.5f, 0.0f, false, false, 209.7f, 110.0f)
                close()
                moveTo(86.0f, 32.0f)
                horizontalLineToRelative(84.0f)
                lineToRelative(20.8f, 70.5f)
                curveToRelative(-10.7f, 4.5f, -31.0f, 8.4f, -59.2f, -5.7f)
                curveToRelative(-26.2f, -13.0f, -47.2f, -13.0f, -61.9f, -9.5f)
                close()
                moveTo(193.6f, 125.7f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -131.2f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -0.8f, -11.2f)
                lineToRelative(2.6f, -8.6f)
                curveToRelative(11.0f, -4.9f, 31.4f, -9.1f, 60.2f, 5.3f)
                curveToRelative(17.3f, 8.6f, 32.3f, 11.5f, 44.7f, 11.5f)
                arcToRelative(74.7f, 74.7f, 0.0f, false, false, 25.9f, -4.6f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 193.6f, 125.7f)
                close()
            }
        }
        .build()
        return _wine!!
    }

private var _wine: ImageVector? = null
