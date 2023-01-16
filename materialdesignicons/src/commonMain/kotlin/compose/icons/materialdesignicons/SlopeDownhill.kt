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

public val MaterialDesignIcons.SlopeDownhill: ImageVector
    get() {
        if (_slopeDownhill != null) {
            return _slopeDownhill!!
        }
        _slopeDownhill = Builder(name = "SlopeDownhill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                lineTo(22.0f, 19.0f)
                moveTo(19.09f, 7.5f)
                lineTo(18.25f, 10.26f)
                lineTo(8.13f, 7.26f)
                curveTo(8.06f, 5.66f, 6.7f, 4.42f, 5.1f, 4.5f)
                curveTo(3.5f, 4.57f, 2.26f, 5.93f, 2.34f, 7.53f)
                curveTo(2.41f, 9.13f, 3.77f, 10.36f, 5.37f, 10.29f)
                curveTo(6.24f, 10.25f, 7.05f, 9.82f, 7.57f, 9.11f)
                lineTo(17.69f, 12.11f)
                lineTo(16.85f, 14.89f)
                lineTo(21.67f, 12.29f)
                lineTo(19.09f, 7.5f)
                close()
            }
        }
        .build()
        return _slopeDownhill!!
    }

private var _slopeDownhill: ImageVector? = null
