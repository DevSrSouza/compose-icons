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

public val MaterialDesignIcons.FormatSubscript: ImageVector
    get() {
        if (_formatSubscript != null) {
            return _formatSubscript!!
        }
        _formatSubscript = Builder(name = "FormatSubscript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(21.85f, 21.03f)
                horizontalLineTo(16.97f)
                verticalLineTo(20.03f)
                lineTo(17.86f, 19.23f)
                curveTo(18.62f, 18.58f, 19.18f, 18.04f, 19.56f, 17.6f)
                curveTo(19.93f, 17.16f, 20.12f, 16.75f, 20.13f, 16.36f)
                curveTo(20.14f, 16.08f, 20.05f, 15.85f, 19.86f, 15.66f)
                curveTo(19.68f, 15.5f, 19.39f, 15.38f, 19.0f, 15.38f)
                curveTo(18.69f, 15.38f, 18.42f, 15.44f, 18.16f, 15.56f)
                lineTo(17.5f, 15.94f)
                lineTo(17.05f, 14.77f)
                curveTo(17.32f, 14.56f, 17.64f, 14.38f, 18.03f, 14.24f)
                curveTo(18.42f, 14.1f, 18.85f, 14.0f, 19.32f, 14.0f)
                curveTo(20.1f, 14.04f, 20.7f, 14.25f, 21.1f, 14.66f)
                curveTo(21.5f, 15.07f, 21.72f, 15.59f, 21.72f, 16.23f)
                curveTo(21.71f, 16.79f, 21.53f, 17.31f, 21.18f, 17.78f)
                curveTo(20.84f, 18.25f, 20.42f, 18.7f, 19.91f, 19.14f)
                lineTo(19.27f, 19.66f)
                verticalLineTo(19.68f)
                horizontalLineTo(21.85f)
                verticalLineTo(21.03f)
                close()
            }
        }
        .build()
        return _formatSubscript!!
    }

private var _formatSubscript: ImageVector? = null
