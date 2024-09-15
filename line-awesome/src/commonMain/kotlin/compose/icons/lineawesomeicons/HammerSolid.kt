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

public val LineAwesomeIcons.HammerSolid: ImageVector
    get() {
        if (_hammerSolid != null) {
            return _hammerSolid!!
        }
        _hammerSolid = Builder(name = "HammerSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.063f, 2.0f)
                lineTo(9.563f, 3.813f)
                curveTo(14.277f, 7.211f, 15.707f, 10.543f, 16.0f, 11.281f)
                lineTo(15.094f, 12.188f)
                lineTo(15.094f, 12.219f)
                lineTo(14.406f, 12.906f)
                lineTo(2.688f, 25.063f)
                lineTo(2.0f, 25.781f)
                lineTo(6.25f, 30.031f)
                lineTo(6.969f, 29.281f)
                lineTo(19.375f, 16.438f)
                lineTo(19.688f, 16.063f)
                lineTo(19.781f, 16.0f)
                lineTo(20.75f, 15.656f)
                lineTo(20.938f, 15.844f)
                lineTo(20.563f, 16.75f)
                lineTo(20.281f, 17.375f)
                lineTo(23.594f, 20.688f)
                lineTo(29.969f, 14.313f)
                lineTo(27.125f, 11.469f)
                lineTo(26.656f, 11.031f)
                lineTo(26.063f, 11.25f)
                lineTo(25.156f, 11.594f)
                lineTo(24.938f, 11.375f)
                lineTo(25.25f, 10.375f)
                lineTo(25.375f, 9.969f)
                lineTo(25.188f, 9.594f)
                curveTo(25.188f, 9.594f, 24.133f, 7.637f, 21.75f, 5.75f)
                curveTo(19.367f, 3.863f, 15.594f, 2.0f, 10.156f, 2.0f)
                close()
                moveTo(13.094f, 4.25f)
                curveTo(16.461f, 4.75f, 18.891f, 6.016f, 20.531f, 7.313f)
                curveTo(22.297f, 8.711f, 23.0f, 9.844f, 23.219f, 10.219f)
                lineTo(22.844f, 11.375f)
                lineTo(22.688f, 11.938f)
                lineTo(23.094f, 12.375f)
                lineTo(24.688f, 13.969f)
                lineTo(25.313f, 13.719f)
                lineTo(26.188f, 13.375f)
                lineTo(27.125f, 14.313f)
                lineTo(23.594f, 17.844f)
                lineTo(22.656f, 16.906f)
                lineTo(23.031f, 16.0f)
                lineTo(23.313f, 15.375f)
                lineTo(22.813f, 14.906f)
                lineTo(21.688f, 13.781f)
                lineTo(21.25f, 13.313f)
                lineTo(20.625f, 13.531f)
                lineTo(18.844f, 14.25f)
                lineTo(18.656f, 14.313f)
                lineTo(17.938f, 13.625f)
                lineTo(17.219f, 12.906f)
                lineTo(18.375f, 11.75f)
                lineTo(18.156f, 11.156f)
                curveTo(18.156f, 11.156f, 16.813f, 7.762f, 13.094f, 4.25f)
                close()
                moveTo(15.813f, 14.313f)
                lineTo(17.25f, 15.75f)
                lineTo(6.219f, 27.156f)
                lineTo(4.813f, 25.75f)
                close()
            }
        }
        .build()
        return _hammerSolid!!
    }

private var _hammerSolid: ImageVector? = null
