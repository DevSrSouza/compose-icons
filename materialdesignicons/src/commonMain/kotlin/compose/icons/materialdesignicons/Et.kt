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

public val MaterialDesignIcons.Et: ImageVector
    get() {
        if (_et != null) {
            return _et!!
        }
        _et = Builder(name = "Et", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.78f)
                lineTo(21.71f, 7.22f)
                curveTo(21.45f, 7.42f, 20.53f, 8.0f, 19.77f, 8.0f)
                curveTo(19.26f, 8.0f, 18.3f, 7.75f, 17.45f, 7.53f)
                curveTo(16.39f, 7.26f, 15.39f, 7.0f, 14.6f, 7.0f)
                curveTo(14.0f, 7.0f, 13.43f, 7.15f, 12.93f, 7.35f)
                curveTo(12.62f, 5.45f, 11.0f, 4.0f, 9.0f, 4.0f)
                curveTo(4.58f, 4.0f, 2.0f, 7.58f, 2.0f, 12.0f)
                curveTo(2.0f, 16.42f, 5.58f, 19.0f, 10.0f, 19.0f)
                curveTo(12.06f, 19.0f, 13.93f, 18.43f, 15.34f, 17.39f)
                lineTo(15.0f, 21.29f)
                lineTo(17.0f, 21.47f)
                lineTo(18.0f, 9.74f)
                curveTo(18.66f, 9.89f, 19.27f, 10.0f, 19.77f, 10.0f)
                curveTo(21.38f, 10.0f, 22.84f, 8.91f, 23.0f, 8.78f)
                moveTo(9.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 10.0f)
                horizontalLineTo(4.23f)
                curveTo(4.8f, 7.67f, 6.39f, 6.0f, 9.0f, 6.0f)
                moveTo(10.0f, 17.0f)
                curveTo(6.69f, 17.0f, 4.0f, 15.31f, 4.0f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(10.6f, 12.0f, 11.83f, 11.17f, 12.5f, 9.91f)
                verticalLineTo(9.91f)
                curveTo(12.76f, 9.71f, 13.85f, 9.0f, 14.6f, 9.0f)
                curveTo(14.94f, 9.0f, 15.5f, 9.11f, 16.05f, 9.25f)
                lineTo(15.65f, 13.89f)
                curveTo(14.82f, 15.95f, 12.6f, 17.0f, 10.0f, 17.0f)
                close()
            }
        }
        .build()
        return _et!!
    }

private var _et: ImageVector? = null
