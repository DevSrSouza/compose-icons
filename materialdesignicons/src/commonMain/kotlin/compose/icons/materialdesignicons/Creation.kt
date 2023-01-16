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

public val MaterialDesignIcons.Creation: ImageVector
    get() {
        if (_creation != null) {
            return _creation!!
        }
        _creation = Builder(name = "Creation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 1.0f)
                lineTo(17.74f, 3.75f)
                lineTo(15.0f, 5.0f)
                lineTo(17.74f, 6.26f)
                lineTo(19.0f, 9.0f)
                lineTo(20.25f, 6.26f)
                lineTo(23.0f, 5.0f)
                lineTo(20.25f, 3.75f)
                moveTo(9.0f, 4.0f)
                lineTo(6.5f, 9.5f)
                lineTo(1.0f, 12.0f)
                lineTo(6.5f, 14.5f)
                lineTo(9.0f, 20.0f)
                lineTo(11.5f, 14.5f)
                lineTo(17.0f, 12.0f)
                lineTo(11.5f, 9.5f)
                moveTo(19.0f, 15.0f)
                lineTo(17.74f, 17.74f)
                lineTo(15.0f, 19.0f)
                lineTo(17.74f, 20.25f)
                lineTo(19.0f, 23.0f)
                lineTo(20.25f, 20.25f)
                lineTo(23.0f, 19.0f)
                lineTo(20.25f, 17.74f)
            }
        }
        .build()
        return _creation!!
    }

private var _creation: ImageVector? = null
