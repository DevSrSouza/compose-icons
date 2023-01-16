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

public val MaterialDesignIcons.Turnstile: ImageVector
    get() {
        if (_turnstile != null) {
            return _turnstile!!
        }
        _turnstile = Builder(name = "Turnstile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                lineTo(10.0f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                moveTo(9.17f, 6.17f)
                curveTo(8.42f, 6.92f, 8.0f, 7.94f, 8.0f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.55f)
                curveTo(8.9f, 11.6f, 9.4f, 12.1f, 10.0f, 12.45f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                curveTo(13.06f, 13.0f, 14.08f, 12.58f, 14.83f, 11.83f)
                lineTo(9.17f, 6.17f)
                close()
            }
        }
        .build()
        return _turnstile!!
    }

private var _turnstile: ImageVector? = null
