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

public val SimpleIcons.Nintendonetwork: ImageVector
    get() {
        if (_nintendonetwork != null) {
            return _nintendonetwork!!
        }
        _nintendonetwork = Builder(name = "Nintendonetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.965f, 8.686f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, true, -0.519f, -0.266f)
                curveToRelative(-2.111f, -2.893f, -5.555f, -4.624f, -9.215f, -4.624f)
                arcToRelative(11.474f, 11.474f, 0.0f, false, false, -4.689f, 0.986f)
                arcToRelative(0.641f, 0.641f, 0.0f, false, true, -0.849f, -0.338f)
                arcToRelative(0.656f, 0.656f, 0.0f, false, true, 0.333f, -0.859f)
                arcToRelative(12.78f, 12.78f, 0.0f, false, true, 5.206f, -1.095f)
                curveToRelative(4.067f, 0.0f, 7.9f, 1.926f, 10.253f, 5.154f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, -0.137f, 0.913f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, -0.381f, 0.128f)
                moveTo(0.902f, 8.979f)
                curveToRelative(0.0f, -0.492f, 0.411f, -0.889f, 0.918f, -0.889f)
                horizontalLineToRelative(2.331f)
                curveToRelative(0.21f, 0.0f, 0.364f, -0.096f, 0.557f, -0.229f)
                arcToRelative(9.223f, 9.223f, 0.0f, false, true, 5.268f, -1.634f)
                curveToRelative(5.01f, 0.0f, 9.073f, 3.941f, 9.073f, 8.802f)
                verticalLineToRelative(8.077f)
                arcToRelative(0.908f, 0.908f, 0.0f, false, true, -0.922f, 0.894f)
                horizontalLineToRelative(-2.955f)
                arcToRelative(0.909f, 0.909f, 0.0f, false, true, -0.924f, -0.894f)
                verticalLineToRelative(-8.077f)
                curveToRelative(0.0f, -2.289f, -1.912f, -4.146f, -4.274f, -4.146f)
                curveToRelative(-2.36f, 0.0f, -4.272f, 1.855f, -4.272f, 4.146f)
                verticalLineToRelative(8.077f)
                arcTo(0.909f, 0.909f, 0.0f, false, true, 4.779f, 24.0f)
                horizontalLineTo(1.824f)
                arcToRelative(0.908f, 0.908f, 0.0f, false, true, -0.922f, -0.894f)
                verticalLineTo(8.98f)
                moveTo(4.302f, 2.592f)
                arcToRelative(14.548f, 14.548f, 0.0f, false, true, 5.98f, -1.274f)
                curveToRelative(4.822f, 0.0f, 9.075f, 2.329f, 11.649f, 5.879f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 0.904f, 0.141f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, false, 0.137f, -0.923f)
                curveTo(20.155f, 2.528f, 15.516f, 0.0f, 10.281f, 0.0f)
                arcToRelative(15.791f, 15.791f, 0.0f, false, false, -6.502f, 1.387f)
                arcToRelative(0.663f, 0.663f, 0.0f, false, false, -0.33f, 0.869f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 0.852f, 0.336f)
                close()
            }
        }
        .build()
        return _nintendonetwork!!
    }

private var _nintendonetwork: ImageVector? = null
