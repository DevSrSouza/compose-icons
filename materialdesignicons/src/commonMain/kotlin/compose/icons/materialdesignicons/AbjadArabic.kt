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

public val MaterialDesignIcons.AbjadArabic: ImageVector
    get() {
        if (_abjadArabic != null) {
            return _abjadArabic!!
        }
        _abjadArabic = Builder(name = "AbjadArabic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(10.08f, 4.0f, 8.5f, 5.58f, 8.5f, 7.5f)
                curveTo(8.5f, 8.43f, 8.88f, 9.28f, 9.5f, 9.91f)
                curveTo(7.97f, 10.91f, 7.0f, 12.62f, 7.0f, 14.5f)
                curveTo(7.0f, 17.53f, 9.47f, 20.0f, 12.5f, 20.0f)
                curveTo(14.26f, 20.0f, 16.0f, 19.54f, 17.5f, 18.66f)
                lineTo(16.5f, 16.93f)
                curveTo(15.28f, 17.63f, 13.9f, 18.0f, 12.5f, 18.0f)
                curveTo(10.56f, 18.0f, 9.0f, 16.45f, 9.0f, 14.5f)
                curveTo(9.0f, 12.91f, 10.06f, 11.53f, 11.59f, 11.12f)
                lineTo(16.8f, 9.72f)
                lineTo(16.28f, 7.79f)
                lineTo(11.83f, 9.0f)
                curveTo(11.08f, 8.9f, 10.5f, 8.28f, 10.5f, 7.5f)
                curveTo(10.5f, 6.66f, 11.16f, 6.0f, 12.0f, 6.0f)
                curveTo(12.26f, 6.0f, 12.5f, 6.07f, 12.75f, 6.2f)
                lineTo(13.75f, 4.47f)
                curveTo(13.22f, 4.16f, 12.61f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _abjadArabic!!
    }

private var _abjadArabic: ImageVector? = null
