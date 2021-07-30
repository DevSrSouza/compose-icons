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

public val SolidGroup.UserNinja: ImageVector
    get() {
        if (_userNinja != null) {
            return _userNinja!!
        }
        _userNinja = Builder(name = "UserNinja", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(325.4f, 289.2f)
                lineTo(224.0f, 390.6f)
                lineTo(122.6f, 289.2f)
                curveTo(54.0f, 295.3f, 0.0f, 352.2f, 0.0f, 422.4f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-41.6f)
                curveToRelative(0.0f, -70.2f, -54.0f, -127.1f, -122.6f, -133.2f)
                close()
                moveTo(32.0f, 192.0f)
                curveToRelative(27.3f, 0.0f, 51.8f, -11.5f, 69.2f, -29.7f)
                curveToRelative(15.1f, 53.9f, 64.0f, 93.7f, 122.8f, 93.7f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                reflectiveCurveTo(294.7f, 0.0f, 224.0f, 0.0f)
                curveToRelative(-50.4f, 0.0f, -93.6f, 29.4f, -114.5f, 71.8f)
                curveTo(92.1f, 47.8f, 64.0f, 32.0f, 32.0f, 32.0f)
                curveToRelative(0.0f, 33.4f, 17.1f, 62.8f, 43.1f, 80.0f)
                curveToRelative(-26.0f, 17.2f, -43.1f, 46.6f, -43.1f, 80.0f)
                close()
                moveTo(176.0f, 96.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(144.0f, 128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _userNinja!!
    }

private var _userNinja: ImageVector? = null
