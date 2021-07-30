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

public val SimpleIcons.Alipay: ImageVector
    get() {
        if (_alipay != null) {
            return _alipay!!
        }
        _alipay = Builder(name = "Alipay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.076f, 13.732f)
                curveToRelative(0.862f, -1.494f, 1.55f, -3.196f, 2.003f, -5.045f)
                horizontalLineToRelative(-4.731f)
                verticalLineTo(6.988f)
                horizontalLineToRelative(5.795f)
                verticalLineTo(6.04f)
                horizontalLineToRelative(-5.795f)
                verticalLineTo(3.207f)
                horizontalLineToRelative(-2.365f)
                curveToRelative(-0.415f, 0.0f, -0.415f, 0.408f, -0.415f, 0.408f)
                verticalLineTo(6.04f)
                horizontalLineTo(4.707f)
                verticalLineToRelative(0.948f)
                horizontalLineToRelative(5.861f)
                verticalLineToRelative(1.699f)
                horizontalLineTo(5.729f)
                verticalLineToRelative(0.948f)
                horizontalLineToRelative(9.386f)
                curveToRelative(-0.343f, 1.18f, -0.805f, 2.288f, -1.352f, 3.294f)
                curveToRelative(-3.045f, -1.002f, -6.295f, -1.814f, -8.337f, -1.314f)
                curveToRelative(-1.305f, 0.321f, -2.146f, 0.893f, -2.641f, 1.493f)
                curveToRelative(-2.267f, 2.751f, -0.641f, 6.929f, 4.147f, 6.929f)
                curveToRelative(2.831f, 0.0f, 5.559f, -1.574f, 7.673f, -4.168f)
                curveTo(17.758f, 17.381f, 24.0f, 19.976f, 24.0f, 19.976f)
                verticalLineToRelative(0.157f)
                curveToRelative(0.0f, 2.117f, -1.719f, 3.833f, -3.843f, 3.833f)
                horizontalLineTo(3.845f)
                curveTo(1.72f, 23.966f, 0.0f, 22.249f, 0.0f, 20.132f)
                verticalLineTo(3.868f)
                curveTo(0.0f, 1.75f, 1.72f, 0.034f, 3.845f, 0.034f)
                horizontalLineToRelative(16.312f)
                curveTo(22.281f, 0.034f, 24.0f, 1.75f, 24.0f, 3.868f)
                verticalLineToRelative(12.409f)
                curveToRelative(0.0f, 0.0f, -0.784f, -0.062f, -4.24f, -1.216f)
                curveTo(18.8f, 14.74f, 17.511f, 14.25f, 16.076f, 13.732f)
                close()
                moveTo(5.834f, 13.034f)
                curveToRelative(-0.6f, 0.059f, -1.725f, 0.324f, -2.341f, 0.866f)
                curveToRelative(-1.845f, 1.604f, -0.741f, 4.537f, 2.993f, 4.537f)
                curveToRelative(2.17f, 0.0f, 4.339f, -1.384f, 6.042f, -3.599f)
                curveTo(10.104f, 13.659f, 8.052f, 12.816f, 5.834f, 13.034f)
                close()
            }
        }
        .build()
        return _alipay!!
    }

private var _alipay: ImageVector? = null
