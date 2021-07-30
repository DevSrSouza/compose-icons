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

public val SimpleIcons.Googlelens: ImageVector
    get() {
        if (_googlelens != null) {
            return _googlelens!!
        }
        _googlelens = Builder(name = "Googlelens", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.667f)
                arcToRelative(4.666f, 4.666f, 0.0f, true, false, 0.0f, -9.333f)
                arcToRelative(4.666f, 4.666f, 0.0f, false, false, 0.0f, 9.333f)
                moveToRelative(8.0f, 6.0f)
                arcToRelative(2.666f, 2.666f, 0.0f, true, false, 0.0f, -5.333f)
                arcToRelative(2.666f, 2.666f, 0.0f, false, false, 0.0f, 5.333f)
                moveToRelative(-13.333f, -2.0f)
                arcToRelative(3.343f, 3.343f, 0.0f, false, true, -3.334f, -3.334f)
                verticalLineToRelative(-2.666f)
                lineTo(0.0f, 14.667f)
                verticalLineToRelative(2.666f)
                arcTo(6.665f, 6.665f, 0.0f, false, false, 6.667f, 24.0f)
                horizontalLineToRelative(2.666f)
                verticalLineToRelative(-3.333f)
                close()
                moveTo(3.333f, 6.667f)
                curveToRelative(0.0f, -1.834f, 1.5f, -3.334f, 3.334f, -3.334f)
                horizontalLineToRelative(2.666f)
                lineTo(9.333f, 0.0f)
                lineTo(6.667f, 0.0f)
                arcTo(6.665f, 6.665f, 0.0f, false, false, 0.0f, 6.667f)
                verticalLineToRelative(2.666f)
                horizontalLineToRelative(3.333f)
                close()
                moveTo(17.333f, 3.333f)
                curveToRelative(1.834f, 0.0f, 3.334f, 1.5f, 3.334f, 3.334f)
                verticalLineToRelative(2.666f)
                lineTo(24.0f, 9.333f)
                lineTo(24.0f, 6.667f)
                arcTo(6.665f, 6.665f, 0.0f, false, false, 17.333f, 0.0f)
                horizontalLineToRelative(-2.666f)
                verticalLineToRelative(3.333f)
                close()
            }
        }
        .build()
        return _googlelens!!
    }

private var _googlelens: ImageVector? = null
