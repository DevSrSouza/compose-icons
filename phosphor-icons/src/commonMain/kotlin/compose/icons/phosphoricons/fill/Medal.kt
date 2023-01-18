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

public val FillGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 96.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 184.0f, 96.0f)
                close()
                moveTo(216.0f, 96.0f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, -32.0f, 67.8f)
                lineTo(184.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, true, -3.6f, -0.8f)
                lineTo(128.0f, 224.9f)
                lineTo(83.6f, 247.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -0.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 72.0f, 240.0f)
                lineTo(72.0f, 163.8f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 216.0f, 96.0f)
                close()
                moveTo(200.0f, 96.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -72.0f, 72.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 200.0f, 96.0f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
