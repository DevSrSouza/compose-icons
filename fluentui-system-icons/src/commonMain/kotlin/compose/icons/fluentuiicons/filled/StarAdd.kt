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

public val FilledGroup.StarAdd: ImageVector
    get() {
        if (_starAdd != null) {
            return _starAdd!!
        }
        _starAdd = Builder(name = "StarAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7878f, 3.1021f)
                curveTo(11.283f, 2.0988f, 12.7138f, 2.0988f, 13.209f, 3.1021f)
                lineTo(15.567f, 7.8799f)
                lineTo(20.8395f, 8.646f)
                curveTo(21.9468f, 8.8069f, 22.3889f, 10.1677f, 21.5877f, 10.9487f)
                lineTo(20.682f, 11.8315f)
                curveTo(19.741f, 11.3018f, 18.6548f, 10.9996f, 17.498f, 10.9996f)
                curveTo(13.9082f, 10.9996f, 10.998f, 13.9098f, 10.998f, 17.4996f)
                curveTo(10.998f, 18.1103f, 11.0823f, 18.7013f, 11.2397f, 19.2616f)
                lineTo(7.2825f, 21.342f)
                curveTo(6.2921f, 21.8627f, 5.1346f, 21.0217f, 5.3237f, 19.9189f)
                lineTo(6.2244f, 14.6676f)
                lineTo(2.4092f, 10.9487f)
                curveTo(1.6079f, 10.1677f, 2.0501f, 8.8069f, 3.1574f, 8.646f)
                lineTo(8.4299f, 7.8799f)
                lineTo(10.7878f, 3.1021f)
                close()
                moveTo(22.998f, 17.4996f)
                curveTo(22.998f, 14.462f, 20.5356f, 11.9996f, 17.498f, 11.9996f)
                curveTo(14.4605f, 11.9996f, 11.998f, 14.462f, 11.998f, 17.4996f)
                curveTo(11.998f, 20.5372f, 14.4605f, 22.9996f, 17.498f, 22.9996f)
                curveTo(20.5356f, 22.9996f, 22.998f, 20.5372f, 22.998f, 17.4996f)
                close()
                moveTo(17.9987f, 17.9996f)
                lineTo(17.9992f, 20.5031f)
                curveTo(17.9992f, 20.7793f, 17.7753f, 21.0031f, 17.4992f, 21.0031f)
                curveTo(17.223f, 21.0031f, 16.9992f, 20.7793f, 16.9992f, 20.5031f)
                lineTo(16.9987f, 17.9996f)
                horizontalLineTo(14.4936f)
                curveTo(14.2178f, 17.9996f, 13.9941f, 17.7758f, 13.9941f, 17.4996f)
                curveTo(13.9941f, 17.2235f, 14.2178f, 16.9996f, 14.4936f, 16.9996f)
                horizontalLineTo(16.9985f)
                lineTo(16.998f, 14.4989f)
                curveTo(16.998f, 14.2227f, 17.2219f, 13.9989f, 17.498f, 13.9989f)
                curveTo(17.7742f, 13.9989f, 17.998f, 14.2227f, 17.998f, 14.4989f)
                lineTo(17.9985f, 16.9996f)
                horizontalLineTo(20.4946f)
                curveTo(20.7705f, 16.9996f, 20.9941f, 17.2235f, 20.9941f, 17.4996f)
                curveTo(20.9941f, 17.7758f, 20.7705f, 17.9996f, 20.4946f, 17.9996f)
                horizontalLineTo(17.9987f)
                close()
            }
        }
        .build()
        return _starAdd!!
    }

private var _starAdd: ImageVector? = null
