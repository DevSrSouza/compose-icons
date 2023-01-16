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

public val MaterialDesignIcons.Gatsby: ImageVector
    get() {
        if (_gatsby != null) {
            return _gatsby!!
        }
        _gatsby = Builder(name = "Gatsby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(8.27f, 4.0f, 5.14f, 6.55f, 4.25f, 10.0f)
                lineTo(14.0f, 19.75f)
                curveTo(17.45f, 18.86f, 20.0f, 15.73f, 20.0f, 12.0f)
                horizontalLineTo(14.75f)
                verticalLineTo(13.5f)
                horizontalLineTo(18.2f)
                curveTo(17.71f, 15.54f, 16.24f, 17.19f, 14.31f, 17.94f)
                lineTo(6.06f, 9.69f)
                curveTo(7.0f, 7.31f, 9.3f, 5.63f, 12.0f, 5.63f)
                curveTo(14.13f, 5.63f, 16.0f, 6.67f, 17.18f, 8.28f)
                lineTo(18.41f, 7.22f)
                curveTo(16.95f, 5.26f, 14.63f, 4.0f, 12.0f, 4.0f)
                moveTo(4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                curveTo(12.04f, 20.0f, 12.09f, 20.0f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _gatsby!!
    }

private var _gatsby: ImageVector? = null
