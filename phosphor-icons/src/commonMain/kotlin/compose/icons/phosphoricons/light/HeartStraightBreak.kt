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

public val LightGroup.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) {
            return _heartStraightBreak!!
        }
        _heartStraightBreak = Builder(name = "HeartStraightBreak", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.2f, 53.2f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 139.0f, 51.0f)
                lineTo(128.0f, 62.0f)
                lineToRelative(-8.9f, -8.9f)
                arcTo(62.8f, 62.8f, 0.0f, false, false, 78.8f, 34.8f)
                arcToRelative(56.5f, 56.5f, 0.0f, false, false, -41.6f, 14.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 35.0f, 133.0f)
                lineToRelative(83.1f, 83.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(81.0f, -81.0f)
                arcToRelative(62.8f, 62.8f, 0.0f, false, false, 18.3f, -40.3f)
                arcTo(56.5f, 56.5f, 0.0f, false, false, 223.2f, 53.2f)
                close()
                moveTo(210.4f, 126.6f)
                lineTo(129.4f, 207.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.8f, 0.0f)
                lineTo(43.5f, 124.5f)
                arcToRelative(45.8f, 45.8f, 0.0f, false, true, 1.8f, -66.7f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 75.0f, 46.7f)
                arcToRelative(50.3f, 50.3f, 0.0f, false, true, 35.6f, 14.9f)
                lineToRelative(9.1f, 9.1f)
                lineTo(107.6f, 84.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.2f, 8.2f)
                lineTo(135.5f, 120.0f)
                lineToRelative(-11.7f, 11.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, -8.4f)
                lineToRelative(-27.9f, -28.0f)
                lineToRelative(27.2f, -28.3f)
                arcToRelative(45.8f, 45.8f, 0.0f, false, true, 66.7f, 1.8f)
                curveTo(230.3f, 79.1f, 228.6f, 108.4f, 210.4f, 126.6f)
                close()
            }
        }
        .build()
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
