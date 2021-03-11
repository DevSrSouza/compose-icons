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

public val SimpleIcons.Googlemeet: ImageVector
    get() {
        if (_googlemeet != null) {
            return _googlemeet!!
        }
        _googlemeet = Builder(name = "Googlemeet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.28f, 0.0f, 1.636f, 4.641f, 1.636f, 10.364f)
                curveToRelative(0.0f, 5.421f, 4.945f, 9.817f, 10.364f, 9.817f)
                verticalLineTo(24.0f)
                curveToRelative(6.295f, -3.194f, 10.364f, -8.333f, 10.364f, -13.636f)
                curveTo(22.364f, 4.64f, 17.72f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(7.5f, 6.272f)
                horizontalLineToRelative(6.817f)
                arcToRelative(1.363f, 1.363f, 0.0f, false, true, 1.365f, 1.365f)
                verticalLineToRelative(1.704f)
                lineToRelative(2.728f, -2.727f)
                verticalLineToRelative(7.501f)
                lineToRelative(-2.726f, -2.726f)
                verticalLineToRelative(1.703f)
                arcToRelative(1.362f, 1.362f, 0.0f, false, true, -1.365f, 1.365f)
                horizontalLineTo(7.5f)
                curveToRelative(-0.35f, 0.0f, -0.698f, -0.133f, -0.965f, -0.4f)
                arcToRelative(1.358f, 1.358f, 0.0f, false, true, -0.4f, -0.965f)
                verticalLineTo(7.637f)
                arcTo(1.362f, 1.362f, 0.0f, false, true, 7.5f, 6.272f)
                close()
            }
        }
        .build()
        return _googlemeet!!
    }

private var _googlemeet: ImageVector? = null
