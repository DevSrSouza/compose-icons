package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerDoubleDownRight: ImageVector
    get() {
        if (_cornerDoubleDownRight != null) {
            return _cornerDoubleDownRight!!
        }
        _cornerDoubleDownRight = Builder(name = "CornerDoubleDownRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6004f, 7.6792f)
                lineTo(7.6381f, 2.7419f)
                lineTo(2.7009f, 7.7042f)
                lineTo(4.1187f, 9.1148f)
                lineTo(6.5225f, 6.6989f)
                lineTo(6.5075f, 12.7348f)
                curveTo(6.5009f, 15.3857f, 8.6446f, 17.5401f, 11.2956f, 17.5467f)
                lineTo(17.224f, 17.5614f)
                lineTo(14.9855f, 19.8638f)
                lineTo(16.4195f, 21.258f)
                lineTo(21.299f, 16.239f)
                lineTo(16.2801f, 11.3595f)
                lineTo(14.8859f, 12.7934f)
                lineTo(17.3217f, 15.1616f)
                lineTo(11.3015f, 15.1467f)
                curveTo(9.9761f, 15.1434f, 8.9042f, 14.0662f, 8.9075f, 12.7407f)
                lineTo(8.9221f, 6.8408f)
                lineTo(11.1898f, 9.0969f)
                lineTo(12.6004f, 7.6792f)
                close()
            }
        }
        .build()
        return _cornerDoubleDownRight!!
    }

private var _cornerDoubleDownRight: ImageVector? = null
