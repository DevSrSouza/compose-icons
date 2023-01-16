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

public val MaterialDesignIcons.HeadQuestionOutline: ImageVector
    get() {
        if (_headQuestionOutline != null) {
            return _headQuestionOutline!!
        }
        _headQuestionOutline = Builder(name = "HeadQuestionOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(16.88f, 3.0f, 20.0f, 6.14f, 20.0f, 10.0f)
                curveTo(20.0f, 12.8f, 18.37f, 15.19f, 16.0f, 16.31f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 18.0f, 6.0f, 17.11f, 6.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13.0f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6.0f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3.0f, 13.0f, 3.0f)
                moveTo(10.32f, 7.39f)
                horizontalLineTo(12.25f)
                curveTo(12.26f, 7.09f, 12.35f, 6.86f, 12.53f, 6.7f)
                curveTo(12.71f, 6.55f, 12.93f, 6.47f, 13.19f, 6.47f)
                curveTo(13.5f, 6.47f, 13.76f, 6.57f, 13.94f, 6.75f)
                curveTo(14.12f, 6.94f, 14.2f, 7.2f, 14.2f, 7.5f)
                curveTo(14.2f, 7.82f, 14.13f, 8.09f, 13.97f, 8.32f)
                curveTo(13.83f, 8.55f, 13.62f, 8.75f, 13.36f, 8.91f)
                curveTo(12.85f, 9.25f, 12.5f, 9.55f, 12.31f, 9.82f)
                curveTo(12.11f, 10.08f, 12.0f, 10.5f, 12.0f, 11.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 10.69f, 14.04f, 10.44f, 14.13f, 10.26f)
                curveTo(14.22f, 10.07f, 14.39f, 9.9f, 14.64f, 9.74f)
                curveTo(15.09f, 9.5f, 15.46f, 9.21f, 15.75f, 8.81f)
                curveTo(16.04f, 8.41f, 16.19f, 8.0f, 16.19f, 7.5f)
                curveTo(16.19f, 6.74f, 15.92f, 6.13f, 15.38f, 5.68f)
                curveTo(14.85f, 5.23f, 14.12f, 5.0f, 13.19f, 5.0f)
                curveTo(12.32f, 5.0f, 11.62f, 5.2f, 11.08f, 5.59f)
                curveTo(10.56f, 6.0f, 10.3f, 6.57f, 10.31f, 7.36f)
                lineTo(10.32f, 7.39f)
                moveTo(12.0f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                moveTo(13.0f, 1.0f)
                curveTo(8.41f, 1.0f, 4.61f, 4.42f, 4.06f, 8.9f)
                lineTo(2.5f, 11.0f)
                lineTo(2.47f, 11.0f)
                lineTo(2.45f, 11.03f)
                curveTo(1.9f, 11.79f, 1.83f, 12.79f, 2.26f, 13.62f)
                curveTo(2.62f, 14.31f, 3.26f, 14.79f, 4.0f, 14.94f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.85f, 5.28f, 19.42f, 7.0f, 19.87f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.83f, 22.0f, 13.06f, 22.0f, 10.0f)
                curveTo(22.0f, 5.03f, 17.96f, 1.0f, 13.0f, 1.0f)
                close()
            }
        }
        .build()
        return _headQuestionOutline!!
    }

private var _headQuestionOutline: ImageVector? = null
