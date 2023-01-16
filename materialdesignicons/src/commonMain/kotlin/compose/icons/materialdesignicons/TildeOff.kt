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

public val MaterialDesignIcons.TildeOff: ImageVector
    get() {
        if (_tildeOff != null) {
            return _tildeOff!!
        }
        _tildeOff = Builder(name = "TildeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(10.78f, 12.67f)
                curveTo(10.0f, 12.03f, 9.27f, 11.5f, 8.5f, 11.5f)
                curveTo(4.5f, 11.5f, 4.5f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 15.0f, 2.0f, 9.59f, 7.16f, 9.05f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(10.03f, 9.37f)
                lineTo(10.03f, 9.37f)
                lineTo(15.64f, 15.0f)
                lineTo(15.63f, 15.0f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(22.0f, 9.0f)
                horizontalLineTo(19.5f)
                curveTo(19.5f, 9.0f, 19.5f, 12.38f, 15.69f, 12.5f)
                lineTo(17.95f, 14.75f)
                curveTo(22.0f, 13.62f, 22.0f, 9.0f, 22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _tildeOff!!
    }

private var _tildeOff: ImageVector? = null
