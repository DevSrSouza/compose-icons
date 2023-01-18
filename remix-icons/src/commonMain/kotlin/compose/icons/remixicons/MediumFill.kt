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

public val RemixIcons.MediumFill: ImageVector
    get() {
        if (_mediumFill != null) {
            return _mediumFill!!
        }
        _mediumFill = Builder(name = "MediumFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(17.3f, 15.94f)
                curveToRelative(-0.1f, -0.05f, -0.15f, -0.2f, -0.15f, -0.301f)
                lineTo(17.15f, 8.006f)
                curveToRelative(0.0f, -0.1f, 0.05f, -0.25f, 0.15f, -0.351f)
                lineToRelative(0.955f, -1.105f)
                lineTo(18.255f, 6.5f)
                lineTo(14.84f, 6.5f)
                lineToRelative(-2.56f, 6.478f)
                lineTo(9.366f, 6.5f)
                lineTo(5.852f, 6.5f)
                verticalLineToRelative(0.05f)
                lineToRelative(0.903f, 1.256f)
                curveToRelative(0.201f, 0.2f, 0.251f, 0.502f, 0.251f, 0.753f)
                verticalLineToRelative(5.523f)
                curveToRelative(0.05f, 0.302f, 0.0f, 0.653f, -0.15f, 0.954f)
                lineTo(5.5f, 16.894f)
                verticalLineToRelative(0.05f)
                horizontalLineToRelative(3.616f)
                verticalLineToRelative(-0.05f)
                lineTo(7.76f, 15.087f)
                curveToRelative(-0.15f, -0.302f, -0.201f, -0.603f, -0.15f, -0.954f)
                lineTo(7.61f, 9.11f)
                curveToRelative(0.05f, 0.1f, 0.1f, 0.1f, 0.15f, 0.301f)
                lineToRelative(3.414f, 7.633f)
                horizontalLineToRelative(0.05f)
                lineTo(14.54f, 8.76f)
                curveToRelative(-0.05f, 0.3f, -0.05f, 0.652f, -0.05f, 0.904f)
                verticalLineToRelative(5.925f)
                curveToRelative(0.0f, 0.15f, -0.05f, 0.25f, -0.15f, 0.351f)
                lineToRelative(-1.005f, 0.954f)
                verticalLineToRelative(0.05f)
                horizontalLineToRelative(4.921f)
                verticalLineToRelative(-0.05f)
                lineToRelative(-0.954f, -0.954f)
                close()
            }
        }
        .build()
        return _mediumFill!!
    }

private var _mediumFill: ImageVector? = null
