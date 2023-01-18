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

public val LightGroup.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.6f, 71.1f)
                lineTo(220.2f, 51.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineToRelative(19.3f, 19.4f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, true, 2.9f, 7.0f)
                lineTo(234.0f, 168.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                lineTo(214.0f, 128.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(174.0f, 106.0f)
                lineTo(174.0f, 56.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(72.0f, 34.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 50.0f, 56.0f)
                lineTo(50.0f, 210.0f)
                lineTo(32.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(192.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(174.0f, 210.0f)
                lineTo(174.0f, 118.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                lineTo(246.0f, 86.6f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 239.6f, 71.1f)
                close()
                moveTo(62.0f, 210.0f)
                lineTo(62.0f, 56.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 72.0f, 46.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                lineTo(162.0f, 210.0f)
                close()
                moveTo(142.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 142.0f, 112.0f)
                close()
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
