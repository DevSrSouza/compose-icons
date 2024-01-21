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

public val TablerIcons.FlameOff: ImageVector
    get() {
        if (_flameOff != null) {
            return _flameOff!!
        }
        _flameOff = Builder(name = "FlameOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.973f, 8.974f)
                curveToRelative(-0.335f, 0.378f, -0.67f, 0.716f, -0.973f, 1.026f)
                curveToRelative(-1.226f, 1.26f, -2.0f, 3.24f, -2.0f, 5.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.472f, 2.466f)
                moveToRelative(0.383f, -3.597f)
                curveToRelative(-0.32f, -1.409f, -1.122f, -3.045f, -1.855f, -3.869f)
                curveToRelative(-0.281f, 0.472f, -0.543f, 0.87f, -0.79f, 1.202f)
                moveToRelative(-2.358f, -2.35f)
                curveToRelative(-0.068f, -2.157f, -1.182f, -4.184f, -1.852f, -4.852f)
                curveToRelative(0.0f, 0.968f, -0.18f, 1.801f, -0.465f, 2.527f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _flameOff!!
    }

private var _flameOff: ImageVector? = null
