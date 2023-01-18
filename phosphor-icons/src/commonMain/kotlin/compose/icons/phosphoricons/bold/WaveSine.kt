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

public val BoldGroup.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.9f, 133.1f)
                curveToRelative(-23.0f, 49.5f, -43.0f, 71.6f, -64.9f, 71.6f)
                curveToRelative(-27.6f, 0.0f, -43.8f, -34.8f, -60.9f, -71.6f)
                curveToRelative(-7.2f, -15.5f, -14.6f, -31.5f, -22.2f, -42.9f)
                curveTo(88.5f, 80.6f, 82.4f, 75.3f, 78.0f, 75.3f)
                reflectiveCurveToRelative(-18.3f, 4.2f, -43.1f, 57.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -21.8f, -10.2f)
                curveToRelative(23.0f, -49.5f, 43.0f, -71.6f, 64.9f, -71.6f)
                curveToRelative(27.6f, 0.0f, 43.8f, 34.8f, 60.9f, 71.6f)
                curveToRelative(7.2f, 15.5f, 14.6f, 31.5f, 22.2f, 42.9f)
                curveToRelative(6.4f, 9.6f, 12.5f, 14.9f, 16.9f, 14.9f)
                reflectiveCurveToRelative(18.3f, -4.2f, 43.1f, -57.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 21.8f, 10.2f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
