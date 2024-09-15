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

public val LineAwesomeIcons.GlobeSolid: ImageVector
    get() {
        if (_globeSolid != null) {
            return _globeSolid!!
        }
        _globeSolid = Builder(name = "GlobeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.969f, 6.0f, 19.797f, 6.586f, 21.344f, 7.563f)
                lineTo(20.531f, 7.656f)
                lineTo(20.719f, 9.656f)
                lineTo(19.656f, 9.188f)
                lineTo(18.781f, 9.938f)
                lineTo(18.938f, 12.0f)
                lineTo(21.094f, 11.313f)
                lineTo(23.781f, 12.188f)
                lineTo(23.094f, 13.438f)
                lineTo(21.469f, 12.438f)
                lineTo(19.719f, 12.688f)
                lineTo(18.0f, 13.969f)
                lineTo(17.031f, 16.969f)
                lineTo(18.969f, 18.563f)
                curveTo(18.969f, 18.563f, 20.957f, 18.219f, 21.063f, 18.219f)
                curveTo(21.168f, 18.219f, 21.906f, 20.031f, 21.906f, 20.031f)
                lineTo(20.313f, 25.031f)
                curveTo(19.012f, 25.652f, 17.543f, 26.0f, 16.0f, 26.0f)
                curveTo(15.684f, 26.0f, 15.371f, 25.965f, 15.063f, 25.938f)
                lineTo(13.969f, 24.031f)
                lineTo(15.031f, 20.031f)
                lineTo(11.0f, 17.0f)
                lineTo(7.281f, 17.0f)
                lineTo(6.313f, 15.031f)
                lineTo(9.0f, 12.906f)
                lineTo(13.0f, 11.0f)
                lineTo(12.406f, 8.344f)
                lineTo(14.125f, 7.969f)
                lineTo(14.938f, 9.094f)
                lineTo(17.938f, 8.531f)
                lineTo(17.406f, 6.219f)
                lineTo(15.188f, 6.063f)
                curveTo(15.453f, 6.043f, 15.727f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(14.875f, 6.063f)
                lineTo(13.313f, 6.719f)
                lineTo(12.563f, 6.594f)
                curveTo(13.301f, 6.324f, 14.066f, 6.152f, 14.875f, 6.063f)
                close()
                moveTo(6.063f, 16.781f)
                lineTo(7.031f, 17.906f)
                lineTo(7.031f, 19.969f)
                lineTo(8.906f, 22.031f)
                lineTo(10.063f, 22.031f)
                lineTo(12.906f, 25.531f)
                curveTo(9.133f, 24.309f, 6.379f, 20.891f, 6.063f, 16.781f)
                close()
            }
        }
        .build()
        return _globeSolid!!
    }

private var _globeSolid: ImageVector? = null
