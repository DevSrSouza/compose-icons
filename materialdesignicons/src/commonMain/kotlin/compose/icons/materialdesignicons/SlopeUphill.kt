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

public val MaterialDesignIcons.SlopeUphill: ImageVector
    get() {
        if (_slopeUphill != null) {
            return _slopeUphill!!
        }
        _slopeUphill = Builder(name = "SlopeUphill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                lineTo(22.0f, 13.0f)
                moveTo(21.68f, 7.06f)
                lineTo(16.86f, 4.46f)
                lineTo(17.7f, 7.24f)
                lineTo(7.58f, 10.24f)
                curveTo(6.63f, 8.95f, 4.82f, 8.67f, 3.53f, 9.62f)
                curveTo(2.24f, 10.57f, 1.96f, 12.38f, 2.91f, 13.67f)
                curveTo(3.85f, 14.97f, 5.67f, 15.24f, 6.96f, 14.29f)
                curveTo(7.67f, 13.78f, 8.1f, 12.97f, 8.14f, 12.09f)
                lineTo(18.26f, 9.09f)
                lineTo(19.1f, 11.87f)
                lineTo(21.68f, 7.06f)
                close()
            }
        }
        .build()
        return _slopeUphill!!
    }

private var _slopeUphill: ImageVector? = null
