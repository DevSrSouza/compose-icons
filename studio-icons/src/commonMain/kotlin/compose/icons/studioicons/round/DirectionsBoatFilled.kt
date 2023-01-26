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

public val RoundGroup.DirectionsBoatFilled: ImageVector
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
                curveToRelative(-1.19f, 0.0f, -2.38f, -0.35f, -3.47f, -0.98f)
                curveToRelative(-0.33f, -0.19f, -0.73f, -0.19f, -1.07f, 0.0f)
                curveToRelative(-2.17f, 1.26f, -4.76f, 1.26f, -6.93f, 0.0f)
                curveToRelative(-0.33f, -0.19f, -0.73f, -0.19f, -1.07f, 0.0f)
                curveTo(6.38f, 20.65f, 5.19f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.38f, 0.0f, 2.74f, -0.35f, 4.0f, -0.99f)
                curveToRelative(2.52f, 1.29f, 5.48f, 1.29f, 8.0f, 0.0f)
                curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4.0f, 0.99f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(3.95f, 19.0f)
                horizontalLineTo(4.0f)
                curveToRelative(1.27f, 0.0f, 2.42f, -0.55f, 3.33f, -1.33f)
                curveToRelative(0.39f, -0.34f, 0.95f, -0.34f, 1.34f, 0.0f)
                curveTo(9.58f, 18.45f, 10.73f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveToRelative(2.42f, -0.55f, 3.33f, -1.33f)
                curveToRelative(0.39f, -0.34f, 0.95f, -0.34f, 1.34f, 0.0f)
                curveTo(17.58f, 18.45f, 18.73f, 19.0f, 20.0f, 19.0f)
                horizontalLineToRelative(0.05f)
                lineToRelative(1.9f, -6.68f)
                curveToRelative(0.11f, -0.37f, 0.04f, -1.06f, -0.66f, -1.28f)
                lineTo(20.0f, 10.62f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(9.45f, 1.0f, 9.0f, 1.45f, 9.0f, 2.0f)
                verticalLineToRelative(2.0f)
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
                lineTo(12.62f, 8.2f)
                curveToRelative(-0.41f, -0.13f, -0.84f, -0.13f, -1.25f, 0.0f)
                lineTo(6.0f, 9.97f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _directionsBoatFilled!!
    }

private var _directionsBoatFilled: ImageVector? = null
