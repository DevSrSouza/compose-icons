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

public val MaterialDesignIcons.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.5f)
                lineTo(19.95f, 10.37f)
                curveTo(19.69f, 9.22f, 19.04f, 8.56f, 19.04f, 8.56f)
                curveTo(17.4f, 6.92f, 14.75f, 6.92f, 13.11f, 8.56f)
                lineTo(11.63f, 10.04f)
                lineTo(5.0f, 3.0f)
                curveTo(4.0f, 7.0f, 5.0f, 11.0f, 7.45f, 14.22f)
                lineTo(2.0f, 19.5f)
                curveTo(2.0f, 19.5f, 10.89f, 21.5f, 16.07f, 17.45f)
                curveTo(18.83f, 15.29f, 19.45f, 14.03f, 19.84f, 12.7f)
                lineTo(23.0f, 11.5f)
                moveTo(17.71f, 11.72f)
                curveTo(17.32f, 12.11f, 16.68f, 12.11f, 16.29f, 11.72f)
                curveTo(15.9f, 11.33f, 15.9f, 10.7f, 16.29f, 10.31f)
                curveTo(16.68f, 9.92f, 17.32f, 9.92f, 17.71f, 10.31f)
                curveTo(18.1f, 10.7f, 18.1f, 11.33f, 17.71f, 11.72f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
