package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PowerSharp: ImageVector
    get() {
        if (_powerSharp != null) {
            return _powerSharp!!
        }
        _powerSharp = Builder(name = "PowerSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 464.0f)
                curveTo(141.31f, 464.0f, 48.0f, 370.77f, 48.0f, 256.18f)
                arcTo(207.44f, 207.44f, 0.0f, false, true, 122.76f, 96.05f)
                lineToRelative(16.9f, -14.0f)
                lineToRelative(28.17f, 33.72f)
                lineToRelative(-16.9f, 14.0f)
                arcTo(163.72f, 163.72f, 0.0f, false, false, 92.0f, 256.18f)
                curveToRelative(0.0f, 90.39f, 73.57f, 163.93f, 164.0f, 163.93f)
                reflectiveCurveToRelative(164.0f, -73.54f, 164.0f, -163.93f)
                arcToRelative(163.38f, 163.38f, 0.0f, false, false, -59.83f, -126.36f)
                lineToRelative(-17.0f, -14.0f)
                lineToRelative(28.0f, -33.82f)
                lineToRelative(17.0f, 14.0f)
                arcTo(207.13f, 207.13f, 0.0f, false, true, 464.0f, 256.18f)
                curveTo(464.0f, 370.77f, 370.69f, 464.0f, 256.0f, 464.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 48.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(224.0f)
                horizontalLineToRelative(-44.0f)
                close()
            }
        }
        .build()
        return _powerSharp!!
    }

private var _powerSharp: ImageVector? = null
