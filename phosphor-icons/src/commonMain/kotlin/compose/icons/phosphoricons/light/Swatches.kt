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

public val LightGroup.Swatches: ImageVector
    get() {
        if (_swatches != null) {
            return _swatches!!
        }
        _swatches = Builder(name = "Swatches", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 190.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 72.0f, 190.0f)
                close()
                moveTo(226.0f, 163.9f)
                lineTo(226.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(71.9f, 222.0f)
                arcToRelative(47.2f, 47.2f, 0.0f, false, true, -6.4f, -0.5f)
                arcToRelative(41.3f, 41.3f, 0.0f, false, true, -27.3f, -17.0f)
                arcTo(43.3f, 43.3f, 0.0f, false, true, 30.8f, 172.0f)
                lineTo(54.9f, 34.8f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 71.2f, 23.5f)
                lineToRelative(55.1f, 9.7f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, true, 9.1f, 5.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 2.3f, 10.4f)
                lineTo(126.0f, 115.7f)
                lineToRelative(63.2f, -23.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 17.9f, 8.3f)
                lineToRelative(19.2f, 52.6f)
                arcTo(14.6f, 14.6f, 0.0f, false, true, 226.0f, 163.9f)
                close()
                moveTo(123.6f, 129.3f)
                lineToRelative(-10.2f, 58.0f)
                arcToRelative(42.7f, 42.7f, 0.0f, false, true, -3.5f, 10.8f)
                lineToRelative(103.9f, -37.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.2f, -2.6f)
                lineToRelative(-19.1f, -52.6f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -2.6f, -1.2f)
                close()
                moveTo(67.4f, 209.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 34.1f, -24.4f)
                lineTo(125.9f, 47.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.4f, -1.5f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -1.3f, -0.8f)
                lineTo(69.1f, 35.3f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.9f, 1.6f)
                lineTo(42.6f, 174.1f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, false, 5.3f, 23.4f)
                arcTo(29.2f, 29.2f, 0.0f, false, false, 67.4f, 209.6f)
                close()
                moveTo(214.0f, 208.0f)
                lineTo(214.0f, 173.0f)
                lineTo(112.4f, 210.0f)
                lineTo(212.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 214.0f, 208.0f)
                close()
            }
        }
        .build()
        return _swatches!!
    }

private var _swatches: ImageVector? = null
