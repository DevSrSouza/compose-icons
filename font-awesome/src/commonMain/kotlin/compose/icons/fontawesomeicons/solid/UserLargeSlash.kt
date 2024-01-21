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

public val SolidGroup.UserLargeSlash: ImageVector
    get() {
        if (_userLargeSlash != null) {
            return _userLargeSlash!!
        }
        _userLargeSlash = Builder(name = "UserLargeSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(381.9f, 274.0f)
                curveToRelative(48.5f, -23.2f, 82.1f, -72.7f, 82.1f, -130.0f)
                curveTo(464.0f, 64.5f, 399.5f, 0.0f, 320.0f, 0.0f)
                curveTo(250.4f, 0.0f, 192.4f, 49.3f, 178.9f, 114.9f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(545.5f, 512.0f)
                horizontalLineTo(528.0f)
                lineTo(284.3f, 320.0f)
                horizontalLineToRelative(-59.0f)
                curveTo(136.2f, 320.0f, 64.0f, 392.2f, 64.0f, 481.3f)
                curveToRelative(0.0f, 17.0f, 13.8f, 30.7f, 30.7f, 30.7f)
                horizontalLineTo(545.3f)
                lineToRelative(0.3f, 0.0f)
                close()
            }
        }
        .build()
        return _userLargeSlash!!
    }

private var _userLargeSlash: ImageVector? = null
