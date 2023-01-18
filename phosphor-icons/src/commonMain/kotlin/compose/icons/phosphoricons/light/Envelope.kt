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

public val LightGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 50.0f)
                lineTo(32.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 50.0f)
                close()
                moveTo(128.0f, 135.9f)
                lineTo(47.4f, 62.0f)
                lineTo(208.6f, 62.0f)
                close()
                moveTo(101.7f, 128.0f)
                lineTo(38.0f, 186.4f)
                lineTo(38.0f, 69.6f)
                close()
                moveTo(110.5f, 136.1f)
                lineTo(123.9f, 148.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 8.2f, 0.0f)
                lineToRelative(13.4f, -12.3f)
                lineTo(208.6f, 194.0f)
                lineTo(47.4f, 194.0f)
                close()
                moveTo(154.3f, 128.0f)
                lineTo(218.0f, 69.6f)
                lineTo(218.0f, 186.4f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
