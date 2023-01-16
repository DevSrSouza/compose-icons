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

public val MaterialDesignIcons.Reload: ImageVector
    get() {
        if (_reload != null) {
            return _reload!!
        }
        _reload = Builder(name = "Reload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 16.97f, 6.03f, 21.0f, 11.0f, 21.0f)
                curveTo(13.39f, 21.0f, 15.68f, 20.06f, 17.4f, 18.4f)
                lineTo(15.9f, 16.9f)
                curveTo(14.63f, 18.25f, 12.86f, 19.0f, 11.0f, 19.0f)
                curveTo(4.76f, 19.0f, 1.64f, 11.46f, 6.05f, 7.05f)
                curveTo(10.46f, 2.64f, 18.0f, 5.77f, 18.0f, 12.0f)
                horizontalLineTo(15.0f)
                lineTo(19.0f, 16.0f)
                horizontalLineTo(19.1f)
                lineTo(23.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.03f, 15.97f, 3.0f, 11.0f, 3.0f)
                curveTo(6.03f, 3.0f, 2.0f, 7.03f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _reload!!
    }

private var _reload: ImageVector? = null
