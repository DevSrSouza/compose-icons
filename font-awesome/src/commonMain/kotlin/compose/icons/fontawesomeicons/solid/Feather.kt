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

public val SolidGroup.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(278.5f, 215.6f)
                lineTo(23.0f, 471.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(57.0f, -57.0f)
                horizontalLineToRelative(68.0f)
                curveToRelative(49.7f, 0.0f, 97.9f, -14.4f, 139.0f, -41.0f)
                curveToRelative(11.1f, -7.2f, 5.5f, -23.0f, -7.8f, -23.0f)
                curveToRelative(-5.1f, 0.0f, -9.2f, -4.1f, -9.2f, -9.2f)
                curveToRelative(0.0f, -4.1f, 2.7f, -7.6f, 6.5f, -8.8f)
                lineToRelative(81.0f, -24.3f)
                curveToRelative(2.5f, -0.8f, 4.8f, -2.1f, 6.7f, -4.0f)
                lineToRelative(22.4f, -22.4f)
                curveToRelative(10.1f, -10.1f, 2.9f, -27.3f, -11.3f, -27.3f)
                lineToRelative(-32.2f, 0.0f)
                curveToRelative(-5.1f, 0.0f, -9.2f, -4.1f, -9.2f, -9.2f)
                curveToRelative(0.0f, -4.1f, 2.7f, -7.6f, 6.5f, -8.8f)
                lineToRelative(112.0f, -33.6f)
                curveToRelative(4.0f, -1.2f, 7.4f, -3.9f, 9.3f, -7.7f)
                curveTo(506.4f, 207.6f, 512.0f, 184.1f, 512.0f, 160.0f)
                curveToRelative(0.0f, -41.0f, -16.3f, -80.3f, -45.3f, -109.3f)
                lineToRelative(-5.5f, -5.5f)
                curveTo(432.3f, 16.3f, 393.0f, 0.0f, 352.0f, 0.0f)
                reflectiveCurveToRelative(-80.3f, 16.3f, -109.3f, 45.3f)
                lineTo(139.0f, 149.0f)
                curveTo(91.0f, 197.0f, 64.0f, 262.1f, 64.0f, 330.0f)
                verticalLineToRelative(55.3f)
                lineTo(253.6f, 195.8f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                curveToRelative(5.4f, 5.4f, 6.1f, 13.6f, 2.2f, 19.8f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
