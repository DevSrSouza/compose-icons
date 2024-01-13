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

public val SimpleIcons.Revoltdotchat: ImageVector
    get() {
        if (_revoltdotchat != null) {
            return _revoltdotchat!!
        }
        _revoltdotchat = Builder(name = "Revoltdotchat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.005f, 7.796f)
                curveToRelative(0.0f, 1.88f, -1.023f, 3.009f, -3.207f, 3.009f)
                horizontalLineToRelative(-3.615f)
                verticalLineToRelative(-5.95f)
                horizontalLineTo(13.8f)
                curveToRelative(2.183f, 0.0f, 3.206f, 1.162f, 3.206f, 2.94f)
                close()
                moveTo(0.853f, 0.0f)
                lineToRelative(3.5f, 4.866f)
                verticalLineToRelative(19.133f)
                horizontalLineToRelative(5.832f)
                verticalLineToRelative(-9.06f)
                horizontalLineToRelative(1.398f)
                lineTo(16.563f, 24.0f)
                horizontalLineToRelative(6.583f)
                lineToRelative(-5.525f, -9.504f)
                arcToRelative(6.966f, 6.966f, 0.0f, false, false, 3.879f, -2.532f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 1.44f, -4.408f)
                curveTo(22.94f, 3.384f, 20.009f, 0.0f, 14.143f, 0.0f)
                horizontalLineToRelative(-9.79f)
                close()
            }
        }
        .build()
        return _revoltdotchat!!
    }

private var _revoltdotchat: ImageVector? = null
