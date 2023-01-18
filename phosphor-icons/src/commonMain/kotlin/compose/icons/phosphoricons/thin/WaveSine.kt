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

public val ThinGroup.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.6f, 129.7f)
                curveToRelative(-21.2f, 45.7f, -39.5f, 67.0f, -57.6f, 67.0f)
                curveToRelative(-22.5f, 0.0f, -37.6f, -32.6f, -53.6f, -67.0f)
                curveTo(110.1f, 99.0f, 95.4f, 67.3f, 78.0f, 67.3f)
                curveToRelative(-14.2f, 0.0f, -31.2f, 21.0f, -50.4f, 62.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.2f, -3.4f)
                curveToRelative(21.2f, -45.7f, 39.5f, -67.0f, 57.6f, -67.0f)
                curveToRelative(22.5f, 0.0f, 37.6f, 32.6f, 53.6f, 67.0f)
                curveToRelative(14.3f, 30.7f, 29.0f, 62.4f, 46.4f, 62.4f)
                curveToRelative(14.2f, 0.0f, 31.2f, -21.0f, 50.4f, -62.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.2f, 3.4f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
