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

public val FilledGroup.DocumentFooter: ImageVector
    get() {
        if (_documentFooter != null) {
            return _documentFooter!!
        }
        _documentFooter = Builder(name = "DocumentFooter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.745f, 1.9961f)
                curveTo(18.9359f, 1.9961f, 19.9106f, 2.9213f, 19.9898f, 4.0921f)
                lineTo(19.995f, 4.2461f)
                verticalLineTo(19.7442f)
                curveTo(19.995f, 20.935f, 19.0698f, 21.9098f, 17.899f, 21.989f)
                lineTo(17.745f, 21.9942f)
                horizontalLineTo(6.2451f)
                curveTo(5.0542f, 21.9942f, 4.0795f, 21.069f, 4.0003f, 19.8982f)
                lineTo(3.9951f, 19.7442f)
                verticalLineTo(4.2461f)
                curveTo(3.9951f, 3.0552f, 4.9203f, 2.0805f, 6.0911f, 2.0013f)
                lineTo(6.2451f, 1.9961f)
                horizontalLineTo(17.745f)
                close()
                moveTo(8.5002f, 16.0003f)
                curveTo(7.6718f, 16.0003f, 7.0002f, 16.6719f, 7.0002f, 17.5003f)
                curveTo(7.0002f, 18.3287f, 7.6718f, 19.0003f, 8.5002f, 19.0003f)
                horizontalLineTo(15.5002f)
                curveTo(16.3287f, 19.0003f, 17.0002f, 18.3287f, 17.0002f, 17.5003f)
                curveTo(17.0002f, 16.6719f, 16.3287f, 16.0003f, 15.5002f, 16.0003f)
                horizontalLineTo(8.5002f)
                close()
            }
        }
        .build()
        return _documentFooter!!
    }

private var _documentFooter: ImageVector? = null
