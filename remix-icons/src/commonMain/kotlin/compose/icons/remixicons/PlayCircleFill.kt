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

public val RemixIcons.PlayCircleFill: ImageVector
    get() {
        if (_playCircleFill != null) {
            return _playCircleFill!!
        }
        _playCircleFill = Builder(name = "PlayCircleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(10.622f, 8.415f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.622f, 0.332f)
                verticalLineToRelative(6.506f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.622f, 0.332f)
                lineToRelative(4.879f, -3.252f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.0f, -0.666f)
                lineToRelative(-4.88f, -3.252f)
                close()
            }
        }
        .build()
        return _playCircleFill!!
    }

private var _playCircleFill: ImageVector? = null
