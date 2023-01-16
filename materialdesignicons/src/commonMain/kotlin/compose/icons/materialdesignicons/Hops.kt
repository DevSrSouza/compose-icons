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

public val MaterialDesignIcons.Hops: ImageVector
    get() {
        if (_hops != null) {
            return _hops!!
        }
        _hops = Builder(name = "Hops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 12.0f, 12.5f, 10.0f, 12.5f, 2.0f)
                curveTo(12.5f, 2.0f, 21.0f, 2.0f, 21.0f, 12.0f)
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 2.0f, 11.5f, 2.0f, 11.5f, 2.0f)
                curveTo(11.5f, 10.0f, 3.0f, 12.0f, 3.0f, 12.0f)
                moveTo(12.0f, 6.5f)
                curveTo(12.0f, 6.5f, 13.0f, 8.66f, 15.0f, 10.5f)
                curveTo(14.76f, 14.16f, 12.0f, 16.0f, 12.0f, 16.0f)
                curveTo(12.0f, 16.0f, 9.24f, 14.16f, 9.0f, 10.5f)
                curveTo(11.0f, 8.66f, 12.0f, 6.5f, 12.0f, 6.5f)
                moveTo(20.75f, 13.25f)
                curveTo(20.75f, 13.25f, 20.0f, 17.0f, 18.0f, 19.0f)
                curveTo(18.0f, 19.0f, 15.53f, 17.36f, 14.33f, 14.81f)
                curveTo(15.05f, 13.58f, 15.5f, 12.12f, 15.75f, 11.13f)
                curveTo(17.13f, 12.18f, 18.75f, 13.0f, 20.75f, 13.25f)
                moveTo(15.5f, 18.25f)
                curveTo(14.5f, 20.25f, 12.0f, 21.75f, 12.0f, 21.75f)
                curveTo(12.0f, 21.75f, 9.5f, 20.25f, 8.5f, 18.25f)
                curveTo(8.5f, 18.25f, 9.59f, 17.34f, 10.35f, 15.8f)
                curveTo(10.82f, 16.35f, 11.36f, 16.79f, 12.0f, 17.0f)
                curveTo(12.64f, 16.79f, 13.18f, 16.35f, 13.65f, 15.8f)
                curveTo(14.41f, 17.34f, 15.5f, 18.25f, 15.5f, 18.25f)
                moveTo(3.25f, 13.25f)
                curveTo(5.25f, 13.0f, 6.87f, 12.18f, 8.25f, 11.13f)
                curveTo(8.5f, 12.12f, 8.95f, 13.58f, 9.67f, 14.81f)
                curveTo(8.47f, 17.36f, 6.0f, 19.0f, 6.0f, 19.0f)
                curveTo(4.0f, 17.0f, 3.25f, 13.25f, 3.25f, 13.25f)
                close()
            }
        }
        .build()
        return _hops!!
    }

private var _hops: ImageVector? = null
