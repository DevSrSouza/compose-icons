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

public val MaterialDesignIcons.FrequentlyAskedQuestions: ImageVector
    get() {
        if (_frequentlyAskedQuestions != null) {
            return _frequentlyAskedQuestions!!
        }
        _frequentlyAskedQuestions = Builder(name = "FrequentlyAskedQuestions", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                horizontalLineTo(6.0f)
                lineTo(2.0f, 19.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 3.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 15.0f)
                moveTo(23.0f, 9.0f)
                verticalLineTo(23.0f)
                lineTo(19.0f, 19.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 9.0f)
                moveTo(8.19f, 4.0f)
                curveTo(7.32f, 4.0f, 6.62f, 4.2f, 6.08f, 4.59f)
                curveTo(5.56f, 5.0f, 5.3f, 5.57f, 5.31f, 6.36f)
                lineTo(5.32f, 6.39f)
                horizontalLineTo(7.25f)
                curveTo(7.26f, 6.09f, 7.35f, 5.86f, 7.53f, 5.7f)
                curveTo(7.71f, 5.55f, 7.93f, 5.47f, 8.19f, 5.47f)
                curveTo(8.5f, 5.47f, 8.76f, 5.57f, 8.94f, 5.75f)
                curveTo(9.12f, 5.94f, 9.2f, 6.2f, 9.2f, 6.5f)
                curveTo(9.2f, 6.82f, 9.13f, 7.09f, 8.97f, 7.32f)
                curveTo(8.83f, 7.55f, 8.62f, 7.75f, 8.36f, 7.91f)
                curveTo(7.85f, 8.25f, 7.5f, 8.55f, 7.31f, 8.82f)
                curveTo(7.11f, 9.08f, 7.0f, 9.5f, 7.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 9.69f, 9.04f, 9.44f, 9.13f, 9.26f)
                curveTo(9.22f, 9.08f, 9.39f, 8.9f, 9.64f, 8.74f)
                curveTo(10.09f, 8.5f, 10.46f, 8.21f, 10.75f, 7.81f)
                curveTo(11.04f, 7.41f, 11.19f, 7.0f, 11.19f, 6.5f)
                curveTo(11.19f, 5.74f, 10.92f, 5.13f, 10.38f, 4.68f)
                curveTo(9.85f, 4.23f, 9.12f, 4.0f, 8.19f, 4.0f)
                moveTo(7.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                moveTo(13.0f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                moveTo(13.0f, 4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _frequentlyAskedQuestions!!
    }

private var _frequentlyAskedQuestions: ImageVector? = null
