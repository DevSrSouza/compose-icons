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

public val MaterialDesignIcons.HomeModern: ImageVector
    get() {
        if (_homeModern != null) {
            return _homeModern!!
        }
        _homeModern = Builder(name = "HomeModern", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 21.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 6.0f)
                lineTo(16.0f, 3.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                moveTo(14.0f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                moveTo(8.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                moveTo(12.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _homeModern!!
    }

private var _homeModern: ImageVector? = null
