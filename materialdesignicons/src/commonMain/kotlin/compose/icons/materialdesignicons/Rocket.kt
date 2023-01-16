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

public val MaterialDesignIcons.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                lineTo(16.14f, 20.45f)
                curveTo(16.84f, 18.92f, 17.34f, 17.34f, 17.65f, 15.73f)
                lineTo(20.0f, 22.0f)
                moveTo(7.86f, 20.45f)
                lineTo(4.0f, 22.0f)
                lineTo(6.35f, 15.73f)
                curveTo(6.66f, 17.34f, 7.16f, 18.92f, 7.86f, 20.45f)
                moveTo(12.0f, 2.0f)
                curveTo(12.0f, 2.0f, 17.0f, 4.0f, 17.0f, 12.0f)
                curveTo(17.0f, 15.1f, 16.25f, 17.75f, 15.33f, 19.83f)
                curveTo(15.0f, 20.55f, 14.29f, 21.0f, 13.5f, 21.0f)
                horizontalLineTo(10.5f)
                curveTo(9.71f, 21.0f, 9.0f, 20.55f, 8.67f, 19.83f)
                curveTo(7.76f, 17.75f, 7.0f, 15.1f, 7.0f, 12.0f)
                curveTo(7.0f, 4.0f, 12.0f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 12.0f)
                curveTo(13.1f, 12.0f, 14.0f, 11.1f, 14.0f, 10.0f)
                curveTo(14.0f, 8.9f, 13.1f, 8.0f, 12.0f, 8.0f)
                curveTo(10.9f, 8.0f, 10.0f, 8.9f, 10.0f, 10.0f)
                curveTo(10.0f, 11.1f, 10.9f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
