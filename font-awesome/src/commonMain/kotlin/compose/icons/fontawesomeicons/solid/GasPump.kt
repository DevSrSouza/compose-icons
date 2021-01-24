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

public val SolidGroup.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 448.0f)
                lineTo(16.0f, 448.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(493.2f, 107.3f)
                lineToRelative(-81.0f, -81.0f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0.0f, 22.6f)
                lineTo(416.0f, 97.9f)
                lineTo(416.0f, 160.0f)
                curveToRelative(0.0f, 28.1f, 20.9f, 51.3f, 48.0f, 55.2f)
                lineTo(464.0f, 376.0f)
                curveToRelative(0.0f, 13.2f, -10.8f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.8f, -24.0f, -24.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(320.0f, 64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(96.0f, 0.0f)
                curveTo(60.7f, 0.0f, 32.0f, 28.7f, 32.0f, 64.0f)
                verticalLineToRelative(352.0f)
                horizontalLineToRelative(288.0f)
                lineTo(320.0f, 304.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                verticalLineToRelative(27.8f)
                curveToRelative(0.0f, 37.7f, 27.0f, 72.0f, 64.5f, 75.9f)
                curveToRelative(43.0f, 4.3f, 79.5f, -29.5f, 79.5f, -71.7f)
                lineTo(512.0f, 152.6f)
                curveToRelative(0.0f, -17.0f, -6.8f, -33.3f, -18.8f, -45.3f)
                close()
                moveTo(256.0f, 192.0f)
                lineTo(96.0f, 192.0f)
                lineTo(96.0f, 64.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(128.0f)
                close()
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
