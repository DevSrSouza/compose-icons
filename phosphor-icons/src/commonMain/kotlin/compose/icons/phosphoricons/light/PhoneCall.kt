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

public val LightGroup.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.6f, 38.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 7.4f, -4.3f)
                arcTo(86.1f, 86.1f, 0.0f, false, true, 221.8f, 95.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.3f, 7.4f)
                lineToRelative(-1.5f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.8f, -4.5f)
                arcToRelative(74.3f, 74.3f, 0.0f, false, false, -52.3f, -52.3f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 153.6f, 38.5f)
                close()
                moveTo(149.6f, 76.7f)
                arcToRelative(42.4f, 42.4f, 0.0f, false, true, 29.7f, 29.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.8f, 4.5f)
                lineToRelative(1.5f, -0.2f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 4.3f, -7.4f)
                arcToRelative(54.2f, 54.2f, 0.0f, false, false, -38.2f, -38.2f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -7.4f, 4.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 149.6f, 76.7f)
                close()
                moveTo(229.6f, 174.8f)
                arcTo(54.1f, 54.1f, 0.0f, false, true, 176.0f, 222.0f)
                curveTo(97.7f, 222.0f, 34.0f, 158.3f, 34.0f, 80.0f)
                arcTo(54.1f, 54.1f, 0.0f, false, true, 81.2f, 26.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.5f, 8.4f)
                lineToRelative(20.1f, 46.9f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -1.1f, 13.2f)
                lineTo(98.0f, 120.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.1f, 1.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(78.2f, 78.2f, 0.0f, false, false, 36.2f, 36.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.9f, -0.2f)
                lineToRelative(25.1f, -16.7f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, 13.2f, -1.2f)
                lineToRelative(46.9f, 20.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 229.6f, 174.8f)
                close()
                moveTo(217.7f, 173.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.2f, -2.0f)
                lineToRelative(-46.9f, -20.1f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.9f, 0.2f)
                lineToRelative(-25.0f, 16.7f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, true, -13.8f, 1.0f)
                arcToRelative(90.8f, 90.8f, 0.0f, false, true, -41.8f, -41.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.9f, -13.7f)
                lineToRelative(16.6f, -25.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.2f, -1.9f)
                lineTo(84.7f, 39.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.8f, -1.2f)
                horizontalLineToRelative(-0.2f)
                arcTo(42.2f, 42.2f, 0.0f, false, false, 46.0f, 80.0f)
                arcTo(130.1f, 130.1f, 0.0f, false, false, 176.0f, 210.0f)
                arcTo(42.2f, 42.2f, 0.0f, false, false, 217.7f, 173.3f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
