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
                moveTo(499.1f, 6.3f)
                curveToRelative(8.1f, 6.0f, 12.9f, 15.6f, 12.9f, 25.7f)
                verticalLineToRelative(72.0f)
                verticalLineTo(368.0f)
                curveToRelative(0.0f, 44.2f, -43.0f, 80.0f, -96.0f, 80.0f)
                reflectiveCurveToRelative(-96.0f, -35.8f, -96.0f, -80.0f)
                reflectiveCurveToRelative(43.0f, -80.0f, 96.0f, -80.0f)
                curveToRelative(11.2f, 0.0f, 22.0f, 1.6f, 32.0f, 4.6f)
                verticalLineTo(147.0f)
                lineTo(192.0f, 223.8f)
                verticalLineTo(432.0f)
                curveToRelative(0.0f, 44.2f, -43.0f, 80.0f, -96.0f, 80.0f)
                reflectiveCurveToRelative(-96.0f, -35.8f, -96.0f, -80.0f)
                reflectiveCurveToRelative(43.0f, -80.0f, 96.0f, -80.0f)
                curveToRelative(11.2f, 0.0f, 22.0f, 1.6f, 32.0f, 4.6f)
                verticalLineTo(200.0f)
                verticalLineTo(128.0f)
                curveToRelative(0.0f, -14.1f, 9.3f, -26.6f, 22.8f, -30.7f)
                lineToRelative(320.0f, -96.0f)
                curveToRelative(9.7f, -2.9f, 20.2f, -1.1f, 28.3f, 5.0f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
