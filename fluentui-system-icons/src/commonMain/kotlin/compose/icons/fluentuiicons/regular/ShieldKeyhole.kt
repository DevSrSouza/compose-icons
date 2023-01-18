package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ShieldKeyhole: ImageVector
    get() {
        if (_shieldKeyhole != null) {
            return _shieldKeyhole!!
        }
        _shieldKeyhole = Builder(name = "ShieldKeyhole", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9951f, 11.0f)
                curveTo(13.9951f, 11.8374f, 13.4804f, 12.5545f, 12.75f, 12.8523f)
                lineTo(12.75f, 15.25f)
                curveTo(12.75f, 15.6642f, 12.4142f, 16.0f, 12.0f, 16.0f)
                curveTo(11.5858f, 16.0f, 11.25f, 15.6642f, 11.25f, 15.25f)
                lineTo(11.25f, 12.8559f)
                curveTo(10.515f, 12.5603f, 9.996f, 11.8408f, 9.996f, 11.0f)
                curveTo(9.996f, 9.8957f, 10.8913f, 9.0005f, 11.9956f, 9.0005f)
                curveTo(13.0999f, 9.0005f, 13.9951f, 9.8957f, 13.9951f, 11.0f)
                close()
                moveTo(3.75f, 5.0f)
                curveTo(3.3358f, 5.0f, 3.0f, 5.3358f, 3.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.0012f, 5.9576f, 19.6757f, 11.7251f, 21.9478f)
                curveTo(11.9018f, 22.0174f, 12.0982f, 22.0174f, 12.2749f, 21.9478f)
                curveTo(18.0424f, 19.6757f, 21.0f, 16.0012f, 21.0f, 11.0f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 5.3358f, 20.6642f, 5.0f, 20.25f, 5.0f)
                curveTo(17.5866f, 5.0f, 14.992f, 4.0565f, 12.45f, 2.15f)
                curveTo(12.1833f, 1.95f, 11.8167f, 1.95f, 11.55f, 2.15f)
                curveTo(9.008f, 4.0565f, 6.4134f, 5.0f, 3.75f, 5.0f)
                close()
                moveTo(4.5f, 11.0f)
                verticalLineTo(6.4779f)
                curveTo(7.0774f, 6.3259f, 9.5808f, 5.3883f, 12.0f, 3.6778f)
                curveTo(14.4192f, 5.3883f, 16.9227f, 6.3259f, 19.5f, 6.4779f)
                verticalLineTo(11.0f)
                curveTo(19.5f, 15.2556f, 17.0466f, 18.3789f, 12.0f, 20.4419f)
                curveTo(6.9534f, 18.3789f, 4.5f, 15.2556f, 4.5f, 11.0f)
                close()
            }
        }
        .build()
        return _shieldKeyhole!!
    }

private var _shieldKeyhole: ImageVector? = null
