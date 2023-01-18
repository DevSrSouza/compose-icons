package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.WindowApps: ImageVector
    get() {
        if (_windowApps != null) {
            return _windowApps!!
        }
        _windowApps = Builder(name = "WindowApps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(9.0095f)
                curveTo(20.9175f, 9.0032f, 20.8341f, 9.0f, 20.75f, 9.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.75f)
                curveTo(9.0f, 20.8341f, 9.0032f, 20.9175f, 9.0095f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(12.25f, 15.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(12.25f)
                curveTo(15.5f, 11.0074f, 16.5074f, 10.0f, 17.75f, 10.0f)
                horizontalLineTo(20.75f)
                curveTo(21.9926f, 10.0f, 23.0f, 11.0074f, 23.0f, 12.25f)
                verticalLineTo(19.75f)
                curveTo(23.0f, 21.5449f, 21.5449f, 23.0f, 19.75f, 23.0f)
                horizontalLineTo(12.25f)
                curveTo(11.0074f, 23.0f, 10.0f, 21.9926f, 10.0f, 20.75f)
                verticalLineTo(17.75f)
                curveTo(10.0f, 16.5074f, 11.0074f, 15.5f, 12.25f, 15.5f)
                close()
                moveTo(17.0f, 12.25f)
                verticalLineTo(15.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(12.25f)
                curveTo(21.5f, 11.8358f, 21.1642f, 11.5f, 20.75f, 11.5f)
                horizontalLineTo(17.75f)
                curveTo(17.3358f, 11.5f, 17.0f, 11.8358f, 17.0f, 12.25f)
                close()
                moveTo(15.5f, 21.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.25f)
                curveTo(11.8358f, 17.0f, 11.5f, 17.3358f, 11.5f, 17.75f)
                verticalLineTo(20.75f)
                curveTo(11.5f, 21.1642f, 11.8358f, 21.5f, 12.25f, 21.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(17.0f, 17.0f)
                verticalLineTo(21.5f)
                horizontalLineTo(19.75f)
                curveTo(20.7165f, 21.5f, 21.5f, 20.7165f, 21.5f, 19.75f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _windowApps!!
    }

private var _windowApps: ImageVector? = null
