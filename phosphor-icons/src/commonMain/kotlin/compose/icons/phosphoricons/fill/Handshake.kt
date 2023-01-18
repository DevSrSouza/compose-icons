package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.8f, 214.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.8f, 6.1f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -1.9f, -0.3f)
                lineToRelative(-30.2f, -7.5f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, -6.6f, -3.5f)
                lineTo(50.8f, 190.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, true, true, 10.4f, -12.0f)
                lineToRelative(22.6f, 19.6f)
                lineToRelative(30.1f, 7.5f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 119.8f, 214.8f)
                close()
                moveTo(252.4f, 119.6f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -8.1f, 9.3f)
                lineTo(221.0f, 140.6f)
                lineToRelative(-14.9f, 17.5f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.1f, -0.1f, 0.2f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-36.8f, 36.8f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, true, -11.4f, 4.7f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -3.8f, -0.5f)
                lineTo(95.7f, 185.0f)
                arcToRelative(15.2f, 15.2f, 0.0f, false, true, -6.0f, -2.9f)
                lineToRelative(-54.0f, -42.2f)
                lineToRelative(-24.0f, -12.0f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, -8.1f, -9.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.1f, -12.3f)
                lineTo(29.3f, 59.1f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 21.3f, -7.0f)
                lineTo(73.0f, 63.3f)
                lineToRelative(48.7f, -14.2f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, true, 11.0f, 0.8f)
                lineToRelative(33.0f, 15.0f)
                horizontalLineToRelative(16.4f)
                lineToRelative(23.3f, -11.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.3f, 6.9f)
                lineToRelative(24.6f, 47.1f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 252.4f, 119.6f)
                close()
                moveTo(187.7f, 153.8f)
                lineTo(156.1f, 130.8f)
                lineTo(148.0f, 136.9f)
                arcToRelative(40.2f, 40.2f, 0.0f, false, true, -48.0f, 0.0f)
                lineToRelative(-5.4f, -4.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -1.7f, -24.1f)
                lineTo(132.0f, 69.5f)
                lineToRelative(1.8f, -1.5f)
                lineToRelative(-7.7f, -3.5f)
                lineTo(77.4f, 78.7f)
                lineTo(50.2f, 130.9f)
                lineToRelative(49.4f, 38.6f)
                lineTo(157.5f, 184.0f)
                close()
                moveTo(206.4f, 133.1f)
                lineTo(179.2f, 80.9f)
                lineTo(143.3f, 80.9f)
                lineTo(104.2f, 120.0f)
                lineToRelative(5.4f, 4.1f)
                arcToRelative(24.3f, 24.3f, 0.0f, false, false, 28.8f, 0.0f)
                lineToRelative(12.8f, -9.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.5f, -0.1f)
                lineToRelative(38.0f, 27.6f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
