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

public val SharpGroup.AirplaneTicket: ImageVector
    get() {
        if (_airplaneTicket != null) {
            return _airplaneTicket!!
        }
        _airplaneTicket = Builder(name = "AirplaneTicket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                horizontalLineTo(2.01f)
                verticalLineToRelative(6.0f)
                curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(17.73f, 13.3f)
                lineToRelative(-8.86f, 2.36f)
                lineToRelative(-1.66f, -2.88f)
                lineToRelative(0.93f, -0.25f)
                lineToRelative(1.26f, 0.99f)
                lineToRelative(2.39f, -0.64f)
                lineToRelative(-2.4f, -4.16f)
                lineToRelative(1.4f, -0.38f)
                lineToRelative(4.01f, 3.74f)
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
