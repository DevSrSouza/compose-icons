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

public val MaterialDesignIcons.Xml: ImageVector
    get() {
        if (_xml != null) {
            return _xml!!
        }
        _xml = Builder(name = "Xml", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.89f, 3.0f)
                lineTo(14.85f, 3.4f)
                lineTo(11.11f, 21.0f)
                lineTo(9.15f, 20.6f)
                lineTo(12.89f, 3.0f)
                moveTo(19.59f, 12.0f)
                lineTo(16.0f, 8.41f)
                verticalLineTo(5.58f)
                lineTo(22.42f, 12.0f)
                lineTo(16.0f, 18.41f)
                verticalLineTo(15.58f)
                lineTo(19.59f, 12.0f)
                moveTo(1.58f, 12.0f)
                lineTo(8.0f, 5.58f)
                verticalLineTo(8.41f)
                lineTo(4.41f, 12.0f)
                lineTo(8.0f, 15.58f)
                verticalLineTo(18.41f)
                lineTo(1.58f, 12.0f)
                close()
            }
        }
        .build()
        return _xml!!
    }

private var _xml: ImageVector? = null
