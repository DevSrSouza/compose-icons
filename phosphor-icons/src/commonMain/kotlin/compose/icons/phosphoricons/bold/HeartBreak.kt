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

public val BoldGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 28.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -45.3f, 18.7f)
                lineToRelative(-2.8f, 2.9f)
                arcTo(63.4f, 63.4f, 0.0f, false, false, 80.0f, 28.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 16.0f, 92.0f)
                curveToRelative(0.0f, 74.2f, 101.8f, 132.0f, 106.1f, 134.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 11.8f, 0.0f)
                curveTo(138.2f, 224.0f, 240.0f, 166.2f, 240.0f, 92.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 176.0f, 28.0f)
                close()
                moveTo(128.0f, 202.0f)
                curveToRelative(-20.6f, -12.8f, -88.0f, -58.8f, -88.0f, -110.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 70.9f, -25.4f)
                lineTo(98.7f, 78.7f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(23.6f, 23.5f)
                lineToRelative(-7.6f, 7.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(124.2f, 87.2f)
                lineToRelative(10.3f, -10.3f)
                lineToRelative(0.4f, -0.4f)
                lineToRelative(12.8f, -12.8f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 216.0f, 92.0f)
                curveTo(216.0f, 143.2f, 148.6f, 189.2f, 128.0f, 202.0f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
