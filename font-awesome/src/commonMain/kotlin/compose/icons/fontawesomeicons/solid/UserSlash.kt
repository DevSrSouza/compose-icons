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

public val SolidGroup.UserSlash: ImageVector
    get() {
        if (_userSlash != null) {
            return _userSlash!!
        }
        _userSlash = Builder(name = "UserSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.8f, 458.1f)
                lineTo(362.3f, 248.3f)
                curveTo(412.1f, 230.7f, 448.0f, 183.8f, 448.0f, 128.0f)
                curveTo(448.0f, 57.3f, 390.7f, 0.0f, 320.0f, 0.0f)
                curveToRelative(-67.1f, 0.0f, -121.5f, 51.8f, -126.9f, 117.4f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2.0f, 28.5f, -0.8f, 23.0f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7.0f, -4.2f, 17.0f, 2.8f, 22.4f)
                lineToRelative(588.4f, 454.7f)
                curveToRelative(7.0f, 5.4f, 17.0f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.4f, -6.8f, 4.1f, -16.9f, -2.9f, -22.3f)
                close()
                moveTo(96.0f, 422.4f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(350.2f)
                lineTo(207.4f, 290.3f)
                curveTo(144.2f, 301.3f, 96.0f, 356.0f, 96.0f, 422.4f)
                close()
            }
        }
        .build()
        return _userSlash!!
    }

private var _userSlash: ImageVector? = null
