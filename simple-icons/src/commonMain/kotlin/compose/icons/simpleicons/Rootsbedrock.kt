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

public val SimpleIcons.Rootsbedrock: ImageVector
    get() {
        if (_rootsbedrock != null) {
            return _rootsbedrock!!
        }
        _rootsbedrock = Builder(name = "Rootsbedrock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.4f, 0.0f)
                lineTo(0.0f, 0.4f)
                verticalLineToRelative(5.2f)
                lineToRelative(0.343f, 0.343f)
                lineToRelative(11.314f, -1.886f)
                lineTo(12.0f, 4.4f)
                lineTo(12.0f, 8.0f)
                lineToRelative(11.52f, -1.92f)
                lineToRelative(0.48f, -0.48f)
                lineTo(24.0f, 0.4f)
                lineToRelative(-0.4f, -0.4f)
                close()
                moveTo(0.48f, 9.92f)
                lineTo(0.0f, 10.4f)
                verticalLineToRelative(3.2f)
                lineToRelative(0.343f, 0.343f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 8.0f)
                close()
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(11.52f, -1.92f)
                lineToRelative(0.48f, -0.48f)
                verticalLineToRelative(-3.2f)
                lineToRelative(-0.343f, -0.343f)
                close()
                moveTo(0.48f, 17.92f)
                lineTo(0.0f, 18.4f)
                verticalLineToRelative(5.2f)
                lineToRelative(0.4f, 0.4f)
                horizontalLineToRelative(23.2f)
                lineToRelative(0.4f, -0.4f)
                verticalLineToRelative(-5.2f)
                lineToRelative(-0.343f, -0.343f)
                lineToRelative(-11.314f, 1.886f)
                lineTo(12.0f, 19.6f)
                lineTo(12.0f, 16.0f)
                lineTo(0.48f, 17.92f)
                close()
            }
        }
        .build()
        return _rootsbedrock!!
    }

private var _rootsbedrock: ImageVector? = null
