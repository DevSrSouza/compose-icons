package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.47f, 3.5444f)
                horizontalLineTo(14.4701f)
                curveTo(16.1089f, 3.5444f, 17.4146f, 4.3187f, 18.0963f, 5.515f)
                curveTo(19.3165f, 6.3874f, 19.9427f, 7.9149f, 19.6082f, 9.6533f)
                curveTo(19.0865f, 12.365f, 16.425f, 14.5633f, 13.6636f, 14.5633f)
                horizontalLineTo(11.6636f)
                lineTo(10.5301f, 20.4553f)
                horizontalLineTo(6.3982f)
                lineTo(6.6289f, 19.2563f)
                horizontalLineTo(3.4473f)
                lineTo(6.47f, 3.5444f)
                close()
                moveTo(8.0922f, 5.5084f)
                horizontalLineTo(14.0922f)
                curveTo(15.7491f, 5.5084f, 16.8385f, 6.8274f, 16.5254f, 8.4544f)
                curveTo(16.2124f, 10.0814f, 14.6155f, 11.4004f, 12.9587f, 11.4004f)
                horizontalLineTo(8.9587f)
                lineTo(7.8251f, 17.2923f)
                horizontalLineTo(5.8251f)
                lineTo(8.0922f, 5.5084f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
