package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(23.035f, 9.601f)
                horizontalLineToRelative(-7.677f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, -0.962f, -0.962f)
                lineTo(14.396f, 0.962f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, false, -0.962f, -0.956f)
                lineTo(10.56f, 0.006f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, false, -0.962f, 0.956f)
                lineTo(9.598f, 8.64f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, -0.962f, 0.962f)
                lineTo(5.762f, 9.602f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, -0.961f, -0.962f)
                lineTo(4.801f, 0.962f)
                arcTo(0.956f, 0.956f, 0.0f, false, false, 3.839f, 0.0f)
                lineTo(0.959f, 0.0f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, false, -0.956f, 0.962f)
                verticalLineToRelative(22.076f)
                arcTo(0.956f, 0.956f, 0.0f, false, false, 0.965f, 24.0f)
                horizontalLineToRelative(22.07f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, false, 0.962f, -0.962f)
                lineTo(23.997f, 10.58f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, false, -0.962f, -0.98f)
                close()
                moveTo(19.175f, 17.753f)
                arcToRelative(1.437f, 1.437f, 0.0f, false, true, -1.437f, 1.443f)
                horizontalLineToRelative(-1.924f)
                arcToRelative(1.437f, 1.437f, 0.0f, false, true, -1.436f, -1.443f)
                verticalLineToRelative(-1.917f)
                arcToRelative(1.437f, 1.437f, 0.0f, false, true, 1.436f, -1.443f)
                horizontalLineToRelative(1.924f)
                arcToRelative(1.437f, 1.437f, 0.0f, false, true, 1.437f, 1.443f)
                close()
            }
        }
        .build()
        return _rabbitmq!!
    }

private var _rabbitmq: ImageVector? = null
