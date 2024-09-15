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

public val LineAwesomeIcons.PenFancySolid: ImageVector
    get() {
        if (_penFancySolid != null) {
            return _penFancySolid!!
        }
        _penFancySolid = Builder(name = "PenFancySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.813f, 4.031f)
                curveTo(22.723f, 4.031f, 21.613f, 4.449f, 20.781f, 5.281f)
                lineTo(11.5f, 14.563f)
                lineTo(6.031f, 16.656f)
                lineTo(5.5f, 16.875f)
                lineTo(5.406f, 17.438f)
                lineTo(4.0f, 26.844f)
                lineTo(3.813f, 28.188f)
                lineTo(5.156f, 28.0f)
                lineTo(14.563f, 26.594f)
                lineTo(15.125f, 26.5f)
                lineTo(15.344f, 25.969f)
                lineTo(17.313f, 20.781f)
                lineTo(17.813f, 20.313f)
                lineTo(26.813f, 11.313f)
                curveTo(28.426f, 9.699f, 28.457f, 7.109f, 26.938f, 5.438f)
                lineTo(26.813f, 5.281f)
                curveTo(25.98f, 4.449f, 24.902f, 4.031f, 23.813f, 4.031f)
                close()
                moveTo(23.813f, 6.0f)
                curveTo(24.375f, 6.0f, 24.938f, 6.25f, 25.406f, 6.719f)
                curveTo(26.344f, 7.656f, 26.344f, 8.969f, 25.406f, 9.906f)
                lineTo(20.375f, 14.938f)
                lineTo(17.188f, 11.75f)
                lineTo(22.219f, 6.719f)
                curveTo(22.688f, 6.25f, 23.25f, 6.0f, 23.813f, 6.0f)
                close()
                moveTo(15.75f, 13.188f)
                lineTo(18.938f, 16.375f)
                lineTo(17.125f, 18.188f)
                lineTo(13.938f, 15.0f)
                close()
                moveTo(12.406f, 16.344f)
                lineTo(12.438f, 16.344f)
                lineTo(15.656f, 19.563f)
                lineTo(13.688f, 24.719f)
                lineTo(7.844f, 25.563f)
                lineTo(10.531f, 22.875f)
                curveTo(10.586f, 22.879f, 10.633f, 22.906f, 10.688f, 22.906f)
                curveTo(11.57f, 22.906f, 12.313f, 22.195f, 12.313f, 21.313f)
                curveTo(12.313f, 20.43f, 11.57f, 19.688f, 10.688f, 19.688f)
                curveTo(9.805f, 19.688f, 9.094f, 20.43f, 9.094f, 21.313f)
                curveTo(9.094f, 21.367f, 9.121f, 21.414f, 9.125f, 21.469f)
                lineTo(6.438f, 24.156f)
                lineTo(7.281f, 18.313f)
                close()
            }
        }
        .build()
        return _penFancySolid!!
    }

private var _penFancySolid: ImageVector? = null
