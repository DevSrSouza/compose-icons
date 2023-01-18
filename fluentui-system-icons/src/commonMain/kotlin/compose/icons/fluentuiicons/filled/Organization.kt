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

public val FilledGroup.Organization: ImageVector
    get() {
        if (_organization != null) {
            return _organization!!
        }
        _organization = Builder(name = "Organization", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9976f, 5.7503f)
                curveTo(7.9976f, 3.678f, 9.6775f, 1.998f, 11.7498f, 1.998f)
                curveTo(13.8222f, 1.998f, 15.5021f, 3.678f, 15.5021f, 5.7503f)
                curveTo(15.5021f, 7.5658f, 14.2129f, 9.0801f, 12.5f, 9.4276f)
                verticalLineTo(11.5003f)
                horizontalLineTo(15.75f)
                curveTo(16.9926f, 11.5003f, 18.0f, 12.5077f, 18.0f, 13.7503f)
                verticalLineTo(14.5748f)
                curveTo(19.7141f, 14.9214f, 21.0046f, 16.4363f, 21.0046f, 18.2526f)
                curveTo(21.0046f, 20.3249f, 19.3246f, 22.0049f, 17.2523f, 22.0049f)
                curveTo(15.18f, 22.0049f, 13.5f, 20.3249f, 13.5f, 18.2526f)
                curveTo(13.5f, 16.4379f, 14.7882f, 14.9241f, 16.5f, 14.5757f)
                verticalLineTo(13.7503f)
                curveTo(16.5f, 13.3361f, 16.1642f, 13.0003f, 15.75f, 13.0003f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 13.0003f, 7.0f, 13.3361f, 7.0f, 13.7503f)
                verticalLineTo(14.5748f)
                curveTo(8.7141f, 14.9214f, 10.0046f, 16.4363f, 10.0046f, 18.2526f)
                curveTo(10.0046f, 20.3249f, 8.3246f, 22.0049f, 6.2523f, 22.0049f)
                curveTo(4.18f, 22.0049f, 2.5f, 20.3249f, 2.5f, 18.2526f)
                curveTo(2.5f, 16.4379f, 3.7882f, 14.9241f, 5.5f, 14.5757f)
                verticalLineTo(13.7503f)
                curveTo(5.5f, 12.5077f, 6.5074f, 11.5003f, 7.75f, 11.5003f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.4277f)
                curveTo(9.287f, 9.0802f, 7.9976f, 7.5659f, 7.9976f, 5.7503f)
                close()
            }
        }
        .build()
        return _organization!!
    }

private var _organization: ImageVector? = null
