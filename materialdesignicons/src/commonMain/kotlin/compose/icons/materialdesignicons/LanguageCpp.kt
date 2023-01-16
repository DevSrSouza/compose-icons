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

public val MaterialDesignIcons.LanguageCpp: ImageVector
    get() {
        if (_languageCpp != null) {
            return _languageCpp!!
        }
        _languageCpp = Builder(name = "LanguageCpp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 15.97f)
                lineTo(10.91f, 18.41f)
                curveTo(10.65f, 18.55f, 10.23f, 18.68f, 9.67f, 18.8f)
                curveTo(9.1f, 18.93f, 8.43f, 19.0f, 7.66f, 19.0f)
                curveTo(5.45f, 18.96f, 3.79f, 18.3f, 2.68f, 17.04f)
                curveTo(1.56f, 15.77f, 1.0f, 14.16f, 1.0f, 12.21f)
                curveTo(1.05f, 9.9f, 1.72f, 8.13f, 3.0f, 6.89f)
                curveTo(4.32f, 5.64f, 5.96f, 5.0f, 7.94f, 5.0f)
                curveTo(8.69f, 5.0f, 9.34f, 5.07f, 9.88f, 5.19f)
                curveTo(10.42f, 5.31f, 10.82f, 5.44f, 11.08f, 5.59f)
                lineTo(10.5f, 8.08f)
                lineTo(9.44f, 7.74f)
                curveTo(9.04f, 7.64f, 8.58f, 7.59f, 8.05f, 7.59f)
                curveTo(6.89f, 7.58f, 5.93f, 7.95f, 5.18f, 8.69f)
                curveTo(4.42f, 9.42f, 4.03f, 10.54f, 4.0f, 12.03f)
                curveTo(4.0f, 13.39f, 4.37f, 14.45f, 5.08f, 15.23f)
                curveTo(5.79f, 16.0f, 6.79f, 16.4f, 8.07f, 16.41f)
                lineTo(9.4f, 16.29f)
                curveTo(9.83f, 16.21f, 10.19f, 16.1f, 10.5f, 15.97f)
                moveTo(11.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                moveTo(18.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _languageCpp!!
    }

private var _languageCpp: ImageVector? = null
