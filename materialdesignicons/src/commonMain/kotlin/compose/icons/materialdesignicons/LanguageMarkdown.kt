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

public val MaterialDesignIcons.LanguageMarkdown: ImageVector
    get() {
        if (_languageMarkdown != null) {
            return _languageMarkdown!!
        }
        _languageMarkdown = Builder(name = "LanguageMarkdown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(6.81f, 15.19f)
                verticalLineTo(11.53f)
                lineTo(8.73f, 13.88f)
                lineTo(10.65f, 11.53f)
                verticalLineTo(15.19f)
                horizontalLineTo(12.58f)
                verticalLineTo(8.81f)
                horizontalLineTo(10.65f)
                lineTo(8.73f, 11.16f)
                lineTo(6.81f, 8.81f)
                horizontalLineTo(4.89f)
                verticalLineTo(15.19f)
                horizontalLineTo(6.81f)
                moveTo(19.69f, 12.0f)
                horizontalLineTo(17.77f)
                verticalLineTo(8.81f)
                horizontalLineTo(15.85f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.92f)
                lineTo(16.81f, 15.28f)
                lineTo(19.69f, 12.0f)
                close()
            }
        }
        .build()
        return _languageMarkdown!!
    }

private var _languageMarkdown: ImageVector? = null
