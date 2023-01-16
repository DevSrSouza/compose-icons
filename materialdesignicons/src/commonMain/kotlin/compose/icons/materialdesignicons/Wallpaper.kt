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

public val MaterialDesignIcons.Wallpaper: ImageVector
    get() {
        if (_wallpaper != null) {
            return _wallpaper!!
        }
        _wallpaper = Builder(name = "Wallpaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                moveTo(10.0f, 13.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(18.0f)
                lineTo(15.0f, 14.0f)
                lineTo(12.97f, 16.71f)
                lineTo(10.0f, 13.0f)
                moveTo(17.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 8.5f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 2.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                moveTo(4.0f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _wallpaper!!
    }

private var _wallpaper: ImageVector? = null
