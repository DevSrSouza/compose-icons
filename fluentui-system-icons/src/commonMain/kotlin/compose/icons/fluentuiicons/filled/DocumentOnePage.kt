package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DocumentOnePage: ImageVector
    get() {
        if (_documentOnePage != null) {
            return _documentOnePage!!
        }
        _documentOnePage = Builder(name = "DocumentOnePage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7499f, 2.0078f)
                curveTo(18.9407f, 2.0078f, 19.9155f, 2.933f, 19.9947f, 4.1038f)
                lineTo(19.9999f, 4.2578f)
                verticalLineTo(19.7559f)
                curveTo(19.9999f, 20.9467f, 19.0747f, 21.9215f, 17.9039f, 22.0007f)
                lineTo(17.7499f, 22.0059f)
                horizontalLineTo(6.25f)
                curveTo(5.0591f, 22.0059f, 4.0844f, 21.0807f, 4.0052f, 19.9099f)
                lineTo(4.0f, 19.7559f)
                verticalLineTo(4.2578f)
                curveTo(4.0f, 3.067f, 4.9252f, 2.0922f, 6.096f, 2.013f)
                lineTo(6.25f, 2.0078f)
                horizontalLineTo(17.7499f)
                close()
                moveTo(7.7498f, 7.0007f)
                curveTo(7.3355f, 7.0007f, 6.9998f, 7.3365f, 6.9998f, 7.7507f)
                curveTo(6.9998f, 8.165f, 7.3355f, 8.5007f, 7.7498f, 8.5007f)
                horizontalLineTo(16.2498f)
                curveTo(16.664f, 8.5007f, 16.9998f, 8.165f, 16.9998f, 7.7507f)
                curveTo(16.9998f, 7.3365f, 16.664f, 7.0007f, 16.2498f, 7.0007f)
                horizontalLineTo(7.7498f)
                close()
                moveTo(6.9998f, 11.7507f)
                curveTo(6.9998f, 12.1649f, 7.3355f, 12.5007f, 7.7498f, 12.5007f)
                horizontalLineTo(16.2498f)
                curveTo(16.664f, 12.5007f, 16.9998f, 12.1649f, 16.9998f, 11.7507f)
                curveTo(16.9998f, 11.3365f, 16.664f, 11.0007f, 16.2498f, 11.0007f)
                horizontalLineTo(7.7498f)
                curveTo(7.3355f, 11.0007f, 6.9998f, 11.3365f, 6.9998f, 11.7507f)
                close()
                moveTo(7.7498f, 15.0007f)
                curveTo(7.3355f, 15.0007f, 6.9998f, 15.3365f, 6.9998f, 15.7507f)
                curveTo(6.9998f, 16.1649f, 7.3355f, 16.5007f, 7.7498f, 16.5007f)
                horizontalLineTo(16.2498f)
                curveTo(16.664f, 16.5007f, 16.9998f, 16.1649f, 16.9998f, 15.7507f)
                curveTo(16.9998f, 15.3365f, 16.664f, 15.0007f, 16.2498f, 15.0007f)
                horizontalLineTo(7.7498f)
                close()
            }
        }
        .build()
        return _documentOnePage!!
    }

private var _documentOnePage: ImageVector? = null
