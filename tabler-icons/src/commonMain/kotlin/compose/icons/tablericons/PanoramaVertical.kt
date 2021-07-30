package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) {
            return _panoramaVertical!!
        }
        _panoramaVertical = Builder(name = "PanoramaVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.463f, 4.338f)
                curveToRelative(-1.932f, 5.106f, -1.932f, 10.211f, 0.0f, 15.317f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.934f, 1.345f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-0.692f, 0.0f, -1.208f, -0.692f, -0.962f, -1.34f)
                curveToRelative(1.932f, -5.107f, 1.932f, -10.214f, 0.0f, -15.321f)
                curveToRelative(-0.246f, -0.648f, 0.243f, -1.339f, 0.935f, -1.339f)
                horizontalLineToRelative(11.028f)
                curveToRelative(0.693f, 0.0f, 1.18f, 0.691f, 0.935f, 1.338f)
                close()
            }
        }
        .build()
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
