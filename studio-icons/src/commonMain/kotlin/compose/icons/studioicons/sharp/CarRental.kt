package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.CarRental: ImageVector
    get() {
        if (_carRental != null) {
            return _carRental!!
        }
        _carRental = Builder(name = "CarRental", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.11f, 9.0f)
                horizontalLineTo(6.89f)
                lineTo(5.0f, 14.69f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.31f)
                lineTo(17.11f, 9.0f)
                close()
                moveTo(9.0f, 17.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(9.55f, 17.5f, 9.0f, 17.5f)
                close()
                moveTo(15.0f, 17.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(15.55f, 17.5f, 15.0f, 17.5f)
                close()
                moveTo(7.67f, 13.0f)
                lineToRelative(0.66f, -2.0f)
                horizontalLineToRelative(7.34f)
                lineToRelative(0.66f, 2.0f)
                horizontalLineTo(7.67f)
                close()
            }
        }
        .build()
        return _carRental!!
    }

private var _carRental: ImageVector? = null
