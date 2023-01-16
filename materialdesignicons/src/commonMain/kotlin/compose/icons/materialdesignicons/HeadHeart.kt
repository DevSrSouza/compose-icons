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

public val MaterialDesignIcons.HeadHeart: ImageVector
    get() {
        if (_headHeart != null) {
            return _headHeart!!
        }
        _headHeart = Builder(name = "HeadHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(9.23f, 3.0f, 6.19f, 5.95f, 6.0f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13.0f, 4.5f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.11f, 6.89f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20.0f, 12.8f, 20.0f, 10.0f)
                curveTo(20.0f, 6.14f, 16.88f, 3.0f, 13.0f, 3.0f)
                moveTo(17.0f, 8.83f)
                curveTo(17.0f, 10.37f, 15.64f, 11.6f, 13.58f, 13.47f)
                lineTo(13.0f, 14.0f)
                lineTo(12.42f, 13.47f)
                curveTo(10.36f, 11.6f, 9.0f, 10.37f, 9.0f, 8.83f)
                curveTo(9.0f, 7.63f, 9.96f, 6.64f, 11.16f, 6.63f)
                horizontalLineTo(11.2f)
                curveTo(11.89f, 6.63f, 12.55f, 6.94f, 13.0f, 7.46f)
                curveTo(13.45f, 6.94f, 14.11f, 6.63f, 14.8f, 6.63f)
                curveTo(16.0f, 6.62f, 17.0f, 7.59f, 17.0f, 8.79f)
                verticalLineTo(8.83f)
                close()
            }
        }
        .build()
        return _headHeart!!
    }

private var _headHeart: ImageVector? = null
