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

public val SimpleIcons.Zcash: ImageVector
    get() {
        if (_zcash != null) {
            return _zcash!!
        }
        _zcash = Builder(name = "Zcash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.382f, 0.0f, 0.0f, 5.382f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.382f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.382f, 12.0f, -12.0f)
                reflectiveCurveTo(18.618f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.02f)
                curveTo(6.474f, 22.02f, 1.98f, 17.526f, 1.98f, 12.0f)
                reflectiveCurveTo(6.474f, 1.98f, 12.0f, 1.98f)
                reflectiveCurveTo(22.02f, 6.474f, 22.02f, 12.0f)
                reflectiveCurveTo(17.526f, 22.02f, 12.0f, 22.02f)
                close()
                moveTo(16.28f, 8.257f)
                lineTo(16.28f, 6.431f)
                horizontalLineToRelative(-3.274f)
                lineTo(13.006f, 4.42f)
                horizontalLineToRelative(-2.012f)
                lineTo(10.994f, 6.43f)
                lineTo(7.72f, 6.43f)
                verticalLineToRelative(2.423f)
                horizontalLineToRelative(5.079f)
                lineToRelative(-5.08f, 6.889f)
                verticalLineToRelative(1.826f)
                horizontalLineToRelative(3.275f)
                verticalLineToRelative(2.002f)
                horizontalLineToRelative(2.012f)
                verticalLineToRelative(-2.002f)
                horizontalLineToRelative(3.275f)
                verticalLineToRelative(-2.422f)
                lineTo(11.2f, 15.146f)
                close()
            }
        }
        .build()
        return _zcash!!
    }

private var _zcash: ImageVector? = null
