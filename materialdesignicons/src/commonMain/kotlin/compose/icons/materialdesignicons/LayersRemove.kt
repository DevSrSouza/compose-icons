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

public val MaterialDesignIcons.LayersRemove: ImageVector
    get() {
        if (_layersRemove != null) {
            return _layersRemove!!
        }
        _layersRemove = Builder(name = "LayersRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18.0f, 16.59f)
                lineTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18.0f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18.0f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18.0f)
                lineTo(14.46f, 15.88f)
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
        return _layersRemove!!
    }

private var _layersRemove: ImageVector? = null
