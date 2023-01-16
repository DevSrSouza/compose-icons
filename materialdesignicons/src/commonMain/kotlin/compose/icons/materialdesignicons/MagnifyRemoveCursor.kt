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

public val MaterialDesignIcons.MagnifyRemoveCursor: ImageVector
    get() {
        if (_magnifyRemoveCursor != null) {
            return _magnifyRemoveCursor!!
        }
        _magnifyRemoveCursor = Builder(name = "MagnifyRemoveCursor", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 1.0f)
                verticalLineTo(8.0f)
                lineTo(8.0f, 1.0f)
                horizontalLineTo(1.0f)
                moveTo(18.0f, 16.0f)
                horizontalLineTo(17.42f)
                lineTo(16.61f, 15.19f)
                curveTo(17.5f, 14.0f, 18.0f, 12.5f, 18.0f, 11.0f)
                curveTo(18.0f, 7.13f, 14.87f, 4.0f, 11.0f, 4.0f)
                curveTo(9.5f, 4.0f, 8.0f, 4.5f, 6.79f, 5.4f)
                curveTo(3.7f, 7.72f, 3.07f, 12.11f, 5.39f, 15.2f)
                curveTo(7.71f, 18.29f, 12.1f, 18.92f, 15.19f, 16.6f)
                lineTo(16.0f, 17.41f)
                verticalLineTo(18.0f)
                lineTo(21.0f, 23.0f)
                lineTo(23.0f, 21.0f)
                lineTo(18.0f, 16.0f)
                moveTo(14.6f, 13.16f)
                lineTo(13.18f, 14.58f)
                lineTo(11.06f, 12.45f)
                lineTo(8.94f, 14.58f)
                lineTo(7.5f, 13.16f)
                lineTo(9.65f, 11.04f)
                lineTo(7.5f, 8.92f)
                lineTo(8.94f, 7.5f)
                lineTo(11.06f, 9.63f)
                lineTo(13.18f, 7.5f)
                lineTo(14.6f, 8.92f)
                lineTo(12.47f, 11.04f)
                lineTo(14.6f, 13.16f)
                close()
            }
        }
        .build()
        return _magnifyRemoveCursor!!
    }

private var _magnifyRemoveCursor: ImageVector? = null
