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

public val MaterialDesignIcons.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 16.91f, 19.93f, 18.57f, 18.35f, 19.41f)
                lineTo(19.0f, 22.0f)
                horizontalLineTo(17.0f)
                lineTo(16.5f, 20.0f)
                curveTo(16.33f, 20.0f, 16.17f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(7.83f, 20.0f, 7.67f, 20.0f, 7.5f, 20.0f)
                lineTo(7.0f, 22.0f)
                horizontalLineTo(5.0f)
                lineTo(5.65f, 19.41f)
                curveTo(4.07f, 18.57f, 3.0f, 16.91f, 3.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 4.0f)
                curveTo(18.5f, 4.0f, 18.12f, 4.34f, 18.0f, 4.79f)
                curveTo(18.63f, 5.33f, 19.0f, 6.13f, 19.0f, 7.0f)
                horizontalLineTo(13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 4.0f)
                curveTo(16.06f, 4.0f, 16.11f, 4.0f, 16.17f, 4.0f)
                curveTo(16.58f, 2.84f, 17.69f, 2.0f, 19.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                moveTo(19.0f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 18.0f)
                horizontalLineTo(16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 15.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
