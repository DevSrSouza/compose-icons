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

public val TablerIcons.PanoramaHorizontalOff: ImageVector
    get() {
        if (_panoramaHorizontalOff != null) {
            return _panoramaHorizontalOff!!
        }
        _panoramaHorizontalOff = Builder(name = "PanoramaHorizontalOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.95f, 6.952f)
                curveToRelative(2.901f, 0.15f, 5.803f, -0.323f, 8.705f, -1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.345f, 0.934f)
                verticalLineToRelative(10.534f)
                moveToRelative(-3.212f, 0.806f)
                curveToRelative(-4.483f, -1.281f, -8.966f, -1.074f, -13.449f, 0.622f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -1.339f, -0.935f)
                verticalLineToRelative(-11.027f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.338f, -0.935f)
                curveToRelative(0.588f, 0.221f, 1.176f, 0.418f, 1.764f, 0.59f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _panoramaHorizontalOff!!
    }

private var _panoramaHorizontalOff: ImageVector? = null
