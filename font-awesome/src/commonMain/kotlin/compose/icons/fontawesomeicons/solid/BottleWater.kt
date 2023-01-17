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

public val SolidGroup.BottleWater: ImageVector
    get() {
        if (_bottleWater != null) {
            return _bottleWater!!
        }
        _bottleWater = Builder(name = "BottleWater", defaultWidth = 256.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 0.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(24.0f)
                curveTo(64.0f, 10.7f, 74.7f, 0.0f, 88.0f, 0.0f)
                close()
                moveTo(0.0f, 151.7f)
                curveToRelative(0.0f, -15.6f, 9.0f, -29.8f, 23.2f, -36.5f)
                lineToRelative(24.4f, -11.4f)
                curveToRelative(11.0f, -5.1f, 23.0f, -7.8f, 35.1f, -7.8f)
                horizontalLineToRelative(90.6f)
                curveToRelative(12.1f, 0.0f, 24.1f, 2.7f, 35.1f, 7.8f)
                lineToRelative(24.4f, 11.4f)
                curveToRelative(14.2f, 6.6f, 23.2f, 20.8f, 23.2f, 36.5f)
                curveToRelative(0.0f, 14.4f, -7.5f, 27.0f, -18.9f, 34.1f)
                curveToRelative(11.5f, 8.8f, 18.9f, 22.6f, 18.9f, 38.2f)
                curveToRelative(0.0f, 16.7f, -8.5f, 31.4f, -21.5f, 40.0f)
                curveToRelative(12.9f, 8.6f, 21.5f, 23.3f, 21.5f, 40.0f)
                reflectiveCurveToRelative(-8.5f, 31.4f, -21.5f, 40.0f)
                curveToRelative(12.9f, 8.6f, 21.5f, 23.3f, 21.5f, 40.0f)
                reflectiveCurveToRelative(-8.5f, 31.4f, -21.5f, 40.0f)
                curveToRelative(12.9f, 8.6f, 21.5f, 23.3f, 21.5f, 40.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -16.7f, 8.5f, -31.4f, 21.5f, -40.0f)
                curveTo(8.5f, 415.4f, 0.0f, 400.7f, 0.0f, 384.0f)
                reflectiveCurveToRelative(8.5f, -31.4f, 21.5f, -40.0f)
                curveTo(8.5f, 335.4f, 0.0f, 320.7f, 0.0f, 304.0f)
                reflectiveCurveToRelative(8.5f, -31.4f, 21.5f, -40.0f)
                curveTo(8.5f, 255.4f, 0.0f, 240.7f, 0.0f, 224.0f)
                curveToRelative(0.0f, -15.6f, 7.4f, -29.4f, 18.9f, -38.2f)
                curveTo(7.5f, 178.7f, 0.0f, 166.1f, 0.0f, 151.7f)
                close()
                moveTo(64.0f, 240.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(80.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                close()
                moveTo(80.0f, 352.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(80.0f)
                close()
            }
        }
        .build()
        return _bottleWater!!
    }

private var _bottleWater: ImageVector? = null
