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

public val MaterialDesignIcons.LanguageCss3: ImageVector
    get() {
        if (_languageCss3 != null) {
            return _languageCss3!!
        }
        _languageCss3 = Builder(name = "LanguageCss3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                lineTo(4.35f, 6.34f)
                horizontalLineTo(17.94f)
                lineTo(17.5f, 8.5f)
                horizontalLineTo(3.92f)
                lineTo(3.26f, 11.83f)
                horizontalLineTo(16.85f)
                lineTo(16.09f, 15.64f)
                lineTo(10.61f, 17.45f)
                lineTo(5.86f, 15.64f)
                lineTo(6.19f, 14.0f)
                horizontalLineTo(2.85f)
                lineTo(2.06f, 18.0f)
                lineTo(9.91f, 21.0f)
                lineTo(18.96f, 18.0f)
                lineTo(20.16f, 11.97f)
                lineTo(20.4f, 10.76f)
                lineTo(21.94f, 3.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _languageCss3!!
    }

private var _languageCss3: ImageVector? = null
