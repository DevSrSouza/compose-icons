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

public val SolidGroup.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = Builder(name = "Church", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(264.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(46.4f)
                lineTo(183.3f, 210.0f)
                curveToRelative(-14.5f, 8.7f, -23.3f, 24.3f, -23.3f, 41.2f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(251.2f)
                curveToRelative(0.0f, -16.9f, -8.8f, -32.5f, -23.3f, -41.2f)
                lineTo(344.0f, 142.4f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(344.0f)
                verticalLineTo(24.0f)
                close()
                moveTo(24.9f, 330.3f)
                curveTo(9.5f, 338.8f, 0.0f, 354.9f, 0.0f, 372.4f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(273.6f)
                lineTo(24.9f, 330.3f)
                close()
                moveTo(592.0f, 512.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(372.4f)
                curveToRelative(0.0f, -17.5f, -9.5f, -33.6f, -24.9f, -42.1f)
                lineTo(512.0f, 273.6f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _church!!
    }

private var _church: ImageVector? = null
