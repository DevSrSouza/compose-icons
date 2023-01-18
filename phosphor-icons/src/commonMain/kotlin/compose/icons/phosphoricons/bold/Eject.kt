package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.8f, 144.0f)
                lineTo(205.2f, 144.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.4f, -33.9f)
                lineToRelative(-77.0f, -80.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -29.2f, 0.0f)
                lineToRelative(-77.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 50.8f, 144.0f)
                close()
                moveTo(128.0f, 49.6f)
                lineTo(195.8f, 120.0f)
                lineTo(60.2f, 120.0f)
                close()
                moveTo(208.0f, 156.0f)
                lineTo(48.0f, 156.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 176.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 156.0f)
                close()
                moveTo(204.0f, 196.0f)
                lineTo(52.0f, 196.0f)
                lineTo(52.0f, 180.0f)
                lineTo(204.0f, 180.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
