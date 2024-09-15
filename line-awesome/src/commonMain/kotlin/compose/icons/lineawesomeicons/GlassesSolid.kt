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

public val LineAwesomeIcons.GlassesSolid: ImageVector
    get() {
        if (_glassesSolid != null) {
            return _glassesSolid!!
        }
        _glassesSolid = Builder(name = "GlassesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.063f, 6.0f)
                lineTo(4.813f, 6.656f)
                lineTo(1.313f, 16.0f)
                lineTo(0.0f, 16.0f)
                lineTo(0.0f, 18.0f)
                lineTo(1.0f, 18.0f)
                lineTo(1.0f, 20.0f)
                curveTo(1.0f, 23.297f, 3.703f, 26.0f, 7.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                curveTo(12.297f, 26.0f, 15.0f, 23.297f, 15.0f, 20.0f)
                lineTo(15.0f, 17.0f)
                curveTo(15.0f, 16.434f, 15.434f, 16.0f, 16.0f, 16.0f)
                curveTo(16.566f, 16.0f, 17.0f, 16.434f, 17.0f, 17.0f)
                lineTo(17.0f, 20.0f)
                curveTo(17.0f, 23.297f, 19.703f, 26.0f, 23.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                curveTo(28.297f, 26.0f, 31.0f, 23.297f, 31.0f, 20.0f)
                lineTo(31.0f, 18.0f)
                lineTo(32.0f, 18.0f)
                lineTo(32.0f, 16.0f)
                lineTo(30.688f, 16.0f)
                lineTo(27.188f, 6.656f)
                lineTo(26.938f, 6.0f)
                lineTo(25.0f, 6.0f)
                lineTo(24.719f, 6.375f)
                lineTo(22.219f, 9.375f)
                lineTo(23.781f, 10.625f)
                lineTo(25.688f, 8.313f)
                lineTo(28.563f, 16.0f)
                lineTo(18.813f, 16.0f)
                curveTo(18.395f, 14.844f, 17.293f, 14.0f, 16.0f, 14.0f)
                curveTo(14.707f, 14.0f, 13.605f, 14.844f, 13.188f, 16.0f)
                lineTo(3.438f, 16.0f)
                lineTo(6.313f, 8.313f)
                lineTo(8.219f, 10.625f)
                lineTo(9.781f, 9.375f)
                lineTo(7.281f, 6.375f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(3.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 20.0f)
                curveTo(13.0f, 22.203f, 11.203f, 24.0f, 9.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                curveTo(4.797f, 24.0f, 3.0f, 22.203f, 3.0f, 20.0f)
                close()
                moveTo(19.0f, 18.0f)
                lineTo(29.0f, 18.0f)
                lineTo(29.0f, 20.0f)
                curveTo(29.0f, 22.203f, 27.203f, 24.0f, 25.0f, 24.0f)
                lineTo(23.0f, 24.0f)
                curveTo(20.797f, 24.0f, 19.0f, 22.203f, 19.0f, 20.0f)
                close()
            }
        }
        .build()
        return _glassesSolid!!
    }

private var _glassesSolid: ImageVector? = null
