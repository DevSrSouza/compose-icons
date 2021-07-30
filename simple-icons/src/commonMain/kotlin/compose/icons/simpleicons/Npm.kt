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

public val SimpleIcons.Npm: ImageVector
    get() {
        if (_npm != null) {
            return _npm!!
        }
        _npm = Builder(name = "Npm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.334f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(6.666f)
                verticalLineToRelative(1.332f)
                lineTo(12.0f, 16.666f)
                verticalLineToRelative(-1.332f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-8.0f)
                lineTo(0.0f, 7.334f)
                close()
                moveTo(6.666f, 13.998f)
                lineTo(5.334f, 13.998f)
                verticalLineToRelative(-4.0f)
                lineTo(3.999f, 9.998f)
                verticalLineToRelative(4.0f)
                lineTo(1.335f, 13.998f)
                lineTo(1.335f, 8.667f)
                horizontalLineToRelative(5.331f)
                verticalLineToRelative(5.331f)
                close()
                moveTo(10.666f, 13.998f)
                verticalLineToRelative(1.336f)
                lineTo(8.001f, 15.334f)
                lineTo(8.001f, 8.667f)
                horizontalLineToRelative(5.334f)
                verticalLineToRelative(5.332f)
                horizontalLineToRelative(-2.669f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(22.667f, 13.998f)
                horizontalLineToRelative(-1.33f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.336f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.335f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.33f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.671f)
                lineTo(14.665f, 8.667f)
                horizontalLineToRelative(8.002f)
                verticalLineToRelative(5.331f)
                close()
                moveTo(10.665f, 10.0f)
                lineTo(12.0f, 10.0f)
                verticalLineToRelative(2.667f)
                horizontalLineToRelative(-1.335f)
                lineTo(10.665f, 10.0f)
                close()
            }
        }
        .build()
        return _npm!!
    }

private var _npm: ImageVector? = null
