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

public val MaterialDesignIcons.Goodreads: ImageVector
    get() {
        if (_goodreads != null) {
            return _goodreads!!
        }
        _goodreads = Builder(name = "Goodreads", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.77f)
                curveTo(15.96f, 14.42f, 14.22f, 15.5f, 12.25f, 15.5f)
                curveTo(9.07f, 15.5f, 6.5f, 12.7f, 6.5f, 9.25f)
                curveTo(6.5f, 5.8f, 9.07f, 3.0f, 12.25f, 3.0f)
                curveTo(14.22f, 3.0f, 15.96f, 4.08f, 17.0f, 5.73f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.25f)
                curveTo(18.0f, 20.71f, 14.54f, 21.0f, 11.5f, 21.0f)
                curveTo(9.0f, 21.0f, 7.55f, 19.31f, 7.13f, 17.0f)
                horizontalLineTo(8.14f)
                curveTo(8.5f, 18.75f, 9.54f, 20.0f, 11.5f, 20.0f)
                curveTo(13.72f, 20.0f, 17.0f, 20.05f, 17.0f, 15.25f)
                verticalLineTo(15.25f)
                lineTo(17.0f, 12.77f)
                moveTo(12.25f, 4.0f)
                curveTo(9.63f, 4.0f, 7.5f, 6.35f, 7.5f, 9.25f)
                curveTo(7.5f, 12.15f, 9.63f, 14.5f, 12.25f, 14.5f)
                curveTo(14.87f, 14.5f, 17.0f, 12.15f, 17.0f, 9.25f)
                curveTo(17.0f, 6.35f, 14.87f, 4.0f, 12.25f, 4.0f)
                close()
            }
        }
        .build()
        return _goodreads!!
    }

private var _goodreads: ImageVector? = null
