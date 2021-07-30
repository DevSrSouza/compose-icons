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

public val SolidGroup.CarSide: ImageVector
    get() {
        if (_carSide != null) {
            return _carSide!!
        }
        _carSide = Builder(name = "CarSide", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(544.0f, 192.0f)
                horizontalLineToRelative(-16.0f)
                lineTo(419.22f, 56.02f)
                arcTo(64.025f, 64.025f, 0.0f, false, false, 369.24f, 32.0f)
                lineTo(155.33f, 32.0f)
                curveToRelative(-26.17f, 0.0f, -49.7f, 15.93f, -59.42f, 40.23f)
                lineTo(48.0f, 194.26f)
                curveTo(20.44f, 201.4f, 0.0f, 226.21f, 0.0f, 256.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(0.0f, 53.02f, 42.98f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -42.98f, 96.0f, -96.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(0.0f, 53.02f, 42.98f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -42.98f, 96.0f, -96.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-80.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(160.0f, 432.0f)
                curveToRelative(-26.47f, 0.0f, -48.0f, -21.53f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.53f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.53f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.53f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(232.0f, 192.0f)
                lineTo(116.93f, 192.0f)
                lineToRelative(38.4f, -96.0f)
                lineTo(232.0f, 96.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(280.0f, 192.0f)
                lineTo(280.0f, 96.0f)
                horizontalLineToRelative(89.24f)
                lineToRelative(76.8f, 96.0f)
                lineTo(280.0f, 192.0f)
                close()
                moveTo(480.0f, 432.0f)
                curveToRelative(-26.47f, 0.0f, -48.0f, -21.53f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.53f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.53f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.53f, 48.0f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _carSide!!
    }

private var _carSide: ImageVector? = null
