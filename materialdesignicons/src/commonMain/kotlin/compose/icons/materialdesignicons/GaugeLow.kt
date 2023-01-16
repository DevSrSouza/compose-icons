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

public val MaterialDesignIcons.GaugeLow: ImageVector
    get() {
        if (_gaugeLow != null) {
            return _gaugeLow!!
        }
        _gaugeLow = Builder(name = "GaugeLow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                curveTo(4.0f, 14.4f, 5.0f, 16.5f, 6.7f, 18.0f)
                curveTo(8.1f, 16.7f, 10.0f, 16.0f, 12.0f, 16.0f)
                curveTo(14.0f, 16.0f, 15.8f, 16.7f, 17.3f, 18.0f)
                curveTo(19.0f, 16.5f, 20.0f, 14.4f, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(10.0f, 5.89f)
                curveTo(10.38f, 5.9f, 10.74f, 6.15f, 10.9f, 6.54f)
                lineTo(12.19f, 9.77f)
                lineTo(12.29f, 10.0f)
                curveTo(13.0f, 10.13f, 13.59f, 10.6f, 13.86f, 11.26f)
                curveTo(14.27f, 12.29f, 13.77f, 13.45f, 12.74f, 13.86f)
                curveTo(11.71f, 14.27f, 10.55f, 13.77f, 10.14f, 12.74f)
                curveTo(9.88f, 12.08f, 10.0f, 11.32f, 10.43f, 10.76f)
                lineTo(10.33f, 10.5f)
                lineTo(9.04f, 7.29f)
                lineTo(9.03f, 7.26f)
                curveTo(8.83f, 6.75f, 9.08f, 6.17f, 9.59f, 5.96f)
                curveTo(9.72f, 5.91f, 9.85f, 5.89f, 10.0f, 5.89f)
                verticalLineTo(5.89f)
                moveTo(14.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 6.0f)
                moveTo(17.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 9.0f)
                moveTo(7.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 9.0f)
                close()
            }
        }
        .build()
        return _gaugeLow!!
    }

private var _gaugeLow: ImageVector? = null
