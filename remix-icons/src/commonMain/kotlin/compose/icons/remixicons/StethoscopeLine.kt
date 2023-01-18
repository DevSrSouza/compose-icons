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

public val RemixIcons.StethoscopeLine: ImageVector
    get() {
        if (_stethoscopeLine != null) {
            return _stethoscopeLine!!
        }
        _stethoscopeLine = Builder(name = "StethoscopeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.973f, -2.162f, 5.44f, -5.0f, 5.917f)
                lineTo(11.0f, 16.5f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.497f, 0.0f, 2.775f, -0.94f, 3.275f, -2.263f)
                curveTo(16.728f, 17.27f, 16.0f, 16.22f, 16.0f, 15.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.371f, -0.92f, 2.527f, -2.176f, 2.885f)
                curveTo(19.21f, 20.252f, 17.059f, 22.0f, 14.5f, 22.0f)
                curveTo(11.462f, 22.0f, 9.0f, 19.538f, 9.0f, 16.5f)
                verticalLineToRelative(-1.583f)
                curveTo(6.162f, 14.441f, 4.0f, 11.973f, 4.0f, 9.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 14.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _stethoscopeLine!!
    }

private var _stethoscopeLine: ImageVector? = null
