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

public val SimpleIcons.Dogecoin: ImageVector
    get() {
        if (_dogecoin != null) {
            return _dogecoin!!
        }
        _dogecoin = Builder(name = "Dogecoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.288f, 7.908f)
                horizontalLineToRelative(-1.715f)
                verticalLineToRelative(3.38f)
                horizontalLineToRelative(2.697f)
                verticalLineToRelative(1.415f)
                horizontalLineToRelative(-2.697f)
                verticalLineToRelative(3.38f)
                horizontalLineToRelative(1.799f)
                curveToRelative(0.462f, 0.0f, 3.794f, 0.052f, 3.789f, -3.933f)
                curveToRelative(-0.005f, -3.984f, -3.232f, -4.242f, -3.873f, -4.242f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.472f, 18.481f)
                lineTo(8.126f, 18.481f)
                verticalLineToRelative(-5.778f)
                lineTo(6.594f, 12.703f)
                verticalLineToRelative(-1.415f)
                horizontalLineToRelative(1.532f)
                lineTo(8.126f, 5.511f)
                horizontalLineToRelative(3.73f)
                curveToRelative(0.882f, 0.0f, 6.727f, -0.183f, 6.727f, 6.594f)
                curveToRelative(-0.001f, 6.888f, -6.111f, 6.376f, -6.111f, 6.376f)
                close()
            }
        }
        .build()
        return _dogecoin!!
    }

private var _dogecoin: ImageVector? = null
