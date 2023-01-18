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

public val FilledGroup.MailError: ImageVector
    get() {
        if (_mailError != null) {
            return _mailError!!
        }
        _mailError = Builder(name = "MailError", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.5f)
                curveTo(23.0f, 9.5376f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 14.4624f, 1.0f, 17.5f, 1.0f)
                curveTo(20.5376f, 1.0f, 23.0f, 3.4624f, 23.0f, 6.5f)
                close()
                moveTo(17.5f, 3.0f)
                curveTo(17.2239f, 3.0f, 17.0f, 3.2239f, 17.0f, 3.5f)
                verticalLineTo(7.5f)
                curveTo(17.0f, 7.7761f, 17.2239f, 8.0f, 17.5f, 8.0f)
                curveTo(17.7761f, 8.0f, 18.0f, 7.7761f, 18.0f, 7.5f)
                verticalLineTo(3.5f)
                curveTo(18.0f, 3.2239f, 17.7761f, 3.0f, 17.5f, 3.0f)
                close()
                moveTo(17.5f, 10.125f)
                curveTo(17.8452f, 10.125f, 18.125f, 9.8452f, 18.125f, 9.5f)
                curveTo(18.125f, 9.1548f, 17.8452f, 8.875f, 17.5f, 8.875f)
                curveTo(17.1548f, 8.875f, 16.875f, 9.1548f, 16.875f, 9.5f)
                curveTo(16.875f, 9.8452f, 17.1548f, 10.125f, 17.5f, 10.125f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(19.2465f, 13.0f, 20.8321f, 12.3112f, 22.0f, 11.1904f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.483f, 20.6435f, 19.8992f, 18.9344f, 19.9949f)
                lineTo(18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20.0f, 2.1007f, 18.6435f, 2.0051f, 16.9344f)
                lineTo(2.0f, 16.75f)
                verticalLineTo(8.608f)
                lineTo(11.652f, 13.6644f)
                curveTo(11.87f, 13.7785f, 12.13f, 13.7785f, 12.348f, 13.6644f)
                lineTo(14.7649f, 12.3983f)
                curveTo(15.5963f, 12.7844f, 16.523f, 13.0f, 17.5f, 13.0f)
                close()
                moveTo(5.25f, 4.0f)
                horizontalLineTo(11.4982f)
                curveTo(11.1772f, 4.7696f, 11.0f, 5.6141f, 11.0f, 6.5f)
                curveTo(11.0f, 8.4925f, 11.8966f, 10.2757f, 13.3083f, 11.468f)
                lineTo(12.0f, 12.1533f)
                lineTo(2.0162f, 6.9236f)
                curveTo(2.1739f, 5.3427f, 3.4643f, 4.0954f, 5.0641f, 4.0052f)
                lineTo(5.25f, 4.0f)
                close()
            }
        }
        .build()
        return _mailError!!
    }

private var _mailError: ImageVector? = null
