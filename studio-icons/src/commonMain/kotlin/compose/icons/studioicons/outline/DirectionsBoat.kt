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

public val OutlineGroup.DirectionsBoat: ImageVector
    get() {
        if (_directionsBoat != null) {
            return _directionsBoat!!
        }
        _directionsBoat = Builder(name = "DirectionsBoat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                moveToRelative(-1.0f, 7.11f)
                lineToRelative(5.38f, 1.77f)
                lineToRelative(2.39f, 0.78f)
                lineToRelative(-1.12f, 3.97f)
                curveToRelative(-0.54f, -0.3f, -0.94f, -0.71f, -1.14f, -0.94f)
                lineTo(16.0f, 13.96f)
                lineToRelative(-1.51f, 1.72f)
                curveToRelative(-0.34f, 0.4f, -1.28f, 1.32f, -2.49f, 1.32f)
                reflectiveCurveToRelative(-2.15f, -0.92f, -2.49f, -1.32f)
                lineTo(8.0f, 13.96f)
                lineToRelative(-1.51f, 1.72f)
                curveToRelative(-0.2f, 0.23f, -0.6f, 0.63f, -1.14f, 0.93f)
                lineToRelative(-1.13f, -3.96f)
                lineToRelative(2.4f, -0.79f)
                lineTo(12.0f, 10.11f)
                moveTo(15.0f, 1.0f)
                lineTo(9.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(4.62f)
                lineToRelative(-1.29f, 0.42f)
                curveToRelative(-0.26f, 0.08f, -0.48f, 0.26f, -0.6f, 0.5f)
                reflectiveCurveToRelative(-0.15f, 0.52f, -0.06f, 0.78f)
                lineTo(3.95f, 19.0f)
                lineTo(4.0f, 19.0f)
                curveToRelative(1.6f, 0.0f, 3.02f, -0.88f, 4.0f, -2.0f)
                curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f)
                reflectiveCurveToRelative(3.02f, -0.88f, 4.0f, -2.0f)
                curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f)
                horizontalLineToRelative(0.05f)
                lineToRelative(1.89f, -6.68f)
                curveToRelative(0.08f, -0.26f, 0.06f, -0.54f, -0.06f, -0.78f)
                reflectiveCurveToRelative(-0.34f, -0.42f, -0.6f, -0.5f)
                lineTo(20.0f, 10.62f)
                lineTo(20.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(15.0f, 1.0f)
                close()
                moveTo(6.0f, 9.97f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.97f)
                lineTo(12.0f, 8.0f)
                lineTo(6.0f, 9.97f)
                close()
                moveTo(16.0f, 19.68f)
                curveToRelative(-1.22f, 0.85f, -2.61f, 1.28f, -4.0f, 1.28f)
                reflectiveCurveToRelative(-2.78f, -0.43f, -4.0f, -1.28f)
                curveTo(6.78f, 20.53f, 5.39f, 21.0f, 4.0f, 21.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.38f, 0.0f, 2.74f, -0.35f, 4.0f, -0.99f)
                curveToRelative(1.26f, 0.64f, 2.63f, 0.97f, 4.0f, 0.97f)
                reflectiveCurveToRelative(2.74f, -0.32f, 4.0f, -0.97f)
                curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4.0f, 0.99f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.39f, 0.0f, -2.78f, -0.47f, -4.0f, -1.32f)
                close()
            }
        }
        .build()
        return _directionsBoat!!
    }

private var _directionsBoat: ImageVector? = null
