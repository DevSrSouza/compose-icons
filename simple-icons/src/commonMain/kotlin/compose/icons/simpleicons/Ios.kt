package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Ios: ImageVector
    get() {
        if (_ios != null) {
            return _ios!!
        }
        _ios = Builder(name = "Ios", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.1f, 6.05f)
                curveTo(0.486f, 6.05f, 0.0f, 6.53f, 0.0f, 7.13f)
                arcTo(1.08f, 1.08f, 0.0f, false, false, 1.1f, 8.21f)
                curveTo(1.72f, 8.21f, 2.21f, 7.73f, 2.21f, 7.13f)
                curveTo(2.21f, 6.53f, 1.72f, 6.05f, 1.1f, 6.05f)
                moveTo(8.71f, 6.07f)
                curveTo(5.35f, 6.07f, 3.25f, 8.36f, 3.25f, 12.0f)
                curveTo(3.25f, 15.67f, 5.35f, 17.95f, 8.71f, 17.95f)
                curveTo(12.05f, 17.95f, 14.16f, 15.67f, 14.16f, 12.0f)
                curveTo(14.16f, 8.36f, 12.05f, 6.07f, 8.71f, 6.07f)
                moveTo(19.55f, 6.07f)
                curveTo(17.05f, 6.07f, 15.27f, 7.45f, 15.27f, 9.5f)
                curveTo(15.27f, 11.13f, 16.28f, 12.15f, 18.4f, 12.64f)
                lineTo(19.89f, 13.0f)
                curveTo(21.34f, 13.33f, 21.93f, 13.81f, 21.93f, 14.64f)
                curveTo(21.93f, 15.6f, 20.96f, 16.28f, 19.58f, 16.28f)
                curveTo(18.17f, 16.28f, 17.11f, 15.59f, 17.0f, 14.53f)
                horizontalLineTo(15.0f)
                curveTo(15.08f, 16.65f, 16.82f, 17.95f, 19.46f, 17.95f)
                curveTo(22.25f, 17.95f, 24.0f, 16.58f, 24.0f, 14.4f)
                curveTo(24.0f, 12.69f, 23.0f, 11.72f, 20.68f, 11.19f)
                lineTo(19.35f, 10.89f)
                curveTo(17.94f, 10.55f, 17.36f, 10.1f, 17.36f, 9.34f)
                curveTo(17.36f, 8.38f, 18.24f, 7.74f, 19.54f, 7.74f)
                curveTo(20.85f, 7.74f, 21.75f, 8.39f, 21.85f, 9.46f)
                horizontalLineTo(23.81f)
                curveTo(23.76f, 7.44f, 22.09f, 6.07f, 19.55f, 6.07f)
                moveTo(8.71f, 7.82f)
                curveTo(10.75f, 7.82f, 12.06f, 9.45f, 12.06f, 12.0f)
                curveTo(12.06f, 14.57f, 10.75f, 16.2f, 8.71f, 16.2f)
                curveTo(6.65f, 16.2f, 5.35f, 14.57f, 5.35f, 12.0f)
                curveTo(5.35f, 9.45f, 6.65f, 7.82f, 8.71f, 7.82f)
                moveTo(0.111f, 9.31f)
                verticalLineTo(17.76f)
                horizontalLineTo(2.1f)
                verticalLineTo(9.31f)
                horizontalLineTo(0.11f)
                close()
            }
        }
        .build()
        return _ios!!
    }

private var _ios: ImageVector? = null
