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

public val RegularGroup.PersonTag: ImageVector
    get() {
        if (_personTag != null) {
            return _personTag!!
        }
        _personTag = Builder(name = "PersonTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9981f, 13.9956f)
                verticalLineTo(15.4956f)
                horizontalLineTo(4.2493f)
                curveTo(3.8357f, 15.4956f, 3.5003f, 15.8309f, 3.5003f, 16.2445f)
                verticalLineTo(16.8222f)
                curveTo(3.5003f, 17.3579f, 3.6915f, 17.876f, 4.0394f, 18.2834f)
                curveTo(5.293f, 19.7511f, 7.2593f, 20.4969f, 9.9981f, 20.4969f)
                curveTo(11.104f, 20.4969f, 12.0842f, 20.3753f, 12.9427f, 20.1337f)
                lineTo(14.1138f, 21.3257f)
                curveTo(12.9335f, 21.7742f, 11.5592f, 21.997f, 9.9981f, 21.997f)
                curveTo(6.8516f, 21.997f, 4.4651f, 21.0918f, 2.8985f, 19.2575f)
                curveTo(2.3186f, 18.5785f, 2.0f, 17.715f, 2.0f, 16.8222f)
                verticalLineTo(16.2445f)
                curveTo(2.0f, 15.0025f, 3.0071f, 13.9956f, 4.2493f, 13.9956f)
                horizontalLineTo(10.9981f)
                close()
                moveTo(14.9992f, 7.0001f)
                curveTo(14.9992f, 4.2386f, 12.7601f, 2.0f, 9.9981f, 2.0f)
                curveTo(7.2361f, 2.0f, 4.9971f, 4.2386f, 4.9971f, 7.0001f)
                curveTo(4.9971f, 9.7616f, 7.2361f, 12.0003f, 9.9981f, 12.0003f)
                curveTo(12.7601f, 12.0003f, 14.9992f, 9.7616f, 14.9992f, 7.0001f)
                close()
                moveTo(6.4974f, 7.0001f)
                curveTo(6.4974f, 5.0671f, 8.0647f, 3.5f, 9.9981f, 3.5f)
                curveTo(11.9315f, 3.5f, 13.4988f, 5.0671f, 13.4988f, 7.0001f)
                curveTo(13.4988f, 8.9332f, 11.9315f, 10.5002f, 9.9981f, 10.5002f)
                curveTo(8.0647f, 10.5002f, 6.4974f, 8.9332f, 6.4974f, 7.0001f)
                close()
                moveTo(16.5713f, 22.3999f)
                lineTo(12.5704f, 18.3277f)
                curveTo(12.2036f, 17.9544f, 11.9983f, 17.4528f, 11.9983f, 16.9305f)
                verticalLineTo(13.994f)
                curveTo(11.9983f, 12.892f, 12.8942f, 11.9986f, 14.0001f, 11.9978f)
                lineTo(16.9178f, 11.9958f)
                curveTo(17.4457f, 11.9954f, 17.9525f, 12.2026f, 18.328f, 12.5725f)
                lineTo(22.4045f, 16.5867f)
                curveTo(23.1937f, 17.3639f, 23.1992f, 18.632f, 22.4166f, 19.4154f)
                lineTo(19.4234f, 22.4121f)
                curveTo(18.6356f, 23.2007f, 17.3527f, 23.1953f, 16.5713f, 22.3999f)
                close()
                moveTo(14.9952f, 15.9957f)
                curveTo(15.5469f, 15.9957f, 15.9941f, 15.548f, 15.9941f, 14.9957f)
                curveTo(15.9941f, 14.4434f, 15.5469f, 13.9957f, 14.9952f, 13.9957f)
                curveTo(14.4435f, 13.9957f, 13.9963f, 14.4434f, 13.9963f, 14.9957f)
                curveTo(13.9963f, 15.548f, 14.4435f, 15.9957f, 14.9952f, 15.9957f)
                close()
            }
        }
        .build()
        return _personTag!!
    }

private var _personTag: ImageVector? = null
