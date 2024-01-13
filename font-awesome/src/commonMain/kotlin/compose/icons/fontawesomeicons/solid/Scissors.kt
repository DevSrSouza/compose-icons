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

public val SolidGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 192.0f)
                lineToRelative(-39.5f, -39.5f)
                curveToRelative(4.9f, -12.6f, 7.5f, -26.2f, 7.5f, -40.5f)
                curveTo(224.0f, 50.1f, 173.9f, 0.0f, 112.0f, 0.0f)
                reflectiveCurveTo(0.0f, 50.1f, 0.0f, 112.0f)
                reflectiveCurveToRelative(50.1f, 112.0f, 112.0f, 112.0f)
                curveToRelative(14.3f, 0.0f, 27.9f, -2.7f, 40.5f, -7.5f)
                lineTo(192.0f, 256.0f)
                lineToRelative(-39.5f, 39.5f)
                curveToRelative(-12.6f, -4.9f, -26.2f, -7.5f, -40.5f, -7.5f)
                curveTo(50.1f, 288.0f, 0.0f, 338.1f, 0.0f, 400.0f)
                reflectiveCurveToRelative(50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.1f, 112.0f, -112.0f)
                curveToRelative(0.0f, -14.3f, -2.7f, -27.9f, -7.5f, -40.5f)
                lineTo(499.2f, 76.8f)
                curveToRelative(7.1f, -7.1f, 7.1f, -18.5f, 0.0f, -25.6f)
                curveToRelative(-28.3f, -28.3f, -74.1f, -28.3f, -102.4f, 0.0f)
                lineTo(256.0f, 192.0f)
                close()
                moveTo(278.6f, 342.6f)
                lineTo(396.8f, 460.8f)
                curveToRelative(28.3f, 28.3f, 74.1f, 28.3f, 102.4f, 0.0f)
                curveToRelative(7.1f, -7.1f, 7.1f, -18.5f, 0.0f, -25.6f)
                lineTo(342.6f, 278.6f)
                lineToRelative(-64.0f, 64.0f)
                close()
                moveTo(64.0f, 112.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(112.0f, 352.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
