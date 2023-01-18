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

public val FillGroup.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) {
            return _heartbeat!!
        }
        _heartbeat = Builder(name = "Heartbeat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 92.0f)
                curveToRelative(0.0f, 30.6f, -17.7f, 62.0f, -52.6f, 93.4f)
                arcTo(314.3f, 314.3f, 0.0f, false, true, 131.9f, 223.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.8f, 0.0f)
                curveToRelative(-3.2f, -1.8f, -60.4f, -34.3f, -88.6f, -80.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.4f, -6.1f)
                horizontalLineTo(72.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.7f, -3.6f)
                lineToRelative(9.3f, -14.0f)
                lineToRelative(25.3f, 38.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 9.2f, 3.2f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, false, 4.3f, -3.3f)
                lineTo(140.3f, 136.0f)
                horizontalLineToRelative(19.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 8.3f, -7.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.5f)
                horizontalLineTo(136.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -6.7f, 3.6f)
                lineToRelative(-9.3f, 14.0f)
                lineToRelative(-25.3f, -38.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -9.2f, -3.2f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, false, -4.3f, 3.3f)
                lineTo(67.7f, 120.0f)
                horizontalLineTo(27.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.8f, -2.8f)
                arcTo(86.2f, 86.2f, 0.0f, false, true, 20.0f, 92.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 128.0f, 56.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 236.0f, 92.0f)
                close()
            }
        }
        .build()
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
