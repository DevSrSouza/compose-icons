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

public val LightGroup.HourglassSimpleHigh: ImageVector
    get() {
        if (_hourglassSimpleHigh != null) {
            return _hourglassSimpleHigh!!
        }
        _hourglassSimpleHigh = Builder(name = "HourglassSimpleHigh", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.5f, 128.0f)
                lineToRelative(70.1f, -70.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 196.7f, 34.0f)
                lineTo(59.3f, 34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.9f, 23.9f)
                lineTo(119.5f, 128.0f)
                lineTo(49.4f, 198.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 59.3f, 222.0f)
                lineTo(196.7f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, -23.9f)
                close()
                moveTo(57.5f, 47.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 59.3f, 46.0f)
                lineTo(196.7f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.8f, 1.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.4f, 2.2f)
                lineTo(181.5f, 66.0f)
                lineTo(74.5f, 66.0f)
                lineTo(57.9f, 49.4f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 57.5f, 47.2f)
                close()
                moveTo(86.5f, 78.0f)
                horizontalLineToRelative(83.0f)
                lineTo(128.0f, 119.5f)
                close()
                moveTo(198.5f, 208.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.8f, 1.2f)
                lineTo(59.3f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.8f, -1.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.4f, -2.2f)
                lineTo(128.0f, 136.5f)
                lineToRelative(70.1f, 70.1f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 198.5f, 208.8f)
                close()
            }
        }
        .build()
        return _hourglassSimpleHigh!!
    }

private var _hourglassSimpleHigh: ImageVector? = null
