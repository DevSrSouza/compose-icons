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

public val SimpleIcons.Ton: ImageVector
    get() {
        if (_ton != null) {
            return _ton!!
        }
        _ton = Builder(name = "Ton", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(7.902f, 6.697f)
                horizontalLineToRelative(8.196f)
                curveToRelative(1.505f, 0.0f, 2.462f, 1.628f, 1.705f, 2.94f)
                lineToRelative(-5.059f, 8.765f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, -1.488f, 0.0f)
                lineTo(6.199f, 9.637f)
                curveToRelative(-0.758f, -1.314f, 0.197f, -2.94f, 1.703f, -2.94f)
                close()
                moveTo(12.746f, 8.193f)
                verticalLineToRelative(7.58f)
                lineToRelative(1.102f, -2.128f)
                lineToRelative(2.656f, -4.756f)
                arcToRelative(0.465f, 0.465f, 0.0f, false, false, -0.408f, -0.696f)
                horizontalLineToRelative(-3.35f)
                close()
                moveTo(7.9f, 8.195f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, false, -0.408f, 0.694f)
                lineToRelative(2.658f, 4.754f)
                lineToRelative(1.102f, 2.13f)
                lineTo(11.252f, 8.195f)
                lineTo(7.9f, 8.195f)
                close()
            }
        }
        .build()
        return _ton!!
    }

private var _ton: ImageVector? = null
