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

public val RegularGroup.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) {
            return _trafficSign!!
        }
        _trafficSign = Builder(name = "TrafficSign", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.3f, 101.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineToRelative(24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(0.2f, 0.3f)
                lineToRelative(0.3f, 0.4f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.2f, 0.2f, 0.3f)
                lineToRelative(0.2f, 0.3f)
                verticalLineToRelative(0.4f)
                lineToRelative(0.2f, 0.3f)
                curveToRelative(0.0f, 0.2f, 0.1f, 0.3f, 0.1f, 0.4f)
                lineToRelative(0.2f, 0.4f)
                verticalLineToRelative(0.3f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.1f, 0.4f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.1f, 0.5f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.1f, 0.3f)
                verticalLineToRelative(1.6f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, 0.3f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.1f, 0.5f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.1f, 0.4f)
                verticalLineToRelative(0.3f)
                lineToRelative(-0.2f, 0.4f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.1f, 0.4f)
                lineToRelative(-0.2f, 0.3f)
                verticalLineToRelative(0.4f)
                lineToRelative(-0.2f, 0.3f)
                curveToRelative(-0.1f, 0.1f, -0.2f, 0.2f, -0.2f, 0.3f)
                lineToRelative(-0.3f, 0.4f)
                lineToRelative(-0.2f, 0.3f)
                lineToRelative(-0.5f, 0.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(148.7f, 128.0f)
                horizontalLineTo(112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(36.7f)
                close()
                moveTo(244.0f, 139.3f)
                lineTo(139.3f, 244.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -22.6f, 0.0f)
                lineTo(12.0f, 139.3f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 0.0f, -22.6f)
                lineTo(116.7f, 12.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 22.6f, 0.0f)
                lineTo(244.0f, 116.7f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 244.0f, 139.3f)
                close()
                moveTo(232.7f, 128.0f)
                lineTo(128.0f, 23.3f)
                lineTo(23.3f, 128.0f)
                lineTo(128.0f, 232.7f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
