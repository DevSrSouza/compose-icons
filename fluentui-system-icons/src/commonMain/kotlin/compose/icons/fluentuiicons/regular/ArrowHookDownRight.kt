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

public val RegularGroup.ArrowHookDownRight: ImageVector
    get() {
        if (_arrowHookDownRight != null) {
            return _arrowHookDownRight!!
        }
        _arrowHookDownRight = Builder(name = "ArrowHookDownRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 5.5f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 5.5f, 16.75f, 5.1642f, 16.75f, 4.75f)
                curveTo(16.75f, 4.3358f, 16.4142f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(10.5f)
                curveTo(6.9102f, 4.0f, 4.0f, 6.9102f, 4.0f, 10.5f)
                curveTo(4.0f, 14.0899f, 6.9102f, 17.0f, 10.5f, 17.0f)
                horizontalLineTo(16.4503f)
                lineTo(13.8336f, 19.6168f)
                curveTo(13.5407f, 19.9097f, 13.5407f, 20.3845f, 13.8336f, 20.6774f)
                curveTo(14.1264f, 20.9703f, 14.6013f, 20.9703f, 14.8942f, 20.6774f)
                lineTo(18.7765f, 16.7951f)
                curveTo(18.8762f, 16.6955f, 18.9419f, 16.5748f, 18.9738f, 16.4473f)
                curveTo(18.9909f, 16.3845f, 19.0f, 16.3183f, 19.0f, 16.25f)
                curveTo(19.0f, 16.0371f, 18.9113f, 15.8449f, 18.7688f, 15.7084f)
                lineTo(14.8887f, 11.8283f)
                curveTo(14.5958f, 11.5354f, 14.121f, 11.5354f, 13.8281f, 11.8283f)
                curveTo(13.5352f, 12.1212f, 13.5352f, 12.5961f, 13.8281f, 12.889f)
                lineTo(16.4391f, 15.5f)
                horizontalLineTo(10.5f)
                curveTo(7.7386f, 15.5f, 5.5f, 13.2614f, 5.5f, 10.5f)
                curveTo(5.5f, 7.7386f, 7.7386f, 5.5f, 10.5f, 5.5f)
                close()
            }
        }
        .build()
        return _arrowHookDownRight!!
    }

private var _arrowHookDownRight: ImageVector? = null
