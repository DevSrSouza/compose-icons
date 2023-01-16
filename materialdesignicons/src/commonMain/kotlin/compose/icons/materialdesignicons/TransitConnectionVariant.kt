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

public val MaterialDesignIcons.TransitConnectionVariant: ImageVector
    get() {
        if (_transitConnectionVariant != null) {
            return _transitConnectionVariant!!
        }
        _transitConnectionVariant = Builder(name = "TransitConnectionVariant", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 9.84f, 13.3f, 9.0f, 12.0f, 9.0f)
                curveTo(10.7f, 9.0f, 9.6f, 9.84f, 9.18f, 11.0f)
                horizontalLineTo(6.0f)
                curveTo(5.67f, 11.0f, 4.0f, 10.9f, 4.0f, 9.0f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 6.17f, 5.54f, 6.0f, 6.0f, 6.0f)
                horizontalLineTo(16.18f)
                curveTo(16.6f, 7.16f, 17.7f, 8.0f, 19.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 2.0f)
                curveTo(17.7f, 2.0f, 16.6f, 2.84f, 16.18f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(4.39f, 4.0f, 2.0f, 5.06f, 2.0f, 8.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 11.94f, 4.39f, 13.0f, 6.0f, 13.0f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 14.16f, 10.7f, 15.0f, 12.0f, 15.0f)
                curveTo(13.3f, 15.0f, 14.4f, 14.16f, 14.82f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(18.33f, 13.0f, 20.0f, 13.1f, 20.0f, 15.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 17.83f, 18.46f, 18.0f, 18.0f, 18.0f)
                horizontalLineTo(7.82f)
                curveTo(7.4f, 16.84f, 6.3f, 16.0f, 5.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 22.0f)
                curveTo(6.3f, 22.0f, 7.4f, 21.16f, 7.82f, 20.0f)
                horizontalLineTo(18.0f)
                curveTo(19.61f, 20.0f, 22.0f, 18.93f, 22.0f, 16.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 12.07f, 19.61f, 11.0f, 18.0f, 11.0f)
                moveTo(19.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 4.0f)
                moveTo(5.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _transitConnectionVariant!!
    }

private var _transitConnectionVariant: ImageVector? = null
