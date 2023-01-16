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

public val MaterialDesignIcons.IvBag: ImageVector
    get() {
        if (_ivBag != null) {
            return _ivBag!!
        }
        _ivBag = Builder(name = "IvBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 1.0f)
                horizontalLineTo(10.0f)
                curveTo(5.0f, 1.0f, 5.0f, 3.0f, 5.0f, 3.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 15.0f, 5.0f, 17.0f, 10.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 21.21f, 11.8f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                curveTo(13.19f, 21.0f, 13.0f, 20.45f, 13.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 17.0f, 19.0f, 15.0f, 19.0f, 15.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 3.0f, 19.0f, 1.0f, 14.0f, 1.0f)
                moveTo(17.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                moveTo(17.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.5f)
                curveTo(7.3f, 3.32f, 8.13f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(15.88f, 3.0f, 16.7f, 3.32f, 17.0f, 3.5f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _ivBag!!
    }

private var _ivBag: ImageVector? = null
