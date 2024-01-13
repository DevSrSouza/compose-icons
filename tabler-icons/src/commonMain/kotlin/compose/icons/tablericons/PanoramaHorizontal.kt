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

public val TablerIcons.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) {
            return _panoramaHorizontal!!
        }
        _panoramaHorizontal = Builder(name = "PanoramaHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.338f, 5.53f)
                curveToRelative(5.106f, 1.932f, 10.211f, 1.932f, 15.317f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.345f, 0.934f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.692f, -0.692f, 1.2f, -1.34f, 0.962f)
                curveToRelative(-5.107f, -1.932f, -10.214f, -1.932f, -15.321f, 0.0f)
                curveToRelative(-0.648f, 0.246f, -1.339f, -0.242f, -1.339f, -0.935f)
                verticalLineToRelative(-11.027f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.338f, -0.935f)
                close()
            }
        }
        .build()
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
