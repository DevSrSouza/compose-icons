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

public val LightGroup.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) {
            return _eyedropper!!
        }
        _eyedropper = Builder(name = "Eyedropper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 67.5f)
                arcToRelative(33.8f, 33.8f, 0.0f, false, false, -10.6f, -24.2f)
                curveToRelative(-13.3f, -12.5f, -34.7f, -12.1f, -47.9f, 1.1f)
                lineTo(140.2f, 67.7f)
                lineToRelative(-0.6f, -0.6f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -31.2f, 0.0f)
                lineToRelative(-7.0f, 7.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 0.0f, 19.8f)
                lineToRelative(3.5f, 3.5f)
                lineTo(53.1f, 149.1f)
                arcToRelative(38.3f, 38.3f, 0.0f, false, false, -10.3f, 34.6f)
                lineToRelative(-10.0f, 23.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 2.4f, 13.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, 4.1f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 5.6f, -1.2f)
                lineToRelative(21.6f, -9.4f)
                arcToRelative(38.3f, 38.3f, 0.0f, false, false, 34.6f, -10.3f)
                lineToRelative(51.7f, -51.8f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(7.0f, -7.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 0.0f, -31.2f)
                lineToRelative(-0.6f, -0.6f)
                lineTo(212.0f, 92.0f)
                arcTo(33.5f, 33.5f, 0.0f, false, false, 222.0f, 67.5f)
                close()
                moveTo(98.4f, 194.4f)
                arcToRelative(26.2f, 26.2f, 0.0f, false, true, -25.1f, 6.7f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, -4.0f, 0.3f)
                lineTo(45.9f, 211.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.1f, -0.3f)
                lineToRelative(10.8f, -24.6f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 0.3f, -4.0f)
                arcToRelative(26.2f, 26.2f, 0.0f, false, true, 6.7f, -25.1f)
                lineToRelative(51.8f, -51.7f)
                lineToRelative(36.7f, 36.7f)
                close()
                moveTo(203.6f, 83.6f)
                lineToRelative(-28.0f, 28.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 8.4f)
                lineToRelative(4.8f, 4.9f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, 0.0f, 14.2f)
                lineToRelative(-7.0f, 7.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.8f, 0.0f)
                lineTo(109.9f, 85.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, -2.8f)
                lineToRelative(7.0f, -7.0f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, true, 14.2f, 0.0f)
                lineToRelative(4.9f, 4.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 8.4f, 0.0f)
                lineTo(172.0f, 52.9f)
                curveToRelative(8.6f, -8.6f, 22.5f, -9.0f, 31.1f, -0.9f)
                arcTo(21.7f, 21.7f, 0.0f, false, true, 210.0f, 67.7f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 203.6f, 83.6f)
                close()
            }
        }
        .build()
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
