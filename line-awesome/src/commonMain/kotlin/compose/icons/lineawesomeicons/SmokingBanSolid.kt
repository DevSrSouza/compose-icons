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

public val LineAwesomeIcons.SmokingBanSolid: ImageVector
    get() {
        if (_smokingBanSolid != null) {
            return _smokingBanSolid!!
        }
        _smokingBanSolid = Builder(name = "SmokingBanSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.719f, 2.281f)
                lineTo(2.281f, 3.719f)
                lineTo(28.281f, 29.719f)
                lineTo(29.719f, 28.281f)
                lineTo(23.438f, 22.0f)
                lineTo(31.0f, 22.0f)
                lineTo(31.0f, 16.0f)
                lineTo(17.438f, 16.0f)
                close()
                moveTo(16.031f, 4.0f)
                curveTo(15.672f, 4.359f, 15.406f, 4.785f, 15.094f, 5.469f)
                curveTo(14.781f, 6.152f, 14.504f, 7.012f, 14.5f, 7.969f)
                curveTo(14.496f, 8.926f, 14.828f, 10.02f, 15.688f, 10.844f)
                curveTo(16.547f, 11.668f, 17.859f, 12.203f, 19.688f, 12.438f)
                curveTo(21.211f, 12.633f, 22.191f, 12.883f, 22.75f, 13.219f)
                curveTo(23.309f, 13.555f, 23.539f, 13.898f, 23.719f, 14.719f)
                lineTo(25.688f, 14.281f)
                curveTo(25.43f, 13.102f, 24.777f, 12.098f, 23.781f, 11.5f)
                curveTo(22.785f, 10.902f, 21.566f, 10.645f, 19.938f, 10.438f)
                curveTo(18.379f, 10.238f, 17.508f, 9.801f, 17.063f, 9.375f)
                curveTo(16.617f, 8.949f, 16.5f, 8.512f, 16.5f, 7.969f)
                curveTo(16.5f, 7.426f, 16.676f, 6.816f, 16.906f, 6.313f)
                curveTo(17.137f, 5.809f, 17.492f, 5.352f, 17.438f, 5.406f)
                close()
                moveTo(21.563f, 4.313f)
                lineTo(21.563f, 6.313f)
                curveTo(22.184f, 6.313f, 22.984f, 6.406f, 23.594f, 6.75f)
                curveTo(24.203f, 7.094f, 24.719f, 7.602f, 24.844f, 9.063f)
                lineTo(24.938f, 10.0f)
                lineTo(25.844f, 10.0f)
                curveTo(26.359f, 10.0f, 27.434f, 10.16f, 27.969f, 10.625f)
                curveTo(28.234f, 10.859f, 28.406f, 11.133f, 28.469f, 11.656f)
                curveTo(28.531f, 12.18f, 28.438f, 12.98f, 27.969f, 14.125f)
                lineTo(29.844f, 14.875f)
                curveTo(30.402f, 13.516f, 30.586f, 12.387f, 30.469f, 11.406f)
                curveTo(30.352f, 10.426f, 29.875f, 9.645f, 29.281f, 9.125f)
                curveTo(28.379f, 8.336f, 27.398f, 8.133f, 26.594f, 8.063f)
                curveTo(26.246f, 6.617f, 25.523f, 5.527f, 24.594f, 5.0f)
                curveTo(23.473f, 4.363f, 22.305f, 4.313f, 21.563f, 4.313f)
                close()
                moveTo(1.0f, 16.0f)
                lineTo(1.0f, 22.0f)
                lineTo(17.813f, 22.0f)
                lineTo(15.813f, 20.0f)
                lineTo(3.0f, 20.0f)
                lineTo(3.0f, 18.0f)
                lineTo(13.813f, 18.0f)
                lineTo(11.813f, 16.0f)
                close()
                moveTo(19.438f, 18.0f)
                lineTo(23.0f, 18.0f)
                lineTo(23.0f, 20.0f)
                lineTo(21.438f, 20.0f)
                close()
                moveTo(25.0f, 18.0f)
                lineTo(26.0f, 18.0f)
                lineTo(26.0f, 20.0f)
                lineTo(25.0f, 20.0f)
                close()
                moveTo(28.0f, 18.0f)
                lineTo(29.0f, 18.0f)
                lineTo(29.0f, 20.0f)
                lineTo(28.0f, 20.0f)
                close()
            }
        }
        .build()
        return _smokingBanSolid!!
    }

private var _smokingBanSolid: ImageVector? = null
