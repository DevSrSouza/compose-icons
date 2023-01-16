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

public val MaterialDesignIcons.LanguageMarkdownOutline: ImageVector
    get() {
        if (_languageMarkdownOutline != null) {
            return _languageMarkdownOutline!!
        }
        _languageMarkdownOutline = Builder(name = "LanguageMarkdownOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.56f, 18.0f)
                horizontalLineTo(3.44f)
                curveTo(2.65f, 18.0f, 2.0f, 17.37f, 2.0f, 16.59f)
                verticalLineTo(7.41f)
                curveTo(2.0f, 6.63f, 2.65f, 6.0f, 3.44f, 6.0f)
                horizontalLineTo(20.56f)
                curveTo(21.35f, 6.0f, 22.0f, 6.63f, 22.0f, 7.41f)
                verticalLineTo(16.59f)
                curveTo(22.0f, 17.37f, 21.35f, 18.0f, 20.56f, 18.0f)
                moveTo(3.44f, 6.94f)
                curveTo(3.18f, 6.94f, 2.96f, 7.15f, 2.96f, 7.41f)
                verticalLineTo(16.6f)
                curveTo(2.96f, 16.85f, 3.18f, 17.06f, 3.44f, 17.06f)
                horizontalLineTo(20.56f)
                curveTo(20.82f, 17.06f, 21.04f, 16.85f, 21.04f, 16.6f)
                verticalLineTo(7.41f)
                curveTo(21.04f, 7.15f, 20.82f, 6.94f, 20.56f, 6.94f)
                horizontalLineTo(3.44f)
                moveTo(4.89f, 15.19f)
                verticalLineTo(8.81f)
                horizontalLineTo(6.81f)
                lineTo(8.73f, 11.16f)
                lineTo(10.65f, 8.81f)
                horizontalLineTo(12.58f)
                verticalLineTo(15.19f)
                horizontalLineTo(10.65f)
                verticalLineTo(11.53f)
                lineTo(8.73f, 13.88f)
                lineTo(6.81f, 11.53f)
                verticalLineTo(15.19f)
                horizontalLineTo(4.89f)
                moveTo(16.9f, 15.19f)
                lineTo(14.0f, 12.09f)
                horizontalLineTo(15.94f)
                verticalLineTo(8.81f)
                horizontalLineTo(17.86f)
                verticalLineTo(12.09f)
                horizontalLineTo(19.79f)
                lineTo(16.9f, 15.19f)
            }
        }
        .build()
        return _languageMarkdownOutline!!
    }

private var _languageMarkdownOutline: ImageVector? = null
