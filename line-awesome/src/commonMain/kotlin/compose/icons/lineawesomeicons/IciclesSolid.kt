package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.IciclesSolid: ImageVector
    get() {
        if (_iciclesSolid != null) {
            return _iciclesSolid!!
        }
        _iciclesSolid = Builder(name = "IciclesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                lineTo(6.0f, 7.375f)
                lineTo(6.813f, 7.656f)
                curveTo(7.547f, 8.27f, 8.0f, 9.156f, 8.0f, 10.125f)
                lineTo(8.0f, 21.0f)
                curveTo(8.0f, 22.645f, 9.355f, 24.0f, 11.0f, 24.0f)
                curveTo(12.645f, 24.0f, 14.0f, 22.645f, 14.0f, 21.0f)
                lineTo(14.0f, 18.875f)
                curveTo(14.0f, 18.145f, 14.66f, 17.68f, 15.344f, 17.938f)
                curveTo(15.738f, 18.086f, 16.0f, 18.453f, 16.0f, 18.875f)
                lineTo(16.0f, 25.0f)
                curveTo(16.0f, 26.645f, 17.355f, 28.0f, 19.0f, 28.0f)
                curveTo(20.645f, 28.0f, 22.0f, 26.645f, 22.0f, 25.0f)
                lineTo(22.0f, 16.031f)
                curveTo(22.0f, 14.758f, 22.98f, 13.797f, 24.188f, 13.75f)
                lineTo(24.219f, 13.75f)
                lineTo(26.0f, 14.375f)
                lineTo(26.0f, 12.0f)
                close()
                moveTo(9.813f, 8.719f)
                lineTo(21.5f, 12.813f)
                curveTo(20.594f, 13.594f, 20.0f, 14.73f, 20.0f, 16.031f)
                lineTo(20.0f, 25.0f)
                curveTo(20.0f, 25.566f, 19.566f, 26.0f, 19.0f, 26.0f)
                curveTo(18.434f, 26.0f, 18.0f, 25.566f, 18.0f, 25.0f)
                lineTo(18.0f, 18.875f)
                curveTo(18.0f, 17.629f, 17.23f, 16.5f, 16.063f, 16.063f)
                curveTo(14.133f, 15.34f, 12.0f, 16.813f, 12.0f, 18.875f)
                lineTo(12.0f, 21.0f)
                curveTo(12.0f, 21.566f, 11.566f, 22.0f, 11.0f, 22.0f)
                curveTo(10.434f, 22.0f, 10.0f, 21.566f, 10.0f, 21.0f)
                lineTo(10.0f, 10.125f)
                curveTo(10.0f, 9.645f, 9.938f, 9.172f, 9.813f, 8.719f)
                close()
            }
        }
        .build()
        return _iciclesSolid!!
    }

private var _iciclesSolid: ImageVector? = null
