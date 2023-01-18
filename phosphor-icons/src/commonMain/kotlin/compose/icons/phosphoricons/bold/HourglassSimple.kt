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

public val BoldGroup.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) {
            return _hourglassSimple!!
        }
        _hourglassSimple = Builder(name = "HourglassSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.7f, 228.0f)
                lineTo(59.3f, 228.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -14.1f, -34.1f)
                lineTo(111.0f, 128.0f)
                lineTo(45.2f, 62.1f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 59.3f, 28.0f)
                lineTo(196.7f, 28.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 14.1f, 34.1f)
                lineTo(145.0f, 128.0f)
                lineToRelative(65.8f, 65.9f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 196.7f, 228.0f)
                close()
                moveTo(193.9f, 210.8f)
                close()
                moveTo(69.0f, 204.0f)
                lineTo(187.0f, 204.0f)
                lineToRelative(-59.0f, -59.0f)
                close()
                moveTo(69.0f, 52.0f)
                lineToRelative(59.0f, 59.0f)
                lineToRelative(59.0f, -59.0f)
                close()
                moveTo(196.7f, 52.0f)
                close()
            }
        }
        .build()
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
