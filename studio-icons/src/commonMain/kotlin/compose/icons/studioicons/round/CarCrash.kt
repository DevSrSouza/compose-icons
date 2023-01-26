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

public val RoundGroup.CarCrash: ImageVector
    get() {
        if (_carCrash != null) {
            return _carCrash!!
        }
        _carCrash = Builder(name = "CarCrash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f)
                close()
                moveTo(18.0f, 7.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                curveTo(17.5f, 3.22f, 17.72f, 3.0f, 18.0f, 3.0f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                curveTo(18.5f, 6.78f, 18.28f, 7.0f, 18.0f, 7.0f)
                close()
                moveTo(18.5f, 8.5f)
                curveTo(18.5f, 8.78f, 18.28f, 9.0f, 18.0f, 9.0f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveTo(17.72f, 8.0f, 18.0f, 8.0f)
                reflectiveCurveTo(18.5f, 8.22f, 18.5f, 8.5f)
                close()
                moveTo(19.5f, 20.0f)
                curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.18f)
                curveToRelative(-1.05f, 0.51f, -2.16f, 0.69f, -3.09f, 0.68f)
                curveToRelative(0.06f, 0.16f, 0.09f, 0.33f, 0.09f, 0.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(15.0f, 14.33f, 15.0f, 13.5f)
                curveToRelative(0.0f, -0.39f, 0.15f, -0.74f, 0.39f, -1.01f)
                curveToRelative(-1.63f, -0.66f, -2.96f, -1.91f, -3.71f, -3.49f)
                horizontalLineTo(5.81f)
                lineToRelative(1.04f, -3.0f)
                horizontalLineTo(11.0f)
                curveToRelative(0.0f, -0.69f, 0.1f, -1.37f, 0.29f, -2.0f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 4.0f, 5.29f, 4.42f, 5.08f, 5.01f)
                lineToRelative(-1.97f, 5.67f)
                curveTo(3.04f, 10.89f, 3.0f, 11.11f, 3.0f, 11.34f)
                verticalLineToRelative(7.16f)
                curveTo(3.0f, 19.33f, 3.67f, 20.0f, 4.5f, 20.0f)
                reflectiveCurveTo(6.0f, 19.33f, 6.0f, 18.5f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(0.5f)
                curveTo(18.0f, 19.33f, 18.68f, 20.0f, 19.5f, 20.0f)
                close()
                moveTo(7.5f, 15.0f)
                curveTo(6.67f, 15.0f, 6.0f, 14.33f, 6.0f, 13.5f)
                reflectiveCurveTo(6.67f, 12.0f, 7.5f, 12.0f)
                reflectiveCurveTo(9.0f, 12.67f, 9.0f, 13.5f)
                reflectiveCurveTo(8.33f, 15.0f, 7.5f, 15.0f)
                close()
            }
        }
        .build()
        return _carCrash!!
    }

private var _carCrash: ImageVector? = null
