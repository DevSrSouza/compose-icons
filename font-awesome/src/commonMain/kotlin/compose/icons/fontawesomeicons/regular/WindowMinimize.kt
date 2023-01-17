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

public val RegularGroup.WindowMinimize: ImageVector
    get() {
        if (_windowMinimize != null) {
            return _windowMinimize!!
        }
        _windowMinimize = Builder(name = "WindowMinimize", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 456.0f)
                curveTo(0.0f, 442.7f, 10.75f, 432.0f, 24.0f, 432.0f)
                horizontalLineTo(488.0f)
                curveTo(501.3f, 432.0f, 512.0f, 442.7f, 512.0f, 456.0f)
                curveTo(512.0f, 469.3f, 501.3f, 480.0f, 488.0f, 480.0f)
                horizontalLineTo(24.0f)
                curveTo(10.75f, 480.0f, 0.0f, 469.3f, 0.0f, 456.0f)
                close()
            }
        }
        .build()
        return _windowMinimize!!
    }

private var _windowMinimize: ImageVector? = null
