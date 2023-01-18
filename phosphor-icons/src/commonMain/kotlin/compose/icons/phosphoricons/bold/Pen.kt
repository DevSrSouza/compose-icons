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

public val BoldGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.7f, 88.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -5.9f, -14.1f)
                lineTo(182.1f, 29.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -28.2f, 0.0f)
                lineToRelative(-120.0f, 120.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 28.0f, 163.3f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(92.7f, 228.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 14.1f, -5.9f)
                lineToRelative(1.7f, -1.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(77.8f, -77.8f)
                lineToRelative(4.1f, 13.9f)
                lineToRelative(-34.9f, 34.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.0f, -11.9f)
                lineToRelative(-9.9f, -33.2f)
                lineToRelative(21.2f, -21.3f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 232.7f, 88.0f)
                close()
                moveTo(100.0f, 195.0f)
                lineTo(61.0f, 156.0f)
                lineToRelative(75.0f, -75.0f)
                lineToRelative(39.0f, 39.0f)
                close()
                moveTo(52.0f, 181.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(52.0f, 204.0f)
                close()
                moveTo(192.0f, 103.0f)
                lineTo(153.0f, 64.0f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
