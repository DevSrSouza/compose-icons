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

public val SimpleIcons.Yubico: ImageVector
    get() {
        if (_yubico != null) {
            return _yubico!!
        }
        _yubico = Builder(name = "Yubico", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.356f, 12.388f)
                lineToRelative(2.521f, -7.138f)
                horizontalLineToRelative(3.64f)
                lineToRelative(-6.135f, 15.093f)
                lineTo(8.539f, 20.343f)
                lineToRelative(1.755f, -4.136f)
                lineTo(6.0f, 5.25f)
                horizontalLineToRelative(3.717f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.381f, 0.0f, 0.0f, 5.381f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.381f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.381f, 12.0f, -12.0f)
                reflectiveCurveTo(18.619f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.5f)
                curveToRelative(5.808f, 0.0f, 10.5f, 4.692f, 10.5f, 10.5f)
                reflectiveCurveTo(17.808f, 22.5f, 12.0f, 22.5f)
                reflectiveCurveTo(1.5f, 17.808f, 1.5f, 12.0f)
                reflectiveCurveTo(6.192f, 1.5f, 12.0f, 1.5f)
                close()
            }
        }
        .build()
        return _yubico!!
    }

private var _yubico: ImageVector? = null
