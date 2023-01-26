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

public val BaselineGroup.AirlineSeatReclineNormal: ImageVector
    get() {
        if (_airlineSeatReclineNormal != null) {
            return _airlineSeatReclineNormal!!
        }
        _airlineSeatReclineNormal = Builder(name = "AirlineSeatReclineNormal", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.59f, 5.41f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0.0f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f)
                curveToRelative(-0.79f, 0.79f, -2.05f, 0.79f, -2.83f, 0.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(6.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(9.0f, 19.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                close()
                moveTo(20.0f, 20.07f)
                lineTo(14.93f, 15.0f)
                lineTo(11.5f, 15.0f)
                verticalLineToRelative(-3.68f)
                curveToRelative(1.4f, 1.15f, 3.6f, 2.16f, 5.5f, 2.16f)
                verticalLineToRelative(-2.16f)
                curveToRelative(-1.66f, 0.02f, -3.61f, -0.87f, -4.67f, -2.04f)
                lineToRelative(-1.4f, -1.55f)
                curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f)
                curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f)
                horizontalLineToRelative(-0.03f)
                curveTo(8.01f, 7.0f, 7.0f, 8.01f, 7.0f, 9.25f)
                lineTo(7.0f, 15.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.07f)
                lineToRelative(3.5f, 3.5f)
                lineTo(20.0f, 20.07f)
                close()
            }
        }
        .build()
        return _airlineSeatReclineNormal!!
    }

private var _airlineSeatReclineNormal: ImageVector? = null
