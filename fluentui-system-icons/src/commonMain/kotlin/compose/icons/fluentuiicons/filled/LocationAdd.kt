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

public val FilledGroup.LocationAdd: ImageVector
    get() {
        if (_locationAdd != null) {
            return _locationAdd!!
        }
        _locationAdd = Builder(name = "LocationAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9703f, 18.0562f)
                lineTo(18.1573f, 16.8823f)
                curveTo(21.5577f, 13.4819f, 21.5577f, 7.9687f, 18.1573f, 4.5683f)
                curveTo(14.7568f, 1.1679f, 9.2437f, 1.1679f, 5.8433f, 4.5683f)
                curveTo(2.4429f, 7.9687f, 2.4429f, 13.4819f, 5.8433f, 16.8823f)
                curveTo(6.1391f, 17.1781f, 6.5064f, 17.5414f, 6.9451f, 17.9723f)
                lineTo(10.4362f, 21.3681f)
                curveTo(11.3084f, 22.2116f, 12.6922f, 22.2117f, 13.5644f, 21.3684f)
                curveTo(14.9603f, 20.0188f, 16.0954f, 18.9149f, 16.9703f, 18.0562f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(12.4142f, 7.0f, 12.75f, 7.3358f, 12.75f, 7.75f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 10.0f, 16.0f, 10.3358f, 16.0f, 10.75f)
                curveTo(16.0f, 11.1642f, 15.6642f, 11.5f, 15.25f, 11.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(13.75f)
                curveTo(12.75f, 14.1642f, 12.4142f, 14.5f, 12.0f, 14.5f)
                curveTo(11.5858f, 14.5f, 11.25f, 14.1642f, 11.25f, 13.75f)
                verticalLineTo(11.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 11.5f, 8.0f, 11.1642f, 8.0f, 10.75f)
                curveTo(8.0f, 10.3358f, 8.3358f, 10.0f, 8.75f, 10.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.75f)
                curveTo(11.25f, 7.3358f, 11.5858f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _locationAdd!!
    }

private var _locationAdd: ImageVector? = null
