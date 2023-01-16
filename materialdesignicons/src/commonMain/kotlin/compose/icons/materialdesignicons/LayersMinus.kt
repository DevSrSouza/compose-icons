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

public val MaterialDesignIcons.LayersMinus: ImageVector
    get() {
        if (_layersMinus != null) {
            return _layersMinus!!
        }
        _layersMinus = Builder(name = "LayersMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                moveTo(11.0f, 16.0f)
                lineTo(2.0f, 9.0f)
                lineTo(11.0f, 2.0f)
                lineTo(20.0f, 9.0f)
                lineTo(11.0f, 16.0f)
                moveTo(11.0f, 18.54f)
                lineTo(12.0f, 17.75f)
                verticalLineTo(18.0f)
                curveTo(12.0f, 18.71f, 12.12f, 19.39f, 12.35f, 20.0f)
                lineTo(11.0f, 21.07f)
                lineTo(2.0f, 14.07f)
                lineTo(3.62f, 12.81f)
                lineTo(11.0f, 18.54f)
                close()
            }
        }
        .build()
        return _layersMinus!!
    }

private var _layersMinus: ImageVector? = null
