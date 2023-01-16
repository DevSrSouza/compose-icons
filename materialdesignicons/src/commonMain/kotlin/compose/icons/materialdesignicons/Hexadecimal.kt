package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.Hexadecimal: ImageVector
    get() {
        if (_hexadecimal != null) {
            return _hexadecimal!!
        }
        _hexadecimal = Builder(name = "Hexadecimal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                curveTo(5.9f, 7.0f, 5.0f, 7.9f, 5.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 16.11f, 5.9f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(10.11f, 17.0f, 11.0f, 16.11f, 11.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(11.0f, 7.9f, 10.11f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                moveTo(17.6f, 17.0f)
                lineTo(15.5f, 14.9f)
                lineTo(13.4f, 17.0f)
                lineTo(12.0f, 15.6f)
                lineTo(14.1f, 13.5f)
                lineTo(12.0f, 11.4f)
                lineTo(13.4f, 10.0f)
                lineTo(15.5f, 12.1f)
                lineTo(17.6f, 10.0f)
                lineTo(19.0f, 11.4f)
                lineTo(16.9f, 13.5f)
                lineTo(19.0f, 15.6f)
                lineTo(17.6f, 17.0f)
                close()
            }
        }
        .build()
        return _hexadecimal!!
    }

private var _hexadecimal: ImageVector? = null
