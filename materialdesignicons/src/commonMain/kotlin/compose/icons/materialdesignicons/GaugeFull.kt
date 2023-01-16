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

public val MaterialDesignIcons.GaugeFull: ImageVector
    get() {
        if (_gaugeFull != null) {
            return _gaugeFull!!
        }
        _gaugeFull = Builder(name = "GaugeFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                curveTo(20.0f, 14.4f, 19.0f, 16.5f, 17.3f, 18.0f)
                curveTo(15.9f, 16.7f, 14.0f, 16.0f, 12.0f, 16.0f)
                curveTo(10.0f, 16.0f, 8.2f, 16.7f, 6.7f, 18.0f)
                curveTo(5.0f, 16.5f, 4.0f, 14.4f, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                moveTo(10.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 6.0f)
                moveTo(14.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 6.0f)
                moveTo(17.09f, 8.94f)
                curveTo(16.96f, 8.94f, 16.84f, 8.97f, 16.7f, 9.0f)
                lineTo(13.5f, 10.32f)
                lineTo(13.23f, 10.43f)
                curveTo(12.67f, 10.0f, 11.91f, 9.88f, 11.25f, 10.15f)
                curveTo(10.23f, 10.56f, 9.73f, 11.73f, 10.15f, 12.75f)
                curveTo(10.56f, 13.77f, 11.73f, 14.27f, 12.75f, 13.85f)
                curveTo(13.41f, 13.59f, 13.88f, 13.0f, 14.0f, 12.28f)
                lineTo(14.23f, 12.18f)
                lineTo(17.45f, 10.88f)
                lineTo(17.47f, 10.87f)
                curveTo(18.0f, 10.66f, 18.23f, 10.08f, 18.03f, 9.56f)
                curveTo(17.87f, 9.18f, 17.5f, 8.93f, 17.09f, 8.94f)
                moveTo(7.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 9.0f)
                close()
            }
        }
        .build()
        return _gaugeFull!!
    }

private var _gaugeFull: ImageVector? = null
