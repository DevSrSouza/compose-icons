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

public val MaterialDesignIcons.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9f, 12.0f)
                curveTo(3.9f, 10.29f, 5.29f, 8.9f, 7.0f, 8.9f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.1f)
                horizontalLineTo(7.0f)
                curveTo(5.29f, 15.1f, 3.9f, 13.71f, 3.9f, 12.0f)
                moveTo(8.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.9f)
                horizontalLineTo(17.0f)
                curveTo(18.71f, 8.9f, 20.1f, 10.29f, 20.1f, 12.0f)
                curveTo(20.1f, 13.71f, 18.71f, 15.1f, 17.0f, 15.1f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 7.0f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
