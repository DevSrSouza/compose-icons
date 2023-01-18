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

public val FilledGroup.ViewDesktopMobile: ImageVector
    get() {
        if (_viewDesktopMobile != null) {
            return _viewDesktopMobile!!
        }
        _viewDesktopMobile = Builder(name = "ViewDesktopMobile", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 2.0f)
                curveTo(16.9926f, 2.0f, 18.0f, 3.0074f, 18.0f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.9926f, 16.9926f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0074f, 7.0074f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(13.25f, 18.0f)
                horizontalLineTo(10.75f)
                curveTo(10.3358f, 18.0f, 10.0f, 18.3358f, 10.0f, 18.75f)
                curveTo(10.0f, 19.1297f, 10.2822f, 19.4435f, 10.6482f, 19.4932f)
                lineTo(10.75f, 19.5f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 19.5f, 14.0f, 19.1642f, 14.0f, 18.75f)
                curveTo(14.0f, 18.3358f, 13.6642f, 18.0f, 13.25f, 18.0f)
                close()
                moveTo(14.5f, 8.9986f)
                horizontalLineTo(9.5f)
                curveTo(9.2239f, 8.9986f, 9.0f, 9.2225f, 9.0f, 9.4986f)
                verticalLineTo(15.4997f)
                curveTo(9.0f, 15.7758f, 9.2239f, 15.9997f, 9.5f, 15.9997f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 15.9997f, 15.0f, 15.7758f, 15.0f, 15.4997f)
                verticalLineTo(9.4986f)
                curveTo(15.0f, 9.2225f, 14.7761f, 8.9986f, 14.5f, 8.9986f)
                close()
                moveTo(14.5f, 5.0f)
                horizontalLineTo(9.5f)
                curveTo(9.2239f, 5.0f, 9.0f, 5.2239f, 9.0f, 5.5f)
                verticalLineTo(7.4967f)
                curveTo(9.0f, 7.7729f, 9.2239f, 7.9967f, 9.5f, 7.9967f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 7.9967f, 15.0f, 7.7729f, 15.0f, 7.4967f)
                verticalLineTo(5.5f)
                curveTo(15.0f, 5.2239f, 14.7761f, 5.0f, 14.5f, 5.0f)
                close()
            }
        }
        .build()
        return _viewDesktopMobile!!
    }

private var _viewDesktopMobile: ImageVector? = null
