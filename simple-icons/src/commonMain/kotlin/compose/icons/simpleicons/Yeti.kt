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

public val SimpleIcons.Yeti: ImageVector
    get() {
        if (_yeti != null) {
            return _yeti!!
        }
        _yeti = Builder(name = "Yeti", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.575f, 8.582f)
                verticalLineToRelative(1.685f)
                horizontalLineToRelative(2.183f)
                verticalLineToRelative(5.15f)
                horizontalLineToRelative(2.14f)
                verticalLineToRelative(-5.15f)
                horizontalLineToRelative(2.183f)
                lineTo(21.081f, 8.583f)
                horizontalLineToRelative(-6.505f)
                close()
                moveTo(0.0f, 8.582f)
                lineToRelative(2.699f, 3.972f)
                verticalLineToRelative(2.864f)
                horizontalLineToRelative(2.144f)
                verticalLineToRelative(-2.864f)
                lineToRelative(2.693f, -3.971f)
                lineTo(5.172f, 8.583f)
                lineToRelative(-1.398f, 2.305f)
                lineToRelative(-1.397f, -2.305f)
                close()
                moveTo(8.022f, 8.582f)
                verticalLineToRelative(6.836f)
                horizontalLineToRelative(5.84f)
                verticalLineToRelative(-1.663f)
                horizontalLineToRelative(-3.694f)
                verticalLineToRelative(-0.974f)
                lineTo(13.3f, 12.781f)
                verticalLineToRelative(-1.54f)
                horizontalLineToRelative(-3.132f)
                verticalLineToRelative(-0.974f)
                horizontalLineToRelative(3.589f)
                lineTo(13.757f, 8.583f)
                close()
                moveTo(21.854f, 8.582f)
                lineTo(21.855f, 15.418f)
                lineTo(24.0f, 15.418f)
                lineTo(24.0f, 8.583f)
                close()
            }
        }
        .build()
        return _yeti!!
    }

private var _yeti: ImageVector? = null
