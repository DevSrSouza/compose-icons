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

public val SimpleIcons.Douban: ImageVector
    get() {
        if (_douban != null) {
            return _douban!!
        }
        _douban = Builder(name = "Douban", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.51f, 3.06f)
                horizontalLineToRelative(22.98f)
                lineTo(23.49f, 0.755f)
                lineTo(0.51f, 0.755f)
                lineTo(0.51f, 3.06f)
                close()
                moveTo(21.486f, 5.597f)
                verticalLineToRelative(9.608f)
                horizontalLineToRelative(-2.137f)
                lineToRelative(-1.669f, 5.76f)
                lineTo(24.0f, 20.965f)
                verticalLineToRelative(2.28f)
                lineTo(0.0f, 23.245f)
                verticalLineToRelative(-2.28f)
                horizontalLineToRelative(6.32f)
                lineToRelative(-1.67f, -5.76f)
                lineTo(2.515f, 15.205f)
                lineTo(2.515f, 5.597f)
                horizontalLineToRelative(18.972f)
                close()
                moveTo(16.42f, 15.205f)
                lineTo(7.58f, 15.205f)
                lineToRelative(1.67f, 5.76f)
                horizontalLineToRelative(5.501f)
                lineToRelative(1.67f, -5.76f)
                close()
                moveTo(18.367f, 7.9f)
                lineTo(5.634f, 7.9f)
                verticalLineToRelative(5.025f)
                horizontalLineToRelative(12.733f)
                lineTo(18.367f, 7.9f)
                close()
            }
        }
        .build()
        return _douban!!
    }

private var _douban: ImageVector? = null
