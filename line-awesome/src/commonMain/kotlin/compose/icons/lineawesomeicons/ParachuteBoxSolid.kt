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

public val LineAwesomeIcons.ParachuteBoxSolid: ImageVector
    get() {
        if (_parachuteBoxSolid != null) {
            return _parachuteBoxSolid!!
        }
        _parachuteBoxSolid = Builder(name = "ParachuteBoxSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                lineTo(4.0f, 16.453f)
                lineTo(12.0f, 23.453f)
                lineTo(12.0f, 28.0f)
                lineTo(20.0f, 28.0f)
                lineTo(20.0f, 23.453f)
                lineTo(28.0f, 16.453f)
                close()
                moveTo(16.0f, 6.363f)
                curveTo(16.867f, 7.305f, 18.422f, 9.535f, 18.871f, 13.656f)
                curveTo(18.148f, 13.281f, 17.207f, 13.0f, 16.0f, 13.0f)
                curveTo(14.793f, 13.0f, 13.852f, 13.281f, 13.129f, 13.656f)
                curveTo(13.578f, 9.531f, 15.137f, 7.301f, 16.0f, 6.363f)
                close()
                moveTo(11.086f, 16.398f)
                lineTo(13.484f, 22.0f)
                lineTo(13.375f, 22.0f)
                lineTo(6.336f, 15.84f)
                curveTo(6.719f, 15.449f, 7.391f, 15.0f, 8.5f, 15.0f)
                curveTo(10.402f, 15.0f, 11.059f, 16.352f, 11.086f, 16.398f)
                close()
                moveTo(15.66f, 22.0f)
                lineTo(13.141f, 16.125f)
                curveTo(13.523f, 15.691f, 14.379f, 15.0f, 16.0f, 15.0f)
                curveTo(17.625f, 15.0f, 18.484f, 15.695f, 18.859f, 16.121f)
                lineTo(16.34f, 22.0f)
                close()
                moveTo(18.516f, 22.0f)
                lineTo(20.914f, 16.398f)
                curveTo(20.926f, 16.383f, 21.555f, 15.0f, 23.5f, 15.0f)
                curveTo(24.602f, 15.0f, 25.273f, 15.453f, 25.66f, 15.844f)
                lineTo(18.625f, 22.0f)
                close()
                moveTo(25.66f, 13.445f)
                curveTo(25.078f, 13.18f, 24.367f, 13.0f, 23.5f, 13.0f)
                curveTo(22.391f, 13.0f, 21.535f, 13.293f, 20.879f, 13.684f)
                curveTo(20.535f, 10.207f, 19.469f, 7.824f, 18.477f, 6.32f)
                curveTo(21.977f, 7.219f, 24.738f, 9.957f, 25.66f, 13.445f)
                close()
                moveTo(13.52f, 6.324f)
                curveTo(12.531f, 7.824f, 11.465f, 10.207f, 11.121f, 13.684f)
                curveTo(10.465f, 13.293f, 9.609f, 13.0f, 8.5f, 13.0f)
                curveTo(7.633f, 13.0f, 6.922f, 13.18f, 6.34f, 13.445f)
                curveTo(7.262f, 9.957f, 10.023f, 7.219f, 13.52f, 6.324f)
                close()
                moveTo(18.0f, 26.0f)
                lineTo(14.0f, 26.0f)
                lineTo(14.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                close()
            }
        }
        .build()
        return _parachuteBoxSolid!!
    }

private var _parachuteBoxSolid: ImageVector? = null
