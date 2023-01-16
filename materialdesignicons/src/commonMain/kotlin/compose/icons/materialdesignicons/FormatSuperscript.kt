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

public val MaterialDesignIcons.FormatSuperscript: ImageVector
    get() {
        if (_formatSuperscript != null) {
            return _formatSuperscript!!
        }
        _formatSuperscript = Builder(name = "FormatSuperscript", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.41f)
                lineTo(11.41f, 12.0f)
                lineTo(16.0f, 16.59f)
                lineTo(14.59f, 18.0f)
                lineTo(10.0f, 13.41f)
                lineTo(5.41f, 18.0f)
                lineTo(4.0f, 16.59f)
                lineTo(8.59f, 12.0f)
                lineTo(4.0f, 7.41f)
                lineTo(5.41f, 6.0f)
                lineTo(10.0f, 10.59f)
                lineTo(14.59f, 6.0f)
                lineTo(16.0f, 7.41f)
                moveTo(21.85f, 9.0f)
                horizontalLineTo(16.97f)
                verticalLineTo(8.0f)
                lineTo(17.86f, 7.18f)
                curveTo(18.62f, 6.54f, 19.18f, 6.0f, 19.56f, 5.55f)
                curveTo(19.93f, 5.11f, 20.12f, 4.7f, 20.13f, 4.32f)
                curveTo(20.14f, 4.04f, 20.05f, 3.8f, 19.86f, 3.62f)
                curveTo(19.68f, 3.43f, 19.39f, 3.34f, 19.0f, 3.33f)
                curveTo(18.69f, 3.34f, 18.42f, 3.4f, 18.16f, 3.5f)
                lineTo(17.5f, 3.89f)
                lineTo(17.05f, 2.72f)
                curveTo(17.32f, 2.5f, 17.64f, 2.33f, 18.03f, 2.19f)
                curveTo(18.42f, 2.05f, 18.85f, 2.0f, 19.32f, 2.0f)
                curveTo(20.1f, 2.0f, 20.7f, 2.2f, 21.1f, 2.61f)
                curveTo(21.5f, 3.0f, 21.72f, 3.54f, 21.72f, 4.18f)
                curveTo(21.71f, 4.74f, 21.53f, 5.26f, 21.18f, 5.73f)
                curveTo(20.84f, 6.21f, 20.42f, 6.66f, 19.91f, 7.09f)
                lineTo(19.27f, 7.61f)
                verticalLineTo(7.63f)
                horizontalLineTo(21.85f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _formatSuperscript!!
    }

private var _formatSuperscript: ImageVector? = null
