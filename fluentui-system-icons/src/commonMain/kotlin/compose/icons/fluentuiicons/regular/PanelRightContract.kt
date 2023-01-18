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

public val RegularGroup.PanelRightContract: ImageVector
    get() {
        if (_panelRightContract != null) {
            return _panelRightContract!!
        }
        _panelRightContract = Builder(name = "PanelRightContract", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1925f, 9.2489f)
                curveTo(9.4696f, 8.9411f, 9.9438f, 8.9162f, 10.2517f, 9.1932f)
                lineTo(12.7517f, 11.4427f)
                curveTo(12.9098f, 11.5849f, 13.0f, 11.7874f, 13.0f, 12.0f)
                curveTo(13.0f, 12.2126f, 12.9098f, 12.4152f, 12.7517f, 12.5574f)
                lineTo(10.2517f, 14.8068f)
                curveTo(9.9438f, 15.0839f, 9.4696f, 15.0589f, 9.1925f, 14.7511f)
                curveTo(8.9154f, 14.4433f, 8.9404f, 13.9692f, 9.2483f, 13.6922f)
                lineTo(10.2955f, 12.7499f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 12.7499f, 6.0f, 12.4141f, 6.0f, 12.0f)
                curveTo(6.0f, 11.5859f, 6.3358f, 11.2502f, 6.75f, 11.2502f)
                horizontalLineTo(10.2955f)
                lineTo(9.2483f, 10.3079f)
                curveTo(8.9404f, 10.0309f, 8.9154f, 9.5568f, 9.1925f, 9.2489f)
                close()
                moveTo(22.0f, 17.2506f)
                curveTo(22.0f, 18.7691f, 20.7688f, 20.0f, 19.25f, 20.0f)
                lineTo(4.75f, 20.0f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7691f, 2.0f, 17.2506f)
                verticalLineTo(6.7494f)
                curveTo(2.0f, 5.2309f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2309f, 22.0f, 6.7494f)
                lineTo(22.0f, 17.2506f)
                close()
                moveTo(19.25f, 18.5003f)
                curveTo(19.9404f, 18.5003f, 20.5f, 17.9408f, 20.5f, 17.2506f)
                lineTo(20.5f, 6.7494f)
                curveTo(20.5f, 6.0592f, 19.9404f, 5.4997f, 19.25f, 5.4997f)
                lineTo(15.9958f, 5.4997f)
                lineTo(15.9958f, 18.5003f)
                horizontalLineTo(19.25f)
                close()
                moveTo(14.4958f, 18.5003f)
                lineTo(14.4958f, 5.4997f)
                lineTo(4.75f, 5.4997f)
                curveTo(4.0596f, 5.4997f, 3.5f, 6.0592f, 3.5f, 6.7494f)
                lineTo(3.5f, 17.2506f)
                curveTo(3.5f, 17.9408f, 4.0596f, 18.5003f, 4.75f, 18.5003f)
                lineTo(14.4958f, 18.5003f)
                close()
            }
        }
        .build()
        return _panelRightContract!!
    }

private var _panelRightContract: ImageVector? = null
