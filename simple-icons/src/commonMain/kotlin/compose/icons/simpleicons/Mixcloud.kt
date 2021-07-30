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

public val SimpleIcons.Mixcloud: ImageVector
    get() {
        if (_mixcloud != null) {
            return _mixcloud!!
        }
        _mixcloud = Builder(name = "Mixcloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.462f, 8.596f)
                lineToRelative(1.372f, 6.49f)
                horizontalLineToRelative(0.319f)
                lineToRelative(1.372f, -6.49f)
                horizontalLineToRelative(2.462f)
                verticalLineToRelative(6.808f)
                lineTo(6.742f, 15.404f)
                verticalLineToRelative(-5.68f)
                lineToRelative(0.232f, -0.81f)
                horizontalLineToRelative(-0.402f)
                lineToRelative(-1.43f, 6.49f)
                lineTo(2.854f, 15.404f)
                lineToRelative(-1.44f, -6.49f)
                horizontalLineToRelative(-0.391f)
                lineToRelative(0.222f, 0.81f)
                verticalLineToRelative(5.68f)
                lineTo(0.0f, 15.404f)
                lineTo(0.0f, 8.596f)
                close()
                moveTo(24.0f, 8.63f)
                verticalLineToRelative(1.429f)
                lineTo(21.257f, 12.0f)
                lineTo(24.0f, 13.941f)
                verticalLineToRelative(1.43f)
                lineToRelative(-3.235f, -2.329f)
                horizontalLineToRelative(-0.348f)
                lineToRelative(-3.226f, 2.329f)
                verticalLineToRelative(-1.43f)
                lineToRelative(2.734f, -1.94f)
                lineToRelative(-2.733f, -1.942f)
                lineTo(17.192f, 8.63f)
                lineToRelative(3.225f, 2.338f)
                horizontalLineToRelative(0.348f)
                close()
                moveTo(16.131f, 11.38f)
                verticalLineToRelative(1.24f)
                lineTo(9.304f, 12.62f)
                verticalLineToRelative(-1.24f)
                close()
            }
        }
        .build()
        return _mixcloud!!
    }

private var _mixcloud: ImageVector? = null
