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

public val RegularGroup.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.1f, 0.0f)
                horizontalLineToRelative(-384.0f)
                curveToRelative(-35.25f, 0.0f, -64.0f, 28.75f, -64.0f, 63.1f)
                verticalLineToRelative(287.1f)
                curveToRelative(0.0f, 35.25f, 28.75f, 63.1f, 64.0f, 63.1f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(83.98f)
                curveToRelative(0.0f, 9.836f, 11.02f, 15.55f, 19.12f, 9.7f)
                lineToRelative(124.9f, -93.68f)
                horizontalLineToRelative(144.0f)
                curveToRelative(35.25f, 0.0f, 64.0f, -28.75f, 64.0f, -63.1f)
                verticalLineTo(63.1f)
                curveTo(511.1f, 28.75f, 483.2f, 0.0f, 447.1f, 0.0f)
                close()
                moveTo(464.0f, 352.0f)
                curveToRelative(0.0f, 8.75f, -7.25f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-160.0f)
                lineToRelative(-80.0f, 60.0f)
                verticalLineToRelative(-60.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.75f, 0.0f, -16.0f, -7.25f, -16.0f, -16.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -8.75f, 7.25f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(8.75f, 0.0f, 16.0f, 7.25f, 16.0f, 16.0f)
                verticalLineTo(352.0f)
                close()
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null
