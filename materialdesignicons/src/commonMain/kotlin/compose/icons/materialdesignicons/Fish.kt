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

public val MaterialDesignIcons.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                lineTo(12.76f, 17.0f)
                curveTo(9.5f, 16.79f, 6.59f, 15.4f, 5.75f, 13.58f)
                curveTo(5.66f, 14.06f, 5.53f, 14.5f, 5.33f, 14.83f)
                curveTo(4.67f, 16.0f, 3.33f, 16.0f, 2.0f, 16.0f)
                curveTo(3.1f, 16.0f, 3.5f, 14.43f, 3.5f, 12.5f)
                curveTo(3.5f, 10.57f, 3.1f, 9.0f, 2.0f, 9.0f)
                curveTo(3.33f, 9.0f, 4.67f, 9.0f, 5.33f, 10.17f)
                curveTo(5.53f, 10.5f, 5.66f, 10.94f, 5.75f, 11.42f)
                curveTo(6.4f, 10.0f, 8.32f, 8.85f, 10.66f, 8.32f)
                lineTo(9.0f, 5.0f)
                curveTo(11.0f, 5.0f, 13.0f, 5.0f, 14.33f, 5.67f)
                curveTo(15.46f, 6.23f, 16.11f, 7.27f, 16.69f, 8.38f)
                curveTo(19.61f, 9.08f, 22.0f, 10.66f, 22.0f, 12.5f)
                curveTo(22.0f, 14.38f, 19.5f, 16.0f, 16.5f, 16.66f)
                curveTo(15.67f, 17.76f, 14.86f, 18.78f, 14.17f, 19.33f)
                curveTo(13.33f, 20.0f, 12.67f, 20.0f, 12.0f, 20.0f)
                moveTo(17.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
