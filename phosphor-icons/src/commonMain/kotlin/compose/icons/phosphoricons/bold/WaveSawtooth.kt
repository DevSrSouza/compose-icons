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

public val BoldGroup.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) {
            return _waveSawtooth!!
        }
        _waveSawtooth = Builder(name = "WaveSawtooth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.3f, 138.2f)
                lineToRelative(-104.0f, 64.0f)
                arcTo(11.8f, 11.8f, 0.0f, false, true, 128.0f, 204.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -5.9f, -1.5f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 116.0f, 192.0f)
                verticalLineTo(85.5f)
                lineTo(30.3f, 138.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.6f, -20.4f)
                lineToRelative(104.0f, -64.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 140.0f, 64.0f)
                verticalLineTo(170.5f)
                lineToRelative(85.7f, -52.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.6f, 20.4f)
                close()
            }
        }
        .build()
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
