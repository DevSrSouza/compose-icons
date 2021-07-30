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

public val SimpleIcons.Ifttt: ImageVector
    get() {
        if (_ifttt != null) {
            return _ifttt!!
        }
        _ifttt = Builder(name = "Ifttt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.82f)
                horizontalLineToRelative(2.024f)
                verticalLineToRelative(6.36f)
                lineTo(0.0f, 15.18f)
                close()
                moveTo(11.566f, 8.82f)
                horizontalLineToRelative(-3.47f)
                verticalLineToRelative(2.024f)
                horizontalLineToRelative(1.446f)
                verticalLineToRelative(4.337f)
                horizontalLineToRelative(2.024f)
                verticalLineToRelative(-4.337f)
                horizontalLineToRelative(1.446f)
                lineTo(13.012f, 8.82f)
                close()
                moveTo(17.06f, 8.82f)
                horizontalLineToRelative(-3.47f)
                verticalLineToRelative(2.024f)
                horizontalLineToRelative(1.446f)
                verticalLineToRelative(4.337f)
                horizontalLineToRelative(2.024f)
                verticalLineToRelative(-4.337f)
                horizontalLineToRelative(1.446f)
                lineTo(18.506f, 8.82f)
                close()
                moveTo(22.554f, 8.82f)
                horizontalLineToRelative(-3.47f)
                verticalLineToRelative(2.024f)
                horizontalLineToRelative(1.446f)
                verticalLineToRelative(4.337f)
                horizontalLineToRelative(2.024f)
                verticalLineToRelative(-4.337f)
                lineTo(24.0f, 10.844f)
                lineTo(24.0f, 8.82f)
                close()
                moveTo(7.518f, 10.843f)
                lineTo(7.518f, 8.82f)
                lineTo(2.892f, 8.82f)
                verticalLineToRelative(6.36f)
                horizontalLineToRelative(2.024f)
                verticalLineToRelative(-1.734f)
                lineTo(6.65f, 13.446f)
                verticalLineToRelative(-2.024f)
                lineTo(4.916f, 11.422f)
                verticalLineToRelative(-0.578f)
                close()
            }
        }
        .build()
        return _ifttt!!
    }

private var _ifttt: ImageVector? = null
