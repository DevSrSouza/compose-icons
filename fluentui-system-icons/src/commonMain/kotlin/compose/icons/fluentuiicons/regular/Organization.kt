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

public val RegularGroup.Organization: ImageVector
    get() {
        if (_organization != null) {
            return _organization!!
        }
        _organization = Builder(name = "Organization", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7498f, 1.998f)
                curveTo(9.6775f, 1.998f, 7.9976f, 3.678f, 7.9976f, 5.7503f)
                curveTo(7.9976f, 7.5659f, 9.287f, 9.0802f, 11.0f, 9.4277f)
                verticalLineTo(11.5003f)
                horizontalLineTo(7.75f)
                curveTo(6.5074f, 11.5003f, 5.5f, 12.5077f, 5.5f, 13.7503f)
                verticalLineTo(14.5757f)
                curveTo(3.7882f, 14.9241f, 2.5f, 16.4379f, 2.5f, 18.2526f)
                curveTo(2.5f, 20.3249f, 4.18f, 22.0049f, 6.2523f, 22.0049f)
                curveTo(8.3246f, 22.0049f, 10.0046f, 20.3249f, 10.0046f, 18.2526f)
                curveTo(10.0046f, 16.4363f, 8.7141f, 14.9214f, 7.0f, 14.5748f)
                verticalLineTo(13.7503f)
                curveTo(7.0f, 13.3361f, 7.3358f, 13.0003f, 7.75f, 13.0003f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 13.0003f, 16.5f, 13.3361f, 16.5f, 13.7503f)
                verticalLineTo(14.5757f)
                curveTo(14.7882f, 14.9241f, 13.5f, 16.4379f, 13.5f, 18.2526f)
                curveTo(13.5f, 20.3249f, 15.18f, 22.0049f, 17.2523f, 22.0049f)
                curveTo(19.3246f, 22.0049f, 21.0046f, 20.3249f, 21.0046f, 18.2526f)
                curveTo(21.0046f, 16.4363f, 19.7141f, 14.9214f, 18.0f, 14.5748f)
                verticalLineTo(13.7503f)
                curveTo(18.0f, 12.5077f, 16.9926f, 11.5003f, 15.75f, 11.5003f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.4276f)
                curveTo(14.2129f, 9.0801f, 15.5021f, 7.5658f, 15.5021f, 5.7503f)
                curveTo(15.5021f, 3.678f, 13.8222f, 1.998f, 11.7498f, 1.998f)
                close()
                moveTo(9.4976f, 5.7503f)
                curveTo(9.4976f, 4.5064f, 10.5059f, 3.498f, 11.7498f, 3.498f)
                curveTo(12.9937f, 3.498f, 14.0021f, 4.5064f, 14.0021f, 5.7503f)
                curveTo(14.0021f, 6.9942f, 12.9937f, 8.0026f, 11.7498f, 8.0026f)
                curveTo(10.5059f, 8.0026f, 9.4976f, 6.9942f, 9.4976f, 5.7503f)
                close()
                moveTo(4.0f, 18.2526f)
                curveTo(4.0f, 17.0087f, 5.0084f, 16.0003f, 6.2523f, 16.0003f)
                curveTo(7.4962f, 16.0003f, 8.5046f, 17.0087f, 8.5046f, 18.2526f)
                curveTo(8.5046f, 19.4965f, 7.4962f, 20.5049f, 6.2523f, 20.5049f)
                curveTo(5.0084f, 20.5049f, 4.0f, 19.4965f, 4.0f, 18.2526f)
                close()
                moveTo(17.2523f, 16.0003f)
                curveTo(18.4962f, 16.0003f, 19.5046f, 17.0087f, 19.5046f, 18.2526f)
                curveTo(19.5046f, 19.4965f, 18.4962f, 20.5049f, 17.2523f, 20.5049f)
                curveTo(16.0084f, 20.5049f, 15.0f, 19.4965f, 15.0f, 18.2526f)
                curveTo(15.0f, 17.0087f, 16.0084f, 16.0003f, 17.2523f, 16.0003f)
                close()
            }
        }
        .build()
        return _organization!!
    }

private var _organization: ImageVector? = null
