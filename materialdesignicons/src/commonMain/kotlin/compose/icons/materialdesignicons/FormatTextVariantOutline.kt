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

public val MaterialDesignIcons.FormatTextVariantOutline: ImageVector
    get() {
        if (_formatTextVariantOutline != null) {
            return _formatTextVariantOutline!!
        }
        _formatTextVariantOutline = Builder(name = "FormatTextVariantOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                curveTo(10.18f, 3.0f, 9.44f, 3.5f, 9.14f, 4.27f)
                lineTo(3.64f, 18.27f)
                curveTo(3.12f, 19.58f, 4.09f, 21.0f, 5.5f, 21.0f)
                horizontalLineTo(7.75f)
                curveTo(8.59f, 21.0f, 9.33f, 20.5f, 9.62f, 19.7f)
                lineTo(10.26f, 18.0f)
                horizontalLineTo(13.74f)
                lineTo(14.38f, 19.7f)
                curveTo(14.67f, 20.5f, 15.42f, 21.0f, 16.25f, 21.0f)
                horizontalLineTo(18.5f)
                curveTo(19.91f, 21.0f, 20.88f, 19.58f, 20.36f, 18.27f)
                lineTo(14.86f, 4.27f)
                curveTo(14.56f, 3.5f, 13.82f, 3.0f, 13.0f, 3.0f)
                moveTo(11.0f, 5.0f)
                horizontalLineTo(13.0f)
                lineTo(18.5f, 19.0f)
                horizontalLineTo(16.25f)
                lineTo(15.12f, 16.0f)
                horizontalLineTo(8.87f)
                lineTo(7.75f, 19.0f)
                horizontalLineTo(5.5f)
                moveTo(12.0f, 7.67f)
                lineTo(9.62f, 14.0f)
                horizontalLineTo(14.37f)
                close()
            }
        }
        .build()
        return _formatTextVariantOutline!!
    }

private var _formatTextVariantOutline: ImageVector? = null
