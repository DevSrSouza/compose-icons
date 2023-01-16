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

public val MaterialDesignIcons.IcePop: ImageVector
    get() {
        if (_icePop != null) {
            return _icePop!!
        }
        _icePop = Builder(name = "IcePop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.15f, 14.96f)
                lineTo(9.95f, 18.65f)
                lineTo(5.85f, 9.65f)
                curveTo(7.21f, 9.13f, 8.12f, 7.82f, 8.15f, 6.36f)
                curveTo(8.14f, 5.0f, 7.36f, 3.76f, 6.15f, 3.15f)
                curveTo(6.54f, 2.8f, 7.0f, 2.5f, 7.45f, 2.25f)
                curveTo(9.71f, 1.25f, 12.37f, 2.23f, 13.45f, 4.46f)
                moveTo(13.15f, 18.36f)
                lineTo(14.75f, 21.86f)
                lineTo(17.45f, 20.65f)
                lineTo(15.85f, 17.15f)
            }
        }
        .build()
        return _icePop!!
    }

private var _icePop: ImageVector? = null
