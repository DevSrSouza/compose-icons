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

public val MaterialDesignIcons.HomeHeart: ImageVector
    get() {
        if (_homeHeart != null) {
            return _homeHeart!!
        }
        _homeHeart = Builder(name = "HomeHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                lineTo(12.0f, 3.0f)
                lineTo(22.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                moveTo(12.0f, 18.0f)
                lineTo(12.72f, 17.34f)
                curveTo(15.3f, 15.0f, 17.0f, 13.46f, 17.0f, 11.57f)
                curveTo(17.0f, 10.03f, 15.79f, 8.82f, 14.25f, 8.82f)
                curveTo(13.38f, 8.82f, 12.55f, 9.23f, 12.0f, 9.87f)
                curveTo(11.45f, 9.23f, 10.62f, 8.82f, 9.75f, 8.82f)
                curveTo(8.21f, 8.82f, 7.0f, 10.03f, 7.0f, 11.57f)
                curveTo(7.0f, 13.46f, 8.7f, 15.0f, 11.28f, 17.34f)
                lineTo(12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _homeHeart!!
    }

private var _homeHeart: ImageVector? = null
