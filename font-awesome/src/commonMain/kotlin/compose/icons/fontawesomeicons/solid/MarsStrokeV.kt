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

public val SolidGroup.MarsStrokeV: ImageVector
    get() {
        if (_marsStrokeV != null) {
            return _marsStrokeV!!
        }
        _marsStrokeV = Builder(name = "MarsStrokeV", defaultWidth = 288.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 288.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.8f, 234.2f)
                curveToRelative(-19.9f, -19.9f, -44.2f, -32.8f, -69.8f, -38.6f)
                verticalLineToRelative(-25.4f)
                horizontalLineToRelative(20.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-20.0f)
                lineTo(176.0f, 81.4f)
                horizontalLineToRelative(23.9f)
                curveToRelative(10.7f, 0.0f, 16.0f, -12.9f, 8.5f, -20.5f)
                lineTo(152.5f, 5.1f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17.0f, 0.0f)
                lineTo(79.6f, 61.0f)
                curveToRelative(-7.6f, 7.6f, -2.2f, 20.5f, 8.5f, 20.5f)
                lineTo(112.0f, 81.5f)
                verticalLineToRelative(24.7f)
                lineTo(92.0f, 106.2f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(25.4f)
                curveToRelative(-25.6f, 5.8f, -49.9f, 18.7f, -69.8f, 38.6f)
                curveToRelative(-56.2f, 56.2f, -56.2f, 147.4f, 0.0f, 203.6f)
                curveToRelative(56.2f, 56.2f, 147.4f, 56.2f, 203.6f, 0.0f)
                curveToRelative(56.3f, -56.2f, 56.3f, -147.4f, 0.0f, -203.6f)
                close()
                moveTo(200.6f, 392.6f)
                curveToRelative(-31.2f, 31.2f, -81.9f, 31.2f, -113.1f, 0.0f)
                curveToRelative(-31.2f, -31.2f, -31.2f, -81.9f, 0.0f, -113.1f)
                curveToRelative(31.2f, -31.2f, 81.9f, -31.2f, 113.1f, 0.0f)
                curveToRelative(31.2f, 31.1f, 31.2f, 81.9f, 0.0f, 113.1f)
                close()
            }
        }
        .build()
        return _marsStrokeV!!
    }

private var _marsStrokeV: ImageVector? = null
