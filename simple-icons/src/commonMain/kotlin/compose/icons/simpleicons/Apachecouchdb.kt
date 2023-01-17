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

public val SimpleIcons.Apachecouchdb: ImageVector
    get() {
        if (_apachecouchdb != null) {
            return _apachecouchdb!!
        }
        _apachecouchdb = Builder(name = "Apachecouchdb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 14.625f)
                curveToRelative(0.0f, 0.995f, -0.524f, 1.482f, -1.5f, 1.5f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.976f, -0.018f, -1.5f, -0.505f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.524f, -1.482f, 1.5f, -1.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.976f, 0.018f, 1.5f, 0.505f, 1.5f, 1.5f)
                moveToRelative(-1.5f, 2.25f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.976f, 0.018f, -1.5f, 0.505f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.524f, 1.482f, 1.5f, 1.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.976f, -0.018f, 1.5f, -0.505f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.524f, -1.482f, -1.5f, -1.5f)
                moveToRelative(3.75f, -8.248f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-0.976f, 0.017f, -1.5f, 0.504f, -1.5f, 1.499f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 0.995f, 0.524f, 1.482f, 1.5f, 1.5f)
                verticalLineToRelative(-0.002f)
                curveToRelative(1.464f, -0.052f, 2.25f, -1.514f, 2.25f, -4.498f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0.0f, -1.99f, -0.786f, -2.964f, -2.25f, -2.998f)
                moveToRelative(-19.5f, -0.001f)
                curveTo(0.786f, 8.662f, 0.0f, 9.637f, 0.0f, 11.626f)
                verticalLineToRelative(3.75f)
                curveToRelative(0.0f, 2.984f, 0.786f, 4.446f, 2.25f, 4.498f)
                verticalLineToRelative(0.001f)
                curveToRelative(0.976f, -0.017f, 1.5f, -0.504f, 1.5f, -1.499f)
                verticalLineToRelative(-8.25f)
                curveToRelative(0.0f, -0.995f, -0.524f, -1.482f, -1.5f, -1.5f)
                moveToRelative(19.5f, -0.75f)
                curveToRelative(0.0f, -2.486f, -1.31f, -3.705f, -3.75f, -3.748f)
                verticalLineToRelative(-0.002f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(0.002f)
                curveToRelative(-2.44f, 0.043f, -3.75f, 1.262f, -3.75f, 3.748f)
                verticalLineToRelative(0.001f)
                curveToRelative(1.464f, 0.026f, 2.25f, 0.757f, 2.25f, 2.249f)
                reflectiveCurveToRelative(0.786f, 2.223f, 2.25f, 2.249f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-0.001f)
                curveToRelative(1.464f, -0.026f, 2.25f, -0.757f, 2.25f, -2.249f)
                reflectiveCurveToRelative(0.786f, -2.223f, 2.25f, -2.249f)
                close()
            }
        }
        .build()
        return _apachecouchdb!!
    }

private var _apachecouchdb: ImageVector? = null
