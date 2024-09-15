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

public val SolidGroup.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 51.81f, -61.62f, 96.0f, -130.02f, 96.0f)
                lineToRelative(62.98f, 49.72f)
                curveTo(386.9f, 502.42f, 383.56f, 512.0f, 376.0f, 512.0f)
                lineTo(72.0f, 512.0f)
                curveToRelative(-7.58f, 0.0f, -10.89f, -9.59f, -4.96f, -14.28f)
                lineTo(130.02f, 448.0f)
                curveTo(61.82f, 448.0f, 0.0f, 403.95f, 0.0f, 352.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 42.98f, 64.0f, 0.0f, 128.0f, 0.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(65.0f, 0.0f, 128.0f, 42.98f, 128.0f, 96.0f)
                close()
                moveTo(200.0f, 232.0f)
                lineTo(200.0f, 120.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                lineTo(72.0f, 96.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                close()
                moveTo(400.0f, 232.0f)
                lineTo(400.0f, 120.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                lineTo(272.0f, 96.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                close()
                moveTo(352.0f, 288.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(96.0f, 288.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.49f, -48.0f, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
