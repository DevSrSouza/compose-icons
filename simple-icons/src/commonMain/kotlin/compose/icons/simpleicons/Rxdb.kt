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

public val SimpleIcons.Rxdb: ImageVector
    get() {
        if (_rxdb != null) {
            return _rxdb!!
        }
        _rxdb = Builder(name = "Rxdb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.096f, 3.452f)
                horizontalLineToRelative(1.15f)
                verticalLineToRelative(-1.15f)
                horizontalLineToRelative(1.151f)
                verticalLineToRelative(1.15f)
                horizontalLineToRelative(6.411f)
                verticalLineToRelative(4.932f)
                lineTo(4.192f, 8.384f)
                lineTo(4.192f, 1.15f)
                horizontalLineToRelative(1.15f)
                lineTo(5.342f, 2.3f)
                horizontalLineToRelative(1.151f)
                lineTo(6.493f, 0.0f)
                horizontalLineToRelative(1.15f)
                verticalLineToRelative(1.15f)
                horizontalLineToRelative(1.152f)
                verticalLineToRelative(2.302f)
                horizontalLineToRelative(1.15f)
                lineTo(9.945f, 1.151f)
                horizontalLineToRelative(1.151f)
                verticalLineToRelative(2.301f)
                close()
                moveTo(4.192f, 14.466f)
                horizontalLineToRelative(15.616f)
                lineTo(19.808f, 9.534f)
                lineTo(4.192f, 9.534f)
                verticalLineToRelative(4.932f)
                close()
                moveTo(19.808f, 15.616f)
                lineTo(4.192f, 15.616f)
                verticalLineToRelative(4.932f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(1.15f)
                horizontalLineToRelative(1.151f)
                verticalLineToRelative(-1.15f)
                horizontalLineToRelative(1.151f)
                verticalLineToRelative(2.301f)
                horizontalLineToRelative(1.15f)
                verticalLineToRelative(-2.301f)
                horizontalLineToRelative(1.152f)
                verticalLineToRelative(2.301f)
                horizontalLineToRelative(1.15f)
                lineTo(16.356f, 24.0f)
                horizontalLineToRelative(1.151f)
                verticalLineToRelative(-2.301f)
                horizontalLineToRelative(1.15f)
                verticalLineToRelative(1.15f)
                horizontalLineToRelative(1.151f)
                verticalLineToRelative(-7.233f)
                close()
            }
        }
        .build()
        return _rxdb!!
    }

private var _rxdb: ImageVector? = null
