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

public val MaterialDesignIcons.PowerPlugOffOutline: ImageVector
    get() {
        if (_powerPlugOffOutline != null) {
            return _powerPlugOffOutline!!
        }
        _powerPlugOffOutline = Builder(name = "PowerPlugOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(6.25f, 8.14f)
                curveTo(6.1f, 8.41f, 6.0f, 8.7f, 6.0f, 9.0f)
                verticalLineTo(14.5f)
                lineTo(9.5f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(18.0f)
                lineTo(15.31f, 17.2f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(13.09f, 16.59f)
                lineTo(12.67f, 17.0f)
                horizontalLineTo(11.33f)
                lineTo(10.92f, 16.59f)
                lineTo(8.0f, 13.67f)
                verticalLineTo(9.89f)
                lineTo(13.89f, 15.78f)
                lineTo(13.09f, 16.59f)
                moveTo(12.2f, 9.0f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 7.0f, 18.0f, 8.0f, 18.0f, 9.0f)
                verticalLineTo(14.5f)
                lineTo(17.85f, 14.65f)
                lineTo(16.0f, 12.8f)
                verticalLineTo(9.09f)
                curveTo(16.0f, 9.06f, 15.95f, 9.0f, 15.92f, 9.0f)
                horizontalLineTo(12.2f)
                moveTo(10.0f, 6.8f)
                lineTo(8.0f, 4.8f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.8f)
                close()
            }
        }
        .build()
        return _powerPlugOffOutline!!
    }

private var _powerPlugOffOutline: ImageVector? = null
