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

public val LightGroup.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) {
            return _heartbeat!!
        }
        _heartbeat = Builder(name = "Heartbeat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 134.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(68.8f)
                lineTo(83.0f, 100.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.0f, 0.0f)
                lineToRelative(27.0f, 40.5f)
                lineToRelative(11.0f, -16.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.0f, -2.7f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(139.2f)
                lineTo(125.0f, 155.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.0f, 0.0f)
                lineTo(88.0f, 114.8f)
                lineTo(77.0f, 131.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 72.0f, 134.0f)
                close()
                moveTo(176.0f, 34.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -48.0f, 25.4f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 22.0f, 92.0f)
                curveToRelative(0.0f, 1.4f, 0.0f, 2.9f, 0.1f, 4.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 6.4f, 5.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.6f, -6.3f)
                curveTo(34.0f, 94.4f, 34.0f, 93.2f, 34.0f, 92.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 88.5f, -17.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 11.0f, 0.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 222.0f, 92.0f)
                curveToRelative(0.0f, 57.3f, -77.8f, 107.3f, -94.0f, 117.0f)
                curveToRelative(-9.6f, -5.8f, -41.0f, -25.7f, -64.8f, -52.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, -0.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -0.6f, 8.5f)
                curveToRelative(29.8f, 34.0f, 69.3f, 56.3f, 71.0f, 57.2f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 5.8f, 0.0f)
                arcTo(315.8f, 315.8f, 0.0f, false, false, 182.0f, 184.0f)
                curveToRelative(34.5f, -31.1f, 52.0f, -62.0f, 52.0f, -92.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 176.0f, 34.0f)
                close()
            }
        }
        .build()
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
