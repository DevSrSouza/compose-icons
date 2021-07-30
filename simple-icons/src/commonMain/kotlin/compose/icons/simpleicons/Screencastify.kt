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

public val SimpleIcons.Screencastify: ImageVector
    get() {
        if (_screencastify != null) {
            return _screencastify!!
        }
        _screencastify = Builder(name = "Screencastify", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.898f, 2.347f)
                curveToRelative(-0.472f, 0.008f, -0.914f, 0.38f, -0.914f, 0.891f)
                verticalLineToRelative(4.278f)
                horizontalLineTo(1.1f)
                curveToRelative(-0.541f, 0.0f, -1.1f, 0.437f, -1.1f, 0.978f)
                verticalLineToRelative(7.02f)
                curveToRelative(0.0f, 0.54f, 0.559f, 0.907f, 1.1f, 0.907f)
                horizontalLineToRelative(5.884f)
                verticalLineTo(7.533f)
                horizontalLineToRelative(6.408f)
                curveToRelative(0.542f, 0.0f, 0.926f, 0.437f, 0.926f, 0.979f)
                verticalLineToRelative(1.623f)
                lineToRelative(3.667f, -2.095f)
                verticalLineToRelative(7.927f)
                lineToRelative(-3.667f, -2.095f)
                verticalLineToRelative(1.676f)
                curveToRelative(0.0f, 0.541f, -0.384f, 0.908f, -0.926f, 0.908f)
                horizontalLineTo(6.984f)
                verticalLineToRelative(4.313f)
                curveToRelative(0.0f, 0.68f, 0.786f, 1.1f, 1.38f, 0.768f)
                lineToRelative(9.638f, -5.535f)
                lineToRelative(5.553f, -3.195f)
                curveToRelative(0.593f, -0.402f, 0.593f, -1.257f, 0.0f, -1.59f)
                lineToRelative(-5.553f, -3.194f)
                lineTo(8.364f, 2.47f)
                arcToRelative(0.886f, 0.886f, 0.0f, false, false, -0.466f, -0.123f)
                close()
            }
        }
        .build()
        return _screencastify!!
    }

private var _screencastify: ImageVector? = null
