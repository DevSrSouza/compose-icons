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

public val MaterialDesignIcons.LinkBox: ImageVector
    get() {
        if (_linkBox != null) {
            return _linkBox!!
        }
        _linkBox = Builder(name = "LinkBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                moveTo(11.0f, 16.0f)
                horizontalLineTo(10.0f)
                curveTo(8.39f, 16.0f, 6.0f, 14.94f, 6.0f, 12.0f)
                curveTo(6.0f, 9.07f, 8.39f, 8.0f, 10.0f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                curveTo(9.54f, 10.0f, 8.0f, 10.17f, 8.0f, 12.0f)
                curveTo(8.0f, 13.9f, 9.67f, 14.0f, 10.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                moveTo(15.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                curveTo(14.46f, 14.0f, 16.0f, 13.83f, 16.0f, 12.0f)
                curveTo(16.0f, 10.1f, 14.33f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                curveTo(15.61f, 8.0f, 18.0f, 9.07f, 18.0f, 12.0f)
                curveTo(18.0f, 14.94f, 15.61f, 16.0f, 14.0f, 16.0f)
                close()
            }
        }
        .build()
        return _linkBox!!
    }

private var _linkBox: ImageVector? = null
