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

public val MaterialDesignIcons.IdeogramCjkVariant: ImageVector
    get() {
        if (_ideogramCjkVariant != null) {
            return _ideogramCjkVariant!!
        }
        _ideogramCjkVariant = Builder(name = "IdeogramCjkVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.36f)
                curveTo(15.13f, 8.87f, 14.63f, 9.77f, 13.88f, 10.69f)
                curveTo(13.35f, 11.35f, 12.71f, 12.0f, 12.0f, 12.67f)
                curveTo(11.29f, 12.0f, 10.65f, 11.35f, 10.12f, 10.69f)
                curveTo(9.65f, 10.12f, 9.3f, 9.55f, 9.03f, 9.0f)
                horizontalLineTo(6.85f)
                curveTo(7.21f, 10.05f, 7.82f, 11.03f, 8.56f, 11.95f)
                curveTo(9.13f, 12.66f, 9.79f, 13.34f, 10.5f, 14.0f)
                lineTo(5.36f, 18.23f)
                lineTo(6.64f, 19.77f)
                lineTo(12.0f, 15.34f)
                lineTo(17.36f, 19.77f)
                lineTo(18.64f, 18.23f)
                lineTo(13.5f, 14.0f)
                curveTo(14.21f, 13.34f, 14.87f, 12.66f, 15.44f, 11.95f)
                curveTo(16.41f, 10.74f, 17.16f, 9.43f, 17.4f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _ideogramCjkVariant!!
    }

private var _ideogramCjkVariant: ImageVector? = null
