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

public val SimpleIcons.Decapcms: ImageVector
    get() {
        if (_decapcms != null) {
            return _decapcms!!
        }
        _decapcms = Builder(name = "Decapcms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.947f, 13.177f)
                curveToRelative(0.0f, 3.263f, -2.0f, 5.649f, -4.736f, 5.649f)
                horizontalLineToRelative(-2.773f)
                verticalLineToRelative(-5.65f)
                horizontalLineTo(6.282f)
                verticalLineToRelative(10.387f)
                horizontalLineToRelative(7.93f)
                curveToRelative(5.403f, 0.0f, 9.788f, -4.668f, 9.788f, -10.386f)
                horizontalLineToRelative(-5.052f)
                close()
                moveTo(7.894f, 0.476f)
                lineTo(0.0f, 1.212f)
                lineToRelative(0.948f, 10.352f)
                lineToRelative(5.157f, -0.456f)
                lineToRelative(-0.526f, -5.615f)
                lineToRelative(2.737f, -0.245f)
                curveToRelative(2.737f, -0.246f, 4.91f, 1.93f, 5.227f, 5.193f)
                lineToRelative(5.052f, -0.458f)
                curveToRelative(-0.49f, -5.752f, -5.297f, -9.998f, -10.7f, -9.507f)
                close()
            }
        }
        .build()
        return _decapcms!!
    }

private var _decapcms: ImageVector? = null
