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

public val RegularGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.25f)
                curveTo(12.0f, 1.8358f, 11.6642f, 1.5f, 11.25f, 1.5f)
                curveTo(10.8358f, 1.5f, 10.5f, 1.8358f, 10.5f, 2.25f)
                verticalLineTo(3.4995f)
                curveTo(10.1929f, 3.6078f, 9.9046f, 3.7847f, 9.659f, 4.0304f)
                lineTo(2.7803f, 10.909f)
                curveTo(1.9017f, 11.7877f, 1.9017f, 13.2123f, 2.7803f, 14.091f)
                lineTo(7.659f, 18.9697f)
                curveTo(8.5377f, 19.8484f, 9.9623f, 19.8484f, 10.841f, 18.9697f)
                lineTo(17.7197f, 12.091f)
                curveTo(18.5984f, 11.2123f, 18.5984f, 9.7877f, 17.7197f, 8.909f)
                lineTo(12.841f, 4.0304f)
                curveTo(12.5954f, 3.7847f, 12.3071f, 3.6078f, 12.0f, 3.4995f)
                verticalLineTo(2.25f)
                close()
                moveTo(3.841f, 11.9697f)
                lineTo(10.5f, 5.3107f)
                verticalLineTo(6.75f)
                curveTo(10.5f, 7.1642f, 10.8358f, 7.5f, 11.25f, 7.5f)
                curveTo(11.6642f, 7.5f, 12.0f, 7.1642f, 12.0f, 6.75f)
                verticalLineTo(5.3107f)
                lineTo(16.659f, 9.9697f)
                curveTo(16.9519f, 10.2626f, 16.9519f, 10.7375f, 16.659f, 11.0303f)
                lineTo(15.6894f, 12.0f)
                horizontalLineTo(3.8123f)
                curveTo(3.8215f, 11.9897f, 3.8311f, 11.9796f, 3.841f, 11.9697f)
                close()
                moveTo(4.3107f, 13.5f)
                horizontalLineTo(14.1894f)
                lineTo(9.7803f, 17.909f)
                curveTo(9.4874f, 18.2019f, 9.0126f, 18.2019f, 8.7197f, 17.909f)
                lineTo(4.3107f, 13.5f)
                close()
                moveTo(19.5212f, 13.6022f)
                curveTo(19.1922f, 12.9853f, 18.3079f, 12.9853f, 17.9788f, 13.6022f)
                lineTo(15.9706f, 17.3677f)
                curveTo(14.8516f, 19.4659f, 16.372f, 22.0f, 18.75f, 22.0f)
                curveTo(21.128f, 22.0f, 22.6485f, 19.4659f, 21.5294f, 17.3677f)
                lineTo(19.5212f, 13.6022f)
                close()
                moveTo(17.2941f, 18.0735f)
                lineTo(18.75f, 15.3438f)
                lineTo(20.2059f, 18.0735f)
                curveTo(20.7921f, 19.1726f, 19.9956f, 20.5f, 18.75f, 20.5f)
                curveTo(17.5044f, 20.5f, 16.708f, 19.1726f, 17.2941f, 18.0735f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
