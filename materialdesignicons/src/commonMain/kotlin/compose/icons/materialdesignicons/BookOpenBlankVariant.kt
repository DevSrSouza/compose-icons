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

public val MaterialDesignIcons.BookOpenBlankVariant: ImageVector
    get() {
        if (_bookOpenBlankVariant != null) {
            return _bookOpenBlankVariant!!
        }
        _bookOpenBlankVariant = Builder(name = "BookOpenBlankVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                curveTo(19.89f, 4.65f, 18.67f, 4.5f, 17.5f, 4.5f)
                curveTo(15.55f, 4.5f, 13.45f, 4.9f, 12.0f, 6.0f)
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
                moveTo(21.0f, 18.5f)
                curveTo(19.9f, 18.15f, 18.7f, 18.0f, 17.5f, 18.0f)
                curveTo(15.8f, 18.0f, 13.35f, 18.65f, 12.0f, 19.5f)
                verticalLineTo(8.0f)
                curveTo(13.35f, 7.15f, 15.8f, 6.5f, 17.5f, 6.5f)
                curveTo(18.7f, 6.5f, 19.9f, 6.65f, 21.0f, 7.0f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _bookOpenBlankVariant!!
    }

private var _bookOpenBlankVariant: ImageVector? = null
