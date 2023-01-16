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

public val MaterialDesignIcons.TurnstileOutline: ImageVector
    get() {
        if (_turnstileOutline != null) {
            return _turnstileOutline!!
        }
        _turnstileOutline = Builder(name = "TurnstileOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.41f, 10.41f)
                curveTo(13.04f, 10.79f, 12.53f, 11.0f, 12.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 9.0f)
                curveTo(10.0f, 8.47f, 10.21f, 7.96f, 10.59f, 7.59f)
                lineTo(9.17f, 6.17f)
                curveTo(8.42f, 6.92f, 8.0f, 7.94f, 8.0f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.55f)
                curveTo(8.9f, 11.6f, 9.4f, 12.1f, 10.0f, 12.45f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                curveTo(13.06f, 13.0f, 14.08f, 12.58f, 14.83f, 11.83f)
                lineTo(13.41f, 10.41f)
                moveTo(10.0f, 2.0f)
                verticalLineTo(5.0f)
                lineTo(16.0f, 11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.17f)
                lineTo(12.0f, 4.17f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _turnstileOutline!!
    }

private var _turnstileOutline: ImageVector? = null
