package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.History24: ImageVector
    get() {
        if (_history24 != null) {
            return _history24!!
        }
        _history24 = Builder(name = "History24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 2.5f)
                arcTo(9.503f, 9.503f, 0.0f, false, false, 3.378f, 8.0f)
                horizontalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(1.697f)
                arcTo(10.997f, 10.997f, 0.0f, false, true, 11.998f, 1.0f)
                curveTo(18.074f, 1.0f, 23.0f, 5.925f, 23.0f, 12.0f)
                reflectiveCurveToRelative(-4.926f, 11.0f, -11.002f, 11.0f)
                curveTo(6.014f, 23.0f, 1.146f, 18.223f, 1.0f, 12.275f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.037f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.498f, 9.262f)
                curveToRelative(5.248f, 0.0f, 9.502f, -4.253f, 9.502f, -9.5f)
                reflectiveCurveToRelative(-4.254f, -9.5f, -9.502f, -9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.27f, 0.144f, 0.518f, 0.378f, 0.651f)
                lineToRelative(3.5f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.744f, -1.302f)
                lineTo(12.5f, 12.315f)
                verticalLineTo(7.25f)
                close()
            }
        }
        .build()
        return _history24!!
    }

private var _history24: ImageVector? = null
