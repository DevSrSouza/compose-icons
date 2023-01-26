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

public val RoundGroup.AirplaneTicket: ImageVector
    get() {
        if (_airplaneTicket != null) {
            return _airplaneTicket!!
        }
        _airplaneTicket = Builder(name = "AirplaneTicket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.19f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f)
                verticalLineToRelative(4.0f)
                curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.19f, 4.0f, 20.19f, 4.0f)
                close()
                moveTo(17.73f, 13.3f)
                lineToRelative(-8.49f, 2.26f)
                curveToRelative(-0.22f, 0.06f, -0.45f, -0.04f, -0.56f, -0.23f)
                lineToRelative(-1.12f, -1.95f)
                curveToRelative(-0.18f, -0.3f, -0.01f, -0.69f, 0.32f, -0.78f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.16f, -0.04f, 0.34f, -0.01f, 0.47f, 0.1f)
                lineToRelative(1.05f, 0.82f)
                lineToRelative(2.39f, -0.64f)
                lineTo(9.9f, 9.6f)
                curveToRelative(-0.26f, -0.44f, -0.02f, -1.01f, 0.47f, -1.15f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.26f, -0.07f, 0.54f, 0.0f, 0.74f, 0.18f)
                lineToRelative(3.69f, 3.44f)
                lineToRelative(2.44f, -0.65f)
                curveToRelative(0.51f, -0.14f, 1.04f, 0.17f, 1.18f, 0.68f)
                curveTo(18.55f, 12.62f, 18.25f, 13.15f, 17.73f, 13.3f)
                close()
            }
        }
        .build()
        return _airplaneTicket!!
    }

private var _airplaneTicket: ImageVector? = null
