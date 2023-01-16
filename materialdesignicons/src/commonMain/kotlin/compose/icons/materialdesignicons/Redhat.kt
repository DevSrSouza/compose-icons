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

public val MaterialDesignIcons.Redhat: ImageVector
    get() {
        if (_redhat != null) {
            return _redhat!!
        }
        _redhat = Builder(name = "Redhat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.34f, 13.16f)
                curveTo(16.66f, 13.16f, 18.56f, 12.89f, 18.56f, 11.32f)
                curveTo(18.57f, 11.2f, 18.56f, 11.08f, 18.53f, 10.96f)
                lineTo(17.75f, 7.56f)
                curveTo(17.57f, 6.81f, 17.41f, 6.47f, 16.09f, 5.81f)
                curveTo(15.07f, 5.29f, 12.85f, 4.43f, 12.19f, 4.43f)
                curveTo(11.58f, 4.43f, 11.4f, 5.22f, 10.67f, 5.22f)
                curveTo(9.97f, 5.22f, 9.45f, 4.63f, 8.79f, 4.63f)
                curveTo(8.16f, 4.63f, 7.75f, 5.06f, 7.43f, 5.94f)
                curveTo(7.43f, 5.94f, 6.55f, 8.44f, 6.43f, 8.8f)
                curveTo(6.42f, 8.87f, 6.41f, 8.93f, 6.41f, 9.0f)
                curveTo(6.41f, 9.97f, 10.23f, 13.15f, 15.34f, 13.15f)
                moveTo(18.77f, 11.96f)
                curveTo(18.95f, 12.82f, 18.95f, 12.91f, 18.95f, 13.0f)
                curveTo(18.95f, 14.5f, 17.29f, 15.31f, 15.12f, 15.31f)
                curveTo(10.2f, 15.31f, 5.89f, 12.43f, 5.89f, 10.53f)
                curveTo(5.89f, 10.26f, 5.95f, 10.0f, 6.05f, 9.76f)
                curveTo(4.28f, 9.84f, 2.0f, 10.16f, 2.0f, 12.18f)
                curveTo(2.0f, 15.5f, 9.84f, 19.57f, 16.05f, 19.57f)
                curveTo(20.81f, 19.57f, 22.0f, 17.42f, 22.0f, 15.72f)
                curveTo(22.0f, 14.38f, 20.85f, 12.86f, 18.77f, 11.96f)
            }
        }
        .build()
        return _redhat!!
    }

private var _redhat: ImageVector? = null
