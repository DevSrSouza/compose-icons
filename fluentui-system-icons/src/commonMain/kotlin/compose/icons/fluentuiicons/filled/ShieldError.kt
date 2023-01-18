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

public val FilledGroup.ShieldError: ImageVector
    get() {
        if (_shieldError != null) {
            return _shieldError!!
        }
        _shieldError = Builder(name = "ShieldError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 5.0f)
                curveTo(17.5866f, 5.0f, 14.992f, 4.0565f, 12.45f, 2.15f)
                curveTo(12.1833f, 1.95f, 11.8167f, 1.95f, 11.55f, 2.15f)
                curveTo(9.008f, 4.0565f, 6.4134f, 5.0f, 3.75f, 5.0f)
                curveTo(3.3358f, 5.0f, 3.0f, 5.3358f, 3.0f, 5.75f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.0012f, 5.9576f, 19.6757f, 11.7251f, 21.9478f)
                curveTo(11.9018f, 22.0174f, 12.0982f, 22.0174f, 12.2749f, 21.9478f)
                curveTo(18.0424f, 19.6757f, 21.0f, 16.0012f, 21.0f, 11.0f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 5.3358f, 20.6642f, 5.0f, 20.25f, 5.0f)
                close()
                moveTo(11.2568f, 7.6303f)
                curveTo(11.3065f, 7.2643f, 11.6203f, 6.9821f, 12.0f, 6.9821f)
                curveTo(12.3797f, 6.9821f, 12.6935f, 7.2643f, 12.7432f, 7.6303f)
                lineTo(12.75f, 7.7321f)
                verticalLineTo(14.2321f)
                lineTo(12.7432f, 14.3339f)
                curveTo(12.6935f, 14.7f, 12.3797f, 14.9821f, 12.0f, 14.9821f)
                curveTo(11.6203f, 14.9821f, 11.3065f, 14.7f, 11.2568f, 14.3339f)
                lineTo(11.25f, 14.2321f)
                verticalLineTo(7.7321f)
                lineTo(11.2568f, 7.6303f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(11.4477f, 18.0f, 11.0f, 17.5523f, 11.0f, 17.0f)
                curveTo(11.0f, 16.4477f, 11.4477f, 16.0f, 12.0f, 16.0f)
                curveTo(12.5523f, 16.0f, 13.0f, 16.4477f, 13.0f, 17.0f)
                curveTo(13.0f, 17.5523f, 12.5523f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _shieldError!!
    }

private var _shieldError: ImageVector? = null
