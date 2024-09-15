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

public val LineAwesomeIcons.DeafSolid: ImageVector
    get() {
        if (_deafSolid != null) {
            return _deafSolid!!
        }
        _deafSolid = Builder(name = "DeafSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.719f, 2.281f)
                lineTo(2.281f, 3.719f)
                lineTo(28.281f, 29.719f)
                lineTo(29.719f, 28.281f)
                lineTo(21.875f, 20.438f)
                curveTo(23.383f, 18.203f, 25.0f, 15.199f, 25.0f, 12.0f)
                curveTo(25.0f, 7.59f, 21.41f, 4.0f, 17.0f, 4.0f)
                curveTo(13.879f, 4.0f, 11.16f, 5.793f, 9.844f, 8.406f)
                close()
                moveTo(17.0f, 6.0f)
                curveTo(20.309f, 6.0f, 23.0f, 8.691f, 23.0f, 12.0f)
                curveTo(23.0f, 14.531f, 21.727f, 17.031f, 20.438f, 19.0f)
                lineTo(14.031f, 12.594f)
                curveTo(14.219f, 11.09f, 15.43f, 10.0f, 17.0f, 10.0f)
                curveTo(18.078f, 10.0f, 19.094f, 10.59f, 19.625f, 11.531f)
                lineTo(21.344f, 10.531f)
                curveTo(20.457f, 8.969f, 18.797f, 8.0f, 17.0f, 8.0f)
                curveTo(14.922f, 8.0f, 13.172f, 9.203f, 12.406f, 10.969f)
                lineTo(11.375f, 9.938f)
                curveTo(12.219f, 7.641f, 14.414f, 6.0f, 17.0f, 6.0f)
                close()
                moveTo(11.156f, 15.344f)
                lineTo(11.0f, 15.469f)
                lineTo(11.0f, 16.0f)
                curveTo(11.0f, 17.43f, 12.215f, 17.98f, 13.031f, 18.344f)
                curveTo(13.781f, 18.676f, 14.0f, 18.813f, 14.0f, 19.0f)
                curveTo(14.0f, 19.688f, 12.918f, 20.0f, 11.906f, 20.0f)
                lineTo(11.906f, 22.0f)
                curveTo(13.867f, 22.0f, 15.281f, 21.227f, 15.781f, 20.0f)
                close()
                moveTo(9.0f, 22.0f)
                lineTo(9.0f, 23.0f)
                curveTo(9.0f, 25.758f, 11.242f, 28.0f, 14.0f, 28.0f)
                curveTo(16.906f, 28.0f, 18.0f, 26.16f, 18.875f, 24.688f)
                curveTo(19.086f, 24.336f, 19.281f, 24.004f, 19.5f, 23.688f)
                lineTo(18.063f, 22.25f)
                curveTo(18.039f, 22.285f, 18.023f, 22.344f, 18.0f, 22.375f)
                curveTo(17.684f, 22.809f, 17.41f, 23.258f, 17.156f, 23.688f)
                curveTo(16.32f, 25.09f, 15.77f, 26.0f, 14.0f, 26.0f)
                curveTo(12.348f, 26.0f, 11.0f, 24.652f, 11.0f, 23.0f)
                lineTo(11.0f, 22.0f)
                close()
            }
        }
        .build()
        return _deafSolid!!
    }

private var _deafSolid: ImageVector? = null
