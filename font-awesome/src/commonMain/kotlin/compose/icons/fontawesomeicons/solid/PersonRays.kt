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

public val SolidGroup.PersonRays: ImageVector
    get() {
        if (_personRays != null) {
            return _personRays!!
        }
        _personRays = Builder(name = "PersonRays", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(248.0f, 352.0f)
                lineTo(248.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(184.0f, 256.9f)
                lineToRelative(-28.6f, 47.5f)
                curveToRelative(-9.1f, 15.1f, -28.8f, 20.0f, -43.9f, 10.9f)
                reflectiveCurveToRelative(-20.0f, -28.8f, -10.9f, -43.9f)
                lineToRelative(58.3f, -97.0f)
                curveToRelative(17.4f, -28.9f, 48.6f, -46.6f, 82.3f, -46.6f)
                horizontalLineToRelative(29.7f)
                curveToRelative(33.7f, 0.0f, 64.9f, 17.7f, 82.3f, 46.6f)
                lineToRelative(58.3f, 97.0f)
                curveToRelative(9.1f, 15.1f, 4.2f, 34.8f, -10.9f, 43.9f)
                reflectiveCurveToRelative(-34.8f, 4.2f, -43.9f, -10.9f)
                lineTo(328.0f, 256.9f)
                lineTo(328.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(264.0f, 352.0f)
                lineTo(248.0f, 352.0f)
                close()
                moveTo(7.0f, 7.0f)
                curveTo(16.4f, -2.3f, 31.6f, -2.3f, 41.0f, 7.0f)
                lineToRelative(80.0f, 80.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineTo(7.0f, 41.0f)
                curveTo(-2.3f, 31.6f, -2.3f, 16.4f, 7.0f, 7.0f)
                close()
                moveTo(471.0f, 7.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-80.0f, 80.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(471.0f, 7.0f)
                close()
                moveTo(7.0f, 505.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(80.0f, -80.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineTo(41.0f, 505.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                close()
                moveTo(471.0f, 505.0f)
                lineToRelative(-80.0f, -80.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(80.0f, 80.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                close()
            }
        }
        .build()
        return _personRays!!
    }

private var _personRays: ImageVector? = null
