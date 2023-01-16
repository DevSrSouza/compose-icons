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

public val MaterialDesignIcons.LanguageHtml5: ImageVector
    get() {
        if (_languageHtml5 != null) {
            return _languageHtml5!!
        }
        _languageHtml5 = Builder(name = "LanguageHtml5", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.56f)
                lineTo(16.07f, 16.43f)
                lineTo(16.62f, 10.33f)
                horizontalLineTo(9.38f)
                lineTo(9.2f, 8.3f)
                horizontalLineTo(16.8f)
                lineTo(17.0f, 6.31f)
                horizontalLineTo(7.0f)
                lineTo(7.56f, 12.32f)
                horizontalLineTo(14.45f)
                lineTo(14.22f, 14.9f)
                lineTo(12.0f, 15.5f)
                lineTo(9.78f, 14.9f)
                lineTo(9.64f, 13.24f)
                horizontalLineTo(7.64f)
                lineTo(7.93f, 16.43f)
                lineTo(12.0f, 17.56f)
                moveTo(4.07f, 3.0f)
                horizontalLineTo(19.93f)
                lineTo(18.5f, 19.2f)
                lineTo(12.0f, 21.0f)
                lineTo(5.5f, 19.2f)
                lineTo(4.07f, 3.0f)
                close()
            }
        }
        .build()
        return _languageHtml5!!
    }

private var _languageHtml5: ImageVector? = null
