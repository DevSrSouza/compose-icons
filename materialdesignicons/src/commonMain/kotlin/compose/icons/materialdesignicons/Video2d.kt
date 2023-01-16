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

public val MaterialDesignIcons.Video2d: ImageVector
    get() {
        if (_video2d != null) {
            return _video2d!!
        }
        _video2d = Builder(name = "Video2d", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                horizontalLineTo(16.0f)
                curveTo(17.66f, 7.0f, 19.0f, 8.34f, 19.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(19.0f, 15.66f, 17.66f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                moveTo(16.0f, 15.0f)
                curveTo(16.55f, 15.0f, 17.0f, 14.55f, 17.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 9.45f, 16.55f, 9.0f, 16.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                moveTo(5.0f, 7.0f)
                horizontalLineTo(9.0f)
                curveTo(10.11f, 7.0f, 11.0f, 7.9f, 11.0f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(11.0f, 12.11f, 10.11f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                curveTo(5.0f, 11.9f, 5.9f, 11.0f, 7.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _video2d!!
    }

private var _video2d: ImageVector? = null
