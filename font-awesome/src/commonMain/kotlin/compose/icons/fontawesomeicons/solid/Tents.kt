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

public val SolidGroup.Tents: ImageVector
    get() {
        if (_tents != null) {
            return _tents!!
        }
        _tents = Builder(name = "Tents", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(396.6f, 6.5f)
                lineTo(235.8f, 129.1f)
                curveToRelative(9.6f, 1.8f, 18.9f, 5.8f, 27.0f, 12.0f)
                lineToRelative(168.0f, 128.0f)
                curveToRelative(13.2f, 10.1f, 22.0f, 24.9f, 24.5f, 41.4f)
                lineToRelative(6.2f, 41.5f)
                lineTo(608.0f, 352.0f)
                curveToRelative(9.3f, 0.0f, 18.2f, -4.1f, 24.2f, -11.1f)
                reflectiveCurveToRelative(8.8f, -16.4f, 7.4f, -25.6f)
                lineToRelative(-24.0f, -160.0f)
                curveToRelative(-1.2f, -8.2f, -5.6f, -15.7f, -12.3f, -20.7f)
                lineToRelative(-168.0f, -128.0f)
                curveToRelative(-11.5f, -8.7f, -27.3f, -8.7f, -38.8f, 0.0f)
                close()
                moveTo(243.4f, 166.5f)
                curveToRelative(-11.5f, -8.7f, -27.3f, -8.7f, -38.8f, 0.0f)
                lineToRelative(-168.0f, 128.0f)
                curveToRelative(-6.6f, 5.0f, -11.0f, 12.5f, -12.3f, 20.7f)
                lineToRelative(-24.0f, 160.0f)
                curveToRelative(-1.4f, 9.2f, 1.3f, 18.6f, 7.4f, 25.6f)
                reflectiveCurveTo(22.7f, 512.0f, 32.0f, 512.0f)
                lineTo(176.0f, 512.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(224.0f, 361.9f)
                curveToRelative(0.0f, -5.5f, 4.4f, -9.9f, 9.9f, -9.9f)
                curveToRelative(3.7f, 0.0f, 7.2f, 2.1f, 8.8f, 5.5f)
                lineToRelative(68.4f, 136.8f)
                curveToRelative(5.4f, 10.8f, 16.5f, 17.7f, 28.6f, 17.7f)
                lineTo(400.0f, 512.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(9.3f, 0.0f, 18.2f, -4.1f, 24.2f, -11.1f)
                reflectiveCurveToRelative(8.8f, -16.4f, 7.4f, -25.6f)
                lineToRelative(-24.0f, -160.0f)
                curveToRelative(-1.2f, -8.2f, -5.6f, -15.7f, -12.3f, -20.7f)
                lineToRelative(-168.0f, -128.0f)
                close()
            }
        }
        .build()
        return _tents!!
    }

private var _tents: ImageVector? = null
