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

public val MaterialDesignIcons.GoogleEarth: ImageVector
    get() {
        if (_googleEarth != null) {
            return _googleEarth!!
        }
        _googleEarth = Builder(name = "GoogleEarth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.14f)
                curveTo(11.09f, 10.77f, 10.14f, 9.78f, 9.14f, 9.19f)
                curveTo(8.14f, 8.59f, 7.27f, 8.38f, 6.5f, 8.55f)
                curveTo(5.77f, 8.73f, 5.14f, 9.14f, 4.64f, 9.8f)
                curveTo(4.2f, 10.39f, 4.0f, 11.06f, 4.0f, 11.81f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 12.78f, 4.11f, 13.58f, 4.36f, 14.39f)
                curveTo(4.45f, 14.64f, 4.5f, 14.64f, 4.55f, 14.39f)
                curveTo(4.67f, 13.77f, 4.96f, 13.31f, 5.41f, 13.03f)
                curveTo(5.87f, 12.75f, 6.47f, 12.76f, 7.22f, 13.05f)
                curveTo(7.97f, 13.35f, 8.7f, 14.0f, 9.42f, 14.95f)
                curveTo(10.7f, 16.67f, 12.2f, 17.72f, 13.92f, 18.09f)
                curveTo(16.14f, 18.41f, 17.81f, 17.7f, 18.94f, 16.0f)
                curveTo(19.25f, 15.39f, 19.5f, 14.86f, 19.64f, 14.39f)
                curveTo(19.73f, 14.08f, 19.69f, 14.05f, 19.5f, 14.3f)
                curveTo(19.03f, 14.92f, 18.4f, 15.33f, 17.6f, 15.5f)
                curveTo(16.8f, 15.7f, 15.89f, 15.5f, 14.86f, 15.0f)
                curveTo(13.83f, 14.43f, 12.88f, 13.5f, 12.0f, 12.14f)
                moveTo(16.97f, 8.16f)
                curveTo(15.41f, 5.81f, 13.72f, 4.5f, 11.91f, 4.17f)
                curveTo(10.47f, 3.95f, 8.91f, 4.45f, 7.22f, 5.67f)
                curveTo(7.0f, 5.83f, 6.9f, 5.91f, 6.91f, 5.93f)
                curveTo(6.93f, 5.95f, 7.06f, 5.89f, 7.31f, 5.77f)
                curveTo(9.81f, 4.55f, 12.22f, 5.83f, 14.53f, 9.61f)
                curveTo(15.03f, 10.45f, 15.55f, 11.11f, 16.1f, 11.58f)
                curveTo(16.65f, 12.05f, 17.16f, 12.33f, 17.65f, 12.42f)
                curveTo(18.13f, 12.5f, 18.57f, 12.5f, 18.96f, 12.38f)
                curveTo(19.35f, 12.25f, 19.7f, 12.05f, 20.0f, 11.77f)
                curveTo(20.0f, 11.17f, 19.91f, 10.5f, 19.69f, 9.8f)
                curveTo(19.19f, 9.92f, 18.74f, 9.88f, 18.35f, 9.68f)
                curveTo(17.96f, 9.5f, 17.5f, 8.97f, 16.97f, 8.16f)
                moveTo(12.0f, 2.0f)
                curveTo(14.75f, 2.0f, 17.1f, 3.0f, 19.05f, 4.95f)
                curveTo(21.0f, 6.9f, 22.0f, 9.25f, 22.0f, 12.0f)
                curveTo(22.0f, 14.75f, 21.0f, 17.1f, 19.05f, 19.05f)
                curveTo(17.1f, 21.0f, 14.75f, 22.0f, 12.0f, 22.0f)
                curveTo(9.25f, 22.0f, 6.9f, 21.0f, 4.95f, 19.05f)
                curveTo(3.0f, 17.1f, 2.0f, 14.75f, 2.0f, 12.0f)
                curveTo(2.0f, 9.25f, 3.0f, 6.9f, 4.95f, 4.95f)
                curveTo(6.9f, 3.0f, 9.25f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _googleEarth!!
    }

private var _googleEarth: ImageVector? = null
