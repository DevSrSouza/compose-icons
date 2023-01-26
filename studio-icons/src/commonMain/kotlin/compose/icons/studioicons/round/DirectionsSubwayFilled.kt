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

public val RoundGroup.DirectionsSubwayFilled: ImageVector
    get() {
        if (_directionsSubwayFilled != null) {
            return _directionsSubwayFilled!!
        }
        _directionsSubwayFilled = Builder(name = "DirectionsSubwayFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.0f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f)
                verticalLineToRelative(9.5f)
                curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f)
                lineToRelative(-1.21f, 0.81f)
                curveTo(6.11f, 19.93f, 6.0f, 20.13f, 6.0f, 20.35f)
                verticalLineToRelative(0.0f)
                curveTo(6.0f, 20.71f, 6.29f, 21.0f, 6.65f, 21.0f)
                horizontalLineToRelative(10.7f)
                curveToRelative(0.36f, 0.0f, 0.65f, -0.29f, 0.65f, -0.65f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.22f, -0.11f, -0.42f, -0.29f, -0.54f)
                lineTo(16.5f, 19.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 2.5f, 16.42f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.5f, 16.0f)
                curveTo(7.67f, 16.0f, 7.0f, 15.33f, 7.0f, 14.5f)
                reflectiveCurveTo(7.67f, 13.0f, 8.5f, 13.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.33f, 16.0f, 8.5f, 16.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(15.5f, 16.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(16.33f, 16.0f, 15.5f, 16.0f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _directionsSubwayFilled!!
    }

private var _directionsSubwayFilled: ImageVector? = null
