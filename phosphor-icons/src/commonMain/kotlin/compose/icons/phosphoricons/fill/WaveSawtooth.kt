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

public val FillGroup.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) {
            return _waveSawtooth!!
        }
        _waveSawtooth = Builder(name = "WaveSawtooth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 134.8f)
                lineToRelative(-104.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.1f, 0.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.1f, -7.0f)
                verticalLineTo(78.3f)
                lineTo(28.2f, 134.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.4f, -13.6f)
                lineToRelative(104.0f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 64.0f)
                verticalLineTo(177.7f)
                lineToRelative(91.8f, -56.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.4f, 13.6f)
                close()
            }
        }
        .build()
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
