package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.EggSolid: ImageVector
    get() {
        if (_eggSolid != null) {
            return _eggSolid!!
        }
        _eggSolid = Builder(name = "EggSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveToRelative(-3.0f, 0.0f, -5.7f, 2.3f, -7.7f, 5.2f)
                curveTo(6.3f, 11.1f, 5.0f, 14.7f, 5.0f, 18.0f)
                curveToRelative(0.0f, 3.5f, 1.2f, 6.3f, 3.2f, 8.2f)
                curveTo(10.3f, 28.0f, 13.0f, 29.0f, 16.0f, 29.0f)
                curveToRelative(3.0f, 0.0f, 5.7f, -0.9f, 7.8f, -2.8f)
                reflectiveCurveTo(27.0f, 21.5f, 27.0f, 18.0f)
                curveToRelative(0.0f, -3.3f, -1.3f, -6.9f, -3.3f, -9.8f)
                curveTo(21.7f, 5.3f, 19.0f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveToRelative(1.9f, 0.0f, 4.2f, 1.7f, 6.0f, 4.3f)
                curveToRelative(1.8f, 2.6f, 3.0f, 6.0f, 3.0f, 8.7f)
                curveToRelative(0.0f, 3.1f, -1.0f, 5.3f, -2.6f, 6.7f)
                curveTo(20.8f, 26.2f, 18.6f, 27.0f, 16.0f, 27.0f)
                curveToRelative(-2.6f, 0.0f, -4.8f, -0.8f, -6.4f, -2.3f)
                curveTo(8.0f, 23.2f, 7.0f, 21.0f, 7.0f, 18.0f)
                curveToRelative(0.0f, -2.8f, 1.2f, -6.1f, 3.0f, -8.7f)
                curveTo(11.8f, 6.7f, 14.1f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _eggSolid!!
    }

private var _eggSolid: ImageVector? = null
