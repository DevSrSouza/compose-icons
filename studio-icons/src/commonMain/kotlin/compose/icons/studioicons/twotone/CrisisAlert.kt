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

public val TwotoneGroup.CrisisAlert: ImageVector
    get() {
        if (_crisisAlert != null) {
            return _crisisAlert!!
        }
        _crisisAlert = Builder(name = "CrisisAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 2.5f)
                curveToRelative(0.0f, 1.5f, -1.5f, 6.0f, -1.5f, 6.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.0f, -1.5f, -4.5f, -1.5f, -6.0f)
                curveTo(9.5f, 1.12f, 10.62f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(14.5f, 1.12f, 14.5f, 2.5f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(16.08f, 5.11f)
                curveToRelative(0.18f, -0.75f, 0.33f, -1.47f, 0.39f, -2.06f)
                curveTo(19.75f, 4.69f, 22.0f, 8.08f, 22.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f)
                curveToRelative(0.0f, -3.92f, 2.25f, -7.31f, 5.53f, -8.95f)
                curveTo(7.6f, 3.64f, 7.74f, 4.37f, 7.92f, 5.11f)
                curveTo(5.58f, 6.51f, 4.0f, 9.07f, 4.0f, 12.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                curveTo(20.0f, 9.07f, 18.42f, 6.51f, 16.08f, 5.11f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f)
                curveToRelative(0.0f, -2.0f, 0.98f, -3.77f, 2.48f, -4.86f)
                curveToRelative(0.23f, 0.81f, 0.65f, 2.07f, 0.65f, 2.07f)
                curveTo(8.43f, 9.93f, 8.0f, 10.92f, 8.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.08f, -0.43f, -2.07f, -1.13f, -2.79f)
                curveToRelative(0.0f, 0.0f, 0.41f, -1.22f, 0.65f, -2.07f)
                curveTo(17.02f, 8.23f, 18.0f, 10.0f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _crisisAlert!!
    }

private var _crisisAlert: ImageVector? = null
