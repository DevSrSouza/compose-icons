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

public val SolidGroup.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = Builder(name = "VolumeMute", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.03f, 71.05f)
                lineTo(126.06f, 160.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(144.0f)
                curveToRelative(0.0f, 13.25f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(102.06f)
                lineToRelative(88.97f, 88.95f)
                curveToRelative(15.03f, 15.03f, 40.97f, 4.47f, 40.97f, -16.97f)
                verticalLineTo(88.02f)
                curveToRelative(0.0f, -21.46f, -25.96f, -31.98f, -40.97f, -16.97f)
                close()
                moveTo(461.64f, 256.0f)
                lineToRelative(45.64f, -45.64f)
                curveToRelative(6.3f, -6.3f, 6.3f, -16.52f, 0.0f, -22.82f)
                lineToRelative(-22.82f, -22.82f)
                curveToRelative(-6.3f, -6.3f, -16.52f, -6.3f, -22.82f, 0.0f)
                lineTo(416.0f, 210.36f)
                lineToRelative(-45.64f, -45.64f)
                curveToRelative(-6.3f, -6.3f, -16.52f, -6.3f, -22.82f, 0.0f)
                lineToRelative(-22.82f, 22.82f)
                curveToRelative(-6.3f, 6.3f, -6.3f, 16.52f, 0.0f, 22.82f)
                lineTo(370.36f, 256.0f)
                lineToRelative(-45.63f, 45.63f)
                curveToRelative(-6.3f, 6.3f, -6.3f, 16.52f, 0.0f, 22.82f)
                lineToRelative(22.82f, 22.82f)
                curveToRelative(6.3f, 6.3f, 16.52f, 6.3f, 22.82f, 0.0f)
                lineTo(416.0f, 301.64f)
                lineToRelative(45.64f, 45.64f)
                curveToRelative(6.3f, 6.3f, 16.52f, 6.3f, 22.82f, 0.0f)
                lineToRelative(22.82f, -22.82f)
                curveToRelative(6.3f, -6.3f, 6.3f, -16.52f, 0.0f, -22.82f)
                lineTo(461.64f, 256.0f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
