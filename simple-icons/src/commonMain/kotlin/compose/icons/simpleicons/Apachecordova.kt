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

public val SimpleIcons.Apachecordova: ImageVector
    get() {
        if (_apachecordova != null) {
            return _apachecordova!!
        }
        _apachecordova = Builder(name = "Apachecordova", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.545f, 0.545f)
                horizontalLineTo(5.455f)
                lineTo(0.0f, 9.273f)
                lineToRelative(2.182f, 14.182f)
                horizontalLineToRelative(3.886f)
                lineToRelative(-0.273f, -3.273f)
                horizontalLineToRelative(1.909f)
                lineToRelative(0.273f, 3.273f)
                horizontalLineToRelative(8.045f)
                lineToRelative(0.273f, -3.273f)
                horizontalLineToRelative(1.909f)
                lineToRelative(-0.273f, 3.273f)
                horizontalLineToRelative(3.886f)
                lineTo(24.0f, 9.273f)
                lineTo(18.545f, 0.545f)
                close()
                moveTo(18.545f, 18.0f)
                horizontalLineTo(5.455f)
                lineTo(4.364f, 9.273f)
                lineToRelative(2.182f, -4.364f)
                horizontalLineToRelative(3.506f)
                lineTo(9.818f, 6.545f)
                horizontalLineToRelative(4.364f)
                lineToRelative(-0.234f, -1.636f)
                horizontalLineToRelative(3.506f)
                lineToRelative(2.182f, 4.364f)
                lineTo(18.545f, 18.0f)
                close()
                moveTo(15.545f, 11.045f)
                curveToRelative(0.301f, 0.0f, 0.545f, 0.908f, 0.545f, 2.029f)
                curveToRelative(0.0f, 1.121f, -0.244f, 2.029f, -0.545f, 2.029f)
                curveToRelative(-0.301f, 0.0f, -0.545f, -0.908f, -0.545f, -2.029f)
                curveTo(15.0f, 11.954f, 15.244f, 11.045f, 15.545f, 11.045f)
                close()
                moveTo(8.659f, 11.215f)
                curveToRelative(0.301f, 0.0f, 0.545f, 0.908f, 0.545f, 2.029f)
                curveToRelative(0.0f, 1.121f, -0.244f, 2.029f, -0.545f, 2.029f)
                curveToRelative(-0.301f, 0.0f, -0.545f, -0.908f, -0.545f, -2.029f)
                curveTo(8.114f, 12.123f, 8.358f, 11.215f, 8.659f, 11.215f)
                close()
            }
        }
        .build()
        return _apachecordova!!
    }

private var _apachecordova: ImageVector? = null
