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

public val ThinGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 220.0f)
                curveTo(98.8f, 220.0f, 36.0f, 157.2f, 36.0f, 80.0f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 81.4f, 28.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 12.5f, 7.2f)
                lineTo(114.0f, 82.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.0f, 11.3f)
                lineTo(96.4f, 119.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.3f, 3.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, false, 37.2f, 37.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 3.8f, -0.3f)
                lineToRelative(25.1f, -16.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 11.4f, -1.1f)
                lineToRelative(46.8f, 20.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 7.2f, 12.5f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 176.0f, 220.0f)
                close()
                moveTo(82.9f, 36.3f)
                horizontalLineToRelative(-0.5f)
                arcTo(44.1f, 44.1f, 0.0f, false, false, 44.0f, 80.0f)
                arcTo(132.1f, 132.1f, 0.0f, false, false, 176.0f, 212.0f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, 43.7f, -38.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.5f, -4.1f)
                lineToRelative(-46.8f, -20.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 0.3f)
                lineToRelative(-25.0f, 16.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -11.8f, 0.9f)
                arcToRelative(88.6f, 88.6f, 0.0f, false, true, -40.9f, -40.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 0.8f, -11.8f)
                lineToRelative(16.6f, -25.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.3f, -3.8f)
                lineTo(86.5f, 38.8f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 82.9f, 36.3f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
