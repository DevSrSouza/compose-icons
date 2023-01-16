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

public val MaterialDesignIcons.Necklace: ImageVector
    get() {
        if (_necklace != null) {
            return _necklace!!
        }
        _necklace = Builder(name = "Necklace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 5.0f)
                horizontalLineTo(19.5f)
                curveTo(19.5f, 9.14f, 16.14f, 12.5f, 12.0f, 12.5f)
                curveTo(7.86f, 12.5f, 4.5f, 9.14f, 4.5f, 5.0f)
                horizontalLineTo(2.5f)
                curveTo(2.55f, 10.11f, 6.59f, 14.29f, 11.7f, 14.5f)
                curveTo(11.1f, 15.4f, 10.0f, 17.2f, 10.0f, 18.0f)
                curveTo(10.0f, 20.67f, 14.0f, 20.67f, 14.0f, 18.0f)
                curveTo(14.0f, 17.2f, 12.9f, 15.4f, 12.3f, 14.5f)
                curveTo(17.41f, 14.29f, 21.45f, 10.11f, 21.5f, 5.0f)
                close()
            }
        }
        .build()
        return _necklace!!
    }

private var _necklace: ImageVector? = null
