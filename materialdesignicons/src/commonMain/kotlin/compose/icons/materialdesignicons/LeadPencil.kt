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

public val MaterialDesignIcons.LeadPencil: ImageVector
    get() {
        if (_leadPencil != null) {
            return _leadPencil!!
        }
        _leadPencil = Builder(name = "LeadPencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.84f, 2.73f)
                curveTo(16.45f, 2.73f, 16.07f, 2.88f, 15.77f, 3.17f)
                lineTo(13.65f, 5.29f)
                lineTo(18.95f, 10.6f)
                lineTo(21.07f, 8.5f)
                curveTo(21.67f, 7.89f, 21.67f, 6.94f, 21.07f, 6.36f)
                lineTo(17.9f, 3.17f)
                curveTo(17.6f, 2.88f, 17.22f, 2.73f, 16.84f, 2.73f)
                moveTo(12.94f, 6.0f)
                lineTo(4.84f, 14.11f)
                lineTo(7.4f, 14.39f)
                lineTo(7.58f, 16.68f)
                lineTo(9.86f, 16.85f)
                lineTo(10.15f, 19.41f)
                lineTo(18.25f, 11.3f)
                moveTo(4.25f, 15.04f)
                lineTo(2.5f, 21.73f)
                lineTo(9.2f, 19.94f)
                lineTo(8.96f, 17.78f)
                lineTo(6.65f, 17.61f)
                lineTo(6.47f, 15.29f)
            }
        }
        .build()
        return _leadPencil!!
    }

private var _leadPencil: ImageVector? = null
