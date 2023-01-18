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

public val FilledGroup.AppStore: ImageVector
    get() {
        if (_appStore != null) {
            return _appStore!!
        }
        _appStore = Builder(name = "AppStore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(9.3687f, 15.2541f)
                horizontalLineTo(7.6307f)
                lineTo(7.5642f, 15.3697f)
                lineTo(7.5188f, 15.461f)
                curveTo(7.377f, 15.8022f, 7.5056f, 16.2041f, 7.8335f, 16.3956f)
                curveTo(8.1613f, 16.5871f, 8.5746f, 16.5018f, 8.8021f, 16.2108f)
                lineTo(8.8594f, 16.1264f)
                lineTo(9.3687f, 15.2541f)
                close()
                moveTo(13.2926f, 10.0241f)
                lineTo(12.4216f, 11.5161f)
                lineTo(15.0796f, 16.1238f)
                lineTo(15.1364f, 16.2085f)
                curveTo(15.3624f, 16.5008f, 15.7752f, 16.5884f, 16.104f, 16.3986f)
                curveTo(16.4329f, 16.2089f, 16.5637f, 15.8077f, 16.4238f, 15.4658f)
                lineTo(16.3789f, 15.3742f)
                lineTo(15.8766f, 14.5041f)
                lineTo(16.7519f, 14.5049f)
                lineTo(16.8537f, 14.4981f)
                curveTo(17.1865f, 14.453f, 17.4499f, 14.1895f, 17.495f, 13.8567f)
                lineTo(17.5019f, 13.7549f)
                lineTo(17.495f, 13.6532f)
                curveTo(17.4499f, 13.3204f, 17.1865f, 13.0569f, 16.8537f, 13.0118f)
                lineTo(16.7519f, 13.0049f)
                lineTo(15.0116f, 13.0041f)
                lineTo(13.2926f, 10.0241f)
                close()
                moveTo(13.2631f, 7.1015f)
                curveTo(12.9353f, 6.9099f, 12.522f, 6.9953f, 12.2945f, 7.2863f)
                lineTo(12.2372f, 7.3707f)
                lineTo(11.9965f, 7.7799f)
                lineTo(11.7634f, 7.3742f)
                lineTo(11.7066f, 7.2895f)
                curveTo(11.5033f, 7.0265f, 11.1485f, 6.9292f, 10.8399f, 7.0507f)
                lineTo(10.739f, 7.0994f)
                lineTo(10.6542f, 7.1562f)
                curveTo(10.3912f, 7.3596f, 10.294f, 7.7143f, 10.4155f, 8.0229f)
                lineTo(10.4641f, 8.1238f)
                lineTo(11.1265f, 9.2709f)
                lineTo(8.9456f, 13.0049f)
                lineTo(7.2516f, 13.0049f)
                lineTo(7.1498f, 13.0118f)
                curveTo(6.7837f, 13.0615f, 6.5016f, 13.3753f, 6.5016f, 13.7549f)
                curveTo(6.5016f, 14.1346f, 6.7837f, 14.4484f, 7.1498f, 14.4981f)
                lineTo(7.2516f, 14.5049f)
                lineTo(13.279f, 14.5048f)
                lineTo(12.414f, 13.0048f)
                lineTo(10.6826f, 13.0039f)
                lineTo(13.5324f, 8.1274f)
                lineTo(13.5778f, 8.036f)
                curveTo(13.7196f, 7.6949f, 13.591f, 7.293f, 13.2631f, 7.1015f)
                close()
            }
        }
        .build()
        return _appStore!!
    }

private var _appStore: ImageVector? = null
