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

public val LineAwesomeIcons.UtensilSpoonSolid: ImageVector
    get() {
        if (_utensilSpoonSolid != null) {
            return _utensilSpoonSolid!!
        }
        _utensilSpoonSolid = Builder(name = "UtensilSpoonSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.094f, 4.0f)
                curveTo(22.648f, 4.008f, 22.195f, 4.07f, 21.75f, 4.156f)
                curveTo(19.973f, 4.496f, 18.191f, 5.402f, 16.875f, 6.719f)
                curveTo(15.559f, 8.035f, 14.941f, 9.586f, 15.0f, 11.094f)
                curveTo(15.047f, 12.27f, 15.504f, 13.383f, 16.219f, 14.344f)
                lineTo(4.281f, 26.281f)
                lineTo(5.719f, 27.719f)
                lineTo(17.656f, 15.781f)
                curveTo(18.617f, 16.496f, 19.73f, 16.953f, 20.906f, 17.0f)
                curveTo(22.414f, 17.059f, 23.965f, 16.441f, 25.281f, 15.125f)
                curveTo(26.598f, 13.809f, 27.504f, 12.027f, 27.844f, 10.25f)
                curveTo(28.184f, 8.473f, 27.969f, 6.594f, 26.688f, 5.313f)
                curveTo(26.047f, 4.672f, 25.262f, 4.301f, 24.406f, 4.125f)
                curveTo(23.98f, 4.039f, 23.539f, 3.992f, 23.094f, 4.0f)
                close()
                moveTo(23.094f, 6.0f)
                curveTo(23.402f, 5.996f, 23.699f, 6.008f, 23.969f, 6.063f)
                curveTo(24.508f, 6.168f, 24.957f, 6.395f, 25.281f, 6.719f)
                curveTo(25.93f, 7.367f, 26.168f, 8.52f, 25.906f, 9.875f)
                curveTo(25.645f, 11.23f, 24.875f, 12.688f, 23.875f, 13.688f)
                curveTo(22.875f, 14.688f, 21.926f, 15.035f, 21.0f, 15.0f)
                curveTo(20.074f, 14.965f, 19.133f, 14.508f, 18.313f, 13.688f)
                curveTo(17.492f, 12.867f, 17.035f, 11.926f, 17.0f, 11.0f)
                curveTo(16.965f, 10.074f, 17.313f, 9.125f, 18.313f, 8.125f)
                curveTo(19.313f, 7.125f, 20.77f, 6.355f, 22.125f, 6.094f)
                curveTo(22.465f, 6.027f, 22.785f, 6.004f, 23.094f, 6.0f)
                close()
            }
        }
        .build()
        return _utensilSpoonSolid!!
    }

private var _utensilSpoonSolid: ImageVector? = null
