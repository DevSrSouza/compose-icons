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

public val SimpleIcons.Coda: ImageVector
    get() {
        if (_coda != null) {
            return _coda!!
        }
        _coda = Builder(name = "Coda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.194f, 0.0f)
                horizontalLineTo(2.806f)
                arcTo(2.01f, 2.01f, 0.0f, false, false, 0.8f, 2.0f)
                verticalLineToRelative(20.0f)
                curveToRelative(0.0f, 1.1f, 0.903f, 2.0f, 2.006f, 2.0f)
                horizontalLineToRelative(18.388f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, 2.006f, -2.0f)
                verticalLineToRelative(-0.933f)
                curveToRelative(-0.033f, -1.2f, -0.067f, -3.7f, -0.067f, -4.834f)
                curveToRelative(0.0f, -0.633f, -0.468f, -1.166f, -1.07f, -1.166f)
                curveToRelative(-0.668f, 0.0f, -1.103f, 0.4f, -1.437f, 0.733f)
                curveToRelative(-1.003f, 0.9f, -2.508f, 1.067f, -3.812f, 0.833f)
                curveToRelative(-0.601f, -0.133f, -1.17f, -0.3f, -1.638f, -0.6f)
                curveToRelative(-1.438f, -0.833f, -2.374f, -2.4f, -2.374f, -4.066f)
                curveToRelative(0.0f, -1.667f, 0.936f, -3.2f, 2.374f, -4.067f)
                curveToRelative(0.502f, -0.3f, 1.07f, -0.467f, 1.638f, -0.6f)
                curveToRelative(1.27f, -0.233f, 2.809f, -0.067f, 3.812f, 0.833f)
                curveToRelative(0.367f, 0.334f, 0.802f, 0.734f, 1.437f, 0.734f)
                curveToRelative(0.602f, 0.0f, 1.07f, -0.534f, 1.07f, -1.167f)
                curveToRelative(0.0f, -1.1f, 0.034f, -3.633f, 0.067f, -4.833f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -1.1f, -0.903f, -2.0f, -2.006f, -2.0f)
                close()
            }
        }
        .build()
        return _coda!!
    }

private var _coda: ImageVector? = null
