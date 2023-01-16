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

public val MaterialDesignIcons.BookOpenPageVariantOutline: ImageVector
    get() {
        if (_bookOpenPageVariantOutline != null) {
            return _bookOpenPageVariantOutline!!
        }
        _bookOpenPageVariantOutline = Builder(name = "BookOpenPageVariantOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 1.0f)
                lineTo(14.0f, 6.0f)
                verticalLineTo(17.0f)
                lineTo(19.0f, 12.5f)
                verticalLineTo(1.0f)
                moveTo(21.0f, 5.0f)
                verticalLineTo(18.5f)
                curveTo(19.9f, 18.15f, 18.7f, 18.0f, 17.5f, 18.0f)
                curveTo(15.8f, 18.0f, 13.35f, 18.65f, 12.0f, 19.5f)
                verticalLineTo(6.0f)
                curveTo(10.55f, 4.9f, 8.45f, 4.5f, 6.5f, 4.5f)
                curveTo(4.55f, 4.5f, 2.45f, 4.9f, 1.0f, 6.0f)
                verticalLineTo(20.65f)
                curveTo(1.0f, 20.9f, 1.25f, 21.15f, 1.5f, 21.15f)
                curveTo(1.6f, 21.15f, 1.65f, 21.1f, 1.75f, 21.1f)
                curveTo(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f)
                curveTo(8.45f, 20.0f, 10.55f, 20.4f, 12.0f, 21.5f)
                curveTo(13.35f, 20.65f, 15.8f, 20.0f, 17.5f, 20.0f)
                curveTo(19.15f, 20.0f, 20.85f, 20.3f, 22.25f, 21.05f)
                curveTo(22.35f, 21.1f, 22.4f, 21.1f, 22.5f, 21.1f)
                curveTo(22.75f, 21.1f, 23.0f, 20.85f, 23.0f, 20.6f)
                verticalLineTo(6.0f)
                curveTo(22.4f, 5.55f, 21.75f, 5.25f, 21.0f, 5.0f)
                moveTo(10.0f, 18.41f)
                curveTo(8.75f, 18.09f, 7.5f, 18.0f, 6.5f, 18.0f)
                curveTo(5.44f, 18.0f, 4.18f, 18.19f, 3.0f, 18.5f)
                verticalLineTo(7.13f)
                curveTo(3.91f, 6.73f, 5.14f, 6.5f, 6.5f, 6.5f)
                curveTo(7.86f, 6.5f, 9.09f, 6.73f, 10.0f, 7.13f)
                verticalLineTo(18.41f)
                close()
            }
        }
        .build()
        return _bookOpenPageVariantOutline!!
    }

private var _bookOpenPageVariantOutline: ImageVector? = null
