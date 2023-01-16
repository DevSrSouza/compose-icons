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

public val MaterialDesignIcons.Graphql: ImageVector
    get() {
        if (_graphql != null) {
            return _graphql!!
        }
        _graphql = Builder(name = "Graphql", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.37f)
                lineTo(11.56f, 5.31f)
                lineTo(6.0f, 14.9f)
                curveTo(6.24f, 15.11f, 6.4f, 15.38f, 6.47f, 15.68f)
                horizontalLineTo(17.53f)
                curveTo(17.6f, 15.38f, 17.76f, 15.11f, 18.0f, 14.9f)
                lineTo(12.44f, 5.31f)
                lineTo(12.0f, 5.37f)
                moveTo(6.6f, 16.53f)
                lineTo(10.88f, 19.06f)
                curveTo(11.17f, 18.79f, 11.57f, 18.63f, 12.0f, 18.63f)
                curveTo(12.43f, 18.63f, 12.83f, 18.79f, 13.12f, 19.06f)
                lineTo(17.4f, 16.53f)
                horizontalLineTo(6.6f)
                moveTo(12.0f, 22.0f)
                arcTo(1.68f, 1.68f, 0.0f, false, true, 10.32f, 20.32f)
                lineTo(10.41f, 19.76f)
                lineTo(6.11f, 17.21f)
                curveTo(5.8f, 17.57f, 5.35f, 17.79f, 4.84f, 17.79f)
                arcTo(1.68f, 1.68f, 0.0f, false, true, 3.16f, 16.11f)
                curveTo(3.16f, 15.32f, 3.69f, 14.66f, 4.42f, 14.47f)
                verticalLineTo(9.36f)
                curveTo(3.59f, 9.25f, 2.95f, 8.54f, 2.95f, 7.68f)
                arcTo(1.68f, 1.68f, 0.0f, false, true, 4.63f, 6.0f)
                curveTo(5.18f, 6.0f, 5.66f, 6.26f, 5.97f, 6.66f)
                lineTo(10.38f, 4.13f)
                lineTo(10.32f, 3.68f)
                curveTo(10.32f, 2.75f, 11.07f, 2.0f, 12.0f, 2.0f)
                curveTo(12.93f, 2.0f, 13.68f, 2.75f, 13.68f, 3.68f)
                lineTo(13.62f, 4.13f)
                lineTo(18.03f, 6.66f)
                curveTo(18.34f, 6.26f, 18.82f, 6.0f, 19.37f, 6.0f)
                arcTo(1.68f, 1.68f, 0.0f, false, true, 21.05f, 7.68f)
                curveTo(21.05f, 8.54f, 20.41f, 9.25f, 19.58f, 9.36f)
                verticalLineTo(14.47f)
                curveTo(20.31f, 14.66f, 20.84f, 15.32f, 20.84f, 16.11f)
                arcTo(1.68f, 1.68f, 0.0f, false, true, 19.16f, 17.79f)
                curveTo(18.65f, 17.79f, 18.2f, 17.57f, 17.89f, 17.21f)
                lineTo(13.59f, 19.76f)
                lineTo(13.68f, 20.32f)
                arcTo(1.68f, 1.68f, 0.0f, false, true, 12.0f, 22.0f)
                moveTo(10.8f, 4.86f)
                lineTo(6.3f, 7.44f)
                lineTo(6.32f, 7.68f)
                curveTo(6.32f, 8.39f, 5.88f, 9.0f, 5.26f, 9.25f)
                lineTo(5.29f, 14.5f)
                lineTo(10.8f, 4.86f)
                moveTo(13.2f, 4.86f)
                lineTo(18.71f, 14.5f)
                lineTo(18.74f, 9.25f)
                curveTo(18.12f, 9.0f, 17.68f, 8.39f, 17.68f, 7.68f)
                lineTo(17.7f, 7.44f)
                lineTo(13.2f, 4.86f)
                close()
            }
        }
        .build()
        return _graphql!!
    }

private var _graphql: ImageVector? = null
