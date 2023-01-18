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

public val LightGroup.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) {
            return _waveSawtooth!!
        }
        _waveSawtooth = Builder(name = "WaveSawtooth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.1f, 133.1f)
                lineToRelative(-104.0f, 64.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -3.1f, 0.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.9f, -0.8f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 122.0f, 192.0f)
                verticalLineTo(74.7f)
                lineTo(27.1f, 133.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.2f, -10.2f)
                lineToRelative(104.0f, -64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 134.0f, 64.0f)
                verticalLineTo(181.3f)
                lineToRelative(94.9f, -58.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.2f, 10.2f)
                close()
            }
        }
        .build()
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
