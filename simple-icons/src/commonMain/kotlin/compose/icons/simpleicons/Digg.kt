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

public val SimpleIcons.Digg: ImageVector
    get() {
        if (_digg != null) {
            return _digg!!
        }
        _digg = Builder(name = "Digg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.76f, 8.16f)
                verticalLineToRelative(8.16f)
                horizontalLineToRelative(3.84f)
                verticalLineToRelative(0.96f)
                horizontalLineToRelative(-3.84f)
                verticalLineToRelative(1.92f)
                lineTo(24.0f, 19.2f)
                lineTo(24.0f, 8.16f)
                horizontalLineToRelative(-6.24f)
                close()
                moveTo(10.56f, 8.16f)
                verticalLineToRelative(8.16f)
                horizontalLineToRelative(3.84f)
                verticalLineToRelative(0.96f)
                horizontalLineToRelative(-3.84f)
                verticalLineToRelative(1.92f)
                horizontalLineToRelative(6.24f)
                lineTo(16.8f, 8.16f)
                horizontalLineToRelative(-6.24f)
                close()
                moveTo(3.84f, 4.8f)
                verticalLineToRelative(3.36f)
                lineTo(0.0f, 8.16f)
                verticalLineToRelative(8.16f)
                horizontalLineToRelative(6.24f)
                lineTo(6.24f, 4.8f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(9.6f, 8.16f)
                lineTo(7.2f, 8.16f)
                verticalLineToRelative(8.16f)
                horizontalLineToRelative(2.4f)
                lineTo(9.6f, 8.16f)
                close()
                moveTo(21.6f, 14.4f)
                horizontalLineToRelative(-1.44f)
                verticalLineToRelative(-4.32f)
                horizontalLineToRelative(1.44f)
                verticalLineToRelative(4.32f)
                close()
                moveTo(3.84f, 14.4f)
                lineTo(2.4f, 14.4f)
                verticalLineToRelative(-4.32f)
                horizontalLineToRelative(1.44f)
                verticalLineToRelative(4.32f)
                close()
                moveTo(14.4f, 14.4f)
                horizontalLineToRelative(-1.44f)
                verticalLineToRelative(-4.32f)
                horizontalLineToRelative(1.44f)
                verticalLineToRelative(4.32f)
                close()
                moveTo(9.6f, 4.8f)
                lineTo(7.2f, 4.8f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                lineTo(9.6f, 4.8f)
                close()
            }
        }
        .build()
        return _digg!!
    }

private var _digg: ImageVector? = null
