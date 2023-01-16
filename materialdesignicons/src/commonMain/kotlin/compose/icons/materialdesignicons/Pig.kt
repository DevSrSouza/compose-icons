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

public val MaterialDesignIcons.Pig: ImageVector
    get() {
        if (_pig != null) {
            return _pig!!
        }
        _pig = Builder(name = "Pig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 9.0f)
                moveTo(14.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 9.0f)
                moveTo(12.0f, 4.0f)
                lineTo(12.68f, 4.03f)
                curveTo(13.62f, 3.24f, 14.82f, 2.59f, 15.72f, 2.35f)
                curveTo(17.59f, 1.85f, 20.88f, 2.23f, 21.31f, 3.83f)
                curveTo(21.62f, 5.0f, 20.6f, 6.45f, 19.03f, 7.38f)
                curveTo(20.26f, 8.92f, 21.0f, 10.87f, 21.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 13.0f)
                curveTo(3.0f, 10.87f, 3.74f, 8.92f, 4.97f, 7.38f)
                curveTo(3.4f, 6.45f, 2.38f, 5.0f, 2.69f, 3.83f)
                curveTo(3.12f, 2.23f, 6.41f, 1.85f, 8.28f, 2.35f)
                curveTo(9.18f, 2.59f, 10.38f, 3.24f, 11.32f, 4.03f)
                lineTo(12.0f, 4.0f)
                moveTo(10.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 16.0f)
                moveTo(14.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 16.0f)
                moveTo(12.0f, 13.0f)
                curveTo(9.24f, 13.0f, 7.0f, 15.34f, 7.0f, 17.0f)
                curveTo(7.0f, 18.66f, 9.24f, 20.0f, 12.0f, 20.0f)
                curveTo(14.76f, 20.0f, 17.0f, 18.66f, 17.0f, 17.0f)
                curveTo(17.0f, 15.34f, 14.76f, 13.0f, 12.0f, 13.0f)
                moveTo(7.76f, 4.28f)
                curveTo(7.31f, 4.16f, 4.59f, 4.35f, 4.59f, 4.35f)
                curveTo(4.59f, 4.35f, 6.8f, 6.1f, 7.24f, 6.22f)
                curveTo(7.69f, 6.34f, 9.77f, 6.43f, 9.91f, 5.9f)
                curveTo(10.06f, 5.36f, 8.2f, 4.4f, 7.76f, 4.28f)
                moveTo(16.24f, 4.28f)
                curveTo(15.8f, 4.4f, 13.94f, 5.36f, 14.09f, 5.9f)
                curveTo(14.23f, 6.43f, 16.31f, 6.34f, 16.76f, 6.22f)
                curveTo(17.2f, 6.1f, 19.41f, 4.35f, 19.41f, 4.35f)
                curveTo(19.41f, 4.35f, 16.69f, 4.16f, 16.24f, 4.28f)
                close()
            }
        }
        .build()
        return _pig!!
    }

private var _pig: ImageVector? = null
