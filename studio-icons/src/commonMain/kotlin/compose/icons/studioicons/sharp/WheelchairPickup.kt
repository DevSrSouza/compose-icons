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

public val SharpGroup.WheelchairPickup: ImageVector
    get() {
        if (_wheelchairPickup != null) {
            return _wheelchairPickup!!
        }
        _wheelchairPickup = Builder(name = "WheelchairPickup", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 4.0f)
                curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(4.5f, 5.11f, 4.5f, 4.0f)
                close()
                moveTo(10.0f, 10.95f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-0.11f)
                curveToRelative(-1.24f, -1.26f, -2.0f, -2.99f, -2.0f, -4.89f)
                curveTo(6.5f, 14.42f, 7.91f, 12.16f, 10.0f, 10.95f)
                close()
                moveTo(16.5f, 17.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.11f, 0.61f, -2.06f, 1.5f, -2.58f)
                verticalLineToRelative(-2.16f)
                curveTo(9.98f, 12.9f, 8.5f, 14.77f, 8.5f, 17.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(19.54f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(5.46f)
                lineToRelative(2.47f, 3.71f)
                lineToRelative(1.66f, -1.11f)
                lineTo(19.54f, 14.0f)
                close()
            }
        }
        .build()
        return _wheelchairPickup!!
    }

private var _wheelchairPickup: ImageVector? = null
