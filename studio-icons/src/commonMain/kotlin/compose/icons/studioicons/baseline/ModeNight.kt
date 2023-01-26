package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.ModeNight: ImageVector
    get() {
        if (_modeNight != null) {
            return _modeNight!!
        }
        _modeNight = Builder(name = "ModeNight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.0f)
                curveToRelative(-1.82f, 0.0f, -3.53f, 0.5f, -5.0f, 1.35f)
                curveToRelative(2.99f, 1.73f, 5.0f, 4.95f, 5.0f, 8.65f)
                reflectiveCurveToRelative(-2.01f, 6.92f, -5.0f, 8.65f)
                curveTo(5.97f, 21.5f, 7.68f, 22.0f, 9.5f, 22.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(15.02f, 2.0f, 9.5f, 2.0f)
                close()
            }
        }
        .build()
        return _modeNight!!
    }

private var _modeNight: ImageVector? = null
