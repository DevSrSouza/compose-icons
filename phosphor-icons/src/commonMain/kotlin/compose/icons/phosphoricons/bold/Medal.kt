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

public val BoldGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 96.0f)
                arcTo(92.0f, 92.0f, 0.0f, true, false, 68.0f, 165.7f)
                lineTo(68.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.7f, 10.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.7f, 0.5f)
                lineTo(128.0f, 229.4f)
                lineToRelative(42.6f, 21.3f)
                arcTo(11.6f, 11.6f, 0.0f, false, false, 176.0f, 252.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 6.3f, -1.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 188.0f, 240.0f)
                lineTo(188.0f, 165.7f)
                arcTo(91.9f, 91.9f, 0.0f, false, false, 220.0f, 96.0f)
                close()
                moveTo(60.0f, 96.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, 68.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 60.0f, 96.0f)
                close()
                moveTo(164.0f, 220.6f)
                lineToRelative(-30.6f, -15.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -10.8f, 0.0f)
                lineTo(92.0f, 220.6f)
                lineTo(92.0f, 180.7f)
                arcToRelative(92.4f, 92.4f, 0.0f, false, false, 72.0f, 0.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 76.0f, 96.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 68.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 128.0f, 68.0f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
