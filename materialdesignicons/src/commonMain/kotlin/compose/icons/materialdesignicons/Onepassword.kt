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

public val MaterialDesignIcons.Onepassword: ImageVector
    get() {
        if (_onepassword != null) {
            return _onepassword!!
        }
        _onepassword = Builder(name = "Onepassword", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(5.92f, 1.0f, 1.0f, 5.92f, 1.0f, 12.0f)
                curveTo(1.0f, 18.08f, 5.92f, 23.0f, 12.0f, 23.0f)
                curveTo(18.08f, 23.0f, 23.0f, 18.08f, 23.0f, 12.0f)
                curveTo(23.0f, 5.92f, 18.08f, 1.0f, 12.0f, 1.0f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(13.0f, 13.5f)
                curveTo(13.0f, 14.13f, 13.4f, 14.7f, 14.0f, 14.91f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.91f)
                curveTo(10.78f, 11.64f, 11.19f, 10.8f, 10.93f, 10.0f)
                curveTo(10.78f, 9.58f, 10.44f, 9.24f, 10.0f, 9.09f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.09f)
                curveTo(13.4f, 12.3f, 13.0f, 12.87f, 13.0f, 13.5f)
                close()
            }
        }
        .build()
        return _onepassword!!
    }

private var _onepassword: ImageVector? = null
