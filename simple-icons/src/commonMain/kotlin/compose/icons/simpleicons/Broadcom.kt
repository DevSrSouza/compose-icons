package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Broadcom: ImageVector
    get() {
        if (_broadcom != null) {
            return _broadcom!!
        }
        _broadcom = Builder(name = "Broadcom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.37f, 0.0f, 0.0f, 5.37f, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.574f, 15.62f)
                curveTo(0.848f, 15.5f, 1.14f, 15.36f, 1.43f, 15.24f)
                curveTo(2.8f, 14.7f, 4.06f, 14.88f, 5.31f, 15.64f)
                curveTo(5.31f, 15.64f, 5.77f, 15.92f, 5.91f, 16.0f)
                curveTo(6.5f, 16.38f, 7.05f, 16.73f, 7.58f, 16.73f)
                curveTo(8.09f, 16.73f, 8.59f, 16.59f, 8.8f, 15.61f)
                curveTo(9.13f, 14.08f, 9.94f, 10.31f, 10.29f, 8.45f)
                curveTo(10.5f, 7.35f, 10.61f, 6.76f, 10.73f, 6.36f)
                curveTo(10.93f, 5.65f, 11.31f, 5.27f, 11.84f, 5.21f)
                curveTo(11.84f, 5.21f, 11.93f, 5.2f, 12.0f, 5.2f)
                curveTo(12.07f, 5.2f, 12.15f, 5.21f, 12.15f, 5.21f)
                curveTo(12.69f, 5.27f, 13.07f, 5.65f, 13.28f, 6.36f)
                curveTo(13.39f, 6.76f, 13.5f, 7.35f, 13.71f, 8.45f)
                curveTo(14.06f, 10.31f, 14.87f, 14.08f, 15.2f, 15.61f)
                curveTo(15.41f, 16.59f, 15.91f, 16.73f, 16.42f, 16.73f)
                curveTo(16.95f, 16.73f, 17.5f, 16.38f, 18.09f, 16.0f)
                curveTo(18.23f, 15.92f, 18.69f, 15.64f, 18.69f, 15.64f)
                curveTo(19.95f, 14.88f, 21.2f, 14.7f, 22.57f, 15.24f)
                curveTo(22.87f, 15.36f, 23.16f, 15.5f, 23.44f, 15.63f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 12.0f)
                curveTo(24.0f, 5.37f, 18.63f, 0.0f, 12.0f, 0.0f)
                moveTo(12.0f, 9.79f)
                curveTo(11.6f, 11.8f, 11.0f, 14.71f, 10.7f, 16.0f)
                curveTo(10.34f, 17.7f, 9.2f, 18.66f, 7.58f, 18.66f)
                curveTo(6.5f, 18.66f, 5.64f, 18.12f, 4.88f, 17.65f)
                curveTo(4.5f, 17.4f, 4.08f, 17.13f, 3.63f, 17.0f)
                arcTo(2.32f, 2.32f, 0.0f, false, false, 2.21f, 16.97f)
                arcTo(6.11f, 6.11f, 0.0f, false, false, 1.27f, 17.36f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 22.73f, 17.35f)
                arcTo(6.08f, 6.08f, 0.0f, false, false, 21.79f, 16.96f)
                arcTo(2.32f, 2.32f, 0.0f, false, false, 20.38f, 16.97f)
                curveTo(19.92f, 17.13f, 19.5f, 17.4f, 19.12f, 17.65f)
                curveTo(18.36f, 18.12f, 17.5f, 18.66f, 16.42f, 18.66f)
                curveTo(14.8f, 18.66f, 13.67f, 17.7f, 13.3f, 16.0f)
                curveTo(13.0f, 14.71f, 12.0f, 9.79f, 12.0f, 9.79f)
                close()
            }
        }
        .build()
        return _broadcom!!
    }

private var _broadcom: ImageVector? = null
