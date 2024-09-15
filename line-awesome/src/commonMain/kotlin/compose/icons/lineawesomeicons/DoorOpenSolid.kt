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

public val LineAwesomeIcons.DoorOpenSolid: ImageVector
    get() {
        if (_doorOpenSolid != null) {
            return _doorOpenSolid!!
        }
        _doorOpenSolid = Builder(name = "DoorOpenSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.875f, 4.0f)
                lineTo(15.781f, 4.031f)
                lineTo(7.781f, 5.906f)
                lineTo(7.0f, 6.094f)
                lineTo(7.0f, 26.344f)
                lineTo(7.813f, 26.469f)
                lineTo(15.813f, 27.969f)
                lineTo(15.906f, 28.0f)
                lineTo(18.0f, 28.0f)
                lineTo(18.0f, 4.0f)
                close()
                moveTo(20.0f, 6.0f)
                lineTo(20.0f, 8.0f)
                lineTo(23.0f, 8.0f)
                lineTo(23.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                lineTo(25.0f, 6.0f)
                close()
                moveTo(16.0f, 6.031f)
                lineTo(16.0f, 26.0f)
                lineTo(9.0f, 24.688f)
                lineTo(9.0f, 7.656f)
                close()
                moveTo(14.344f, 15.0f)
                curveTo(13.977f, 15.0f, 13.656f, 15.449f, 13.656f, 16.0f)
                curveTo(13.656f, 16.551f, 13.977f, 17.0f, 14.344f, 17.0f)
                curveTo(14.711f, 17.0f, 15.0f, 16.551f, 15.0f, 16.0f)
                curveTo(15.0f, 15.449f, 14.711f, 15.0f, 14.344f, 15.0f)
                close()
            }
        }
        .build()
        return _doorOpenSolid!!
    }

private var _doorOpenSolid: ImageVector? = null
