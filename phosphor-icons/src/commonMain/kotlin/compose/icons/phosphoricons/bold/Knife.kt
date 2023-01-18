package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.6f, 29.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -45.2f, 0.0f)
                curveToRelative(-0.1f, 0.0f, -0.1f, 0.0f, -0.1f, 0.1f)
                lineTo(15.4f, 207.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.9f, 20.1f)
                arcToRelative(162.1f, 162.1f, 0.0f, false, false, 35.9f, 4.1f)
                curveToRelative(34.2f, 0.0f, 68.4f, -11.1f, 100.5f, -32.9f)
                arcToRelative(234.1f, 234.1f, 0.0f, false, false, 51.9f, -47.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.1f, -15.7f)
                lineToRelative(-16.0f, -16.0f)
                lineToRelative(42.3f, -45.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 234.6f, 29.4f)
                close()
                moveTo(143.7f, 179.5f)
                curveToRelative(-31.0f, 20.8f, -62.7f, 30.2f, -94.7f, 28.1f)
                lineToRelative(97.6f, -100.0f)
                lineTo(167.0f, 127.9f)
                lineToRelative(0.6f, 0.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(16.1f, 16.1f)
                arcTo(222.4f, 222.4f, 0.0f, false, true, 143.7f, 179.5f)
                close()
                moveTo(217.7f, 57.7f)
                lineTo(217.4f, 57.9f)
                lineTo(175.5f, 102.5f)
                lineTo(163.4f, 90.4f)
                lineToRelative(43.0f, -44.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 0.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 217.7f, 57.7f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
