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

public val BaselineGroup.AirlineSeatReclineExtra: ImageVector
    get() {
        if (_airlineSeatReclineExtra != null) {
            return _airlineSeatReclineExtra!!
        }
        _airlineSeatReclineExtra = Builder(name = "AirlineSeatReclineExtra", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.35f, 5.64f)
                curveToRelative(-0.9f, -0.64f, -1.12f, -1.88f, -0.49f, -2.79f)
                curveToRelative(0.63f, -0.9f, 1.88f, -1.12f, 2.79f, -0.49f)
                curveToRelative(0.9f, 0.64f, 1.12f, 1.88f, 0.49f, 2.79f)
                curveToRelative(-0.64f, 0.9f, -1.88f, 1.12f, -2.79f, 0.49f)
                close()
                moveTo(16.0f, 19.0f)
                lineTo(8.93f, 19.0f)
                curveToRelative(-1.48f, 0.0f, -2.74f, -1.08f, -2.96f, -2.54f)
                lineTo(4.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineToRelative(1.99f, 9.76f)
                curveTo(4.37f, 19.2f, 6.47f, 21.0f, 8.94f, 21.0f)
                lineTo(16.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.23f, 15.0f)
                horizontalLineToRelative(-4.88f)
                lineToRelative(-1.03f, -4.1f)
                curveToRelative(1.58f, 0.89f, 3.28f, 1.54f, 5.15f, 1.22f)
                lineTo(15.47f, 9.99f)
                curveToRelative(-1.63f, 0.31f, -3.44f, -0.27f, -4.69f, -1.25f)
                lineTo(9.14f, 7.47f)
                curveToRelative(-0.23f, -0.18f, -0.49f, -0.3f, -0.76f, -0.38f)
                curveToRelative(-0.32f, -0.09f, -0.66f, -0.12f, -0.99f, -0.06f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.23f, 0.22f, -2.05f, 1.39f, -1.84f, 2.61f)
                lineToRelative(1.35f, 5.92f)
                curveTo(7.16f, 16.98f, 8.39f, 18.0f, 9.83f, 18.0f)
                horizontalLineToRelative(6.85f)
                lineToRelative(3.82f, 3.0f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-5.77f, -4.5f)
                close()
            }
        }
        .build()
        return _airlineSeatReclineExtra!!
    }

private var _airlineSeatReclineExtra: ImageVector? = null
