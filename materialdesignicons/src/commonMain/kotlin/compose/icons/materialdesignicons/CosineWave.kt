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

public val MaterialDesignIcons.CosineWave: ImageVector
    get() {
        if (_cosineWave != null) {
            return _cosineWave!!
        }
        _cosineWave = Builder(name = "CosineWave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(20.26f, 4.0f, 19.0f, 8.58f, 17.96f, 12.27f)
                curveTo(16.57f, 17.27f, 15.26f, 22.0f, 12.0f, 22.0f)
                curveTo(8.74f, 22.0f, 7.43f, 17.27f, 6.04f, 12.27f)
                curveTo(5.0f, 8.58f, 3.74f, 4.0f, 2.0f, 4.0f)
                verticalLineTo(2.0f)
                curveTo(5.26f, 2.0f, 6.57f, 6.73f, 7.96f, 11.73f)
                curveTo(9.0f, 15.42f, 10.26f, 20.0f, 12.0f, 20.0f)
                curveTo(13.74f, 20.0f, 15.0f, 15.42f, 16.04f, 11.73f)
                curveTo(17.43f, 6.73f, 18.74f, 2.0f, 22.0f, 2.0f)
                close()
            }
        }
        .build()
        return _cosineWave!!
    }

private var _cosineWave: ImageVector? = null
