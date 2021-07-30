package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.YandexInternational: ImageVector
    get() {
        if (_yandexInternational != null) {
            return _yandexInternational!!
        }
        _yandexInternational = Builder(name = "YandexInternational", defaultWidth = 320.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(129.5f, 512.0f)
                verticalLineTo(345.9f)
                lineTo(18.5f, 48.0f)
                horizontalLineToRelative(55.8f)
                lineToRelative(81.8f, 229.7f)
                lineTo(250.2f, 0.0f)
                horizontalLineToRelative(51.3f)
                lineTo(180.8f, 347.8f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(-51.3f)
                close()
            }
        }
        .build()
        return _yandexInternational!!
    }

private var _yandexInternational: ImageVector? = null
