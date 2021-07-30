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

public val SimpleIcons.Xamarin: ImageVector
    get() {
        if (_xamarin != null) {
            return _xamarin!!
        }
        _xamarin = Builder(name = "Xamarin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.925f, 1.323f)
                arcToRelative(1.904f, 1.904f, 0.0f, false, false, -1.609f, 0.93f)
                lineTo(0.241f, 11.07f)
                arcToRelative(1.918f, 1.918f, 0.0f, false, false, 0.0f, 1.862f)
                lineToRelative(5.075f, 8.816f)
                curveToRelative(0.326f, 0.56f, 0.96f, 0.929f, 1.609f, 0.93f)
                horizontalLineToRelative(10.15f)
                arcToRelative(1.904f, 1.904f, 0.0f, false, false, 1.609f, -0.93f)
                lineToRelative(5.075f, -8.816f)
                arcToRelative(1.918f, 1.918f, 0.0f, false, false, 0.0f, -1.862f)
                lineToRelative(-5.075f, -8.816f)
                arcToRelative(1.904f, 1.904f, 0.0f, false, false, -1.609f, -0.93f)
                close()
                moveTo(7.017f, 6.48f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, true, 0.043f, 0.0f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, true, 0.192f, 0.114f)
                lineToRelative(2.97f, 5.292f)
                arcToRelative(0.228f, 0.228f, 0.0f, false, true, 0.028f, 0.086f)
                arcToRelative(0.228f, 0.228f, 0.0f, false, true, 0.028f, -0.086f)
                lineToRelative(2.963f, -5.292f)
                arcToRelative(0.231f, 0.231f, 0.0f, false, true, 0.198f, -0.114f)
                horizontalLineToRelative(1.751f)
                curveToRelative(0.155f, 0.002f, 0.271f, 0.197f, 0.199f, 0.334f)
                lineTo(14.239f, 12.0f)
                lineToRelative(2.9f, 5.179f)
                curveToRelative(0.08f, 0.138f, -0.04f, 0.342f, -0.199f, 0.34f)
                horizontalLineToRelative(-1.75f)
                arcToRelative(0.232f, 0.232f, 0.0f, false, true, -0.2f, -0.12f)
                lineToRelative(-2.962f, -5.292f)
                arcTo(0.228f, 0.228f, 0.0f, false, true, 12.0f, 12.02f)
                arcToRelative(0.228f, 0.228f, 0.0f, false, true, -0.028f, 0.086f)
                lineToRelative(-2.97f, 5.292f)
                arcToRelative(0.231f, 0.231f, 0.0f, false, true, -0.192f, 0.12f)
                lineTo(7.06f, 17.518f)
                curveToRelative(-0.16f, 0.002f, -0.278f, -0.202f, -0.199f, -0.34f)
                lineTo(9.761f, 12.0f)
                lineToRelative(-2.9f, -5.186f)
                curveToRelative(-0.07f, -0.125f, 0.015f, -0.307f, 0.156f, -0.334f)
                close()
            }
        }
        .build()
        return _xamarin!!
    }

private var _xamarin: ImageVector? = null
