package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Xing: ImageVector
    get() {
        if (_xing != null) {
            return _xing!!
        }
        _xing = Builder(name = "Xing", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.7f, 210.0f)
                curveToRelative(-1.8f, 3.3f, -25.2f, 44.4f, -70.1f, 123.5f)
                curveToRelative(-4.9f, 8.3f, -10.8f, 12.5f, -17.7f, 12.5f)
                horizontalLineTo(9.8f)
                curveToRelative(-7.7f, 0.0f, -12.1f, -7.5f, -8.5f, -14.4f)
                lineToRelative(69.0f, -121.3f)
                curveToRelative(0.2f, 0.0f, 0.2f, -0.1f, 0.0f, -0.3f)
                lineToRelative(-43.9f, -75.6f)
                curveToRelative(-4.3f, -7.8f, 0.3f, -14.1f, 8.5f, -14.1f)
                horizontalLineTo(100.0f)
                curveToRelative(7.3f, 0.0f, 13.3f, 4.1f, 18.0f, 12.2f)
                lineToRelative(44.7f, 77.5f)
                close()
                moveTo(382.6f, 46.1f)
                lineToRelative(-144.0f, 253.0f)
                verticalLineToRelative(0.3f)
                lineTo(330.2f, 466.0f)
                curveToRelative(3.9f, 7.1f, 0.2f, 14.1f, -8.5f, 14.1f)
                horizontalLineToRelative(-65.2f)
                curveToRelative(-7.6f, 0.0f, -13.6f, -4.0f, -18.0f, -12.2f)
                lineToRelative(-92.4f, -168.5f)
                curveToRelative(3.3f, -5.8f, 51.5f, -90.8f, 144.8f, -255.2f)
                curveToRelative(4.6f, -8.1f, 10.4f, -12.2f, 17.5f, -12.2f)
                horizontalLineToRelative(65.7f)
                curveToRelative(8.0f, 0.0f, 12.3f, 6.7f, 8.5f, 14.1f)
                close()
            }
        }
        .build()
        return _xing!!
    }

private var _xing: ImageVector? = null
