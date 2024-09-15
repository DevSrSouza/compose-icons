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

public val LineAwesomeIcons.UmbrellaSolid: ImageVector
    get() {
        if (_umbrellaSolid != null) {
            return _umbrellaSolid!!
        }
        _umbrellaSolid = Builder(name = "UmbrellaSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 6.063f)
                curveTo(8.988f, 6.566f, 4.254f, 11.469f, 4.031f, 16.625f)
                curveTo(4.027f, 16.75f, 4.0f, 16.875f, 4.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                curveTo(6.0f, 16.922f, 6.09f, 16.723f, 6.531f, 16.469f)
                curveTo(6.973f, 16.215f, 7.688f, 16.0f, 8.5f, 16.0f)
                curveTo(9.313f, 16.0f, 10.027f, 16.215f, 10.469f, 16.469f)
                curveTo(10.91f, 16.723f, 11.0f, 16.922f, 11.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                curveTo(13.0f, 16.988f, 13.082f, 16.738f, 13.625f, 16.469f)
                curveTo(14.168f, 16.199f, 15.031f, 16.0f, 16.0f, 16.0f)
                curveTo(16.969f, 16.0f, 17.832f, 16.199f, 18.375f, 16.469f)
                curveTo(18.918f, 16.738f, 19.0f, 16.988f, 19.0f, 17.0f)
                lineTo(21.0f, 17.0f)
                curveTo(21.0f, 16.922f, 21.09f, 16.723f, 21.531f, 16.469f)
                curveTo(21.973f, 16.215f, 22.688f, 16.0f, 23.5f, 16.0f)
                curveTo(24.313f, 16.0f, 25.027f, 16.215f, 25.469f, 16.469f)
                curveTo(25.91f, 16.723f, 26.0f, 16.922f, 26.0f, 17.0f)
                lineTo(28.0f, 17.0f)
                curveTo(28.0f, 16.871f, 27.988f, 16.746f, 27.969f, 16.625f)
                curveTo(27.746f, 11.469f, 23.012f, 6.566f, 17.0f, 6.063f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(20.348f, 8.0f, 24.063f, 10.953f, 25.438f, 14.281f)
                curveTo(24.844f, 14.098f, 24.191f, 14.0f, 23.5f, 14.0f)
                curveTo(22.379f, 14.0f, 21.355f, 14.25f, 20.531f, 14.719f)
                curveTo(20.332f, 14.832f, 20.145f, 14.977f, 19.969f, 15.125f)
                curveTo(19.754f, 14.961f, 19.52f, 14.809f, 19.281f, 14.688f)
                curveTo(18.375f, 14.234f, 17.238f, 14.0f, 16.0f, 14.0f)
                curveTo(14.762f, 14.0f, 13.625f, 14.234f, 12.719f, 14.688f)
                curveTo(12.484f, 14.805f, 12.27f, 14.965f, 12.063f, 15.125f)
                curveTo(12.055f, 15.121f, 12.039f, 15.129f, 12.031f, 15.125f)
                curveTo(11.855f, 14.977f, 11.668f, 14.832f, 11.469f, 14.719f)
                curveTo(10.645f, 14.25f, 9.621f, 14.0f, 8.5f, 14.0f)
                curveTo(7.809f, 14.0f, 7.156f, 14.098f, 6.563f, 14.281f)
                curveTo(7.938f, 10.953f, 11.652f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(15.0f, 17.0f)
                lineTo(15.0f, 25.0f)
                curveTo(15.0f, 25.566f, 14.566f, 26.0f, 14.0f, 26.0f)
                curveTo(13.434f, 26.0f, 13.0f, 25.566f, 13.0f, 25.0f)
                lineTo(13.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 25.0f)
                curveTo(11.0f, 26.645f, 12.355f, 28.0f, 14.0f, 28.0f)
                curveTo(15.645f, 28.0f, 17.0f, 26.645f, 17.0f, 25.0f)
                lineTo(17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _umbrellaSolid!!
    }

private var _umbrellaSolid: ImageVector? = null
