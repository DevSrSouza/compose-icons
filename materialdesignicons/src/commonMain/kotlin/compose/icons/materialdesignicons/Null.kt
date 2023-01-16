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

public val MaterialDesignIcons.Null: ImageVector
    get() {
        if (_null != null) {
            return _null!!
        }
        _null = Builder(name = "Null", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.85f, 2.0f, 15.55f, 2.78f, 16.9f, 4.1f)
                lineTo(18.6f, 1.93f)
                lineTo(20.18f, 3.16f)
                lineTo(18.2f, 5.68f)
                curveTo(19.33f, 7.41f, 20.0f, 9.6f, 20.0f, 12.0f)
                curveTo(20.0f, 17.5f, 16.42f, 22.0f, 12.0f, 22.0f)
                curveTo(10.15f, 22.0f, 8.45f, 21.22f, 7.1f, 19.9f)
                lineTo(5.4f, 22.07f)
                lineTo(3.82f, 20.84f)
                lineTo(5.8f, 18.32f)
                curveTo(4.67f, 16.59f, 4.0f, 14.4f, 4.0f, 12.0f)
                curveTo(4.0f, 6.5f, 7.58f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(8.69f, 4.0f, 6.0f, 7.58f, 6.0f, 12.0f)
                curveTo(6.0f, 13.73f, 6.41f, 15.33f, 7.11f, 16.64f)
                lineTo(15.67f, 5.67f)
                curveTo(14.66f, 4.62f, 13.38f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 20.0f)
                curveTo(15.31f, 20.0f, 18.0f, 16.42f, 18.0f, 12.0f)
                curveTo(18.0f, 10.27f, 17.59f, 8.67f, 16.89f, 7.36f)
                lineTo(8.33f, 18.33f)
                curveTo(9.34f, 19.38f, 10.62f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _null!!
    }

private var _null: ImageVector? = null
