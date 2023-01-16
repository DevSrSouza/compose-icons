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

public val MaterialDesignIcons.CheckboxMultipleBlankCircleOutline: ImageVector
    get() {
        if (_checkboxMultipleBlankCircleOutline != null) {
            return _checkboxMultipleBlankCircleOutline!!
        }
        _checkboxMultipleBlankCircleOutline = Builder(name = "CheckboxMultipleBlankCircleOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 6.0f, 10.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 14.0f, 18.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 22.0f, 10.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 14.0f, 2.0f)
                moveTo(14.0f, 4.0f)
                curveTo(17.32f, 4.0f, 20.0f, 6.69f, 20.0f, 10.0f)
                curveTo(20.0f, 13.32f, 17.32f, 16.0f, 14.0f, 16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 14.0f, 4.0f)
                moveTo(4.93f, 5.82f)
                curveTo(3.08f, 7.34f, 2.0f, 9.61f, 2.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 10.0f, 20.0f)
                curveTo(10.64f, 20.0f, 11.27f, 19.92f, 11.88f, 19.77f)
                curveTo(10.12f, 19.38f, 8.5f, 18.5f, 7.17f, 17.29f)
                curveTo(5.22f, 16.25f, 4.0f, 14.21f, 4.0f, 12.0f)
                curveTo(4.0f, 11.7f, 4.03f, 11.41f, 4.07f, 11.11f)
                curveTo(4.03f, 10.74f, 4.0f, 10.37f, 4.0f, 10.0f)
                curveTo(4.0f, 8.56f, 4.32f, 7.13f, 4.93f, 5.82f)
                close()
            }
        }
        .build()
        return _checkboxMultipleBlankCircleOutline!!
    }

private var _checkboxMultipleBlankCircleOutline: ImageVector? = null
