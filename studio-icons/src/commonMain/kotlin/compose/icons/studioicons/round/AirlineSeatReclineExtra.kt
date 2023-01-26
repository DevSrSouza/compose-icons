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

public val RoundGroup.AirlineSeatReclineExtra: ImageVector
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
                moveTo(16.0f, 20.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(8.93f, 19.0f)
                curveToRelative(-1.48f, 0.0f, -2.74f, -1.08f, -2.96f, -2.54f)
                lineTo(4.16f, 7.78f)
                curveTo(4.07f, 7.33f, 3.67f, 7.0f, 3.2f, 7.0f)
                curveToRelative(-0.62f, 0.0f, -1.08f, 0.57f, -0.96f, 1.18f)
                lineToRelative(1.75f, 8.58f)
                curveTo(4.37f, 19.2f, 6.47f, 21.0f, 8.94f, 21.0f)
                lineTo(15.0f, 21.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                close()
                moveTo(15.54f, 15.0f)
                horizontalLineToRelative(-4.19f)
                lineToRelative(-1.03f, -4.1f)
                curveToRelative(1.28f, 0.72f, 2.63f, 1.28f, 4.1f, 1.3f)
                curveToRelative(0.58f, 0.01f, 1.05f, -0.49f, 1.05f, -1.07f)
                curveToRelative(0.0f, -0.59f, -0.49f, -1.04f, -1.08f, -1.06f)
                curveToRelative(-1.31f, -0.04f, -2.63f, -0.56f, -3.61f, -1.33f)
                lineTo(9.14f, 7.47f)
                curveToRelative(-0.23f, -0.18f, -0.49f, -0.3f, -0.76f, -0.38f)
                curveToRelative(-0.32f, -0.09f, -0.66f, -0.12f, -0.99f, -0.06f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.23f, 0.22f, -2.05f, 1.39f, -1.84f, 2.61f)
                lineToRelative(1.35f, 5.92f)
                curveTo(7.16f, 16.98f, 8.39f, 18.0f, 9.83f, 18.0f)
                horizontalLineToRelative(6.85f)
                lineToRelative(3.09f, 2.42f)
                curveToRelative(0.42f, 0.33f, 1.02f, 0.29f, 1.39f, -0.08f)
                curveToRelative(0.45f, -0.45f, 0.4f, -1.18f, -0.1f, -1.57f)
                lineToRelative(-4.29f, -3.35f)
                curveToRelative(-0.35f, -0.27f, -0.78f, -0.42f, -1.23f, -0.42f)
                close()
            }
        }
        .build()
        return _airlineSeatReclineExtra!!
    }

private var _airlineSeatReclineExtra: ImageVector? = null
