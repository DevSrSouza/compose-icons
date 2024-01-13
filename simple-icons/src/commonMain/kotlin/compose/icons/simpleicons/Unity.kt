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

public val SimpleIcons.Unity: ImageVector
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = Builder(name = "Unity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.9288f, 4.2939f)
                lineToRelative(3.7997f, 2.1929f)
                curveToRelative(0.1366f, 0.077f, 0.1415f, 0.2905f, 0.0f, 0.3675f)
                lineToRelative(-4.515f, 2.6076f)
                arcToRelative(0.4192f, 0.4192f, 0.0f, false, true, -0.4246f, 0.0f)
                lineTo(7.274f, 6.8543f)
                curveToRelative(-0.139f, -0.0745f, -0.1415f, -0.293f, 0.0f, -0.3675f)
                lineToRelative(3.7972f, -2.193f)
                verticalLineTo(0.0f)
                lineTo(1.3758f, 5.5977f)
                verticalLineTo(16.793f)
                lineToRelative(3.7177f, -2.1456f)
                verticalLineToRelative(-4.3858f)
                curveToRelative(-0.0025f, -0.1565f, 0.1813f, -0.2682f, 0.318f, -0.1838f)
                lineToRelative(4.5148f, 2.6076f)
                arcToRelative(0.4252f, 0.4252f, 0.0f, false, true, 0.2136f, 0.3676f)
                verticalLineToRelative(5.2127f)
                curveToRelative(0.0025f, 0.1565f, -0.1813f, 0.2682f, -0.3179f, 0.1838f)
                lineToRelative(-3.7996f, -2.1929f)
                lineToRelative(-3.7178f, 2.1457f)
                lineTo(12.0f, 24.0f)
                lineToRelative(9.6954f, -5.5977f)
                lineToRelative(-3.7178f, -2.1457f)
                lineToRelative(-3.7996f, 2.1929f)
                curveToRelative(-0.1341f, 0.082f, -0.3229f, -0.0248f, -0.3179f, -0.1838f)
                verticalLineTo(13.053f)
                curveToRelative(0.0f, -0.1565f, 0.087f, -0.2956f, 0.2136f, -0.3676f)
                lineToRelative(4.5149f, -2.6076f)
                curveToRelative(0.134f, -0.082f, 0.3228f, 0.0224f, 0.3179f, 0.1838f)
                verticalLineToRelative(4.3858f)
                lineToRelative(3.7177f, 2.1456f)
                verticalLineTo(5.5977f)
                lineTo(12.9288f, 0.0f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: ImageVector? = null
