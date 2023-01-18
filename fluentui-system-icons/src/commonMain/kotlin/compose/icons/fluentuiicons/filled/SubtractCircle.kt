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

public val FilledGroup.SubtractCircle: ImageVector
    get() {
        if (_subtractCircle != null) {
            return _subtractCircle!!
        }
        _subtractCircle = Builder(name = "SubtractCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.75f, 11.25f)
                curveTo(7.3358f, 11.25f, 7.0f, 11.5858f, 7.0f, 12.0f)
                curveTo(7.0f, 12.3797f, 7.2821f, 12.6935f, 7.6482f, 12.7432f)
                lineTo(7.75f, 12.75f)
                curveTo(13.2107f, 12.75f, 11.2532f, 12.75f, 16.25f, 12.75f)
                curveTo(16.6642f, 12.75f, 17.0f, 12.4142f, 17.0f, 12.0f)
                curveTo(17.0f, 11.6203f, 16.7178f, 11.3065f, 16.3518f, 11.2568f)
                lineTo(16.25f, 11.25f)
                curveTo(11.0554f, 11.25f, 13.4435f, 11.25f, 7.75f, 11.25f)
                close()
            }
        }
        .build()
        return _subtractCircle!!
    }

private var _subtractCircle: ImageVector? = null
