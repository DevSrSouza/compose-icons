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

public val ThinGroup.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) {
            return _hourglassSimple!!
        }
        _hourglassSimple = Builder(name = "HourglassSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.7f, 220.0f)
                horizontalLineTo(59.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -20.5f)
                lineTo(122.3f, 128.0f)
                lineTo(50.8f, 56.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 59.3f, 36.0f)
                horizontalLineTo(196.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.5f, 20.5f)
                lineTo(133.7f, 128.0f)
                lineToRelative(71.5f, 71.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, 20.5f)
                close()
                moveTo(128.0f, 133.7f)
                lineTo(56.5f, 205.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.9f, 4.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.7f, 2.5f)
                horizontalLineTo(196.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.7f, -2.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.9f, -4.3f)
                close()
                moveTo(59.3f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.7f, 2.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.9f, 4.3f)
                lineTo(128.0f, 122.3f)
                lineToRelative(71.5f, -71.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.9f, -4.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.7f, -2.5f)
                close()
            }
        }
        .build()
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
