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

public val MaterialDesignIcons.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(16.97f, 3.0f, 21.0f, 6.58f, 21.0f, 11.0f)
                curveTo(21.0f, 15.42f, 15.0f, 21.0f, 12.0f, 21.0f)
                curveTo(9.0f, 21.0f, 3.0f, 15.42f, 3.0f, 11.0f)
                curveTo(3.0f, 6.58f, 7.03f, 3.0f, 12.0f, 3.0f)
                moveTo(10.31f, 10.93f)
                curveTo(9.29f, 9.29f, 7.47f, 8.58f, 6.25f, 9.34f)
                curveTo(5.03f, 10.1f, 4.87f, 12.05f, 5.89f, 13.69f)
                curveTo(6.92f, 15.33f, 8.74f, 16.04f, 9.96f, 15.28f)
                curveTo(11.18f, 14.5f, 11.33f, 12.57f, 10.31f, 10.93f)
                moveTo(13.69f, 10.93f)
                curveTo(12.67f, 12.57f, 12.82f, 14.5f, 14.04f, 15.28f)
                curveTo(15.26f, 16.04f, 17.08f, 15.33f, 18.11f, 13.69f)
                curveTo(19.13f, 12.05f, 18.97f, 10.1f, 17.75f, 9.34f)
                curveTo(16.53f, 8.58f, 14.71f, 9.29f, 13.69f, 10.93f)
                moveTo(12.0f, 17.75f)
                curveTo(10.0f, 17.75f, 9.5f, 17.0f, 9.5f, 17.0f)
                curveTo(9.5f, 17.03f, 10.0f, 19.0f, 12.0f, 19.0f)
                curveTo(14.0f, 19.0f, 14.5f, 17.0f, 14.5f, 17.0f)
                curveTo(14.5f, 17.0f, 14.0f, 17.75f, 12.0f, 17.75f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
