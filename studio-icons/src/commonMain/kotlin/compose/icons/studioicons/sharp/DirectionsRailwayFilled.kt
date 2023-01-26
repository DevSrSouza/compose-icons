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

public val SharpGroup.DirectionsRailwayFilled: ImageVector
    get() {
        if (_directionsRailwayFilled != null) {
            return _directionsRailwayFilled!!
        }
        _directionsRailwayFilled = Builder(name = "DirectionsRailwayFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.0f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f)
                verticalLineToRelative(9.5f)
                curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-1.5f, -1.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 2.5f, 16.42f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(11.17f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(12.83f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _directionsRailwayFilled!!
    }

private var _directionsRailwayFilled: ImageVector? = null