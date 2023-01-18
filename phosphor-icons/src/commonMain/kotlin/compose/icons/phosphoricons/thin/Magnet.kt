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

public val ThinGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.1f, 53.1f)
                arcTo(83.4f, 83.4f, 0.0f, false, false, 144.6f, 28.0f)
                horizontalLineToRelative(-0.3f)
                arcTo(83.5f, 83.5f, 0.0f, false, false, 84.8f, 52.6f)
                lineTo(18.7f, 119.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.1f, 17.0f)
                lineToRelative(28.6f, 28.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.5f, 3.5f)
                lineTo(56.0f, 168.6f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 8.5f, -3.6f)
                lineToRelative(65.6f, -67.2f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 28.0f, -0.2f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, true, 6.0f, 14.0f)
                arcToRelative(21.5f, 21.5f, 0.0f, false, true, -6.0f, 14.9f)
                lineTo(91.0f, 191.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -3.6f, 8.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 3.5f, 8.6f)
                lineToRelative(28.7f, 28.6f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 8.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.4f, -3.4f)
                lineTo(169.4f, 205.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(33.5f, -32.9f)
                curveTo(235.8f, 139.2f, 236.4f, 85.8f, 204.1f, 53.1f)
                close()
                moveTo(58.8f, 159.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, 1.2f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                lineTo(24.5f, 130.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.1f, -5.6f)
                lineTo(54.0f, 95.3f)
                lineToRelative(34.1f, 34.1f)
                close()
                moveTo(130.9f, 231.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -5.7f, 0.0f)
                lineTo(96.6f, 202.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -1.2f, -2.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.2f, -2.9f)
                lineTo(126.7f, 168.0f)
                lineToRelative(34.2f, 34.2f)
                close()
                moveTo(166.6f, 196.6f)
                lineTo(132.5f, 162.4f)
                lineTo(163.7f, 132.2f)
                arcToRelative(29.3f, 29.3f, 0.0f, false, false, 8.4f, -20.7f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -47.6f, -19.3f)
                horizontalLineToRelative(-0.1f)
                lineTo(93.7f, 123.7f)
                lineTo(59.6f, 89.6f)
                lineTo(90.5f, 58.3f)
                arcTo(75.6f, 75.6f, 0.0f, false, true, 144.3f, 36.0f)
                horizontalLineToRelative(0.2f)
                arcToRelative(75.4f, 75.4f, 0.0f, false, true, 53.9f, 22.7f)
                curveToRelative(29.2f, 29.6f, 28.7f, 77.9f, -1.1f, 107.7f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
