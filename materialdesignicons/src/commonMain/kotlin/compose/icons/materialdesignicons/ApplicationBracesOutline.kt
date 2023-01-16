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

public val MaterialDesignIcons.ApplicationBracesOutline: ImageVector
    get() {
        if (_applicationBracesOutline != null) {
            return _applicationBracesOutline!!
        }
        _applicationBracesOutline = Builder(name = "ApplicationBracesOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
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
                moveTo(21.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                moveTo(9.0f, 8.0f)
                curveTo(7.9f, 8.0f, 7.0f, 8.9f, 7.0f, 10.0f)
                curveTo(7.0f, 11.1f, 6.1f, 12.0f, 5.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(6.1f, 14.0f, 7.0f, 14.9f, 7.0f, 16.0f)
                curveTo(7.0f, 17.1f, 7.9f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 13.9f, 8.1f, 13.0f, 7.0f, 13.0f)
                curveTo(8.1f, 13.0f, 9.0f, 12.1f, 9.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                moveTo(15.0f, 8.0f)
                curveTo(16.1f, 8.0f, 17.0f, 8.9f, 17.0f, 10.0f)
                curveTo(17.0f, 11.1f, 17.9f, 12.0f, 19.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(17.9f, 14.0f, 17.0f, 14.9f, 17.0f, 16.0f)
                curveTo(17.0f, 17.1f, 16.1f, 18.0f, 15.0f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 13.9f, 15.9f, 13.0f, 17.0f, 13.0f)
                curveTo(15.9f, 13.0f, 15.0f, 12.1f, 15.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _applicationBracesOutline!!
    }

private var _applicationBracesOutline: ImageVector? = null
