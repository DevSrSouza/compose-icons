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

public val RegularGroup.PanelLeftExpand: ImageVector
    get() {
        if (_panelLeftExpand != null) {
            return _panelLeftExpand!!
        }
        _panelLeftExpand = Builder(name = "PanelLeftExpand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1925f, 14.7512f)
                curveTo(14.4696f, 15.059f, 14.9438f, 15.084f, 15.2517f, 14.807f)
                lineTo(17.7517f, 12.5575f)
                curveTo(17.9098f, 12.4153f, 18.0f, 12.2127f, 18.0f, 12.0001f)
                curveTo(18.0f, 11.7876f, 17.9098f, 11.585f, 17.7517f, 11.4428f)
                lineTo(15.2517f, 9.1933f)
                curveTo(14.9438f, 8.9163f, 14.4696f, 8.9412f, 14.1925f, 9.249f)
                curveTo(13.9154f, 9.5569f, 13.9404f, 10.031f, 14.2483f, 10.308f)
                lineTo(15.2955f, 11.2503f)
                lineTo(11.75f, 11.2503f)
                curveTo(11.3358f, 11.2503f, 11.0f, 11.586f, 11.0f, 12.0001f)
                curveTo(11.0f, 12.4143f, 11.3358f, 12.75f, 11.75f, 12.75f)
                horizontalLineTo(15.2955f)
                lineTo(14.2483f, 13.6923f)
                curveTo(13.9404f, 13.9693f, 13.9154f, 14.4434f, 14.1925f, 14.7512f)
                close()
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.7688f, 20.7688f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(4.75f, 5.5f)
                curveTo(4.0596f, 5.5f, 3.5f, 6.0596f, 3.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(3.5f, 17.9404f, 4.0596f, 18.5f, 4.75f, 18.5f)
                horizontalLineTo(8.0043f)
                verticalLineTo(5.5f)
                horizontalLineTo(4.75f)
                close()
                moveTo(9.5043f, 5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(19.25f)
                curveTo(19.9404f, 18.5f, 20.5f, 17.9404f, 20.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.0596f, 19.9404f, 5.5f, 19.25f, 5.5f)
                horizontalLineTo(9.5043f)
                close()
            }
        }
        .build()
        return _panelLeftExpand!!
    }

private var _panelLeftExpand: ImageVector? = null
