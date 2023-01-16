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

public val MaterialDesignIcons.Hail: ImageVector
    get() {
        if (_hail != null) {
            return _hail!!
        }
        _hail = Builder(name = "Hail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                moveTo(19.0f, 2.39f)
                curveTo(18.92f, 3.86f, 18.55f, 5.13f, 17.86f, 6.21f)
                curveTo(17.17f, 7.29f, 16.22f, 8.0f, 15.0f, 8.39f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.08f)
                curveTo(8.72f, 10.17f, 8.5f, 10.28f, 8.39f, 10.41f)
                curveTo(7.45f, 11.16f, 7.0f, 12.19f, 7.0f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.5f)
                curveTo(5.0f, 11.53f, 5.72f, 9.94f, 7.13f, 8.72f)
                curveTo(8.53f, 7.56f, 10.16f, 7.0f, 12.0f, 7.0f)
                curveTo(13.41f, 7.0f, 14.56f, 6.64f, 15.47f, 5.95f)
                curveTo(16.5f, 5.11f, 17.0f, 3.95f, 17.0f, 2.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(2.39f)
                moveTo(12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _hail!!
    }

private var _hail: ImageVector? = null
