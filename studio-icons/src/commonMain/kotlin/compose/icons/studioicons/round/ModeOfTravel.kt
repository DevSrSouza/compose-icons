package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ModeOfTravel: ImageVector
    get() {
        if (_modeOfTravel != null) {
            return _modeOfTravel!!
        }
        _modeOfTravel = Builder(name = "ModeOfTravel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.2f)
                curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f)
                curveToRelative(4.0f, 0.0f, 7.64f, 2.92f, 7.97f, 7.5f)
                lineToRelative(2.32f, 0.0f)
                curveToRelative(0.45f, 0.0f, 0.67f, 0.54f, 0.35f, 0.85f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.31f, -0.31f, -0.09f, -0.85f, 0.35f, -0.85f)
                lineToRelative(2.26f, 0.0f)
                curveTo(17.65f, 6.24f, 15.13f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-3.35f, 0.0f, -6.0f, 2.57f, -6.0f, 6.2f)
                curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f)
                curveToRelative(0.64f, -0.59f, 1.23f, -1.16f, 1.77f, -1.71f)
                curveToRelative(-0.17f, -0.34f, -0.27f, -0.72f, -0.27f, -1.12f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(17.38f, 19.0f, 16.0f, 19.0f)
                curveToRelative(-0.24f, 0.0f, -0.47f, -0.03f, -0.69f, -0.1f)
                curveToRelative(-0.78f, 0.82f, -1.67f, 1.66f, -2.65f, 2.52f)
                curveToRelative(-0.38f, 0.33f, -0.95f, 0.33f, -1.33f, 0.0f)
                curveTo(6.45f, 17.12f, 4.0f, 13.38f, 4.0f, 10.2f)
                close()
            }
        }
        .build()
        return _modeOfTravel!!
    }

private var _modeOfTravel: ImageVector? = null
