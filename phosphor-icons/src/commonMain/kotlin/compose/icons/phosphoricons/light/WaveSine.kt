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

public val LightGroup.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.4f, 130.5f)
                curveTo(215.9f, 177.0f, 197.0f, 198.7f, 178.0f, 198.7f)
                curveToRelative(-23.8f, 0.0f, -39.2f, -33.1f, -55.4f, -68.2f)
                curveTo(109.2f, 101.8f, 94.1f, 69.3f, 78.0f, 69.3f)
                curveToRelative(-9.2f, 0.0f, -25.1f, 10.7f, -48.6f, 61.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.8f, -5.0f)
                curveTo(40.1f, 79.0f, 59.0f, 57.3f, 78.0f, 57.3f)
                curveToRelative(23.8f, 0.0f, 39.2f, 33.1f, 55.4f, 68.2f)
                curveToRelative(13.4f, 28.7f, 28.5f, 61.2f, 44.6f, 61.2f)
                curveToRelative(9.2f, 0.0f, 25.1f, -10.7f, 48.6f, -61.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.8f, 5.0f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
