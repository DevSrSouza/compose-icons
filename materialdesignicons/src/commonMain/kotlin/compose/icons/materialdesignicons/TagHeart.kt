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

public val MaterialDesignIcons.TagHeart: ImageVector
    get() {
        if (_tagHeart != null) {
            return _tagHeart!!
        }
        _tagHeart = Builder(name = "TagHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.55f, 2.22f, 12.05f, 2.59f, 12.42f)
                lineTo(11.59f, 21.42f)
                curveTo(11.95f, 21.78f, 12.45f, 22.0f, 13.0f, 22.0f)
                curveTo(13.55f, 22.0f, 14.05f, 21.78f, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                curveTo(21.78f, 14.05f, 22.0f, 13.55f, 22.0f, 13.0f)
                curveTo(22.0f, 12.45f, 21.77f, 11.94f, 21.41f, 11.58f)
                moveTo(5.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 7.0f)
                moveTo(17.27f, 15.27f)
                lineTo(13.0f, 19.54f)
                lineTo(8.73f, 15.27f)
                curveTo(8.28f, 14.81f, 8.0f, 14.19f, 8.0f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 11.0f)
                curveTo(11.19f, 11.0f, 11.82f, 11.28f, 12.27f, 11.74f)
                lineTo(13.0f, 12.46f)
                lineTo(13.73f, 11.73f)
                curveTo(14.18f, 11.28f, 14.81f, 11.0f, 15.5f, 11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 13.5f)
                curveTo(18.0f, 14.19f, 17.72f, 14.82f, 17.27f, 15.27f)
                close()
            }
        }
        .build()
        return _tagHeart!!
    }

private var _tagHeart: ImageVector? = null
