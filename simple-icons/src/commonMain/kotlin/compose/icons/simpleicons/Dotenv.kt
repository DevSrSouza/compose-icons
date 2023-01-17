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

public val SimpleIcons.Dotenv: ImageVector
    get() {
        if (_dotenv != null) {
            return _dotenv!!
        }
        _dotenv = Builder(name = "Dotenv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(10.933f, 15.89f)
                lineTo(6.84f, 15.89f)
                verticalLineToRelative(5.52f)
                horizontalLineToRelative(4.198f)
                verticalLineToRelative(-0.93f)
                lineTo(7.955f, 20.48f)
                verticalLineToRelative(-1.503f)
                horizontalLineToRelative(2.77f)
                verticalLineToRelative(-0.93f)
                horizontalLineToRelative(-2.77f)
                verticalLineToRelative(-1.224f)
                horizontalLineToRelative(2.978f)
                verticalLineToRelative(-0.934f)
                close()
                moveTo(13.079f, 15.89f)
                horizontalLineToRelative(-1.084f)
                verticalLineToRelative(5.52f)
                horizontalLineToRelative(1.035f)
                verticalLineToRelative(-3.6f)
                lineToRelative(2.226f, 3.6f)
                horizontalLineToRelative(1.118f)
                verticalLineToRelative(-5.52f)
                horizontalLineToRelative(-1.036f)
                verticalLineToRelative(3.686f)
                lineToRelative(-2.259f, -3.687f)
                close()
                moveTo(18.196f, 15.89f)
                horizontalLineToRelative(-1.208f)
                lineToRelative(1.973f, 5.52f)
                horizontalLineToRelative(1.19f)
                lineToRelative(1.976f, -5.52f)
                horizontalLineToRelative(-1.182f)
                lineToRelative(-1.352f, 4.085f)
                lineToRelative(-1.397f, -4.086f)
                close()
                moveTo(5.4f, 19.68f)
                lineTo(3.72f, 19.68f)
                verticalLineToRelative(1.68f)
                lineTo(5.4f, 21.36f)
                verticalLineToRelative(-1.68f)
                close()
            }
        }
        .build()
        return _dotenv!!
    }

private var _dotenv: ImageVector? = null
