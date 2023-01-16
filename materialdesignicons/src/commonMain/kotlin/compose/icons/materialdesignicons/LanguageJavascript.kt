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

public val MaterialDesignIcons.LanguageJavascript: ImageVector
    get() {
        if (_languageJavascript != null) {
            return _languageJavascript!!
        }
        _languageJavascript = Builder(name = "LanguageJavascript", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                moveTo(7.73f, 18.04f)
                curveTo(8.13f, 18.89f, 8.92f, 19.59f, 10.27f, 19.59f)
                curveTo(11.77f, 19.59f, 12.8f, 18.79f, 12.8f, 17.04f)
                verticalLineTo(11.26f)
                horizontalLineTo(11.1f)
                verticalLineTo(17.0f)
                curveTo(11.1f, 17.86f, 10.75f, 18.08f, 10.2f, 18.08f)
                curveTo(9.62f, 18.08f, 9.38f, 17.68f, 9.11f, 17.21f)
                lineTo(7.73f, 18.04f)
                moveTo(13.71f, 17.86f)
                curveTo(14.21f, 18.84f, 15.22f, 19.59f, 16.8f, 19.59f)
                curveTo(18.4f, 19.59f, 19.6f, 18.76f, 19.6f, 17.23f)
                curveTo(19.6f, 15.82f, 18.79f, 15.19f, 17.35f, 14.57f)
                lineTo(16.93f, 14.39f)
                curveTo(16.2f, 14.08f, 15.89f, 13.87f, 15.89f, 13.37f)
                curveTo(15.89f, 12.96f, 16.2f, 12.64f, 16.7f, 12.64f)
                curveTo(17.18f, 12.64f, 17.5f, 12.85f, 17.79f, 13.37f)
                lineTo(19.1f, 12.5f)
                curveTo(18.55f, 11.54f, 17.77f, 11.17f, 16.7f, 11.17f)
                curveTo(15.19f, 11.17f, 14.22f, 12.13f, 14.22f, 13.4f)
                curveTo(14.22f, 14.78f, 15.03f, 15.43f, 16.25f, 15.95f)
                lineTo(16.67f, 16.13f)
                curveTo(17.45f, 16.47f, 17.91f, 16.68f, 17.91f, 17.26f)
                curveTo(17.91f, 17.74f, 17.46f, 18.09f, 16.76f, 18.09f)
                curveTo(15.93f, 18.09f, 15.45f, 17.66f, 15.09f, 17.06f)
                lineTo(13.71f, 17.86f)
                close()
            }
        }
        .build()
        return _languageJavascript!!
    }

private var _languageJavascript: ImageVector? = null
