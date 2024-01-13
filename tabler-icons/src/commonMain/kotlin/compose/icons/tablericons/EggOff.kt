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

public val TablerIcons.EggOff: ImageVector
    get() {
        if (_eggOff != null) {
            return _eggOff!!
        }
        _eggOff = Builder(name = "EggOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.927f, 17.934f)
                curveToRelative(-1.211f, 1.858f, -3.351f, 2.953f, -5.927f, 3.066f)
                curveToRelative(-4.2f, 0.0f, -7.0f, -2.763f, -7.0f, -6.917f)
                curveToRelative(0.0f, -2.568f, 0.753f, -5.14f, 1.91f, -7.158f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.642f, 4.628f)
                curveToRelative(1.034f, -1.02f, 2.196f, -1.63f, 3.358f, -1.628f)
                curveToRelative(3.5f, 0.007f, 7.0f, 5.545f, 7.0f, 11.083f)
                curveToRelative(0.0f, 0.298f, -0.015f, 0.587f, -0.045f, 0.868f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _eggOff!!
    }

private var _eggOff: ImageVector? = null
