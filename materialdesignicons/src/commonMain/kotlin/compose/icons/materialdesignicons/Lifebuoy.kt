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

public val MaterialDesignIcons.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.79f, 15.41f)
                curveTo(20.74f, 13.24f, 20.74f, 10.75f, 19.79f, 8.59f)
                lineTo(17.05f, 9.83f)
                curveTo(17.65f, 11.21f, 17.65f, 12.78f, 17.06f, 14.17f)
                lineTo(19.79f, 15.41f)
                moveTo(15.42f, 4.21f)
                curveTo(13.25f, 3.26f, 10.76f, 3.26f, 8.59f, 4.21f)
                lineTo(9.83f, 6.94f)
                curveTo(11.22f, 6.35f, 12.79f, 6.35f, 14.18f, 6.95f)
                lineTo(15.42f, 4.21f)
                moveTo(4.21f, 8.58f)
                curveTo(3.26f, 10.76f, 3.26f, 13.24f, 4.21f, 15.42f)
                lineTo(6.95f, 14.17f)
                curveTo(6.35f, 12.79f, 6.35f, 11.21f, 6.95f, 9.82f)
                lineTo(4.21f, 8.58f)
                moveTo(8.59f, 19.79f)
                curveTo(10.76f, 20.74f, 13.25f, 20.74f, 15.42f, 19.78f)
                lineTo(14.18f, 17.05f)
                curveTo(12.8f, 17.65f, 11.22f, 17.65f, 9.84f, 17.06f)
                lineTo(8.59f, 19.79f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
