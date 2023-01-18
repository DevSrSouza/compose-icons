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

public val FilledGroup.ArrowUpload: ImageVector
    get() {
        if (_arrowUpload != null) {
            return _arrowUpload!!
        }
        _arrowUpload = Builder(name = "ArrowUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 3.4961f)
                horizontalLineTo(18.7477f)
                curveTo(19.1619f, 3.4961f, 19.4977f, 3.1603f, 19.4977f, 2.7461f)
                curveTo(19.4977f, 2.3664f, 19.2155f, 2.0526f, 18.8494f, 2.0029f)
                lineTo(18.7477f, 1.9961f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 1.9961f, 4.5f, 2.3319f, 4.5f, 2.7461f)
                curveTo(4.5f, 3.1258f, 4.7821f, 3.4396f, 5.1482f, 3.4892f)
                lineTo(5.25f, 3.4961f)
                close()
                moveTo(11.8834f, 21.9938f)
                lineTo(12.0f, 22.0005f)
                curveTo(12.5128f, 22.0005f, 12.9355f, 21.6145f, 12.9933f, 21.1171f)
                lineTo(13.0f, 21.0005f)
                verticalLineTo(8.4105f)
                lineTo(16.2941f, 11.7033f)
                curveTo(16.6546f, 12.0637f, 17.2218f, 12.0914f, 17.6141f, 11.7863f)
                lineTo(17.7083f, 11.7031f)
                curveTo(18.0687f, 11.3426f, 18.0964f, 10.7754f, 17.7913f, 10.3831f)
                lineTo(17.7081f, 10.2889f)
                lineTo(12.7105f, 5.2923f)
                curveTo(12.3502f, 4.9321f, 11.7833f, 4.9042f, 11.391f, 5.2088f)
                lineTo(11.2968f, 5.2919f)
                lineTo(6.2934f, 10.2885f)
                curveTo(5.9026f, 10.6788f, 5.9022f, 11.3119f, 6.2924f, 11.7027f)
                curveTo(6.6526f, 12.0634f, 7.2199f, 12.0916f, 7.6124f, 11.7868f)
                lineTo(7.7066f, 11.7037f)
                lineTo(11.0f, 8.4155f)
                verticalLineTo(21.0005f)
                curveTo(11.0f, 21.5133f, 11.386f, 21.936f, 11.8834f, 21.9938f)
                close()
            }
        }
        .build()
        return _arrowUpload!!
    }

private var _arrowUpload: ImageVector? = null
