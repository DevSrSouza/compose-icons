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

public val LightGroup.Needle: ImageVector
    get() {
        if (_needle != null) {
            return _needle!!
        }
        _needle = Builder(name = "Needle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.2f, 67.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                lineToRelative(-16.0f, 16.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(16.0f, -16.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 188.2f, 67.8f)
                close()
                moveTo(222.0f, 72.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, true, -11.1f, 26.9f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -3.3f, 1.6f)
                curveToRelative(-52.1f, 9.0f, -138.5f, 94.9f, -139.4f, 95.7f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -1.8f, 1.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, -2.4f, 0.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -10.2f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.4f, -1.4f, 86.7f, -87.4f, 95.7f, -139.3f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, 1.6f, -3.3f)
                lineToRelative(24.0f, -24.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 222.0f, 72.0f)
                close()
                moveTo(210.0f, 72.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -44.4f, -18.4f)
                lineTo(142.9f, 76.3f)
                curveToRelative(-4.1f, 20.8f, -18.6f, 47.6f, -43.1f, 79.9f)
                curveToRelative(32.3f, -24.5f, 59.1f, -39.0f, 79.9f, -43.1f)
                lineToRelative(22.7f, -22.7f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 210.0f, 72.0f)
                close()
            }
        }
        .build()
        return _needle!!
    }

private var _needle: ImageVector? = null
