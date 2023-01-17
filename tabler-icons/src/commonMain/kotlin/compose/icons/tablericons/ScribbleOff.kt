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

public val TablerIcons.ScribbleOff: ImageVector
    get() {
        if (_scribbleOff != null) {
            return _scribbleOff!!
        }
        _scribbleOff = Builder(name = "ScribbleOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 15.0f)
                curveToRelative(2.0f, 3.0f, 4.0f, 4.0f, 7.0f, 4.0f)
                curveToRelative(1.95f, 0.0f, 4.324f, -1.268f, 5.746f, -3.256f)
                moveToRelative(1.181f, -2.812f)
                arcToRelative(5.97f, 5.97f, 0.0f, false, false, 0.073f, -0.932f)
                curveToRelative(0.0f, -4.0f, -3.0f, -7.0f, -6.0f, -7.0f)
                curveToRelative(-0.642f, 0.0f, -1.239f, 0.069f, -1.78f, 0.201f)
                moveToRelative(-2.492f, 1.515f)
                curveToRelative(-0.47f, 0.617f, -0.728f, 1.386f, -0.728f, 2.284f)
                curveToRelative(0.0f, 2.5f, 2.0f, 5.0f, 6.0f, 5.0f)
                curveToRelative(0.597f, 0.0f, 1.203f, -0.055f, 1.808f, -0.156f)
                moveToRelative(3.102f, -0.921f)
                curveToRelative(2.235f, -0.953f, 4.152f, -2.423f, 5.09f, -3.923f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _scribbleOff!!
    }

private var _scribbleOff: ImageVector? = null
