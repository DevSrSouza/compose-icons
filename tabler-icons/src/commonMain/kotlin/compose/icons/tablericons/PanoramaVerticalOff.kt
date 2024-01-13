package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.PanoramaVerticalOff: ImageVector
    get() {
        if (_panoramaVerticalOff != null) {
            return _panoramaVerticalOff!!
        }
        _panoramaVerticalOff = Builder(name = "PanoramaVerticalOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                horizontalLineToRelative(10.53f)
                curveToRelative(0.693f, 0.0f, 1.18f, 0.691f, 0.935f, 1.338f)
                curveToRelative(-1.098f, 2.898f, -1.573f, 5.795f, -1.425f, 8.692f)
                moveToRelative(0.828f, 4.847f)
                curveToRelative(0.172f, 0.592f, 0.37f, 1.185f, 0.595f, 1.778f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.934f, 1.345f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-0.692f, 0.0f, -1.208f, -0.692f, -0.962f, -1.34f)
                curveToRelative(1.697f, -4.486f, 1.903f, -8.973f, 0.619f, -13.46f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _panoramaVerticalOff!!
    }

private var _panoramaVerticalOff: ImageVector? = null
