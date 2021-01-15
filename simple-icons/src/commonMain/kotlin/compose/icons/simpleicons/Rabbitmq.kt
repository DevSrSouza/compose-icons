package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Rabbitmq: ImageVector
    get() {
        if (_rabbitmq != null) {
            return _rabbitmq!!
        }
        _rabbitmq = Builder(name = "Rabbitmq", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.2f, 9.739f)
                horizontalLineToRelative(-7.09f)
                curveToRelative(-0.567f, -0.068f, -0.999f, -0.567f, -0.999f, -1.155f)
                verticalLineToRelative(-7.44f)
                curveTo(14.112f, 0.51f, 13.597f, 0.0f, 12.968f, 0.0f)
                horizontalLineToRelative(-2.481f)
                curveTo(9.852f, 0.0f, 9.342f, 0.515f, 9.342f, 1.145f)
                verticalLineToRelative(7.518f)
                curveTo(9.311f, 9.23f, 8.843f, 9.687f, 8.281f, 9.739f)
                horizontalLineTo(6.424f)
                curveTo(5.878f, 9.672f, 5.456f, 9.214f, 5.42f, 8.662f)
                verticalLineTo(1.145f)
                curveTo(5.42f, 0.51f, 4.905f, 0.0f, 4.276f, 0.0f)
                horizontalLineTo(1.794f)
                curveTo(1.16f, 0.0f, 0.65f, 0.515f, 0.65f, 1.145f)
                verticalLineToRelative(9.739f)
                verticalLineToRelative(11.971f)
                curveTo(0.65f, 23.49f, 1.165f, 24.0f, 1.794f, 24.0f)
                horizontalLineToRelative(2.481f)
                horizontalLineToRelative(6.211f)
                horizontalLineToRelative(2.481f)
                horizontalLineToRelative(9.238f)
                curveToRelative(0.635f, 0.0f, 1.144f, -0.515f, 1.144f, -1.145f)
                verticalLineTo(10.884f)
                curveTo(23.345f, 10.249f, 22.835f, 9.739f, 22.2f, 9.739f)
                close()
                moveTo(18.934f, 17.949f)
                curveToRelative(0.0f, 0.635f, -0.515f, 1.145f, -1.144f, 1.145f)
                horizontalLineToRelative(-2.481f)
                curveToRelative(-0.635f, 0.0f, -1.144f, -0.515f, -1.144f, -1.145f)
                verticalLineToRelative(-2.341f)
                curveToRelative(0.0f, -0.635f, 0.515f, -1.145f, 1.144f, -1.145f)
                horizontalLineToRelative(2.481f)
                curveToRelative(0.635f, 0.0f, 1.144f, 0.515f, 1.144f, 1.145f)
                verticalLineTo(17.949f)
                close()
            }
        }
        .build()
        return _rabbitmq!!
    }

private var _rabbitmq: ImageVector? = null
