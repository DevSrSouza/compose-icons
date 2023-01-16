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

public val MaterialDesignIcons.LanguageC: ImageVector
    get() {
        if (_languageC != null) {
            return _languageC!!
        }
        _languageC = Builder(name = "LanguageC", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.45f, 15.97f)
                lineTo(15.87f, 18.41f)
                curveTo(15.61f, 18.55f, 15.19f, 18.68f, 14.63f, 18.8f)
                curveTo(14.06f, 18.93f, 13.39f, 19.0f, 12.62f, 19.0f)
                curveTo(10.41f, 18.96f, 8.75f, 18.3f, 7.64f, 17.04f)
                curveTo(6.5f, 15.77f, 5.96f, 14.16f, 5.96f, 12.21f)
                curveTo(6.0f, 9.9f, 6.68f, 8.13f, 8.0f, 6.89f)
                curveTo(9.28f, 5.64f, 10.92f, 5.0f, 12.9f, 5.0f)
                curveTo(13.65f, 5.0f, 14.3f, 5.07f, 14.84f, 5.19f)
                curveTo(15.38f, 5.31f, 15.78f, 5.44f, 16.04f, 5.59f)
                lineTo(15.44f, 8.08f)
                lineTo(14.4f, 7.74f)
                curveTo(14.0f, 7.64f, 13.53f, 7.59f, 13.0f, 7.59f)
                curveTo(11.85f, 7.58f, 10.89f, 7.95f, 10.14f, 8.69f)
                curveTo(9.38f, 9.42f, 9.0f, 10.54f, 8.96f, 12.03f)
                curveTo(8.97f, 13.39f, 9.33f, 14.45f, 10.04f, 15.23f)
                curveTo(10.75f, 16.0f, 11.74f, 16.4f, 13.03f, 16.41f)
                lineTo(14.36f, 16.29f)
                curveTo(14.79f, 16.21f, 15.15f, 16.1f, 15.45f, 15.97f)
                close()
            }
        }
        .build()
        return _languageC!!
    }

private var _languageC: ImageVector? = null
