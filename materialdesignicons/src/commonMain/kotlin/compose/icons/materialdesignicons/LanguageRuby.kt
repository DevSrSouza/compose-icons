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

public val MaterialDesignIcons.LanguageRuby: ImageVector
    get() {
        if (_languageRuby != null) {
            return _languageRuby!!
        }
        _languageRuby = Builder(name = "LanguageRuby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.8f, 2.07f)
                curveTo(21.32f, 2.5f, 22.04f, 4.23f, 22.0f, 6.04f)
                verticalLineTo(6.0f)
                lineTo(20.86f, 20.93f)
                lineTo(6.08f, 21.94f)
                horizontalLineTo(6.09f)
                curveTo(4.86f, 21.89f, 2.13f, 21.77f, 2.0f, 17.95f)
                lineTo(3.37f, 15.45f)
                lineTo(6.14f, 21.91f)
                lineTo(8.5f, 14.29f)
                lineTo(8.45f, 14.3f)
                lineTo(8.47f, 14.28f)
                lineTo(16.18f, 16.74f)
                lineTo(14.19f, 8.96f)
                lineTo(21.54f, 8.5f)
                lineTo(15.75f, 3.76f)
                lineTo(18.8f, 2.06f)
                verticalLineTo(2.07f)
                moveTo(2.0f, 17.91f)
                verticalLineTo(17.93f)
                lineTo(2.0f, 17.91f)
                verticalLineTo(17.91f)
                moveTo(6.28f, 6.23f)
                curveTo(9.24f, 3.28f, 13.07f, 1.54f, 14.54f, 3.03f)
                curveTo(16.0f, 4.5f, 14.46f, 8.12f, 11.5f, 11.06f)
                curveTo(8.5f, 14.0f, 4.73f, 15.84f, 3.26f, 14.36f)
                curveTo(1.79f, 12.87f, 3.3f, 9.17f, 6.27f, 6.23f)
                horizontalLineTo(6.28f)
                close()
            }
        }
        .build()
        return _languageRuby!!
    }

private var _languageRuby: ImageVector? = null
