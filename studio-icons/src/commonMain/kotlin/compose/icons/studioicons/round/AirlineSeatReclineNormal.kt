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

public val RoundGroup.AirlineSeatReclineNormal: ImageVector
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
                reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0.0f)
                reflectiveCurveToRelative(0.78f, 2.05f, 0.0f, 2.83f)
                curveToRelative(-0.79f, 0.79f, -2.05f, 0.79f, -2.83f, 0.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(6.0f, 8.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(9.0f, 19.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                close()
                moveTo(19.28f, 19.35f)
                lineToRelative(-3.77f, -3.77f)
                curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f)
                horizontalLineToRelative(-2.6f)
                verticalLineToRelative(-3.68f)
                curveToRelative(1.09f, 0.89f, 2.66f, 1.7f, 4.2f, 2.02f)
                curveToRelative(0.67f, 0.14f, 1.3f, -0.36f, 1.3f, -1.04f)
                curveToRelative(0.0f, -0.53f, -0.39f, -0.96f, -0.92f, -1.05f)
                curveToRelative(-1.42f, -0.24f, -2.88f, -1.01f, -3.75f, -1.97f)
                lineToRelative(-1.4f, -1.55f)
                curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f)
                curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f)
                horizontalLineToRelative(-0.03f)
                curveTo(8.01f, 7.0f, 7.0f, 8.01f, 7.0f, 9.25f)
                lineTo(7.0f, 15.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.07f)
                lineToRelative(2.78f, 2.78f)
                curveToRelative(0.39f, 0.39f, 1.04f, 0.39f, 1.43f, 0.0f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.03f, 0.0f, -1.43f)
                close()
            }
        }
        .build()
        return _airlineSeatReclineNormal!!
    }

private var _airlineSeatReclineNormal: ImageVector? = null
