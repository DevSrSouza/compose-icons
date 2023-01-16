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

public val MaterialDesignIcons.FireOff: ImageVector
    get() {
        if (_fireOff != null) {
            return _fireOff!!
        }
        _fireOff = Builder(name = "FireOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(7.09f, 9.0f)
                curveTo(5.66f, 10.36f, 4.88f, 12.47f, 5.0f, 14.47f)
                curveTo(5.06f, 14.97f, 5.12f, 15.47f, 5.29f, 15.97f)
                curveTo(5.43f, 16.57f, 5.7f, 17.17f, 6.0f, 17.7f)
                curveTo(7.08f, 19.43f, 8.95f, 20.67f, 10.96f, 20.92f)
                curveTo(13.1f, 21.19f, 15.39f, 20.8f, 17.03f, 19.32f)
                curveTo(17.1f, 19.26f, 17.15f, 19.18f, 17.22f, 19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8.8f, 14.05f)
                curveTo(8.57f, 14.15f, 8.33f, 14.09f, 8.14f, 13.93f)
                curveTo(8.08f, 13.88f, 8.04f, 13.83f, 8.0f, 13.76f)
                curveTo(7.0f, 12.47f, 6.74f, 10.69f, 7.26f, 9.15f)
                lineTo(8.58f, 10.47f)
                curveTo(8.58f, 11.4f, 8.73f, 12.33f, 9.07f, 13.22f)
                curveTo(9.11f, 13.32f, 9.15f, 13.42f, 9.15f, 13.55f)
                curveTo(9.15f, 13.77f, 9.0f, 13.97f, 8.8f, 14.05f)
                moveTo(14.5f, 17.5f)
                curveTo(14.22f, 17.74f, 13.76f, 18.0f, 13.4f, 18.1f)
                curveTo(12.28f, 18.5f, 11.16f, 17.94f, 10.5f, 17.28f)
                curveTo(11.69f, 17.0f, 12.4f, 16.12f, 12.61f, 15.23f)
                curveTo(12.66f, 15.0f, 12.66f, 14.76f, 12.64f, 14.53f)
                lineTo(15.0f, 16.88f)
                curveTo(14.85f, 17.11f, 14.69f, 17.33f, 14.5f, 17.5f)
                moveTo(18.92f, 15.72f)
                lineTo(9.65f, 6.46f)
                curveTo(10.12f, 5.65f, 10.72f, 4.92f, 11.46f, 4.32f)
                curveTo(12.17f, 3.75f, 13.0f, 3.23f, 13.95f, 3.0f)
                curveTo(13.0f, 4.85f, 13.33f, 7.26f, 14.82f, 8.72f)
                curveTo(15.46f, 9.35f, 16.22f, 9.78f, 16.89f, 10.38f)
                curveTo(17.15f, 10.64f, 17.43f, 10.9f, 17.66f, 11.2f)
                curveTo(17.66f, 11.2f, 18.22f, 12.0f, 18.43f, 12.46f)
                lineTo(18.56f, 12.72f)
                curveTo(18.96f, 13.69f, 19.06f, 14.72f, 18.92f, 15.72f)
                close()
            }
        }
        .build()
        return _fireOff!!
    }

private var _fireOff: ImageVector? = null
