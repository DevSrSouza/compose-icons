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

public val MaterialDesignIcons.BookMusic: ImageVector
    get() {
        if (_bookMusic != null) {
            return _bookMusic!!
        }
        _bookMusic = Builder(name = "BookMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.5f)
                curveTo(13.0f, 21.03f, 13.09f, 21.53f, 13.26f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.11f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.89f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                lineTo(9.5f, 7.5f)
                lineTo(12.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 2.0f, 20.0f, 2.89f, 20.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.11f)
                curveTo(14.5f, 16.57f, 13.0f, 18.36f, 13.0f, 20.5f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(18.21f)
                curveTo(18.19f, 18.07f, 17.86f, 18.0f, 17.5f, 18.0f)
                curveTo(16.12f, 18.0f, 15.0f, 19.12f, 15.0f, 20.5f)
                reflectiveCurveTo(16.12f, 23.0f, 17.5f, 23.0f)
                reflectiveCurveTo(20.0f, 21.88f, 20.0f, 20.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _bookMusic!!
    }

private var _bookMusic: ImageVector? = null
