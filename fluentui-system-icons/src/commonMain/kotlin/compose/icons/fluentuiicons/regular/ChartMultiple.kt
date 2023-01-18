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

public val RegularGroup.ChartMultiple: ImageVector
    get() {
        if (_chartMultiple != null) {
            return _chartMultiple!!
        }
        _chartMultiple = Builder(name = "ChartMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.75f)
                horizontalLineTo(19.7146f)
                curveTo(20.0549f, 11.4029f, 20.4956f, 11.1546f, 20.9896f, 11.0521f)
                curveTo(20.7558f, 6.0134f, 16.5966f, 2.0f, 11.5f, 2.0f)
                curveTo(6.2533f, 2.0f, 2.0f, 6.2533f, 2.0f, 11.5f)
                curveTo(2.0f, 16.579f, 5.9857f, 20.7271f, 11.0f, 20.9871f)
                verticalLineTo(19.5f)
                lineTo(11.0f, 19.4846f)
                curveTo(6.8147f, 19.2266f, 3.5f, 15.7504f, 3.5f, 11.5f)
                curveTo(3.5f, 7.1654f, 6.9474f, 3.6359f, 11.25f, 3.5038f)
                verticalLineTo(10.0f)
                curveTo(11.25f, 10.9665f, 12.0335f, 11.75f, 13.0f, 11.75f)
                close()
                moveTo(13.0f, 10.25f)
                curveTo(12.8619f, 10.25f, 12.75f, 10.1381f, 12.75f, 10.0f)
                verticalLineTo(3.5971f)
                curveTo(16.1673f, 4.1333f, 18.8667f, 6.8327f, 19.4029f, 10.25f)
                horizontalLineTo(13.0f)
                close()
                moveTo(21.5f, 12.0f)
                curveTo(20.6716f, 12.0f, 20.0f, 12.6716f, 20.0f, 13.5f)
                verticalLineTo(21.5f)
                curveTo(20.0f, 22.3284f, 20.6716f, 23.0f, 21.5f, 23.0f)
                curveTo(22.3284f, 23.0f, 23.0f, 22.3284f, 23.0f, 21.5f)
                verticalLineTo(13.5f)
                curveTo(23.0f, 12.6716f, 22.3284f, 12.0f, 21.5f, 12.0f)
                close()
                moveTo(13.5f, 18.0f)
                curveTo(12.6716f, 18.0f, 12.0f, 18.6716f, 12.0f, 19.5f)
                verticalLineTo(21.5f)
                curveTo(12.0f, 22.3284f, 12.6716f, 23.0f, 13.5f, 23.0f)
                curveTo(14.3284f, 23.0f, 15.0f, 22.3284f, 15.0f, 21.5f)
                verticalLineTo(19.5f)
                curveTo(15.0f, 18.6716f, 14.3284f, 18.0f, 13.5f, 18.0f)
                close()
                moveTo(16.0f, 16.5f)
                curveTo(16.0f, 15.6716f, 16.6716f, 15.0f, 17.5f, 15.0f)
                curveTo(18.3284f, 15.0f, 19.0f, 15.6716f, 19.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(19.0f, 22.3284f, 18.3284f, 23.0f, 17.5f, 23.0f)
                curveTo(16.6716f, 23.0f, 16.0f, 22.3284f, 16.0f, 21.5f)
                verticalLineTo(16.5f)
                close()
            }
        }
        .build()
        return _chartMultiple!!
    }

private var _chartMultiple: ImageVector? = null
