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

public val RegularGroup.WindowMaximize: ImageVector
    get() {
        if (_windowMaximize != null) {
            return _windowMaximize!!
        }
        _windowMaximize = Builder(name = "WindowMaximize", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.3f, 89.5f)
                curveTo(0.1f, 91.6f, 0.0f, 93.8f, 0.0f, 96.0f)
                verticalLineTo(224.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(224.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-2.2f, 0.0f, -4.4f, 0.1f, -6.5f, 0.3f)
                curveToRelative(-9.2f, 0.9f, -17.8f, 3.8f, -25.5f, 8.2f)
                curveTo(21.8f, 46.5f, 13.4f, 55.1f, 7.7f, 65.5f)
                curveToRelative(-3.9f, 7.3f, -6.5f, 15.4f, -7.4f, 24.0f)
                close()
                moveTo(48.0f, 224.0f)
                horizontalLineTo(464.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(64.0f, 432.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -192.0f)
                close()
            }
        }
        .build()
        return _windowMaximize!!
    }

private var _windowMaximize: ImageVector? = null
