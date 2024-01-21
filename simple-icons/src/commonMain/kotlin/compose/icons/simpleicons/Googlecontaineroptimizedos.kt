package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Googlecontaineroptimizedos: ImageVector
    get() {
        if (_googlecontaineroptimizedos != null) {
            return _googlecontaineroptimizedos!!
        }
        _googlecontaineroptimizedos = Builder(name = "Googlecontaineroptimizedos", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.6f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, -5.016f, -1.416f)
                lineTo(11.28f, 17.7f)
                verticalLineToRelative(-5.4f)
                lineTo(6.612f, 9.6f)
                verticalLineToRelative(5.424f)
                lineToRelative(3.3f, 1.908f)
                lineToRelative(-4.152f, 2.4f)
                arcTo(9.6f, 9.6f, 0.0f, false, true, 7.296f, 3.6f)
                verticalLineToRelative(4.8f)
                lineTo(12.0f, 11.136f)
                lineTo(16.68f, 8.4f)
                lineTo(12.0f, 5.724f)
                lineTo(8.688f, 7.632f)
                lineTo(8.688f, 2.964f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, 12.372f, 5.64f)
                arcTo(9.72f, 9.72f, 0.0f, false, true, 21.672f, 12.0f)
                verticalLineToRelative(0.084f)
                lineTo(17.352f, 9.6f)
                lineToRelative(-4.68f, 2.712f)
                verticalLineToRelative(5.412f)
                lineToRelative(4.68f, -2.7f)
                verticalLineToRelative(-3.816f)
                lineToRelative(4.14f, 2.4f)
                arcTo(9.6f, 9.6f, 0.0f, false, true, 12.0f, 21.6f)
                close()
            }
        }
        .build()
        return _googlecontaineroptimizedos!!
    }

private var _googlecontaineroptimizedos: ImageVector? = null
