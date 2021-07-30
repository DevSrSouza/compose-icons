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

public val SolidGroup.FilePowerpoint: ImageVector
    get() {
        if (_filePowerpoint != null) {
            return _filePowerpoint!!
        }
        _filePowerpoint = Builder(name = "FilePowerpoint", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(193.7f, 271.2f)
                curveToRelative(8.8f, 0.0f, 15.5f, 2.7f, 20.3f, 8.1f)
                curveToRelative(9.6f, 10.9f, 9.8f, 32.7f, -0.2f, 44.1f)
                curveToRelative(-4.9f, 5.6f, -11.9f, 8.5f, -21.1f, 8.5f)
                horizontalLineToRelative(-26.9f)
                verticalLineToRelative(-60.7f)
                horizontalLineToRelative(27.9f)
                close()
                moveTo(377.0f, 105.0f)
                lineTo(279.0f, 7.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0.0f, -6.3f, -2.5f, -12.4f, -7.0f, -16.9f)
                close()
                moveTo(224.0f, 136.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
                moveTo(277.0f, 301.2f)
                curveToRelative(0.0f, 90.3f, -88.8f, 77.6f, -111.1f, 77.6f)
                lineTo(165.9f, 436.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-30.8f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                lineTo(111.1f, 236.2f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(81.0f)
                curveToRelative(44.5f, 0.0f, 72.9f, 32.8f, 72.9f, 77.0f)
                close()
            }
        }
        .build()
        return _filePowerpoint!!
    }

private var _filePowerpoint: ImageVector? = null
