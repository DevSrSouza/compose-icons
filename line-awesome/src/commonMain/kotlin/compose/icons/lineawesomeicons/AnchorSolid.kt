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

public val LineAwesomeIcons.AnchorSolid: ImageVector
    get() {
        if (_anchorSolid != null) {
            return _anchorSolid!!
        }
        _anchorSolid = Builder(name = "AnchorSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.801f, 4.0f, 12.0f, 5.801f, 12.0f, 8.0f)
                curveTo(12.0f, 9.852f, 13.281f, 11.398f, 15.0f, 11.844f)
                lineTo(15.0f, 14.0f)
                lineTo(12.0f, 14.0f)
                lineTo(12.0f, 16.0f)
                lineTo(15.0f, 16.0f)
                lineTo(15.0f, 23.969f)
                curveTo(12.574f, 23.777f, 10.961f, 22.891f, 9.813f, 21.875f)
                curveTo(8.938f, 21.102f, 8.352f, 20.25f, 7.938f, 19.531f)
                lineTo(9.531f, 18.75f)
                lineTo(5.531f, 16.938f)
                lineTo(4.469f, 21.25f)
                lineTo(6.125f, 20.438f)
                curveTo(6.598f, 21.285f, 7.332f, 22.371f, 8.469f, 23.375f)
                curveTo(9.922f, 24.664f, 12.066f, 25.73f, 15.0f, 25.938f)
                lineTo(15.0f, 26.0f)
                lineTo(16.0f, 27.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 25.938f)
                curveTo(19.934f, 25.73f, 22.078f, 24.664f, 23.531f, 23.375f)
                curveTo(24.668f, 22.371f, 25.402f, 21.285f, 25.875f, 20.438f)
                lineTo(27.531f, 21.25f)
                lineTo(26.469f, 16.938f)
                lineTo(22.469f, 18.75f)
                lineTo(24.063f, 19.531f)
                curveTo(23.648f, 20.25f, 23.063f, 21.102f, 22.188f, 21.875f)
                curveTo(21.039f, 22.891f, 19.426f, 23.777f, 17.0f, 23.969f)
                lineTo(17.0f, 16.0f)
                lineTo(20.0f, 16.0f)
                lineTo(20.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.0f, 11.844f)
                curveTo(18.719f, 11.398f, 20.0f, 9.852f, 20.0f, 8.0f)
                curveTo(20.0f, 5.801f, 18.199f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.117f, 6.0f, 18.0f, 6.883f, 18.0f, 8.0f)
                curveTo(18.0f, 9.117f, 17.117f, 10.0f, 16.0f, 10.0f)
                curveTo(14.883f, 10.0f, 14.0f, 9.117f, 14.0f, 8.0f)
                curveTo(14.0f, 6.883f, 14.883f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _anchorSolid!!
    }

private var _anchorSolid: ImageVector? = null
