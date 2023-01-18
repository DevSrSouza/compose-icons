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

public val ThinGroup.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) {
            return _phoneIncoming!!
        }
        _phoneIncoming = Builder(name = "PhoneIncoming", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.4f, 162.1f)
                lineTo(173.6f, 142.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -11.4f, 1.1f)
                lineToRelative(-25.1f, 16.7f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -3.8f, 0.3f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, true, -37.2f, -37.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.3f, -3.9f)
                lineTo(113.0f, 93.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.0f, -11.3f)
                lineTo(93.9f, 35.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -12.5f, -7.2f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 36.0f, 80.0f)
                curveToRelative(0.0f, 77.2f, 62.8f, 140.0f, 140.0f, 140.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, 51.6f, -45.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 220.4f, 162.1f)
                close()
                moveTo(219.7f, 173.6f)
                arcTo(44.1f, 44.1f, 0.0f, false, true, 176.0f, 212.0f)
                arcTo(132.1f, 132.1f, 0.0f, false, true, 44.0f, 80.0f)
                arcTo(44.1f, 44.1f, 0.0f, false, true, 82.4f, 36.3f)
                horizontalLineToRelative(0.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.6f, 2.5f)
                lineToRelative(20.1f, 46.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -0.3f, 3.8f)
                lineTo(89.7f, 114.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -0.8f, 11.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(88.6f, 88.6f, 0.0f, false, false, 40.9f, 40.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.8f, -0.9f)
                lineToRelative(25.0f, -16.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.8f, -0.3f)
                lineToRelative(46.8f, 20.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.7f, 173.6f)
                close()
                moveTo(156.1f, 96.8f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.1f, -0.8f)
                lineTo(156.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(164.0f, 86.3f)
                lineToRelative(41.2f, -41.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                lineTo(169.7f, 92.0f)
                lineTo(200.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(158.5f, 100.0f)
                lineToRelative(-0.4f, -0.2f)
                lineToRelative(-0.3f, -0.2f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -1.1f, -1.1f)
                lineToRelative(-0.2f, -0.3f)
                lineToRelative(-0.2f, -0.4f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.4f)
                arcTo(0.4f, 0.4f, 0.0f, false, true, 156.1f, 96.8f)
                close()
            }
        }
        .build()
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null
