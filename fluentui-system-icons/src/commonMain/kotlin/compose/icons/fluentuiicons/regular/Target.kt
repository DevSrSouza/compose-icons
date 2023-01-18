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

public val RegularGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9982f, 14.0002f)
                curveTo(13.1027f, 14.0002f, 13.9982f, 13.1047f, 13.9982f, 12.0002f)
                curveTo(13.9982f, 10.8956f, 13.1027f, 10.0002f, 11.9982f, 10.0002f)
                curveTo(10.8936f, 10.0002f, 9.9982f, 10.8956f, 9.9982f, 12.0002f)
                curveTo(9.9982f, 13.1047f, 10.8936f, 14.0002f, 11.9982f, 14.0002f)
                close()
                moveTo(5.9982f, 12.0002f)
                curveTo(5.9982f, 8.6864f, 8.6845f, 6.0002f, 11.9982f, 6.0002f)
                curveTo(15.3119f, 6.0002f, 17.9982f, 8.6864f, 17.9982f, 12.0002f)
                curveTo(17.9982f, 15.3139f, 15.3119f, 18.0002f, 11.9982f, 18.0002f)
                curveTo(8.6845f, 18.0002f, 5.9982f, 15.3139f, 5.9982f, 12.0002f)
                close()
                moveTo(11.9982f, 7.5002f)
                curveTo(9.5129f, 7.5002f, 7.4982f, 9.5149f, 7.4982f, 12.0002f)
                curveTo(7.4982f, 14.4854f, 9.5129f, 16.5002f, 11.9982f, 16.5002f)
                curveTo(14.4834f, 16.5002f, 16.4982f, 14.4854f, 16.4982f, 12.0002f)
                curveTo(16.4982f, 9.5149f, 14.4834f, 7.5002f, 11.9982f, 7.5002f)
                close()
                moveTo(1.9961f, 12.0001f)
                curveTo(1.9961f, 6.4761f, 6.4742f, 1.998f, 11.9982f, 1.998f)
                curveTo(17.5222f, 1.998f, 22.0003f, 6.4761f, 22.0003f, 12.0001f)
                curveTo(22.0003f, 17.5242f, 17.5222f, 22.0022f, 11.9982f, 22.0022f)
                curveTo(6.4742f, 22.0022f, 1.9961f, 17.5242f, 1.9961f, 12.0001f)
                close()
                moveTo(11.9982f, 3.498f)
                curveTo(7.3026f, 3.498f, 3.4961f, 7.3046f, 3.4961f, 12.0001f)
                curveTo(3.4961f, 16.6957f, 7.3026f, 20.5022f, 11.9982f, 20.5022f)
                curveTo(16.6938f, 20.5022f, 20.5003f, 16.6957f, 20.5003f, 12.0001f)
                curveTo(20.5003f, 7.3046f, 16.6938f, 3.498f, 11.9982f, 3.498f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
