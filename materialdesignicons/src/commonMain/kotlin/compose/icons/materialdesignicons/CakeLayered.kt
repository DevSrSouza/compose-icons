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

public val MaterialDesignIcons.CakeLayered: ImageVector
    get() {
        if (_cakeLayered != null) {
            return _cakeLayered!!
        }
        _cakeLayered = Builder(name = "CakeLayered", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 15.89f, 20.1f, 15.0f, 19.0f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                curveTo(18.0f, 10.89f, 17.1f, 10.0f, 16.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 10.0f, 6.0f, 10.89f, 6.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 15.0f, 3.0f, 15.89f, 3.0f, 17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                moveTo(12.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 5.0f)
                curveTo(14.0f, 4.62f, 13.9f, 4.27f, 13.71f, 3.97f)
                lineTo(12.0f, 1.0f)
                lineTo(10.28f, 3.97f)
                curveTo(10.1f, 4.27f, 10.0f, 4.62f, 10.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _cakeLayered!!
    }

private var _cakeLayered: ImageVector? = null
