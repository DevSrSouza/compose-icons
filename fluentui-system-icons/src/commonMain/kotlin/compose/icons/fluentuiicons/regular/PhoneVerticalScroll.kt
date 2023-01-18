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

public val RegularGroup.PhoneVerticalScroll: ImageVector
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
                moveTo(15.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 3.5f, 7.5f, 3.8358f, 7.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.1642f, 7.8358f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 20.5f, 16.5f, 20.1642f, 16.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(16.5f, 3.8358f, 16.1642f, 3.5f, 15.75f, 3.5f)
                close()
                moveTo(14.775f, 13.4644f)
                curveTo(15.0439f, 13.7279f, 15.0723f, 14.1443f, 14.8574f, 14.4401f)
                lineTo(14.7856f, 14.525f)
                lineTo(12.5356f, 16.8208f)
                curveTo(12.2684f, 17.0934f, 11.8451f, 17.1183f, 11.5493f, 16.8954f)
                lineTo(11.4647f, 16.8211f)
                lineTo(9.2118f, 14.5253f)
                curveTo(8.9216f, 14.2297f, 8.9261f, 13.7548f, 9.2218f, 13.4647f)
                curveTo(9.4905f, 13.201f, 9.9074f, 13.1807f, 10.1989f, 13.4013f)
                lineTo(10.2824f, 13.4747f)
                lineTo(11.9997f, 15.2246f)
                lineTo(13.7144f, 13.475f)
                curveTo(14.0043f, 13.1792f, 14.4791f, 13.1744f, 14.775f, 13.4644f)
                close()
                moveTo(12.5356f, 7.225f)
                lineTo(14.7856f, 9.5208f)
                curveTo(15.0756f, 9.8167f, 15.0708f, 10.2915f, 14.775f, 10.5814f)
                curveTo(14.4791f, 10.8714f, 14.0043f, 10.8666f, 13.7144f, 10.5708f)
                lineTo(11.9997f, 8.8211f)
                lineTo(10.2824f, 10.5711f)
                curveTo(9.9922f, 10.8667f, 9.5174f, 10.8712f, 9.2218f, 10.5811f)
                curveTo(8.9261f, 10.291f, 8.9216f, 9.8161f, 9.2118f, 9.5205f)
                lineTo(11.4647f, 7.2247f)
                curveTo(11.7588f, 6.925f, 12.2417f, 6.9251f, 12.5356f, 7.225f)
                close()
            }
        }
        .build()
        return _phoneVerticalScroll!!
    }

private var _phoneVerticalScroll: ImageVector? = null
