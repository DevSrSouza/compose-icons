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

public val RegularGroup.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) {
            return _heartStraightBreak!!
        }
        _heartStraightBreak = Builder(name = "HeartStraightBreak", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.6f, 51.9f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, false, -87.0f, -2.3f)
                lineTo(128.0f, 59.1f)
                lineToRelative(-7.5f, -7.4f)
                arcTo(64.3f, 64.3f, 0.0f, false, false, 79.0f, 32.8f)
                arcTo(57.7f, 57.7f, 0.0f, false, false, 35.9f, 47.4f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, false, -2.3f, 87.0f)
                lineToRelative(83.1f, 83.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 22.6f, 0.0f)
                lineToRelative(81.0f, -81.0f)
                arcTo(64.3f, 64.3f, 0.0f, false, false, 239.2f, 95.0f)
                arcTo(57.7f, 57.7f, 0.0f, false, false, 224.6f, 51.9f)
                close()
                moveTo(209.0f, 125.2f)
                lineToRelative(-81.0f, 81.0f)
                lineTo(44.9f, 123.1f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 1.7f, -63.9f)
                arcTo(42.5f, 42.5f, 0.0f, false, true, 75.0f, 48.7f)
                arcTo(48.4f, 48.4f, 0.0f, false, true, 109.2f, 63.0f)
                lineToRelative(7.7f, 7.7f)
                lineTo(106.1f, 82.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.2f, 11.1f)
                lineTo(132.7f, 120.0f)
                lineToRelative(-10.4f, 10.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(123.1f, 87.7f)
                lineToRelative(25.8f, -26.8f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 63.9f, 1.7f)
                curveTo(228.1f, 79.7f, 226.5f, 107.8f, 209.0f, 125.2f)
                close()
            }
        }
        .build()
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
