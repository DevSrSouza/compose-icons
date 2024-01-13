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

public val SimpleIcons.Channel4: ImageVector
    get() {
        if (_channel4 != null) {
            return _channel4!!
        }
        _channel4 = Builder(name = "Channel4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.309f, 0.0f)
                lineToRelative(-0.33f, 0.412f)
                verticalLineToRelative(4.201f)
                lineToRelative(2.382f, -2.95f)
                close()
                moveTo(13.154f, 1.201f)
                lineTo(10.707f, 4.22f)
                verticalLineToRelative(8.674f)
                horizontalLineToRelative(2.447f)
                close()
                moveTo(16.422f, 2.902f)
                lineTo(13.979f, 5.922f)
                verticalLineToRelative(14.81f)
                horizontalLineToRelative(2.443f)
                close()
                moveTo(9.887f, 5.236f)
                lineToRelative(-6.201f, 7.657f)
                horizontalLineToRelative(3.142f)
                lineTo(9.887f, 9.12f)
                close()
                moveTo(3.121f, 13.716f)
                verticalLineToRelative(2.444f)
                horizontalLineToRelative(10.033f)
                verticalLineToRelative(-2.443f)
                close()
                moveTo(17.246f, 13.716f)
                verticalLineToRelative(2.444f)
                horizontalLineToRelative(3.633f)
                verticalLineToRelative(-2.443f)
                close()
                moveTo(10.707f, 16.984f)
                lineTo(10.707f, 24.0f)
                horizontalLineToRelative(2.443f)
                verticalLineToRelative(-7.016f)
                close()
                moveTo(7.436f, 21.557f)
                lineTo(7.436f, 24.0f)
                horizontalLineToRelative(2.443f)
                verticalLineToRelative(-2.443f)
                close()
                moveTo(13.979f, 21.557f)
                lineTo(13.979f, 24.0f)
                horizontalLineToRelative(5.189f)
                verticalLineToRelative(-2.443f)
                close()
            }
        }
        .build()
        return _channel4!!
    }

private var _channel4: ImageVector? = null
