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

public val BaselineGroup.CarCrash: ImageVector
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
                moveTo(18.5f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(18.5f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.5f)
                close()
                moveTo(17.91f, 13.0f)
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
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-6.68f)
                curveTo(19.95f, 12.83f, 18.84f, 13.01f, 17.91f, 13.0f)
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
