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

public val MaterialDesignIcons.ViewCarouselOutline: ImageVector
    get() {
        if (_viewCarouselOutline != null) {
            return _viewCarouselOutline!!
        }
        _viewCarouselOutline = Builder(name = "ViewCarouselOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                moveTo(7.0f, 19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                moveTo(9.0f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                moveTo(18.0f, 6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _viewCarouselOutline!!
    }

private var _viewCarouselOutline: ImageVector? = null
