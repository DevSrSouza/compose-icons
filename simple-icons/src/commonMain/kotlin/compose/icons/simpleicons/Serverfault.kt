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

public val SimpleIcons.Serverfault: ImageVector
    get() {
        if (_serverfault != null) {
            return _serverfault!!
        }
        _serverfault = Builder(name = "Serverfault", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.185f)
                verticalLineToRelative(2.274f)
                horizontalLineToRelative(-4.89f)
                verticalLineToRelative(-2.274f)
                lineTo(24.0f, 18.185f)
                close()
                moveTo(0.0f, 18.079f)
                horizontalLineToRelative(11.505f)
                verticalLineToRelative(2.274f)
                lineTo(0.0f, 20.353f)
                close()
                moveTo(12.89f, 18.079f)
                horizontalLineToRelative(4.89f)
                verticalLineToRelative(2.274f)
                horizontalLineToRelative(-4.89f)
                close()
                moveTo(19.111f, 14.472f)
                lineTo(24.0f, 14.472f)
                verticalLineToRelative(2.274f)
                horizontalLineToRelative(-4.89f)
                lineToRelative(0.001f, -2.274f)
                close()
                moveTo(0.0f, 14.367f)
                horizontalLineToRelative(11.505f)
                verticalLineToRelative(2.274f)
                lineTo(0.0f, 16.641f)
                verticalLineToRelative(-2.274f)
                close()
                moveTo(12.89f, 14.367f)
                horizontalLineToRelative(4.89f)
                verticalLineToRelative(2.274f)
                horizontalLineToRelative(-4.89f)
                verticalLineToRelative(-2.274f)
                close()
                moveTo(19.111f, 11.021f)
                lineTo(24.0f, 11.021f)
                verticalLineToRelative(2.273f)
                horizontalLineToRelative(-4.89f)
                lineToRelative(0.001f, -2.273f)
                close()
                moveTo(0.0f, 10.916f)
                horizontalLineToRelative(11.505f)
                verticalLineToRelative(2.271f)
                lineTo(0.0f, 13.187f)
                verticalLineToRelative(-2.271f)
                close()
                moveTo(12.89f, 10.916f)
                horizontalLineToRelative(4.89f)
                verticalLineToRelative(2.271f)
                horizontalLineToRelative(-4.89f)
                verticalLineToRelative(-2.271f)
                close()
                moveTo(19.11f, 7.307f)
                lineTo(24.0f, 7.307f)
                verticalLineToRelative(2.279f)
                horizontalLineToRelative(-4.89f)
                lineTo(19.11f, 7.307f)
                close()
                moveTo(0.0f, 7.206f)
                horizontalLineToRelative(11.505f)
                lineTo(11.505f, 9.48f)
                lineTo(0.0f, 9.48f)
                lineTo(0.0f, 7.201f)
                close()
                moveTo(12.89f, 7.206f)
                horizontalLineToRelative(4.89f)
                lineTo(17.78f, 9.48f)
                horizontalLineToRelative(-4.89f)
                lineTo(12.89f, 7.201f)
                close()
                moveTo(19.111f, 3.65f)
                lineTo(24.0f, 3.65f)
                verticalLineToRelative(2.276f)
                horizontalLineToRelative(-4.89f)
                verticalLineToRelative(-2.28f)
                lineToRelative(0.001f, 0.004f)
                close()
                moveTo(0.0f, 3.541f)
                horizontalLineToRelative(11.505f)
                verticalLineToRelative(2.274f)
                lineTo(0.0f, 5.815f)
                lineTo(0.0f, 3.541f)
                close()
                moveTo(12.89f, 3.541f)
                horizontalLineToRelative(4.89f)
                verticalLineToRelative(2.274f)
                horizontalLineToRelative(-4.89f)
                lineTo(12.89f, 3.541f)
                close()
            }
        }
        .build()
        return _serverfault!!
    }

private var _serverfault: ImageVector? = null
