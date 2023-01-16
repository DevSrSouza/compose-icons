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

public val MaterialDesignIcons.LanguageSwift: ImageVector
    get() {
        if (_languageSwift != null) {
            return _languageSwift!!
        }
        _languageSwift = Builder(name = "LanguageSwift", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.09f, 19.72f)
                curveTo(14.73f, 21.08f, 11.5f, 21.22f, 8.23f, 19.82f)
                curveTo(5.59f, 18.7f, 3.4f, 16.74f, 2.0f, 14.5f)
                curveTo(2.67f, 15.05f, 3.46f, 15.5f, 4.3f, 15.9f)
                curveTo(7.67f, 17.47f, 11.03f, 17.36f, 13.4f, 15.9f)
                curveTo(10.03f, 13.31f, 7.16f, 9.94f, 5.03f, 7.19f)
                curveTo(4.58f, 6.74f, 4.25f, 6.18f, 3.91f, 5.68f)
                curveTo(12.19f, 11.73f, 11.83f, 13.27f, 6.32f, 4.67f)
                curveTo(11.21f, 9.61f, 15.75f, 12.41f, 15.75f, 12.41f)
                curveTo(15.91f, 12.5f, 16.0f, 12.57f, 16.11f, 12.63f)
                curveTo(16.21f, 12.38f, 16.3f, 12.12f, 16.37f, 11.85f)
                curveTo(17.16f, 9.0f, 16.26f, 5.73f, 14.29f, 3.04f)
                curveTo(18.84f, 5.79f, 21.54f, 10.95f, 20.41f, 15.28f)
                curveTo(20.38f, 15.39f, 20.35f, 15.5f, 20.36f, 15.67f)
                curveTo(22.6f, 18.5f, 22.0f, 21.45f, 21.71f, 20.89f)
                curveTo(20.5f, 18.5f, 18.23f, 19.24f, 17.09f, 19.72f)
                verticalLineTo(19.72f)
                close()
            }
        }
        .build()
        return _languageSwift!!
    }

private var _languageSwift: ImageVector? = null
