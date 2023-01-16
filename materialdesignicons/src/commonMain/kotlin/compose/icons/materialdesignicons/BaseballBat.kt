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

public val MaterialDesignIcons.BaseballBat: ImageVector
    get() {
        if (_baseballBat != null) {
            return _baseballBat!!
        }
        _baseballBat = Builder(name = "BaseballBat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                curveTo(19.72f, 2.0f, 19.5f, 2.11f, 19.29f, 2.29f)
                lineTo(9.79f, 11.79f)
                curveTo(9.75f, 11.83f, 9.72f, 11.87f, 7.23f, 15.35f)
                lineTo(4.0f, 18.59f)
                lineTo(3.71f, 18.29f)
                curveTo(3.5f, 18.1f, 3.26f, 18.0f, 3.0f, 18.0f)
                curveTo(2.44f, 18.0f, 2.0f, 18.44f, 2.0f, 19.0f)
                curveTo(2.0f, 19.26f, 2.1f, 19.5f, 2.29f, 19.71f)
                lineTo(4.29f, 21.71f)
                curveTo(4.68f, 22.11f, 5.31f, 22.12f, 5.71f, 21.74f)
                curveTo(6.11f, 21.35f, 6.12f, 20.72f, 5.71f, 20.29f)
                lineTo(5.41f, 20.0f)
                lineTo(8.64f, 16.77f)
                lineTo(12.21f, 14.21f)
                lineTo(21.71f, 4.71f)
                curveTo(22.1f, 4.32f, 22.1f, 3.68f, 21.71f, 3.29f)
                lineTo(20.71f, 2.29f)
                curveTo(20.5f, 2.1f, 20.26f, 2.0f, 20.0f, 2.0f)
                moveTo(18.5f, 13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.0f, 15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 13.0f)
                close()
            }
        }
        .build()
        return _baseballBat!!
    }

private var _baseballBat: ImageVector? = null
