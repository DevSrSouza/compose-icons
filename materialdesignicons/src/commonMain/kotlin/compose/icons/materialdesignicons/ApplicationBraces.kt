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

public val MaterialDesignIcons.ApplicationBraces: ImageVector
    get() {
        if (_applicationBraces != null) {
            return _applicationBraces!!
        }
        _applicationBraces = Builder(name = "ApplicationBraces", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 2.0f, 1.0f, 2.9f, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.1f, 1.9f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 22.0f, 23.0f, 21.1f, 23.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.9f, 22.1f, 2.0f, 21.0f, 2.0f)
                moveTo(11.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.5f)
                curveTo(9.0f, 13.6f, 8.1f, 14.5f, 7.0f, 14.5f)
                curveTo(8.1f, 14.5f, 9.0f, 15.4f, 9.0f, 16.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 20.0f, 7.0f, 19.1f, 7.0f, 18.0f)
                verticalLineTo(17.5f)
                curveTo(7.0f, 16.4f, 6.1f, 15.5f, 5.0f, 15.5f)
                verticalLineTo(13.5f)
                curveTo(6.1f, 13.5f, 7.0f, 12.6f, 7.0f, 11.5f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 9.9f, 7.9f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                moveTo(19.0f, 15.5f)
                curveTo(17.9f, 15.5f, 17.0f, 16.4f, 17.0f, 17.5f)
                verticalLineTo(18.0f)
                curveTo(17.0f, 19.1f, 16.1f, 20.0f, 15.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.5f)
                curveTo(15.0f, 15.4f, 15.9f, 14.5f, 17.0f, 14.5f)
                curveTo(15.9f, 14.5f, 15.0f, 13.6f, 15.0f, 12.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1f, 9.0f, 17.0f, 9.9f, 17.0f, 11.0f)
                verticalLineTo(11.5f)
                curveTo(17.0f, 12.6f, 17.9f, 13.5f, 19.0f, 13.5f)
                verticalLineTo(15.5f)
                moveTo(21.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _applicationBraces!!
    }

private var _applicationBraces: ImageVector? = null
