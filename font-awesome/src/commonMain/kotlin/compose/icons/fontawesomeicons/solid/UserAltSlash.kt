package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UserAltSlash: ImageVector
    get() {
        if (_userAltSlash != null) {
            return _userAltSlash!!
        }
        _userAltSlash = Builder(name = "UserAltSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.8f, 458.1f)
                lineTo(389.6f, 269.3f)
                curveTo(433.8f, 244.7f, 464.0f, 198.1f, 464.0f, 144.0f)
                curveTo(464.0f, 64.5f, 399.5f, 0.0f, 320.0f, 0.0f)
                curveToRelative(-67.1f, 0.0f, -123.0f, 46.1f, -139.0f, 108.2f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2.0f, 28.5f, -0.8f, 23.0f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7.0f, -4.2f, 17.0f, 2.8f, 22.4f)
                lineToRelative(588.4f, 454.7f)
                curveToRelative(7.0f, 5.4f, 17.0f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.4f, -6.8f, 4.1f, -16.9f, -2.9f, -22.3f)
                close()
                moveTo(198.4f, 320.0f)
                curveTo(124.2f, 320.0f, 64.0f, 380.2f, 64.0f, 454.4f)
                verticalLineToRelative(9.6f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(382.2f)
                lineTo(245.8f, 320.0f)
                horizontalLineToRelative(-47.4f)
                close()
            }
        }
        .build()
        return _userAltSlash!!
    }

private var _userAltSlash: ImageVector? = null
