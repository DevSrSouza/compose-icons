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

public val FilledGroup.TabProhibited: ImageVector
    get() {
        if (_tabProhibited != null) {
            return _tabProhibited!!
        }
        _tabProhibited = Builder(name = "TabProhibited", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.2312f, 4.2312f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 3.0f, 21.0f, 4.2312f, 21.0f, 5.75f)
                verticalLineTo(12.0218f)
                curveTo(20.3945f, 11.6341f, 19.7204f, 11.3441f, 19.0f, 11.1739f)
                verticalLineTo(5.75f)
                curveTo(19.0f, 5.3358f, 18.6642f, 5.0f, 18.25f, 5.0f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 5.0f, 5.0f, 5.3358f, 5.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(5.0f, 18.6642f, 5.3358f, 19.0f, 5.75f, 19.0f)
                horizontalLineTo(11.1739f)
                curveTo(11.3441f, 19.7204f, 11.6341f, 20.3945f, 12.0218f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0f, 3.0f, 19.7688f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 18.3335f, 13.755f, 19.1075f, 14.1911f, 19.7482f)
                lineTo(19.7482f, 14.1911f)
                curveTo(19.1075f, 13.755f, 18.3335f, 13.5f, 17.5f, 13.5f)
                curveTo(15.2909f, 13.5f, 13.5f, 15.2909f, 13.5f, 17.5f)
                close()
                moveTo(17.5f, 21.5f)
                curveTo(19.7091f, 21.5f, 21.5f, 19.7091f, 21.5f, 17.5f)
                curveTo(21.5f, 16.6665f, 21.245f, 15.8925f, 20.8089f, 15.2518f)
                lineTo(15.2518f, 20.8089f)
                curveTo(15.8925f, 21.245f, 16.6665f, 21.5f, 17.5f, 21.5f)
                close()
            }
        }
        .build()
        return _tabProhibited!!
    }

private var _tabProhibited: ImageVector? = null
