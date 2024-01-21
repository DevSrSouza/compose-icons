package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CartFlatbed: ImageVector
    get() {
        if (_cartFlatbed != null) {
            return _cartFlatbed!!
        }
        _cartFlatbed = Builder(name = "CartFlatbed", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 0.0f)
                curveTo(14.3f, 0.0f, 0.0f, 14.3f, 0.0f, 32.0f)
                reflectiveCurveTo(14.3f, 64.0f, 32.0f, 64.0f)
                horizontalLineTo(48.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineTo(368.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                horizontalLineToRelative(18.7f)
                curveToRelative(-1.8f, 5.0f, -2.7f, 10.4f, -2.7f, 16.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -5.6f, -1.0f, -11.0f, -2.7f, -16.0f)
                horizontalLineTo(450.7f)
                curveToRelative(-1.8f, 5.0f, -2.7f, 10.4f, -2.7f, 16.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -5.6f, -1.0f, -11.0f, -2.7f, -16.0f)
                horizontalLineTo(608.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(144.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(80.0f)
                curveTo(128.0f, 35.8f, 92.2f, 0.0f, 48.0f, 0.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(192.0f, 80.0f)
                verticalLineTo(272.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineTo(560.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                horizontalLineTo(464.0f)
                verticalLineTo(176.0f)
                curveToRelative(0.0f, 5.9f, -3.2f, 11.3f, -8.5f, 14.1f)
                reflectiveCurveToRelative(-11.5f, 2.5f, -16.4f, -0.8f)
                lineTo(400.0f, 163.2f)
                lineToRelative(-39.1f, 26.1f)
                curveToRelative(-4.9f, 3.3f, -11.2f, 3.6f, -16.4f, 0.8f)
                reflectiveCurveToRelative(-8.5f, -8.2f, -8.5f, -14.1f)
                verticalLineTo(32.0f)
                horizontalLineTo(240.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _cartFlatbed!!
    }

private var _cartFlatbed: ImageVector? = null
