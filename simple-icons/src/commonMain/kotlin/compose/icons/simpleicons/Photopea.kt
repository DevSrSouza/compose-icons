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

public val SimpleIcons.Photopea: ImageVector
    get() {
        if (_photopea != null) {
            return _photopea!!
        }
        _photopea = Builder(name = "Photopea", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.098f, 0.0f)
                arcTo(3.899f, 3.899f, 0.0f, false, true, 24.0f, 3.903f)
                verticalLineToRelative(16.194f)
                arcTo(3.899f, 3.899f, 0.0f, false, true, 20.098f, 24.0f)
                horizontalLineTo(6.393f)
                lineToRelative(-0.051f, -10.34f)
                verticalLineToRelative(-0.074f)
                curveToRelative(0.0f, -3.92f, 3.112f, -7.09f, 6.963f, -7.09f)
                curveToRelative(2.31f, 0.0f, 4.177f, 1.902f, 4.177f, 4.254f)
                curveToRelative(0.0f, 2.352f, -1.867f, 4.254f, -4.177f, 4.254f)
                curveToRelative(-0.77f, 0.0f, -1.393f, -0.634f, -1.393f, -1.418f)
                curveToRelative(0.0f, -0.783f, 0.623f, -1.418f, 1.393f, -1.418f)
                curveToRelative(0.769f, 0.0f, 1.392f, -0.634f, 1.392f, -1.418f)
                curveToRelative(0.0f, -0.784f, -0.623f, -1.418f, -1.392f, -1.418f)
                curveToRelative(-2.31f, 0.0f, -4.178f, 1.9f, -4.178f, 4.253f)
                curveToRelative(0.0f, 2.352f, 1.868f, 4.254f, 4.178f, 4.254f)
                curveToRelative(3.85f, 0.0f, 6.962f, -3.169f, 6.962f, -7.09f)
                curveToRelative(0.0f, -3.92f, -3.112f, -7.089f, -6.962f, -7.089f)
                curveToRelative(-5.39f, 0.0f, -9.75f, 4.436f, -9.75f, 9.925f)
                verticalLineToRelative(0.086f)
                lineToRelative(0.023f, 10.315f)
                arcTo(3.899f, 3.899f, 0.0f, false, true, 0.0f, 20.097f)
                verticalLineTo(3.903f)
                arcTo(3.899f, 3.899f, 0.0f, false, true, 3.902f, 0.0f)
                close()
            }
        }
        .build()
        return _photopea!!
    }

private var _photopea: ImageVector? = null
