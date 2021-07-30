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

public val SimpleIcons.Xrp: ImageVector
    get() {
        if (_xrp != null) {
            return _xrp!!
        }
        _xrp = Builder(name = "Xrp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.52f, 2.955f)
                arcTo(3.521f, 3.521f, 0.0f, false, false, 1.996f, 6.48f)
                verticalLineToRelative(2.558f)
                arcTo(2.12f, 2.12f, 0.0f, false, true, 0.0f, 11.157f)
                lineToRelative(0.03f, 0.562f)
                lineToRelative(-0.03f, 0.561f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, true, 1.996f, 2.121f)
                verticalLineToRelative(2.948f)
                arcToRelative(3.69f, 3.69f, 0.0f, false, false, 3.68f, 3.696f)
                verticalLineToRelative(-1.123f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, true, -2.557f, -2.558f)
                verticalLineToRelative(-2.963f)
                arcToRelative(3.239f, 3.239f, 0.0f, false, false, -1.42f, -2.682f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, false, 1.42f, -2.682f)
                lineTo(3.119f, 6.48f)
                arcTo(2.412f, 2.412f, 0.0f, false, true, 5.52f, 4.078f)
                horizontalLineToRelative(0.437f)
                lineTo(5.957f, 2.955f)
                close()
                moveTo(18.058f, 2.955f)
                verticalLineToRelative(1.123f)
                horizontalLineToRelative(0.437f)
                arcToRelative(2.39f, 2.39f, 0.0f, false, true, 2.386f, 2.401f)
                verticalLineToRelative(2.558f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, false, 1.42f, 2.682f)
                arcToRelative(3.239f, 3.239f, 0.0f, false, false, -1.42f, 2.682f)
                verticalLineToRelative(2.963f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, true, -2.557f, 2.558f)
                verticalLineToRelative(1.123f)
                arcToRelative(3.69f, 3.69f, 0.0f, false, false, 3.68f, -3.696f)
                lineTo(22.004f, 14.4f)
                arcTo(2.12f, 2.12f, 0.0f, false, true, 24.0f, 12.281f)
                lineToRelative(-0.03f, -0.562f)
                lineToRelative(0.03f, -0.561f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, true, -1.996f, -2.12f)
                lineTo(22.004f, 6.478f)
                arcToRelative(3.518f, 3.518f, 0.0f, false, false, -3.509f, -3.524f)
                close()
                moveTo(6.253f, 7.478f)
                lineToRelative(3.478f, 3.259f)
                arcToRelative(3.393f, 3.393f, 0.0f, false, false, 4.553f, 0.0f)
                lineToRelative(3.478f, -3.26f)
                horizontalLineToRelative(-1.669f)
                lineToRelative(-2.65f, 2.464f)
                arcToRelative(2.133f, 2.133f, 0.0f, false, true, -2.886f, 0.0f)
                lineTo(7.922f, 7.478f)
                close()
                moveTo(11.859f, 12.362f)
                arcToRelative(3.36f, 3.36f, 0.0f, false, false, -2.128f, 0.886f)
                lineToRelative(-3.493f, 3.274f)
                horizontalLineToRelative(1.668f)
                lineToRelative(2.667f, -2.495f)
                arcToRelative(2.133f, 2.133f, 0.0f, false, true, 2.885f, 0.0f)
                lineToRelative(2.65f, 2.495f)
                horizontalLineToRelative(1.67f)
                lineToRelative(-3.494f, -3.274f)
                arcToRelative(3.36f, 3.36f, 0.0f, false, false, -2.425f, -0.886f)
                close()
            }
        }
        .build()
        return _xrp!!
    }

private var _xrp: ImageVector? = null
