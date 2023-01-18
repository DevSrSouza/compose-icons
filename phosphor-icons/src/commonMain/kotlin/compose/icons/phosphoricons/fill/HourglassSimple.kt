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

public val FillGroup.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) {
            return _hourglassSimple!!
        }
        _hourglassSimple = Builder(name = "HourglassSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 196.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.7f, 224.0f)
                horizontalLineTo(59.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 196.7f)
                lineTo(116.7f, 128.0f)
                lineTo(48.0f, 59.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 59.3f, 32.0f)
                horizontalLineTo(196.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 59.3f)
                lineTo(139.3f, 128.0f)
                close()
            }
        }
        .build()
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
