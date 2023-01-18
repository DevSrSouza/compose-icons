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

public val ThinGroup.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) {
            return _trafficSign!!
        }
        _trafficSign = Builder(name = "TrafficSign", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.2f, 119.5f)
                lineTo(136.5f, 14.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(14.8f, 119.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(119.5f, 241.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(241.2f, 136.5f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 241.2f, 119.5f)
                close()
                moveTo(235.5f, 130.8f)
                lineTo(130.8f, 235.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(20.5f, 130.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(125.2f, 20.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineTo(235.5f, 125.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 235.5f, 130.8f)
                close()
                moveTo(171.5f, 121.9f)
                lineTo(171.3f, 122.2f)
                lineTo(170.8f, 122.8f)
                lineTo(146.8f, 146.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(158.3f, 124.0f)
                lineTo(112.0f, 124.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(46.3f)
                lineTo(141.2f, 98.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineToRelative(24.0f, 24.0f)
                lineToRelative(0.5f, 0.6f)
                lineToRelative(0.2f, 0.3f)
                lineToRelative(0.2f, 0.4f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.2f, 0.1f, 0.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.1f, 0.3f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 0.0f, 1.6f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, 0.3f)
                curveToRelative(0.0f, 0.2f, -0.1f, 0.3f, -0.1f, 0.4f)
                close()
            }
        }
        .build()
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
