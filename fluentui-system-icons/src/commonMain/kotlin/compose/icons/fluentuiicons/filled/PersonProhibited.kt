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

public val FilledGroup.PersonProhibited: ImageVector
    get() {
        if (_personProhibited != null) {
            return _personProhibited!!
        }
        _personProhibited = Builder(name = "PersonProhibited", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5004f, 12.0003f)
                curveTo(20.5379f, 12.0003f, 23.0004f, 14.4627f, 23.0004f, 17.5003f)
                curveTo(23.0004f, 20.5378f, 20.5379f, 23.0003f, 17.5004f, 23.0003f)
                curveTo(14.4628f, 23.0003f, 12.0004f, 20.5378f, 12.0004f, 17.5003f)
                curveTo(12.0004f, 14.4627f, 14.4628f, 12.0003f, 17.5004f, 12.0003f)
                close()
                moveTo(12.023f, 13.999f)
                curveTo(11.3757f, 15.0096f, 11.0004f, 16.2111f, 11.0004f, 17.5003f)
                curveTo(11.0004f, 19.144f, 11.6105f, 20.6452f, 12.6166f, 21.7898f)
                curveTo(11.8153f, 21.9316f, 10.9423f, 22.0013f, 10.0004f, 22.0013f)
                curveTo(7.1109f, 22.0013f, 4.872f, 21.3447f, 3.3092f, 20.001f)
                curveTo(2.4806f, 19.2887f, 2.0039f, 18.2503f, 2.0039f, 17.1575f)
                verticalLineTo(16.2502f)
                curveTo(2.0039f, 15.0075f, 3.0113f, 14.0002f, 4.2539f, 14.0002f)
                lineTo(12.023f, 13.999f)
                close()
                moveTo(20.8096f, 15.2525f)
                lineTo(15.2526f, 20.8095f)
                curveTo(15.8932f, 21.2454f, 16.667f, 21.5003f, 17.5004f, 21.5003f)
                curveTo(19.7095f, 21.5003f, 21.5004f, 19.7094f, 21.5004f, 17.5003f)
                curveTo(21.5004f, 16.6669f, 21.2455f, 15.8931f, 20.8096f, 15.2525f)
                close()
                moveTo(17.5004f, 13.5003f)
                curveTo(15.2912f, 13.5003f, 13.5004f, 15.2911f, 13.5004f, 17.5003f)
                curveTo(13.5004f, 18.3336f, 13.7552f, 19.1074f, 14.1912f, 19.748f)
                lineTo(19.7481f, 14.1911f)
                curveTo(19.1075f, 13.7551f, 18.3337f, 13.5003f, 17.5004f, 13.5003f)
                close()
                moveTo(10.0004f, 2.0049f)
                curveTo(12.7618f, 2.0049f, 15.0004f, 4.2435f, 15.0004f, 7.0049f)
                curveTo(15.0004f, 9.7663f, 12.7618f, 12.0049f, 10.0004f, 12.0049f)
                curveTo(7.2389f, 12.0049f, 5.0004f, 9.7663f, 5.0004f, 7.0049f)
                curveTo(5.0004f, 4.2435f, 7.2389f, 2.0049f, 10.0004f, 2.0049f)
                close()
            }
        }
        .build()
        return _personProhibited!!
    }

private var _personProhibited: ImageVector? = null
