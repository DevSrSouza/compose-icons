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

public val LineAwesomeIcons.ShareAltSolid: ImageVector
    get() {
        if (_shareAltSolid != null) {
            return _shareAltSolid!!
        }
        _shareAltSolid = Builder(name = "ShareAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.855f, 4.0f, 12.117f, 5.719f, 12.031f, 7.844f)
                curveTo(8.426f, 9.375f, 6.0f, 12.941f, 6.0f, 17.0f)
                curveTo(6.0f, 17.172f, 5.992f, 17.359f, 6.0f, 17.563f)
                curveTo(4.816f, 18.258f, 4.0f, 19.535f, 4.0f, 21.0f)
                curveTo(4.0f, 23.199f, 5.801f, 25.0f, 8.0f, 25.0f)
                curveTo(8.574f, 25.0f, 9.129f, 24.879f, 9.625f, 24.656f)
                curveTo(11.359f, 26.113f, 13.617f, 27.0f, 16.0f, 27.0f)
                curveTo(18.383f, 27.0f, 20.641f, 26.113f, 22.375f, 24.656f)
                curveTo(22.871f, 24.879f, 23.426f, 25.0f, 24.0f, 25.0f)
                curveTo(26.199f, 25.0f, 28.0f, 23.199f, 28.0f, 21.0f)
                curveTo(28.0f, 19.52f, 27.176f, 18.223f, 25.969f, 17.531f)
                curveTo(25.984f, 17.371f, 26.0f, 17.207f, 26.0f, 17.0f)
                curveTo(26.0f, 12.941f, 23.574f, 9.375f, 19.969f, 7.844f)
                curveTo(19.883f, 5.719f, 18.145f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.117f, 6.0f, 18.0f, 6.883f, 18.0f, 8.0f)
                curveTo(18.0f, 9.117f, 17.117f, 10.0f, 16.0f, 10.0f)
                curveTo(14.883f, 10.0f, 14.0f, 9.117f, 14.0f, 8.0f)
                curveTo(14.0f, 6.883f, 14.883f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(12.469f, 9.844f)
                curveTo(13.141f, 11.117f, 14.469f, 12.0f, 16.0f, 12.0f)
                curveTo(17.531f, 12.0f, 18.859f, 11.117f, 19.531f, 9.844f)
                curveTo(22.211f, 11.145f, 24.0f, 13.879f, 24.0f, 17.0f)
                curveTo(21.801f, 17.0f, 20.0f, 18.801f, 20.0f, 21.0f)
                curveTo(20.0f, 21.895f, 20.309f, 22.707f, 20.813f, 23.375f)
                curveTo(19.477f, 24.387f, 17.758f, 25.0f, 16.0f, 25.0f)
                curveTo(14.242f, 25.0f, 12.523f, 24.387f, 11.188f, 23.375f)
                curveTo(11.691f, 22.707f, 12.0f, 21.895f, 12.0f, 21.0f)
                curveTo(12.0f, 18.801f, 10.199f, 17.0f, 8.0f, 17.0f)
                curveTo(8.0f, 13.879f, 9.789f, 11.145f, 12.469f, 9.844f)
                close()
                moveTo(8.0f, 19.0f)
                curveTo(9.117f, 19.0f, 10.0f, 19.883f, 10.0f, 21.0f)
                curveTo(10.0f, 22.117f, 9.117f, 23.0f, 8.0f, 23.0f)
                curveTo(6.883f, 23.0f, 6.0f, 22.117f, 6.0f, 21.0f)
                curveTo(6.0f, 19.883f, 6.883f, 19.0f, 8.0f, 19.0f)
                close()
                moveTo(24.0f, 19.0f)
                curveTo(25.117f, 19.0f, 26.0f, 19.883f, 26.0f, 21.0f)
                curveTo(26.0f, 22.117f, 25.117f, 23.0f, 24.0f, 23.0f)
                curveTo(22.883f, 23.0f, 22.0f, 22.117f, 22.0f, 21.0f)
                curveTo(22.0f, 19.883f, 22.883f, 19.0f, 24.0f, 19.0f)
                close()
            }
        }
        .build()
        return _shareAltSolid!!
    }

private var _shareAltSolid: ImageVector? = null
