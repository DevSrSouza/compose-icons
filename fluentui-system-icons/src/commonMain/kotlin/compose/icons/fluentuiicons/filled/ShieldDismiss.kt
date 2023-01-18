package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ShieldDismiss: ImageVector
    get() {
        if (_shieldDismiss != null) {
            return _shieldDismiss!!
        }
        _shieldDismiss = Builder(name = "ShieldDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.45f, 2.15f)
                curveTo(14.992f, 4.0565f, 17.5866f, 5.0f, 20.25f, 5.0f)
                curveTo(20.6642f, 5.0f, 21.0f, 5.3358f, 21.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 16.0012f, 18.0424f, 19.6757f, 12.2749f, 21.9478f)
                curveTo(12.0982f, 22.0174f, 11.9018f, 22.0174f, 11.7251f, 21.9478f)
                curveTo(5.9576f, 19.6757f, 3.0f, 16.0012f, 3.0f, 11.0f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 5.3358f, 3.3358f, 5.0f, 3.75f, 5.0f)
                curveTo(6.4134f, 5.0f, 9.008f, 4.0565f, 11.55f, 2.15f)
                curveTo(11.8167f, 1.95f, 12.1833f, 1.95f, 12.45f, 2.15f)
                close()
                moveTo(9.2809f, 8.2216f)
                curveTo(8.9884f, 7.9291f, 8.5141f, 7.9291f, 8.2216f, 8.2216f)
                curveTo(7.9556f, 8.4875f, 7.9315f, 8.9037f, 8.1491f, 9.1969f)
                lineTo(8.2216f, 9.2809f)
                lineTo(10.945f, 12.004f)
                lineTo(8.2216f, 14.7287f)
                curveTo(7.9291f, 15.0212f, 7.9291f, 15.4955f, 8.2216f, 15.788f)
                curveTo(8.5141f, 16.0806f, 8.9884f, 16.0806f, 9.2809f, 15.788f)
                lineTo(12.004f, 13.064f)
                lineTo(14.7287f, 15.788f)
                curveTo(14.9946f, 16.054f, 15.4108f, 16.0781f, 15.704f, 15.8606f)
                lineTo(15.788f, 15.788f)
                curveTo(16.054f, 15.5221f, 16.0781f, 15.106f, 15.8606f, 14.8127f)
                lineTo(15.788f, 14.7287f)
                lineTo(13.064f, 12.004f)
                lineTo(15.788f, 9.2809f)
                curveTo(16.0806f, 8.9884f, 16.0806f, 8.5141f, 15.788f, 8.2216f)
                curveTo(15.4955f, 7.9291f, 15.0212f, 7.9291f, 14.7287f, 8.2216f)
                lineTo(12.004f, 10.945f)
                lineTo(9.2809f, 8.2216f)
                close()
            }
        }
        .build()
        return _shieldDismiss!!
    }

private var _shieldDismiss: ImageVector? = null
