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

public val LineAwesomeIcons.PenSolid: ImageVector
    get() {
        if (_penSolid != null) {
            return _penSolid!!
        }
        _penSolid = Builder(name = "PenSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.906f, 3.969f)
                curveTo(22.859f, 3.969f, 21.813f, 4.375f, 21.0f, 5.188f)
                lineTo(5.188f, 21.0f)
                lineTo(5.125f, 21.313f)
                lineTo(4.031f, 26.813f)
                lineTo(3.719f, 28.281f)
                lineTo(5.188f, 27.969f)
                lineTo(10.688f, 26.875f)
                lineTo(11.0f, 26.813f)
                lineTo(26.813f, 11.0f)
                curveTo(28.438f, 9.375f, 28.438f, 6.813f, 26.813f, 5.188f)
                curveTo(26.0f, 4.375f, 24.953f, 3.969f, 23.906f, 3.969f)
                close()
                moveTo(23.906f, 5.875f)
                curveTo(24.41f, 5.875f, 24.918f, 6.105f, 25.406f, 6.594f)
                curveTo(26.379f, 7.566f, 26.379f, 8.621f, 25.406f, 9.594f)
                lineTo(24.688f, 10.281f)
                lineTo(21.719f, 7.313f)
                lineTo(22.406f, 6.594f)
                curveTo(22.895f, 6.105f, 23.402f, 5.875f, 23.906f, 5.875f)
                close()
                moveTo(20.313f, 8.719f)
                lineTo(23.281f, 11.688f)
                lineTo(11.188f, 23.781f)
                curveTo(10.531f, 22.5f, 9.5f, 21.469f, 8.219f, 20.813f)
                close()
                moveTo(6.938f, 22.438f)
                curveTo(8.137f, 22.922f, 9.078f, 23.863f, 9.563f, 25.063f)
                lineTo(6.281f, 25.719f)
                close()
            }
        }
        .build()
        return _penSolid!!
    }

private var _penSolid: ImageVector? = null
