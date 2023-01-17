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
                moveTo(7.724f, 65.49f)
                curveTo(13.36f, 55.11f, 21.79f, 46.47f, 32.0f, 40.56f)
                curveTo(39.63f, 36.15f, 48.25f, 33.26f, 57.46f, 32.33f)
                curveTo(59.61f, 32.11f, 61.79f, 32.0f, 64.0f, 32.0f)
                horizontalLineTo(448.0f)
                curveTo(483.3f, 32.0f, 512.0f, 60.65f, 512.0f, 96.0f)
                verticalLineTo(416.0f)
                curveTo(512.0f, 451.3f, 483.3f, 480.0f, 448.0f, 480.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 480.0f, 0.0f, 451.3f, 0.0f, 416.0f)
                verticalLineTo(96.0f)
                curveTo(0.0f, 93.79f, 0.112f, 91.61f, 0.331f, 89.46f)
                curveTo(1.204f, 80.85f, 3.784f, 72.75f, 7.724f, 65.49f)
                verticalLineTo(65.49f)
                close()
                moveTo(48.0f, 416.0f)
                curveTo(48.0f, 424.8f, 55.16f, 432.0f, 64.0f, 432.0f)
                horizontalLineTo(448.0f)
                curveTo(456.8f, 432.0f, 464.0f, 424.8f, 464.0f, 416.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _windowMaximize!!
    }

private var _windowMaximize: ImageVector? = null
