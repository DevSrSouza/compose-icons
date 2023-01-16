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

public val MaterialDesignIcons.ArrowUpDown: ImageVector
    get() {
        if (_arrowUpDown != null) {
            return _arrowUpDown!!
        }
        _arrowUpDown = Builder(name = "ArrowUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.45f, 17.55f)
                lineTo(12.0f, 23.0f)
                lineTo(6.55f, 17.55f)
                lineTo(7.96f, 16.14f)
                lineTo(11.0f, 19.17f)
                verticalLineTo(4.83f)
                lineTo(7.96f, 7.86f)
                lineTo(6.55f, 6.45f)
                lineTo(12.0f, 1.0f)
                lineTo(17.45f, 6.45f)
                lineTo(16.04f, 7.86f)
                lineTo(13.0f, 4.83f)
                verticalLineTo(19.17f)
                lineTo(16.04f, 16.14f)
                lineTo(17.45f, 17.55f)
                close()
            }
        }
        .build()
        return _arrowUpDown!!
    }

private var _arrowUpDown: ImageVector? = null
