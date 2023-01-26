package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.CarRental: ImageVector
    get() {
        if (_carRental != null) {
            return _carRental!!
        }
        _carRental = Builder(name = "CarRental", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.39f, 9.0f)
                horizontalLineTo(7.61f)
                curveTo(7.18f, 9.0f, 6.8f, 9.28f, 6.66f, 9.68f)
                lineToRelative(-1.66f, 5.0f)
                verticalLineToRelative(6.81f)
                curveTo(5.0f, 21.78f, 5.23f, 22.0f, 5.5f, 22.0f)
                horizontalLineToRelative(1.0f)
                curveTo(6.78f, 22.0f, 7.0f, 21.78f, 7.0f, 21.5f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.81f)
                lineToRelative(-1.66f, -5.0f)
                curveTo(17.2f, 9.28f, 16.82f, 9.0f, 16.39f, 9.0f)
                close()
                moveTo(7.78f, 18.0f)
                curveToRelative(-0.68f, 0.0f, -1.22f, -0.54f, -1.22f, -1.22f)
                reflectiveCurveToRelative(0.54f, -1.22f, 1.22f, -1.22f)
                reflectiveCurveTo(9.0f, 16.11f, 9.0f, 16.78f)
                reflectiveCurveTo(8.46f, 18.0f, 7.78f, 18.0f)
                close()
                moveTo(16.22f, 18.0f)
                curveTo(15.55f, 18.0f, 15.0f, 17.46f, 15.0f, 16.78f)
                reflectiveCurveToRelative(0.54f, -1.22f, 1.22f, -1.22f)
                reflectiveCurveToRelative(1.22f, 0.54f, 1.22f, 1.22f)
                reflectiveCurveTo(16.9f, 18.0f, 16.22f, 18.0f)
                close()
                moveTo(6.29f, 14.0f)
                lineToRelative(1.33f, -4.0f)
                horizontalLineToRelative(8.78f)
                lineToRelative(1.33f, 4.0f)
                horizontalLineTo(6.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.83f, 3.0f)
                curveTo(10.41f, 1.83f, 9.3f, 1.0f, 8.0f, 1.0f)
                curveTo(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f)
                curveToRelative(0.0f, 1.65f, 1.34f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.83f, -2.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.83f)
                close()
                moveTo(8.0f, 5.0f)
                curveTo(7.45f, 5.0f, 7.0f, 4.55f, 7.0f, 4.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(8.55f, 5.0f, 8.0f, 5.0f)
                close()
            }
        }
        .build()
        return _carRental!!
    }

private var _carRental: ImageVector? = null
