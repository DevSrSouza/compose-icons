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

public val BaselineGroup.DirectionsBoatFilled: ImageVector
    get() {
        if (_directionsBoatFilled != null) {
            return _directionsBoatFilled!!
        }
        _directionsBoatFilled = Builder(name = "DirectionsBoatFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 21.0f)
                curveToRelative(-1.39f, 0.0f, -2.78f, -0.47f, -4.0f, -1.32f)
                curveToRelative(-2.44f, 1.71f, -5.56f, 1.71f, -8.0f, 0.0f)
                curveTo(6.78f, 20.53f, 5.39f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.38f, 0.0f, 2.74f, -0.35f, 4.0f, -0.99f)
                curveToRelative(2.52f, 1.29f, 5.48f, 1.29f, 8.0f, 0.0f)
                curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4.0f, 0.99f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(3.95f, 19.0f)
                horizontalLineTo(4.0f)
                curveToRelative(1.6f, 0.0f, 3.02f, -0.88f, 4.0f, -2.0f)
                curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f)
                reflectiveCurveToRelative(3.02f, -0.88f, 4.0f, -2.0f)
                curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f)
                horizontalLineToRelative(0.05f)
                lineToRelative(1.9f, -6.68f)
                curveToRelative(0.11f, -0.37f, 0.04f, -1.06f, -0.66f, -1.28f)
                lineTo(20.0f, 10.62f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 4.0f, 4.0f, 4.9f, 4.0f, 6.0f)
                verticalLineToRelative(4.62f)
                lineToRelative(-1.29f, 0.42f)
                curveToRelative(-0.63f, 0.19f, -0.81f, 0.84f, -0.66f, 1.28f)
                lineTo(3.95f, 19.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.97f)
                lineTo(12.0f, 8.0f)
                lineTo(6.0f, 9.97f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _directionsBoatFilled!!
    }

private var _directionsBoatFilled: ImageVector? = null
