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

public val MaterialDesignIcons.WallSconceFlatVariantOutline: ImageVector
    get() {
        if (_wallSconceFlatVariantOutline != null) {
            return _wallSconceFlatVariantOutline!!
        }
        _wallSconceFlatVariantOutline = Builder(name = "WallSconceFlatVariantOutline", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                moveTo(18.73f, 10.68f)
                lineTo(20.5f, 8.91f)
                lineTo(19.09f, 7.5f)
                lineTo(17.32f, 9.27f)
                lineTo(18.73f, 10.68f)
                moveTo(5.27f, 10.68f)
                lineTo(6.68f, 9.27f)
                lineTo(4.91f, 7.5f)
                lineTo(3.5f, 8.91f)
                lineTo(5.27f, 10.68f)
                moveTo(13.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _wallSconceFlatVariantOutline!!
    }

private var _wallSconceFlatVariantOutline: ImageVector? = null
