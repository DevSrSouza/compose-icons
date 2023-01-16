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

public val MaterialDesignIcons.PiHole: ImageVector
    get() {
        if (_piHole != null) {
            return _piHole!!
        }
        _piHole = Builder(name = "PiHole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.62f, 2.0f)
                curveTo(9.5f, 2.0f, 11.57f, 4.29f, 11.77f, 7.93f)
                curveTo(12.5f, 3.57f, 15.93f, 4.08f, 15.93f, 4.08f)
                curveTo(16.1f, 6.55f, 14.07f, 8.05f, 11.77f, 8.17f)
                curveTo(11.12f, 6.81f, 7.25f, 3.47f, 7.25f, 3.47f)
                curveTo(7.23f, 3.5f, 10.97f, 6.74f, 10.83f, 8.15f)
                curveTo(8.33f, 7.88f, 5.82f, 6.0f, 5.62f, 2.0f)
                moveTo(6.06f, 13.11f)
                lineTo(9.92f, 9.25f)
                curveTo(11.09f, 8.08f, 13.0f, 8.08f, 14.16f, 9.25f)
                lineTo(18.0f, 13.11f)
                curveTo(19.19f, 14.28f, 19.19f, 16.18f, 18.0f, 17.35f)
                lineTo(14.16f, 21.21f)
                curveTo(13.0f, 22.38f, 11.09f, 22.38f, 9.92f, 21.21f)
                lineTo(6.06f, 17.35f)
                curveTo(4.89f, 16.18f, 4.89f, 14.28f, 6.06f, 13.11f)
                moveTo(9.39f, 19.59f)
                curveTo(9.39f, 18.36f, 10.15f, 16.85f, 12.09f, 16.85f)
                curveTo(13.4f, 16.85f, 14.87f, 18.1f, 16.31f, 17.96f)
                curveTo(14.87f, 17.92f, 13.59f, 16.85f, 13.59f, 15.19f)
                curveTo(13.59f, 13.86f, 14.69f, 12.9f, 14.69f, 11.34f)
                curveTo(14.63f, 12.33f, 13.82f, 13.77f, 12.0f, 13.77f)
                curveTo(10.59f, 13.77f, 9.55f, 12.63f, 7.87f, 12.63f)
                curveTo(8.58f, 12.67f, 10.5f, 13.3f, 10.5f, 15.35f)
                curveTo(10.5f, 17.0f, 9.39f, 17.5f, 9.39f, 19.59f)
                close()
            }
        }
        .build()
        return _piHole!!
    }

private var _piHole: ImageVector? = null
