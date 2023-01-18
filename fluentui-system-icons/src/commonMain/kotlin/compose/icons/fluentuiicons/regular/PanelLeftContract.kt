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

public val RegularGroup.PanelLeftContract: ImageVector
    get() {
        if (_panelLeftContract != null) {
            return _panelLeftContract!!
        }
        _panelLeftContract = Builder(name = "PanelLeftContract", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8075f, 9.249f)
                curveTo(14.5304f, 8.9412f, 14.0562f, 8.9163f, 13.7483f, 9.1933f)
                lineTo(11.2483f, 11.4428f)
                curveTo(11.0902f, 11.585f, 11.0f, 11.7875f, 11.0f, 12.0001f)
                curveTo(11.0f, 12.2127f, 11.0902f, 12.4152f, 11.2483f, 12.5574f)
                lineTo(13.7483f, 14.8069f)
                curveTo(14.0562f, 15.084f, 14.5304f, 15.059f, 14.8075f, 14.7512f)
                curveTo(15.0846f, 14.4434f, 15.0596f, 13.9693f, 14.7517f, 13.6922f)
                lineTo(13.7045f, 12.7499f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 12.7499f, 18.0f, 12.4142f, 18.0f, 12.0001f)
                curveTo(18.0f, 11.586f, 17.6642f, 11.2503f, 17.25f, 11.2503f)
                horizontalLineTo(13.7045f)
                lineTo(14.7517f, 10.308f)
                curveTo(15.0596f, 10.0309f, 15.0846f, 9.5568f, 14.8075f, 9.249f)
                close()
                moveTo(2.0f, 17.2506f)
                curveTo(2.0f, 18.7691f, 3.2312f, 20.0f, 4.75f, 20.0f)
                lineTo(19.25f, 20.0f)
                curveTo(20.7688f, 20.0f, 22.0f, 18.7691f, 22.0f, 17.2506f)
                verticalLineTo(6.7494f)
                curveTo(22.0f, 5.2309f, 20.7688f, 4.0f, 19.25f, 4.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 4.0f, 2.0f, 5.2309f, 2.0f, 6.7494f)
                lineTo(2.0f, 17.2506f)
                close()
                moveTo(4.75f, 18.5003f)
                curveTo(4.0596f, 18.5003f, 3.5f, 17.9408f, 3.5f, 17.2506f)
                lineTo(3.5f, 6.7494f)
                curveTo(3.5f, 6.0592f, 4.0596f, 5.4997f, 4.75f, 5.4997f)
                lineTo(8.0042f, 5.4997f)
                lineTo(8.0042f, 18.5003f)
                horizontalLineTo(4.75f)
                close()
                moveTo(9.5042f, 18.5003f)
                lineTo(9.5042f, 5.4997f)
                lineTo(19.25f, 5.4997f)
                curveTo(19.9404f, 5.4997f, 20.5f, 6.0592f, 20.5f, 6.7494f)
                lineTo(20.5f, 17.2506f)
                curveTo(20.5f, 17.9408f, 19.9404f, 18.5003f, 19.25f, 18.5003f)
                lineTo(9.5042f, 18.5003f)
                close()
            }
        }
        .build()
        return _panelLeftContract!!
    }

private var _panelLeftContract: ImageVector? = null
