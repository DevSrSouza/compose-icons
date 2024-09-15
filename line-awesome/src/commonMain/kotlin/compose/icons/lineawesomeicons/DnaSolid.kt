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

public val LineAwesomeIcons.DnaSolid: ImageVector
    get() {
        if (_dnaSolid != null) {
            return _dnaSolid!!
        }
        _dnaSolid = Builder(name = "DnaSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                curveTo(6.0f, 8.023f, 7.281f, 10.375f, 9.094f, 12.219f)
                curveTo(10.531f, 13.684f, 12.277f, 14.887f, 14.063f, 16.0f)
                curveTo(9.895f, 18.633f, 6.0f, 21.512f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.305f, 11.781f, 19.742f, 15.969f, 17.156f)
                curveTo(16.965f, 17.77f, 17.938f, 18.367f, 18.844f, 19.0f)
                lineTo(15.188f, 19.0f)
                curveTo(14.188f, 19.602f, 13.305f, 20.301f, 12.406f, 21.0f)
                lineTo(21.313f, 21.0f)
                curveTo(21.363f, 21.051f, 21.418f, 21.105f, 21.469f, 21.156f)
                curveTo(22.039f, 21.734f, 22.543f, 22.348f, 22.938f, 23.0f)
                lineTo(10.594f, 23.0f)
                curveTo(10.094f, 23.602f, 9.801f, 24.301f, 9.5f, 25.0f)
                lineTo(23.75f, 25.0f)
                curveTo(23.906f, 25.617f, 24.0f, 26.273f, 24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                curveTo(26.0f, 23.977f, 24.719f, 21.625f, 22.906f, 19.781f)
                curveTo(21.094f, 17.938f, 18.781f, 16.531f, 16.531f, 15.156f)
                curveTo(14.281f, 13.781f, 12.094f, 12.438f, 10.531f, 10.844f)
                curveTo(8.969f, 9.25f, 8.0f, 7.477f, 8.0f, 5.0f)
                close()
                moveTo(24.0f, 5.0f)
                curveTo(24.0f, 5.719f, 23.883f, 6.379f, 23.719f, 7.0f)
                lineTo(9.5f, 7.0f)
                curveTo(9.801f, 7.699f, 10.094f, 8.398f, 10.594f, 9.0f)
                lineTo(22.875f, 9.0f)
                curveTo(22.438f, 9.723f, 21.883f, 10.379f, 21.25f, 11.0f)
                lineTo(12.406f, 11.0f)
                curveTo(13.305f, 11.699f, 14.188f, 12.398f, 15.188f, 13.0f)
                lineTo(18.875f, 13.0f)
                curveTo(18.273f, 13.438f, 17.641f, 13.879f, 17.0f, 14.313f)
                curveTo(17.602f, 14.711f, 18.211f, 15.008f, 18.813f, 15.406f)
                curveTo(22.613f, 12.906f, 26.0f, 10.0f, 26.0f, 5.0f)
                close()
            }
        }
        .build()
        return _dnaSolid!!
    }

private var _dnaSolid: ImageVector? = null
