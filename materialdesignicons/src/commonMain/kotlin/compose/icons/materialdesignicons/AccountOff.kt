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

public val MaterialDesignIcons.AccountOff: ImageVector
    get() {
        if (_accountOff != null) {
            return _accountOff!!
        }
        _accountOff = Builder(name = "AccountOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 8.0f)
                curveTo(16.0f, 9.95f, 14.6f, 11.58f, 12.75f, 11.93f)
                lineTo(8.07f, 7.25f)
                curveTo(8.42f, 5.4f, 10.05f, 4.0f, 12.0f, 4.0f)
                moveTo(12.28f, 14.0f)
                lineTo(18.28f, 20.0f)
                lineTo(20.0f, 21.72f)
                lineTo(18.73f, 23.0f)
                lineTo(15.73f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 16.16f, 6.5f, 14.61f, 9.87f, 14.14f)
                lineTo(2.78f, 7.05f)
                lineTo(4.05f, 5.78f)
                lineTo(12.28f, 14.0f)
                moveTo(20.0f, 18.0f)
                verticalLineTo(19.18f)
                lineTo(15.14f, 14.32f)
                curveTo(18.0f, 14.93f, 20.0f, 16.35f, 20.0f, 18.0f)
                close()
            }
        }
        .build()
        return _accountOff!!
    }

private var _accountOff: ImageVector? = null
