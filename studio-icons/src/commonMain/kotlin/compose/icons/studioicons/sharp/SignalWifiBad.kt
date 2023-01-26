package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SignalWifiBad: ImageVector
    get() {
        if (_signalWifiBad != null) {
            return _signalWifiBad!!
        }
        _signalWifiBad = Builder(name = "SignalWifiBad", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.98f)
                curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f)
                curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f)
                lineTo(12.0f, 21.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(8.99f)
                lineTo(24.0f, 8.98f)
                close()
                moveTo(19.59f, 14.0f)
                lineToRelative(-2.09f, 2.09f)
                lineToRelative(-0.3f, -0.3f)
                lineTo(15.41f, 14.0f)
                lineTo(14.0f, 15.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(0.3f, 0.3f)
                lineTo(14.0f, 19.59f)
                lineTo(15.41f, 21.0f)
                lineToRelative(2.09f, -2.08f)
                lineTo(19.59f, 21.0f)
                lineTo(21.0f, 19.59f)
                lineToRelative(-2.08f, -2.09f)
                lineTo(21.0f, 15.41f)
                lineTo(19.59f, 14.0f)
                close()
            }
        }
        .build()
        return _signalWifiBad!!
    }

private var _signalWifiBad: ImageVector? = null
