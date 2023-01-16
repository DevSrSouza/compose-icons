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

public val MaterialDesignIcons.Airport: ImageVector
    get() {
        if (_airport != null) {
            return _airport!!
        }
        _airport = Builder(name = "Airport", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.97f, 5.92f)
                curveTo(14.83f, 5.41f, 14.3f, 5.1f, 13.79f, 5.24f)
                lineTo(10.39f, 6.15f)
                lineTo(5.95f, 2.03f)
                lineTo(4.72f, 2.36f)
                lineTo(7.38f, 6.95f)
                lineTo(4.19f, 7.8f)
                lineTo(2.93f, 6.82f)
                lineTo(2.0f, 7.07f)
                lineTo(3.66f, 9.95f)
                lineTo(14.28f, 7.11f)
                curveTo(14.8f, 6.96f, 15.1f, 6.43f, 14.97f, 5.92f)
                moveTo(21.0f, 10.0f)
                lineTo(20.0f, 12.0f)
                horizontalLineTo(15.0f)
                lineTo(14.0f, 10.0f)
                lineTo(15.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 10.0f)
                moveTo(22.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _airport!!
    }

private var _airport: ImageVector? = null
