package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                lineTo(24.0f, 128.0f)
                curveTo(76.0f, 16.0f, 102.0f, 72.0f, 128.0f, 128.0f)
                close()
                moveTo(128.0f, 128.0f)
                curveToRelative(26.0f, 56.0f, 52.0f, 112.0f, 104.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.3f, 131.4f)
                curveToRelative(-22.0f, 47.2f, -41.4f, 69.3f, -61.3f, 69.3f)
                curveToRelative(-25.1f, 0.0f, -40.7f, -33.7f, -57.3f, -69.3f)
                curveToRelative(-13.0f, -28.2f, -27.8f, -60.1f, -42.7f, -60.1f)
                reflectiveCurveToRelative(-36.3f, 37.6f, -46.7f, 60.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, true, -14.6f, -6.8f)
                curveTo(38.7f, 77.4f, 58.1f, 55.3f, 78.0f, 55.3f)
                curveToRelative(25.1f, 0.0f, 40.7f, 33.7f, 57.3f, 69.3f)
                curveToRelative(13.0f, 28.2f, 27.8f, 60.1f, 42.7f, 60.1f)
                curveToRelative(16.4f, 0.0f, 36.3f, -37.6f, 46.7f, -60.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 14.6f, 6.8f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
