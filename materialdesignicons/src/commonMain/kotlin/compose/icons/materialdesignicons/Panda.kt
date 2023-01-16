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

public val MaterialDesignIcons.Panda: ImageVector
    get() {
        if (_panda != null) {
            return _panda!!
        }
        _panda = Builder(name = "Panda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(13.74f, 3.0f, 15.36f, 3.5f, 16.74f, 4.35f)
                curveTo(17.38f, 3.53f, 18.38f, 3.0f, 19.5f, 3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 23.0f, 6.5f)
                curveTo(23.0f, 8.0f, 22.05f, 9.28f, 20.72f, 9.78f)
                curveTo(20.9f, 10.5f, 21.0f, 11.23f, 21.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 12.0f)
                curveTo(3.0f, 11.23f, 3.1f, 10.5f, 3.28f, 9.78f)
                curveTo(1.95f, 9.28f, 1.0f, 8.0f, 1.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.5f, 3.0f)
                curveTo(5.62f, 3.0f, 6.62f, 3.53f, 7.26f, 4.35f)
                curveTo(8.64f, 3.5f, 10.26f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 19.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 5.0f)
                moveTo(16.19f, 10.3f)
                curveTo(16.55f, 11.63f, 16.08f, 12.91f, 15.15f, 13.16f)
                curveTo(14.21f, 13.42f, 13.17f, 12.54f, 12.81f, 11.2f)
                curveTo(12.45f, 9.87f, 12.92f, 8.59f, 13.85f, 8.34f)
                curveTo(14.79f, 8.09f, 15.83f, 8.96f, 16.19f, 10.3f)
                moveTo(7.81f, 10.3f)
                curveTo(8.17f, 8.96f, 9.21f, 8.09f, 10.15f, 8.34f)
                curveTo(11.08f, 8.59f, 11.55f, 9.87f, 11.19f, 11.2f)
                curveTo(10.83f, 12.54f, 9.79f, 13.42f, 8.85f, 13.16f)
                curveTo(7.92f, 12.91f, 7.45f, 11.63f, 7.81f, 10.3f)
                moveTo(12.0f, 14.0f)
                curveTo(12.6f, 14.0f, 13.13f, 14.19f, 13.5f, 14.5f)
                lineTo(12.5f, 15.5f)
                curveTo(12.5f, 15.92f, 12.84f, 16.25f, 13.25f, 16.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.0f, 15.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 15.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 15.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 17.25f)
                curveTo(12.76f, 17.25f, 12.32f, 17.05f, 12.0f, 16.72f)
                curveTo(11.68f, 17.05f, 11.24f, 17.25f, 10.75f, 17.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 9.0f, 15.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 15.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 15.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 10.75f, 16.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 11.5f, 15.5f)
                lineTo(10.5f, 14.5f)
                curveTo(10.87f, 14.19f, 11.4f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _panda!!
    }

private var _panda: ImageVector? = null
