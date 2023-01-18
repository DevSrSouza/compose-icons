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

public val RegularGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0177f, 5.6645f)
                curveTo(12.1126f, 5.2613f, 12.5165f, 5.0114f, 12.9196f, 5.1064f)
                curveTo(14.388f, 5.4521f, 15.5426f, 6.6046f, 15.8915f, 8.0717f)
                curveTo(15.9873f, 8.4746f, 15.7383f, 8.879f, 15.3353f, 8.9748f)
                curveTo(14.9324f, 9.0707f, 14.528f, 8.8217f, 14.4322f, 8.4187f)
                curveTo(14.2146f, 7.5037f, 13.4916f, 6.7821f, 12.5758f, 6.5664f)
                curveTo(12.1726f, 6.4715f, 11.9228f, 6.0677f, 12.0177f, 5.6645f)
                close()
                moveTo(5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                curveTo(19.0f, 11.025f, 18.3305f, 13.2357f, 17.1504f, 14.9556f)
                curveTo(16.1075f, 16.4755f, 14.6069f, 17.687f, 12.75f, 17.9479f)
                verticalLineTo(18.25f)
                curveTo(12.75f, 18.6642f, 13.0858f, 19.0f, 13.5f, 19.0f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 19.0f, 19.0f, 20.0074f, 19.0f, 21.25f)
                verticalLineTo(22.25f)
                curveTo(19.0f, 22.6642f, 18.6642f, 23.0f, 18.25f, 23.0f)
                curveTo(17.8358f, 23.0f, 17.5f, 22.6642f, 17.5f, 22.25f)
                verticalLineTo(21.25f)
                curveTo(17.5f, 20.8358f, 17.1642f, 20.5f, 16.75f, 20.5f)
                horizontalLineTo(13.5f)
                curveTo(12.2574f, 20.5f, 11.25f, 19.4926f, 11.25f, 18.25f)
                verticalLineTo(17.9479f)
                curveTo(9.3931f, 17.687f, 7.8925f, 16.4755f, 6.8496f, 14.9556f)
                curveTo(5.6695f, 13.2357f, 5.0f, 11.025f, 5.0f, 9.0f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(8.9624f, 3.5f, 6.5f, 5.9624f, 6.5f, 9.0f)
                curveTo(6.5f, 10.7251f, 7.0795f, 12.6393f, 8.0864f, 14.1069f)
                curveTo(9.0936f, 15.5748f, 10.4527f, 16.5f, 12.0f, 16.5f)
                curveTo(13.5473f, 16.5f, 14.9064f, 15.5748f, 15.9136f, 14.1069f)
                curveTo(16.9205f, 12.6393f, 17.5f, 10.7251f, 17.5f, 9.0f)
                curveTo(17.5f, 5.9624f, 15.0376f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
