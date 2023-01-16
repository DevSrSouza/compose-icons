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

public val MaterialDesignIcons.PanoramaWideAngleOutline: ImageVector
    get() {
        if (_panoramaWideAngleOutline != null) {
            return _panoramaWideAngleOutline!!
        }
        _panoramaWideAngleOutline = Builder(name = "PanoramaWideAngleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(9.27f, 4.0f, 6.78f, 4.24f, 4.05f, 4.72f)
                lineTo(3.12f, 4.88f)
                lineTo(2.87f, 5.78f)
                curveTo(2.29f, 7.85f, 2.0f, 9.93f, 2.0f, 12.0f)
                curveTo(2.0f, 14.07f, 2.29f, 16.15f, 2.87f, 18.22f)
                lineTo(3.12f, 19.11f)
                lineTo(4.05f, 19.27f)
                curveTo(6.78f, 19.76f, 9.27f, 20.0f, 12.0f, 20.0f)
                curveTo(14.73f, 20.0f, 17.22f, 19.76f, 19.95f, 19.28f)
                lineTo(20.88f, 19.12f)
                lineTo(21.13f, 18.23f)
                curveTo(21.71f, 16.15f, 22.0f, 14.07f, 22.0f, 12.0f)
                curveTo(22.0f, 9.93f, 21.71f, 7.85f, 21.13f, 5.78f)
                lineTo(20.88f, 4.89f)
                lineTo(19.95f, 4.73f)
                curveTo(17.22f, 4.24f, 14.73f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 6.0f)
                curveTo(14.45f, 6.0f, 16.71f, 6.2f, 19.29f, 6.64f)
                curveTo(19.76f, 8.42f, 20.0f, 10.22f, 20.0f, 12.0f)
                curveTo(20.0f, 13.78f, 19.76f, 15.58f, 19.29f, 17.36f)
                curveTo(16.71f, 17.8f, 14.45f, 18.0f, 12.0f, 18.0f)
                curveTo(9.55f, 18.0f, 7.29f, 17.8f, 4.71f, 17.36f)
                curveTo(4.24f, 15.58f, 4.0f, 13.78f, 4.0f, 12.0f)
                curveTo(4.0f, 10.22f, 4.24f, 8.42f, 4.71f, 6.64f)
                curveTo(7.29f, 6.2f, 9.55f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _panoramaWideAngleOutline!!
    }

private var _panoramaWideAngleOutline: ImageVector? = null
