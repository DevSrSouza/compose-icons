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

public val MaterialDesignIcons.DiamondOutline: ImageVector
    get() {
        if (_diamondOutline != null) {
            return _diamondOutline!!
        }
        _diamondOutline = Builder(name = "DiamondOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                lineTo(2.0f, 8.0f)
                lineTo(12.0f, 22.0f)
                lineTo(22.0f, 8.0f)
                lineTo(18.0f, 2.0f)
                moveTo(4.43f, 8.0f)
                lineTo(7.07f, 4.0f)
                horizontalLineTo(16.93f)
                lineTo(19.57f, 8.0f)
                lineTo(12.0f, 18.56f)
                lineTo(4.43f, 8.0f)
                close()
            }
        }
        .build()
        return _diamondOutline!!
    }

private var _diamondOutline: ImageVector? = null
