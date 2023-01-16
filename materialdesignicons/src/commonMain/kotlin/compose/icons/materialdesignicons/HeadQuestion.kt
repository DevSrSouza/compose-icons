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

public val MaterialDesignIcons.HeadQuestion: ImageVector
    get() {
        if (_headQuestion != null) {
            return _headQuestion!!
        }
        _headQuestion = Builder(name = "HeadQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(9.23f, 3.0f, 6.19f, 5.95f, 6.0f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13.0f, 4.5f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.11f, 6.89f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20.0f, 12.8f, 20.0f, 10.0f)
                curveTo(20.0f, 6.14f, 16.88f, 3.0f, 13.0f, 3.0f)
                moveTo(14.0f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                moveTo(15.75f, 8.81f)
                curveTo(15.46f, 9.21f, 15.09f, 9.5f, 14.64f, 9.74f)
                curveTo(14.39f, 9.9f, 14.22f, 10.07f, 14.13f, 10.26f)
                curveTo(14.04f, 10.44f, 14.0f, 10.69f, 14.0f, 11.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 10.5f, 12.11f, 10.08f, 12.31f, 9.82f)
                curveTo(12.5f, 9.55f, 12.85f, 9.25f, 13.36f, 8.91f)
                curveTo(13.62f, 8.75f, 13.83f, 8.55f, 13.97f, 8.32f)
                curveTo(14.13f, 8.09f, 14.2f, 7.82f, 14.2f, 7.5f)
                curveTo(14.2f, 7.2f, 14.12f, 6.94f, 13.94f, 6.75f)
                curveTo(13.76f, 6.57f, 13.5f, 6.47f, 13.19f, 6.47f)
                curveTo(12.93f, 6.47f, 12.71f, 6.55f, 12.53f, 6.7f)
                curveTo(12.35f, 6.86f, 12.26f, 7.09f, 12.25f, 7.39f)
                horizontalLineTo(10.32f)
                lineTo(10.31f, 7.36f)
                curveTo(10.3f, 6.57f, 10.56f, 6.0f, 11.08f, 5.59f)
                curveTo(11.62f, 5.2f, 12.32f, 5.0f, 13.19f, 5.0f)
                curveTo(14.12f, 5.0f, 14.85f, 5.23f, 15.38f, 5.68f)
                curveTo(15.92f, 6.13f, 16.19f, 6.74f, 16.19f, 7.5f)
                curveTo(16.19f, 8.0f, 16.04f, 8.41f, 15.75f, 8.81f)
                close()
            }
        }
        .build()
        return _headQuestion!!
    }

private var _headQuestion: ImageVector? = null
