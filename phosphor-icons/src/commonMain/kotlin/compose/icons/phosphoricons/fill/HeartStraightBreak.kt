package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) {
            return _heartStraightBreak!!
        }
        _heartStraightBreak = Builder(name = "HeartStraightBreak", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.2f, 95.0f)
                arcToRelative(64.3f, 64.3f, 0.0f, false, true, -18.9f, 41.5f)
                lineToRelative(-81.0f, 81.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -22.6f, 0.0f)
                lineTo(33.6f, 134.4f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, 2.3f, -87.0f)
                arcTo(57.7f, 57.7f, 0.0f, false, true, 79.0f, 32.8f)
                arcToRelative(64.4f, 64.4f, 0.0f, false, true, 33.8f, 12.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.5f, 6.1f)
                lineTo(94.9f, 69.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                lineToRelative(34.4f, 34.3f)
                lineToRelative(-15.0f, 15.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.0f, 11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, 2.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineToRelative(20.7f, -20.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                lineTo(111.9f, 75.2f)
                lineToRelative(21.7f, -21.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, 87.0f, 2.3f)
                arcTo(57.7f, 57.7f, 0.0f, false, true, 239.2f, 95.0f)
                close()
            }
        }
        .build()
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
