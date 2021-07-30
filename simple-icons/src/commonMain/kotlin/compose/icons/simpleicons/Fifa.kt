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

public val SimpleIcons.Fifa: ImageVector
    get() {
        if (_fifa != null) {
            return _fifa!!
        }
        _fifa = Builder(name = "Fifa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.064f)
                verticalLineToRelative(7.872f)
                horizontalLineToRelative(2.486f)
                verticalLineToRelative(-2.843f)
                horizontalLineToRelative(1.728f)
                lineToRelative(0.671f, -1.72f)
                lineTo(2.486f, 11.373f)
                lineTo(2.486f, 9.775f)
                horizontalLineToRelative(2.92f)
                lineToRelative(0.637f, -1.711f)
                close()
                moveTo(6.804f, 8.064f)
                lineTo(6.8f, 15.936f)
                horizontalLineToRelative(2.457f)
                lineTo(9.257f, 8.064f)
                close()
                moveTo(10.954f, 8.064f)
                verticalLineToRelative(7.872f)
                horizontalLineToRelative(2.484f)
                verticalLineToRelative(-2.843f)
                horizontalLineToRelative(1.726f)
                lineToRelative(0.677f, -1.72f)
                horizontalLineToRelative(-2.403f)
                lineTo(13.438f, 9.775f)
                horizontalLineToRelative(2.922f)
                lineTo(17.0f, 8.064f)
                close()
                moveTo(18.612f, 8.064f)
                lineToRelative(-2.83f, 7.872f)
                horizontalLineToRelative(2.375f)
                lineToRelative(0.306f, -1.058f)
                horizontalLineToRelative(2.769f)
                lineToRelative(0.32f, 1.058f)
                lineTo(24.0f, 15.936f)
                lineToRelative(-2.837f, -7.872f)
                close()
                moveTo(19.847f, 10.087f)
                lineToRelative(0.981f, 3.277f)
                horizontalLineToRelative(-1.927f)
                close()
            }
        }
        .build()
        return _fifa!!
    }

private var _fifa: ImageVector? = null
