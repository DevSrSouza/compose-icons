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

public val ThinGroup.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) {
            return _waveSawtooth!!
        }
        _waveSawtooth = Builder(name = "WaveSawtooth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.1f, 131.4f)
                lineToRelative(-104.0f, 64.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.1f, 0.6f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -2.0f, -0.5f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.0f, -3.5f)
                verticalLineTo(71.2f)
                lineTo(26.1f, 131.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.2f, -6.8f)
                lineToRelative(104.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.1f, -0.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.0f, 3.5f)
                verticalLineTo(184.8f)
                lineToRelative(97.9f, -60.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.2f, 6.8f)
                close()
            }
        }
        .build()
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
