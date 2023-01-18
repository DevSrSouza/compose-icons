package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Poll: ImageVector
    get() {
        if (_poll != null) {
            return _poll!!
        }
        _poll = Builder(name = "Poll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7519f, 2.0f)
                curveTo(13.2717f, 2.0f, 14.5037f, 3.232f, 14.5037f, 4.7519f)
                verticalLineTo(19.2504f)
                curveTo(14.5037f, 20.7702f, 13.2717f, 22.0023f, 11.7519f, 22.0023f)
                curveTo(10.2321f, 22.0023f, 9.0f, 20.7702f, 9.0f, 19.2504f)
                verticalLineTo(4.7519f)
                curveTo(9.0f, 3.232f, 10.2321f, 2.0f, 11.7519f, 2.0f)
                close()
                moveTo(18.7519f, 7.0f)
                curveTo(20.2717f, 7.0f, 21.5037f, 8.232f, 21.5037f, 9.7519f)
                verticalLineTo(19.2504f)
                curveTo(21.5037f, 20.7702f, 20.2717f, 22.0023f, 18.7519f, 22.0023f)
                curveTo(17.2321f, 22.0023f, 16.0f, 20.7702f, 16.0f, 19.2504f)
                verticalLineTo(9.7519f)
                curveTo(16.0f, 8.232f, 17.2321f, 7.0f, 18.7519f, 7.0f)
                close()
                moveTo(4.7519f, 12.0f)
                curveTo(6.2717f, 12.0f, 7.5037f, 13.2321f, 7.5037f, 14.7519f)
                verticalLineTo(19.2504f)
                curveTo(7.5037f, 20.7702f, 6.2717f, 22.0023f, 4.7519f, 22.0023f)
                curveTo(3.232f, 22.0023f, 2.0f, 20.7702f, 2.0f, 19.2504f)
                verticalLineTo(14.7519f)
                curveTo(2.0f, 13.2321f, 3.232f, 12.0f, 4.7519f, 12.0f)
                close()
                moveTo(11.7519f, 3.5f)
                curveTo(11.0605f, 3.5f, 10.5f, 4.0605f, 10.5f, 4.7519f)
                verticalLineTo(19.2504f)
                curveTo(10.5f, 19.9418f, 11.0605f, 20.5023f, 11.7519f, 20.5023f)
                curveTo(12.4433f, 20.5023f, 13.0037f, 19.9418f, 13.0037f, 19.2504f)
                verticalLineTo(4.7519f)
                curveTo(13.0037f, 4.0605f, 12.4433f, 3.5f, 11.7519f, 3.5f)
                close()
                moveTo(18.7519f, 8.5f)
                curveTo(18.0605f, 8.5f, 17.5f, 9.0605f, 17.5f, 9.7519f)
                verticalLineTo(19.2504f)
                curveTo(17.5f, 19.9418f, 18.0605f, 20.5023f, 18.7519f, 20.5023f)
                curveTo(19.4433f, 20.5023f, 20.0037f, 19.9418f, 20.0037f, 19.2504f)
                verticalLineTo(9.7519f)
                curveTo(20.0037f, 9.0605f, 19.4433f, 8.5f, 18.7519f, 8.5f)
                close()
                moveTo(4.7519f, 13.5f)
                curveTo(4.0605f, 13.5f, 3.5f, 14.0605f, 3.5f, 14.7519f)
                verticalLineTo(19.2504f)
                curveTo(3.5f, 19.9418f, 4.0605f, 20.5023f, 4.7519f, 20.5023f)
                curveTo(5.4433f, 20.5023f, 6.0037f, 19.9418f, 6.0037f, 19.2504f)
                verticalLineTo(14.7519f)
                curveTo(6.0037f, 14.0605f, 5.4433f, 13.5f, 4.7519f, 13.5f)
                close()
            }
        }
        .build()
        return _poll!!
    }

private var _poll: ImageVector? = null
