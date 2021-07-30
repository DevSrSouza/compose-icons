package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.YandexInternational: ImageVector
    get() {
        if (_yandexInternational != null) {
            return _yandexInternational!!
        }
        _yandexInternational = Builder(name = "YandexInternational", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8008f, 1.0f)
                lineTo(15.1992f, 17.1992f)
                lineTo(10.1992f, 4.0f)
                lineTo(7.0f, 4.0f)
                lineTo(14.0f, 22.5996f)
                lineTo(14.0f, 31.0f)
                lineTo(17.0f, 31.0f)
                lineTo(17.0f, 21.0996f)
                lineTo(24.0f, 1.0f)
                lineTo(20.8008f, 1.0f)
                close()
            }
        }
        .build()
        return _yandexInternational!!
    }

private var _yandexInternational: ImageVector? = null
