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

public val FilledGroup.PhoneVerticalScroll: ImageVector
    get() {
        if (_phoneVerticalScroll != null) {
            return _phoneVerticalScroll!!
        }
        _phoneVerticalScroll = Builder(name = "PhoneVerticalScroll", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 2.0f)
                curveTo(16.9926f, 2.0f, 18.0f, 3.0074f, 18.0f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.9926f, 16.9926f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0074f, 7.0074f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(13.7144f, 13.475f)
                lineTo(11.9997f, 15.2246f)
                lineTo(10.2824f, 13.4747f)
                curveTo(9.9922f, 13.179f, 9.5174f, 13.1746f, 9.2218f, 13.4647f)
                curveTo(8.9261f, 13.7548f, 8.9216f, 14.2297f, 9.2118f, 14.5253f)
                lineTo(11.4647f, 16.8211f)
                curveTo(11.7588f, 17.1208f, 12.2417f, 17.1207f, 12.5356f, 16.8208f)
                lineTo(14.7856f, 14.525f)
                curveTo(15.0756f, 14.2291f, 15.0708f, 13.7543f, 14.775f, 13.4644f)
                curveTo(14.4791f, 13.1744f, 14.0043f, 13.1792f, 13.7144f, 13.475f)
                close()
                moveTo(14.7856f, 9.5208f)
                lineTo(12.5356f, 7.225f)
                curveTo(12.2684f, 6.9524f, 11.8451f, 6.9275f, 11.5493f, 7.1504f)
                lineTo(11.4647f, 7.2247f)
                lineTo(9.2118f, 9.5205f)
                curveTo(8.9216f, 9.8161f, 8.9261f, 10.291f, 9.2218f, 10.5811f)
                curveTo(9.4905f, 10.8448f, 9.9074f, 10.8651f, 10.1989f, 10.6445f)
                lineTo(10.2824f, 10.5711f)
                lineTo(11.9997f, 8.8211f)
                lineTo(13.7144f, 10.5708f)
                curveTo(14.0043f, 10.8666f, 14.4791f, 10.8714f, 14.775f, 10.5814f)
                curveTo(15.0439f, 10.3179f, 15.0723f, 9.9015f, 14.8574f, 9.6057f)
                lineTo(14.7856f, 9.5208f)
                lineTo(12.5356f, 7.225f)
                lineTo(14.7856f, 9.5208f)
                close()
            }
        }
        .build()
        return _phoneVerticalScroll!!
    }

private var _phoneVerticalScroll: ImageVector? = null
