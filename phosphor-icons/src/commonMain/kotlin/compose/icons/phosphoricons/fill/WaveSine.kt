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

public val FillGroup.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 200.7f)
                curveToRelative(-25.1f, 0.0f, -40.7f, -33.7f, -57.3f, -69.3f)
                curveToRelative(-13.0f, -28.2f, -27.8f, -60.1f, -42.7f, -60.1f)
                reflectiveCurveToRelative(-36.3f, 37.6f, -46.7f, 60.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, true, -14.6f, -6.8f)
                curveTo(38.7f, 77.4f, 58.1f, 55.3f, 78.0f, 55.3f)
                curveToRelative(25.1f, 0.0f, 40.7f, 33.7f, 57.3f, 69.3f)
                curveToRelative(13.0f, 28.2f, 27.8f, 60.1f, 42.7f, 60.1f)
                curveToRelative(16.4f, 0.0f, 36.3f, -37.6f, 46.7f, -60.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 14.6f, 6.8f)
                curveTo(217.3f, 178.6f, 197.9f, 200.7f, 178.0f, 200.7f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
