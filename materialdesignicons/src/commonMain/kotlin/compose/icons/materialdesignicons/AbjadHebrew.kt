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

public val MaterialDesignIcons.AbjadHebrew: ImageVector
    get() {
        if (_abjadHebrew != null) {
            return _abjadHebrew!!
        }
        _abjadHebrew = Builder(name = "AbjadHebrew", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9f, 4.0f)
                lineTo(9.0f, 10.03f)
                curveTo(7.58f, 10.17f, 6.36f, 11.18f, 6.0f, 12.59f)
                lineTo(4.0f, 20.0f)
                horizontalLineTo(6.07f)
                lineTo(7.92f, 13.11f)
                curveTo(8.09f, 12.46f, 8.69f, 12.0f, 9.36f, 12.0f)
                horizontalLineTo(10.69f)
                lineTo(17.47f, 20.0f)
                horizontalLineTo(20.1f)
                lineTo(15.0f, 13.97f)
                curveTo(16.42f, 13.83f, 17.64f, 12.82f, 18.0f, 11.41f)
                lineTo(20.0f, 4.0f)
                horizontalLineTo(17.93f)
                lineTo(16.08f, 10.89f)
                curveTo(15.91f, 11.54f, 15.31f, 12.0f, 14.64f, 12.0f)
                horizontalLineTo(13.31f)
                lineTo(6.53f, 4.0f)
                close()
            }
        }
        .build()
        return _abjadHebrew!!
    }

private var _abjadHebrew: ImageVector? = null
