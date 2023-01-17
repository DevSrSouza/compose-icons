package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 304.0f)
                horizontalLineToRelative(-96.0f)
                curveTo(78.8f, 304.0f, 0.0f, 382.8f, 0.0f, 480.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                curveTo(448.0f, 382.8f, 369.2f, 304.0f, 272.0f, 304.0f)
                close()
                moveTo(48.99f, 464.0f)
                curveTo(56.89f, 400.9f, 110.8f, 352.0f, 176.0f, 352.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(65.16f, 0.0f, 119.1f, 48.95f, 127.0f, 112.0f)
                horizontalLineTo(48.99f)
                close()
                moveTo(224.0f, 256.0f)
                curveToRelative(70.69f, 0.0f, 128.0f, -57.31f, 128.0f, -128.0f)
                curveToRelative(0.0f, -70.69f, -57.31f, -128.0f, -128.0f, -128.0f)
                reflectiveCurveTo(96.0f, 57.31f, 96.0f, 128.0f)
                curveTo(96.0f, 198.7f, 153.3f, 256.0f, 224.0f, 256.0f)
                close()
                moveTo(224.0f, 48.0f)
                curveToRelative(44.11f, 0.0f, 80.0f, 35.89f, 80.0f, 80.0f)
                curveToRelative(0.0f, 44.11f, -35.89f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveTo(144.0f, 172.1f, 144.0f, 128.0f)
                curveTo(144.0f, 83.89f, 179.9f, 48.0f, 224.0f, 48.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
