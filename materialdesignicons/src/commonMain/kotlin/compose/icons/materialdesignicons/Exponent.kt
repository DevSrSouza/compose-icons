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

public val MaterialDesignIcons.Exponent: ImageVector
    get() {
        if (_exponent != null) {
            return _exponent!!
        }
        _exponent = Builder(name = "Exponent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.38f, 3.0f)
                lineTo(17.77f, 8.75f)
                curveTo(17.55f, 9.68f, 17.27f, 10.32f, 17.0f, 10.7f)
                curveTo(16.67f, 11.18f, 16.44f, 11.25f, 16.19f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(16.94f, 12.75f, 17.74f, 12.35f, 18.24f, 11.56f)
                curveTo(19.87f, 8.94f, 22.0f, 3.0f, 22.0f, 3.0f)
                horizontalLineTo(20.38f)
                lineTo(18.69f, 7.05f)
                lineTo(17.0f, 3.0f)
                horizontalLineTo(15.38f)
                moveTo(3.42f, 8.59f)
                lineTo(2.0f, 10.0f)
                lineTo(6.79f, 14.79f)
                lineTo(2.0f, 19.59f)
                lineTo(3.41f, 21.0f)
                lineTo(8.21f, 16.21f)
                lineTo(13.0f, 21.0f)
                lineTo(14.41f, 19.59f)
                lineTo(9.62f, 14.79f)
                lineTo(14.41f, 10.0f)
                lineTo(13.0f, 8.59f)
                lineTo(8.21f, 13.38f)
                lineTo(3.41f, 8.59f)
                horizontalLineTo(3.42f)
                close()
            }
        }
        .build()
        return _exponent!!
    }

private var _exponent: ImageVector? = null
