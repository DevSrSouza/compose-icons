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

public val LightGroup.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) {
            return _hourglassSimple!!
        }
        _hourglassSimple = Builder(name = "HourglassSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.7f, 222.0f)
                horizontalLineTo(59.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -9.9f, -23.9f)
                lineTo(119.5f, 128.0f)
                lineTo(49.4f, 57.9f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 59.3f, 34.0f)
                horizontalLineTo(196.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 9.9f, 23.9f)
                lineTo(136.5f, 128.0f)
                lineToRelative(70.1f, 70.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -9.9f, 23.9f)
                close()
                moveTo(128.0f, 136.5f)
                lineTo(57.9f, 206.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.4f, 2.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.8f, 1.2f)
                horizontalLineTo(196.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.8f, -1.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.4f, -2.2f)
                close()
                moveTo(59.3f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.8f, 1.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.4f, 2.2f)
                lineTo(128.0f, 119.5f)
                lineToRelative(70.1f, -70.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.4f, -2.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.8f, -1.2f)
                close()
            }
        }
        .build()
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
