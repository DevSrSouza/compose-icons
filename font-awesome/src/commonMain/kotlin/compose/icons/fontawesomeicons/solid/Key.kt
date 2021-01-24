package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 176.001f)
                curveTo(512.0f, 273.203f, 433.202f, 352.0f, 336.0f, 352.0f)
                curveToRelative(-11.22f, 0.0f, -22.19f, -1.062f, -32.827f, -3.069f)
                lineToRelative(-24.012f, 27.014f)
                arcTo(23.999f, 23.999f, 0.0f, false, true, 261.223f, 384.0f)
                horizontalLineTo(224.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                verticalLineToRelative(-78.059f)
                curveToRelative(0.0f, -6.365f, 2.529f, -12.47f, 7.029f, -16.971f)
                lineToRelative(161.802f, -161.802f)
                curveTo(163.108f, 213.814f, 160.0f, 195.271f, 160.0f, 176.0f)
                curveTo(160.0f, 78.798f, 238.797f, 0.001f, 335.999f, 0.0f)
                curveTo(433.488f, -0.001f, 512.0f, 78.511f, 512.0f, 176.001f)
                close()
                moveTo(336.0f, 128.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.49f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.49f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
