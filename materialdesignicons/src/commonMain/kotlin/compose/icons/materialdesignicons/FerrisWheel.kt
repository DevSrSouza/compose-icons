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

public val MaterialDesignIcons.FerrisWheel: ImageVector
    get() {
        if (_ferrisWheel != null) {
            return _ferrisWheel!!
        }
        _ferrisWheel = Builder(name = "FerrisWheel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(12.86f, 19.0f, 13.59f, 19.54f, 13.87f, 20.29f)
                curveTo(14.42f, 20.17f, 14.95f, 20.0f, 15.46f, 19.77f)
                lineTo(13.7f, 15.62f)
                curveTo(13.18f, 15.87f, 12.61f, 16.0f, 12.0f, 16.0f)
                curveTo(11.39f, 16.0f, 10.82f, 15.87f, 10.3f, 15.62f)
                lineTo(8.54f, 19.77f)
                curveTo(9.05f, 20.0f, 9.58f, 20.17f, 10.13f, 20.29f)
                curveTo(10.41f, 19.54f, 11.14f, 19.0f, 12.0f, 19.0f)
                moveTo(18.25f, 17.76f)
                curveTo(18.0f, 17.42f, 17.81f, 17.0f, 17.81f, 16.5f)
                curveTo(17.81f, 15.41f, 18.71f, 14.5f, 19.81f, 14.5f)
                lineTo(20.12f, 14.53f)
                curveTo(20.37f, 13.73f, 20.5f, 12.88f, 20.5f, 12.0f)
                curveTo(20.5f, 11.12f, 20.37f, 10.27f, 20.12f, 9.5f)
                horizontalLineTo(19.81f)
                curveTo(18.7f, 9.5f, 17.81f, 8.61f, 17.81f, 7.5f)
                curveTo(17.81f, 7.0f, 17.97f, 6.59f, 18.25f, 6.24f)
                curveTo(17.1f, 5.0f, 15.59f, 4.09f, 13.87f, 3.71f)
                curveTo(13.59f, 4.46f, 12.86f, 5.0f, 12.0f, 5.0f)
                curveTo(11.14f, 5.0f, 10.41f, 4.46f, 10.13f, 3.71f)
                curveTo(8.41f, 4.09f, 6.9f, 5.0f, 5.75f, 6.24f)
                curveTo(6.03f, 6.59f, 6.2f, 7.03f, 6.2f, 7.5f)
                curveTo(6.2f, 8.61f, 5.3f, 9.5f, 4.2f, 9.5f)
                horizontalLineTo(3.88f)
                curveTo(3.63f, 10.28f, 3.5f, 11.12f, 3.5f, 12.0f)
                curveTo(3.5f, 12.89f, 3.64f, 13.74f, 3.89f, 14.55f)
                lineTo(4.2f, 14.5f)
                curveTo(5.31f, 14.5f, 6.2f, 15.42f, 6.2f, 16.5f)
                curveTo(6.2f, 17.0f, 6.04f, 17.43f, 5.76f, 17.77f)
                curveTo(6.08f, 18.12f, 6.44f, 18.44f, 6.81f, 18.73f)
                lineTo(8.71f, 14.27f)
                curveTo(8.26f, 13.62f, 8.0f, 12.84f, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                curveTo(16.0f, 12.84f, 15.74f, 13.62f, 15.29f, 14.27f)
                lineTo(17.19f, 18.73f)
                curveTo(17.57f, 18.44f, 17.92f, 18.11f, 18.25f, 17.76f)
                moveTo(12.0f, 23.0f)
                curveTo(11.0f, 23.0f, 10.16f, 22.26f, 10.0f, 21.29f)
                curveTo(9.37f, 21.16f, 8.75f, 20.95f, 8.15f, 20.69f)
                lineTo(7.17f, 23.0f)
                horizontalLineTo(5.0f)
                lineTo(6.41f, 19.68f)
                curveTo(5.88f, 19.3f, 5.39f, 18.86f, 4.96f, 18.37f)
                curveTo(4.72f, 18.47f, 4.47f, 18.5f, 4.2f, 18.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.2f, 16.5f)
                curveTo(2.2f, 15.88f, 2.5f, 15.32f, 2.97f, 14.95f)
                curveTo(2.66f, 14.0f, 2.5f, 13.03f, 2.5f, 12.0f)
                curveTo(2.5f, 11.0f, 2.66f, 10.0f, 2.96f, 9.08f)
                curveTo(2.5f, 8.71f, 2.2f, 8.15f, 2.2f, 7.5f)
                curveTo(2.2f, 6.41f, 3.09f, 5.5f, 4.2f, 5.5f)
                curveTo(4.46f, 5.5f, 4.71f, 5.56f, 4.93f, 5.65f)
                curveTo(6.25f, 4.18f, 8.0f, 3.13f, 10.0f, 2.71f)
                curveTo(10.16f, 1.74f, 11.0f, 1.0f, 12.0f, 1.0f)
                curveTo(13.0f, 1.0f, 13.84f, 1.74f, 14.0f, 2.71f)
                curveTo(16.0f, 3.13f, 17.74f, 4.18f, 19.06f, 5.64f)
                curveTo(19.29f, 5.55f, 19.54f, 5.5f, 19.81f, 5.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.81f, 7.5f)
                curveTo(21.81f, 8.14f, 21.5f, 8.71f, 21.04f, 9.07f)
                curveTo(21.34f, 10.0f, 21.5f, 11.0f, 21.5f, 12.0f)
                curveTo(21.5f, 13.0f, 21.34f, 14.0f, 21.04f, 14.93f)
                curveTo(21.5f, 15.3f, 21.81f, 15.87f, 21.81f, 16.5f)
                curveTo(21.81f, 17.62f, 20.92f, 18.5f, 19.81f, 18.5f)
                curveTo(19.54f, 18.5f, 19.29f, 18.46f, 19.05f, 18.36f)
                curveTo(18.61f, 18.85f, 18.12f, 19.29f, 17.59f, 19.68f)
                lineTo(19.0f, 23.0f)
                horizontalLineTo(16.83f)
                lineTo(15.85f, 20.69f)
                curveTo(15.25f, 20.95f, 14.63f, 21.16f, 14.0f, 21.29f)
                curveTo(13.84f, 22.26f, 13.0f, 23.0f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _ferrisWheel!!
    }

private var _ferrisWheel: ImageVector? = null
