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

public val SimpleIcons.Datadotai: ImageVector
    get() {
        if (_datadotai != null) {
            return _datadotai!!
        }
        _datadotai = Builder(name = "Datadotai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.12f, 1.744f)
                lineTo(0.015f, 10.009f)
                lineTo(0.0f, 10.023f)
                lineToRelative(11.986f, 12.219f)
                lineToRelative(0.014f, 0.015f)
                lineToRelative(11.986f, -12.22f)
                lineToRelative(0.014f, -0.014f)
                lineToRelative(-8.115f, -8.273f)
                lineToRelative(-0.006f, -0.006f)
                close()
                moveTo(9.327f, 2.764f)
                horizontalLineToRelative(5.326f)
                lineTo(11.99f, 5.41f)
                close()
                moveTo(12.749f, 6.194f)
                lineTo(15.776f, 3.141f)
                lineTo(22.081f, 9.5f)
                horizontalLineToRelative(-6.054f)
                close()
                moveTo(8.211f, 3.14f)
                lineToRelative(3.04f, 3.072f)
                lineTo(7.999f, 9.5f)
                horizontalLineToRelative(-6.08f)
                close()
                moveTo(8.831f, 10.117f)
                lineTo(12.0f, 6.876f)
                lineToRelative(3.169f, 3.242f)
                lineTo(12.0f, 19.842f)
                close()
                moveTo(16.159f, 10.519f)
                horizontalLineToRelative(5.862f)
                lineToRelative(-8.793f, 9.005f)
                close()
                moveTo(1.919f, 10.519f)
                horizontalLineToRelative(5.915f)
                lineToRelative(2.958f, 9.006f)
                close()
            }
        }
        .build()
        return _datadotai!!
    }

private var _datadotai: ImageVector? = null
