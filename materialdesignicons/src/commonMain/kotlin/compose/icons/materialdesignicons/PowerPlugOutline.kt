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

public val MaterialDesignIcons.PowerPlugOutline: ImageVector
    get() {
        if (_powerPlugOutline != null) {
            return _powerPlugOutline!!
        }
        _powerPlugOutline = Builder(name = "PowerPlugOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 7.0f, 6.0f, 8.0f, 6.0f, 9.0f)
                verticalLineTo(14.5f)
                lineTo(9.5f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(18.0f)
                lineTo(18.0f, 14.5f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 8.0f, 17.0f, 7.0f, 16.0f, 7.0f)
                moveTo(16.0f, 13.67f)
                lineTo(13.09f, 16.59f)
                lineTo(12.67f, 17.0f)
                horizontalLineTo(11.33f)
                lineTo(10.92f, 16.59f)
                lineTo(8.0f, 13.67f)
                verticalLineTo(9.09f)
                curveTo(8.0f, 9.06f, 8.06f, 9.0f, 8.09f, 9.0f)
                horizontalLineTo(15.92f)
                curveTo(15.95f, 9.0f, 16.0f, 9.06f, 16.0f, 9.09f)
                verticalLineTo(13.67f)
                close()
            }
        }
        .build()
        return _powerPlugOutline!!
    }

private var _powerPlugOutline: ImageVector? = null
