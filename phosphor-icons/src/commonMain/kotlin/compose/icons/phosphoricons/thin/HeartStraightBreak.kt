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

public val ThinGroup.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) {
            return _heartStraightBreak!!
        }
        _heartStraightBreak = Builder(name = "HeartStraightBreak", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.7f, 54.6f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -81.3f, -2.2f)
                lineTo(128.0f, 64.8f)
                lineTo(117.7f, 54.5f)
                arcToRelative(60.3f, 60.3f, 0.0f, false, false, -39.0f, -17.7f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 38.6f, 50.3f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -2.2f, 81.3f)
                lineToRelative(83.1f, 83.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(81.0f, -81.0f)
                arcToRelative(60.3f, 60.3f, 0.0f, false, false, 17.7f, -39.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 221.7f, 54.6f)
                close()
                moveTo(211.9f, 128.0f)
                lineToRelative(-81.1f, 81.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(42.1f, 125.9f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, true, 1.8f, -69.6f)
                arcTo(45.9f, 45.9f, 0.0f, false, true, 75.0f, 44.7f)
                arcToRelative(52.4f, 52.4f, 0.0f, false, true, 37.0f, 15.4f)
                lineToRelative(10.5f, 10.5f)
                lineTo(109.0f, 85.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.2f, 5.5f)
                lineTo(138.3f, 120.0f)
                lineToRelative(-13.1f, 13.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(117.5f, 87.9f)
                lineToRelative(28.6f, -29.8f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, true, 69.6f, 1.8f)
                curveTo(232.5f, 78.6f, 230.8f, 109.1f, 211.9f, 128.0f)
                close()
            }
        }
        .build()
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
