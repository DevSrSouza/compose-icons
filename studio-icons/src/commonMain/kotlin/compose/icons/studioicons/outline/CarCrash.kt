package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.CarCrash: ImageVector
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
                moveTo(6.0f, 13.5f)
                curveTo(6.0f, 12.67f, 6.67f, 12.0f, 7.5f, 12.0f)
                reflectiveCurveTo(9.0f, 12.67f, 9.0f, 13.5f)
                reflectiveCurveTo(8.33f, 15.0f, 7.5f, 15.0f)
                reflectiveCurveTo(6.0f, 14.33f, 6.0f, 13.5f)
                close()
                moveTo(19.0f, 12.93f)
                curveToRelative(0.65f, -0.09f, 1.34f, -0.28f, 2.0f, -0.6f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                lineToRelative(2.08f, -5.99f)
                curveTo(5.29f, 4.42f, 5.84f, 4.0f, 6.5f, 4.0f)
                lineToRelative(4.79f, 0.0f)
                curveTo(11.1f, 4.63f, 11.0f, 5.31f, 11.0f, 6.0f)
                horizontalLineTo(6.85f)
                lineTo(5.81f, 9.0f)
                horizontalLineToRelative(5.86f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.36f, 0.75f, 0.84f, 1.43f, 1.43f, 2.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 12.93f)
                close()
                moveTo(17.91f, 13.0f)
                curveToRelative(-0.89f, -0.01f, -1.74f, -0.19f, -2.53f, -0.51f)
                curveTo(15.15f, 12.76f, 15.0f, 13.11f, 15.0f, 13.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveTo(18.0f, 13.32f, 17.97f, 13.16f, 17.91f, 13.0f)
                close()
            }
        }
        .build()
        return _carCrash!!
    }

private var _carCrash: ImageVector? = null
