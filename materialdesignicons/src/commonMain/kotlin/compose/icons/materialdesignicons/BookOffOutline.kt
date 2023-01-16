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

public val MaterialDesignIcons.BookOffOutline: ImageVector
    get() {
        if (_bookOffOutline != null) {
            return _bookOffOutline!!
        }
        _bookOffOutline = Builder(name = "BookOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.8f)
                lineTo(4.0f, 16.8f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.89f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(18.24f, 2.0f, 18.47f, 2.04f, 18.68f, 2.12f)
                lineTo(16.8f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.8f)
                lineTo(10.79f, 10.0f)
                lineTo(10.5f, 9.75f)
                lineTo(8.0f, 12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.8f)
                moveTo(22.89f, 3.0f)
                lineTo(20.0f, 5.89f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.11f, 19.11f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.42f, 22.0f, 4.9f, 21.75f, 4.54f, 21.35f)
                lineTo(3.16f, 22.73f)
                lineTo(1.89f, 21.46f)
                lineTo(21.61f, 1.73f)
                lineTo(22.89f, 3.0f)
                moveTo(18.0f, 7.89f)
                lineTo(6.0f, 19.89f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.89f)
                close()
            }
        }
        .build()
        return _bookOffOutline!!
    }

private var _bookOffOutline: ImageVector? = null
