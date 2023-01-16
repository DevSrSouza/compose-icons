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

public val MaterialDesignIcons.CloudOff: ImageVector
    get() {
        if (_cloudOff != null) {
            return _cloudOff!!
        }
        _cloudOff = Builder(name = "CloudOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8f, 22.6f)
                lineTo(17.15f, 20.0f)
                horizontalLineTo(6.5f)
                quadTo(4.2f, 20.0f, 2.6f, 18.4f)
                reflectiveQuadTo(1.0f, 14.5f)
                quadTo(1.0f, 12.58f, 2.19f, 11.08f)
                quadTo(3.38f, 9.57f, 5.25f, 9.15f)
                quadTo(5.33f, 8.95f, 5.4f, 8.76f)
                quadTo(5.5f, 8.57f, 5.55f, 8.35f)
                lineTo(1.4f, 4.2f)
                lineTo(2.8f, 2.8f)
                lineTo(21.2f, 21.2f)
                moveTo(21.6f, 18.75f)
                lineTo(8.05f, 5.23f)
                quadTo(8.93f, 4.63f, 9.91f, 4.31f)
                quadTo(10.9f, 4.0f, 12.0f, 4.0f)
                quadTo(14.93f, 4.0f, 16.96f, 6.04f)
                quadTo(19.0f, 8.07f, 19.0f, 11.0f)
                quadTo(20.73f, 11.2f, 21.86f, 12.5f)
                quadTo(23.0f, 13.78f, 23.0f, 15.5f)
                quadTo(23.0f, 16.5f, 22.63f, 17.31f)
                quadTo(22.25f, 18.15f, 21.6f, 18.75f)
                close()
            }
        }
        .build()
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
