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

public val MaterialDesignIcons.BorderColor: ImageVector
    get() {
        if (_borderColor != null) {
            return _borderColor!!
        }
        _borderColor = Builder(name = "BorderColor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 4.04f)
                curveTo(21.1f, 3.65f, 21.1f, 3.0f, 20.71f, 2.63f)
                lineTo(18.37f, 0.29f)
                curveTo(18.0f, -0.1f, 17.35f, -0.1f, 16.96f, 0.29f)
                lineTo(15.0f, 2.25f)
                lineTo(18.75f, 6.0f)
                moveTo(17.75f, 7.0f)
                lineTo(14.0f, 3.25f)
                lineTo(4.0f, 13.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.75f)
                lineTo(17.75f, 7.0f)
                close()
            }
        }
        .build()
        return _borderColor!!
    }

private var _borderColor: ImageVector? = null
