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

public val MaterialDesignIcons.SourceFork: ImageVector
    get() {
        if (_sourceFork != null) {
            return _sourceFork!!
        }
        _sourceFork = Builder(name = "SourceFork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 5.0f)
                curveTo(9.0f, 6.28f, 8.19f, 7.38f, 7.06f, 7.81f)
                curveTo(7.15f, 8.27f, 7.39f, 8.83f, 8.0f, 9.63f)
                curveTo(9.0f, 10.92f, 11.0f, 12.83f, 12.0f, 14.17f)
                curveTo(13.0f, 12.83f, 15.0f, 10.92f, 16.0f, 9.63f)
                curveTo(16.61f, 8.83f, 16.85f, 8.27f, 16.94f, 7.81f)
                curveTo(15.81f, 7.38f, 15.0f, 6.28f, 15.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 5.0f)
                curveTo(21.0f, 6.32f, 20.14f, 7.45f, 18.95f, 7.85f)
                curveTo(18.87f, 8.37f, 18.64f, 9.0f, 18.0f, 9.83f)
                curveTo(17.0f, 11.17f, 15.0f, 13.08f, 14.0f, 14.38f)
                curveTo(13.39f, 15.17f, 13.15f, 15.73f, 13.06f, 16.19f)
                curveTo(14.19f, 16.62f, 15.0f, 17.72f, 15.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 19.0f)
                curveTo(9.0f, 17.72f, 9.81f, 16.62f, 10.94f, 16.19f)
                curveTo(10.85f, 15.73f, 10.61f, 15.17f, 10.0f, 14.38f)
                curveTo(9.0f, 13.08f, 7.0f, 11.17f, 6.0f, 9.83f)
                curveTo(5.36f, 9.0f, 5.13f, 8.37f, 5.05f, 7.85f)
                curveTo(3.86f, 7.45f, 3.0f, 6.32f, 3.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 2.0f)
                moveTo(6.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 4.0f)
                moveTo(18.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 4.0f)
                moveTo(12.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _sourceFork!!
    }

private var _sourceFork: ImageVector? = null
