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
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(353.3f, 251.6f)
                curveTo(407.9f, 237.0f, 448.0f, 187.2f, 448.0f, 128.0f)
                curveTo(448.0f, 57.3f, 390.7f, 0.0f, 320.0f, 0.0f)
                curveTo(250.2f, 0.0f, 193.5f, 55.8f, 192.0f, 125.2f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(264.3f, 304.3f)
                curveTo(170.5f, 309.4f, 96.0f, 387.2f, 96.0f, 482.3f)
                curveToRelative(0.0f, 16.4f, 13.3f, 29.7f, 29.7f, 29.7f)
                horizontalLineTo(514.3f)
                curveToRelative(3.9f, 0.0f, 7.6f, -0.7f, 11.0f, -2.1f)
                lineToRelative(-261.0f, -205.6f)
                close()
            }
        }
        .build()
        return _userSlash!!
    }

private var _userSlash: ImageVector? = null
