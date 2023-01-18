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

public val BoldGroup.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) {
            return _heartStraightBreak!!
        }
        _heartStraightBreak = Builder(name = "HeartStraightBreak", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.6f, 49.2f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, -92.9f, -2.5f)
                lineTo(128.0f, 53.5f)
                lineToRelative(-4.7f, -4.7f)
                arcToRelative(68.8f, 68.8f, 0.0f, false, false, -44.1f, -20.0f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, false, -46.0f, 15.6f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, -2.5f, 92.9f)
                lineToRelative(83.2f, 83.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.2f, 0.0f)
                lineToRelative(81.1f, -81.1f)
                arcToRelative(68.8f, 68.8f, 0.0f, false, false, 20.0f, -44.1f)
                arcTo(62.1f, 62.1f, 0.0f, false, false, 227.6f, 49.2f)
                close()
                moveTo(206.2f, 122.4f)
                lineTo(128.0f, 200.6f)
                lineTo(47.7f, 120.3f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 1.6f, -58.1f)
                arcTo(38.1f, 38.1f, 0.0f, false, true, 75.0f, 52.7f)
                arcToRelative(44.6f, 44.6f, 0.0f, false, true, 31.4f, 13.1f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(-8.3f, 9.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.4f, 16.6f)
                lineTo(127.0f, 120.0f)
                lineToRelative(-7.5f, 7.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(128.6f, 87.6f)
                lineToRelative(23.1f, -23.9f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 58.1f, 1.6f)
                curveTo(223.8f, 80.8f, 222.2f, 106.4f, 206.2f, 122.4f)
                close()
            }
        }
        .build()
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
