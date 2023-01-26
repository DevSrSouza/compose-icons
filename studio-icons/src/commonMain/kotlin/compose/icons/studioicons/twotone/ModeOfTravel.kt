package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ModeOfTravel: ImageVector
    get() {
        if (_modeOfTravel != null) {
            return _modeOfTravel!!
        }
        _modeOfTravel = Builder(name = "ModeOfTravel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.31f, 18.9f)
                curveToRelative(-0.96f, 1.0f, -2.06f, 2.03f, -3.31f, 3.1f)
                curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f)
                curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f)
                curveToRelative(4.0f, 0.0f, 7.64f, 2.92f, 7.97f, 7.5f)
                lineToRelative(3.53f, 0.0f)
                lineTo(19.0f, 14.0f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(3.47f, 0.0f)
                curveTo(17.65f, 6.24f, 15.13f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-3.35f, 0.0f, -6.0f, 2.57f, -6.0f, 6.2f)
                curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f)
                curveToRelative(0.64f, -0.59f, 1.23f, -1.16f, 1.77f, -1.71f)
                curveToRelative(-0.17f, -0.34f, -0.27f, -0.72f, -0.27f, -1.12f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveTo(17.38f, 19.0f, 16.0f, 19.0f)
                curveTo(15.76f, 19.0f, 15.53f, 18.97f, 15.31f, 18.9f)
                close()
            }
        }
        .build()
        return _modeOfTravel!!
    }

private var _modeOfTravel: ImageVector? = null
