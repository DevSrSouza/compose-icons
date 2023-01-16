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

public val MaterialDesignIcons.VideoVintage: ImageVector
    get() {
        if (_videoVintage != null) {
            return _videoVintage!!
        }
        _videoVintage = Builder(name = "VideoVintage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.5f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 10.0f)
                horizontalLineTo(16.0f)
                curveTo(18.24f, 8.39f, 18.76f, 5.27f, 17.15f, 3.0f)
                curveTo(15.54f, 0.78f, 12.42f, 0.26f, 10.17f, 1.87f)
                curveTo(9.5f, 2.35f, 8.96f, 3.0f, 8.6f, 3.73f)
                curveTo(6.25f, 2.28f, 3.17f, 3.0f, 1.72f, 5.37f)
                curveTo(0.28f, 7.72f, 1.0f, 10.8f, 3.36f, 12.25f)
                curveTo(3.57f, 12.37f, 3.78f, 12.5f, 4.0f, 12.58f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 22.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 21.0f)
                verticalLineTo(17.5f)
                lineTo(22.0f, 21.5f)
                verticalLineTo(10.5f)
                lineTo(18.0f, 14.5f)
                moveTo(13.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 4.0f)
                moveTo(6.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _videoVintage!!
    }

private var _videoVintage: ImageVector? = null
