package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BikeScooter: ImageVector
    get() {
        if (_bikeScooter != null) {
            return _bikeScooter!!
        }
        _bikeScooter = Builder(name = "BikeScooter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(0.74f)
                lineTo(8.47f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.87f)
                lineToRelative(1.42f, 6.25f)
                curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.0f)
                curveTo(6.12f, 12.9f, 4.47f, 14.73f, 4.09f, 17.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                curveTo(6.0f, 15.79f, 7.79f, 14.0f, 10.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.18f, 8.0f)
                lineToRelative(-1.83f, -5.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.96f)
                lineToRelative(1.1f, 3.0f)
                horizontalLineTo(10.4f)
                lineToRelative(0.46f, 2.0f)
                horizontalLineTo(15.0f)
                curveToRelative(-0.43f, 0.58f, -0.75f, 1.25f, -0.9f, 2.0f)
                horizontalLineToRelative(-2.79f)
                lineToRelative(0.46f, 2.0f)
                horizontalLineToRelative(2.33f)
                curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f)
                curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f)
                curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f)
                horizontalLineTo(18.18f)
                close()
                moveTo(19.0f, 16.0f)
                curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.93f, 0.41f, -1.73f, 1.05f, -2.28f)
                lineToRelative(0.96f, 2.64f)
                lineToRelative(1.88f, -0.68f)
                lineToRelative(-0.97f, -2.67f)
                curveToRelative(0.03f, 0.0f, 0.06f, -0.01f, 0.09f, -0.01f)
                curveToRelative(1.68f, 0.0f, 3.0f, 1.32f, 3.0f, 3.0f)
                reflectiveCurveTo(20.68f, 16.0f, 19.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveTo(11.66f, 15.0f, 10.0f, 15.0f)
                close()
                moveTo(10.0f, 19.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(10.55f, 19.0f, 10.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bikeScooter!!
    }

private var _bikeScooter: ImageVector? = null
