package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SignalTowerFill: ImageVector
    get() {
        if (_signalTowerFill != null) {
            return _signalTowerFill!!
        }
        _signalTowerFill = Builder(name = "SignalTowerFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.116f, 20.087f)
                arcTo(9.986f, 9.986f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                arcToRelative(9.986f, 9.986f, 0.0f, false, true, -4.116f, 8.087f)
                lineToRelative(-1.015f, -1.739f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -9.738f, 0.0f)
                lineToRelative(-1.015f, 1.739f)
                close()
                moveTo(8.15f, 16.602f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.7f, 0.0f)
                lineToRelative(-1.03f, -1.766f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.64f, 0.0f)
                lineToRelative(-1.03f, 1.766f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(1.0f, 9.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(1.0f, -9.0f)
                close()
            }
        }
        .build()
        return _signalTowerFill!!
    }

private var _signalTowerFill: ImageVector? = null
