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

public val SimpleIcons.Refine: ImageVector
    get() {
        if (_refine != null) {
            return _refine!!
        }
        _refine = Builder(name = "Refine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.789f, 0.422f)
                arcToRelative(4.001f, 4.001f, 0.0f, false, false, -3.578f, 0.0f)
                lineToRelative(-8.0f, 4.0f)
                arcTo(4.0011f, 4.0011f, 0.0f, false, false, 0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.515f, 0.856f, 2.9f, 2.211f, 3.578f)
                lineToRelative(8.0f, 4.0f)
                arcToRelative(4.001f, 4.001f, 0.0f, false, false, 3.578f, 0.0f)
                lineToRelative(8.0f, -4.0f)
                arcTo(4.0011f, 4.0011f, 0.0f, false, false, 24.0f, 16.0f)
                lineTo(24.0f, 8.0f)
                curveToRelative(0.0f, -1.515f, -0.856f, -2.9f, -2.211f, -3.578f)
                lineToRelative(-8.0f, -4.0f)
                close()
                moveTo(8.0f, 8.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.791f, 4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.791f, -4.0f, -4.0f)
                lineTo(8.0f, 8.0f)
                close()
                moveTo(14.0f, 8.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _refine!!
    }

private var _refine: ImageVector? = null
