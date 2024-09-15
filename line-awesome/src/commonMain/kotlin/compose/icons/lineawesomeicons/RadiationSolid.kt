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

public val LineAwesomeIcons.RadiationSolid: ImageVector
    get() {
        if (_radiationSolid != null) {
            return _radiationSolid!!
        }
        _radiationSolid = Builder(name = "RadiationSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.16f, 3.889f)
                lineTo(8.283f, 4.535f)
                curveTo(5.262f, 6.773f, 3.356f, 10.195f, 3.053f, 13.92f)
                lineTo(2.965f, 15.0f)
                lineTo(10.938f, 15.0f)
                lineTo(11.076f, 14.162f)
                curveTo(11.263f, 13.035f, 11.842f, 11.999f, 12.707f, 11.244f)
                lineTo(13.346f, 10.688f)
                lineTo(9.16f, 3.889f)
                close()
                moveTo(22.84f, 3.889f)
                lineTo(18.654f, 10.688f)
                lineTo(19.293f, 11.244f)
                curveTo(20.158f, 11.998f, 20.737f, 13.035f, 20.924f, 14.162f)
                lineTo(21.063f, 15.0f)
                lineTo(29.035f, 15.0f)
                lineTo(28.945f, 13.92f)
                curveTo(28.642f, 10.195f, 26.736f, 6.773f, 23.715f, 4.535f)
                lineTo(22.84f, 3.889f)
                close()
                moveTo(8.629f, 6.838f)
                lineTo(10.781f, 10.34f)
                curveTo(10.095f, 11.106f, 9.587f, 12.017f, 9.295f, 13.0f)
                lineTo(5.189f, 13.0f)
                curveTo(5.624f, 10.631f, 6.834f, 8.465f, 8.629f, 6.838f)
                close()
                moveTo(23.371f, 6.838f)
                curveTo(25.165f, 8.465f, 26.376f, 10.631f, 26.811f, 13.0f)
                lineTo(22.703f, 13.0f)
                curveTo(22.411f, 12.017f, 21.903f, 11.106f, 21.217f, 10.34f)
                lineTo(23.371f, 6.838f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(14.346f, 12.0f, 13.0f, 13.348f, 13.0f, 15.004f)
                curveTo(13.0f, 16.656f, 14.346f, 18.0f, 16.0f, 18.0f)
                curveTo(17.654f, 18.0f, 19.0f, 16.656f, 19.0f, 15.004f)
                curveTo(19.0f, 13.348f, 17.654f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(16.551f, 14.0f, 17.0f, 14.451f, 17.0f, 15.004f)
                curveTo(17.0f, 15.553f, 16.551f, 16.0f, 16.0f, 16.0f)
                curveTo(15.449f, 16.0f, 15.0f, 15.553f, 15.0f, 15.004f)
                curveTo(15.0f, 14.451f, 15.449f, 14.0f, 16.0f, 14.0f)
                close()
                moveTo(13.346f, 19.307f)
                lineTo(9.172f, 26.109f)
                lineTo(10.137f, 26.602f)
                curveTo(11.959f, 27.53f, 13.932f, 28.0f, 16.0f, 28.0f)
                curveTo(18.068f, 28.0f, 20.042f, 27.53f, 21.863f, 26.602f)
                lineTo(22.828f, 26.109f)
                lineTo(18.652f, 19.307f)
                lineTo(17.861f, 19.639f)
                curveTo(16.719f, 20.119f, 15.279f, 20.119f, 14.137f, 19.639f)
                lineTo(13.346f, 19.307f)
                close()
                moveTo(14.186f, 21.764f)
                curveTo(15.345f, 22.077f, 16.657f, 22.077f, 17.816f, 21.764f)
                lineTo(19.965f, 25.264f)
                curveTo(17.455f, 26.242f, 14.547f, 26.242f, 12.037f, 25.264f)
                lineTo(14.186f, 21.764f)
                close()
            }
        }
        .build()
        return _radiationSolid!!
    }

private var _radiationSolid: ImageVector? = null
