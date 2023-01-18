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

public val RemixIcons.MediumLine: ImageVector
    get() {
        if (_mediumLine != null) {
            return _mediumLine!!
        }
        _mediumLine = Builder(name = "MediumLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(17.3f, 15.94f)
                lineToRelative(0.955f, 0.954f)
                verticalLineToRelative(0.05f)
                horizontalLineToRelative(-4.921f)
                verticalLineToRelative(-0.05f)
                lineToRelative(1.004f, -0.954f)
                curveToRelative(0.1f, -0.1f, 0.15f, -0.2f, 0.15f, -0.351f)
                lineTo(14.488f, 9.664f)
                curveToRelative(0.0f, -0.252f, 0.0f, -0.603f, 0.051f, -0.904f)
                lineToRelative(-3.314f, 8.285f)
                horizontalLineToRelative(-0.05f)
                lineTo(7.76f, 9.412f)
                curveToRelative(-0.05f, -0.2f, -0.1f, -0.2f, -0.15f, -0.3f)
                verticalLineToRelative(5.02f)
                curveToRelative(-0.051f, 0.352f, 0.0f, 0.653f, 0.15f, 0.955f)
                lineToRelative(1.356f, 1.807f)
                verticalLineToRelative(0.05f)
                lineTo(5.5f, 16.944f)
                verticalLineToRelative(-0.05f)
                lineToRelative(1.356f, -1.858f)
                curveToRelative(0.15f, -0.3f, 0.2f, -0.652f, 0.15f, -0.954f)
                lineTo(7.006f, 8.56f)
                curveToRelative(0.0f, -0.251f, -0.05f, -0.553f, -0.25f, -0.753f)
                lineTo(5.851f, 6.55f)
                lineTo(5.851f, 6.5f)
                horizontalLineToRelative(3.515f)
                lineToRelative(2.912f, 6.478f)
                lineTo(14.84f, 6.5f)
                horizontalLineToRelative(3.415f)
                verticalLineToRelative(0.05f)
                lineToRelative(-0.954f, 1.105f)
                curveToRelative(-0.1f, 0.1f, -0.15f, 0.251f, -0.15f, 0.351f)
                verticalLineToRelative(7.633f)
                curveToRelative(0.0f, 0.1f, 0.05f, 0.251f, 0.15f, 0.301f)
                close()
            }
        }
        .build()
        return _mediumLine!!
    }

private var _mediumLine: ImageVector? = null
