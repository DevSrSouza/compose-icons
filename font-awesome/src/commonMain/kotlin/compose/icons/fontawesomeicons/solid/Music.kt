package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(470.38f, 1.51f)
                lineTo(150.41f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 126.51f)
                verticalLineToRelative(261.41f)
                arcTo(139.0f, 139.0f, 0.0f, false, false, 96.0f, 384.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 28.66f, -96.0f, 64.0f)
                reflectiveCurveToRelative(43.0f, 64.0f, 96.0f, 64.0f)
                reflectiveCurveToRelative(96.0f, -28.66f, 96.0f, -64.0f)
                verticalLineTo(214.32f)
                lineToRelative(256.0f, -75.0f)
                verticalLineToRelative(184.61f)
                arcToRelative(138.4f, 138.4f, 0.0f, false, false, -32.0f, -3.93f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 28.66f, -96.0f, 64.0f)
                reflectiveCurveToRelative(43.0f, 64.0f, 96.0f, 64.0f)
                reflectiveCurveToRelative(96.0f, -28.65f, 96.0f, -64.0f)
                verticalLineTo(32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -41.62f, -30.49f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
