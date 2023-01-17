package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Clapperboard: ImageVector
    get() {
        if (_clapperboard != null) {
            return _clapperboard!!
        }
        _clapperboard = Builder(name = "Clapperboard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 32.0f)
                lineTo(361.9f, 32.0f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-127.0f, 127.0f)
                horizontalLineToRelative(92.1f)
                lineToRelative(1.0f, -1.0f)
                lineTo(453.8f, 32.3f)
                curveToRelative(-1.9f, -0.2f, -3.8f, -0.3f, -5.8f, -0.3f)
                close()
                moveTo(512.0f, 160.0f)
                lineTo(512.0f, 96.0f)
                curveToRelative(0.0f, -15.1f, -5.3f, -29.1f, -14.0f, -40.0f)
                lineToRelative(-104.0f, 104.0f)
                lineTo(512.0f, 160.0f)
                close()
                moveTo(294.1f, 32.0f)
                lineTo(201.9f, 32.0f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(73.9f, 160.0f)
                horizontalLineToRelative(92.1f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(127.0f, -127.0f)
                close()
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(6.1f, 160.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(127.0f, -127.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(512.0f, 192.0f)
                lineTo(0.0f, 192.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(448.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(512.0f, 192.0f)
                close()
            }
        }
        .build()
        return _clapperboard!!
    }

private var _clapperboard: ImageVector? = null
