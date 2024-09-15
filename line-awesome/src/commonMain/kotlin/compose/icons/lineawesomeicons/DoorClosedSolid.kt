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

public val LineAwesomeIcons.DoorClosedSolid: ImageVector
    get() {
        if (_doorClosedSolid != null) {
            return _doorClosedSolid!!
        }
        _doorClosedSolid = Builder(name = "DoorClosedSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                lineTo(8.0f, 27.0f)
                lineTo(24.0f, 27.0f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                lineTo(22.0f, 25.0f)
                lineTo(10.0f, 25.0f)
                close()
                moveTo(20.0f, 15.0f)
                curveTo(19.449f, 15.0f, 19.0f, 15.449f, 19.0f, 16.0f)
                curveTo(19.0f, 16.551f, 19.449f, 17.0f, 20.0f, 17.0f)
                curveTo(20.551f, 17.0f, 21.0f, 16.551f, 21.0f, 16.0f)
                curveTo(21.0f, 15.449f, 20.551f, 15.0f, 20.0f, 15.0f)
                close()
            }
        }
        .build()
        return _doorClosedSolid!!
    }

private var _doorClosedSolid: ImageVector? = null
