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

public val SolidGroup.MarsStrokeUp: ImageVector
    get() {
        if (_marsStrokeUp != null) {
            return _marsStrokeUp!!
        }
        _marsStrokeUp = Builder(name = "MarsStrokeUp", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.7f, 4.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(4.6f, 4.6f, 5.9f, 11.5f, 3.5f, 17.4f)
                reflectiveCurveToRelative(-8.3f, 9.9f, -14.8f, 9.9f)
                horizontalLineTo(184.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(184.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 0.6f, 0.0f, 1.2f, -0.1f, 1.8f)
                curveToRelative(77.0f, 11.6f, 136.1f, 78.0f, 136.1f, 158.2f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                reflectiveCurveTo(0.0f, 440.4f, 0.0f, 352.0f)
                curveToRelative(0.0f, -80.2f, 59.1f, -146.7f, 136.1f, -158.2f)
                curveToRelative(0.0f, -0.6f, -0.1f, -1.2f, -0.1f, -1.8f)
                verticalLineTo(168.0f)
                horizontalLineTo(104.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-6.5f, 0.0f, -12.3f, -3.9f, -14.8f, -9.9f)
                reflectiveCurveToRelative(-1.1f, -12.9f, 3.5f, -17.4f)
                lineToRelative(64.0f, -64.0f)
                close()
                moveTo(256.0f, 352.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 64.0f, 352.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 192.0f, 0.0f)
                close()
            }
        }
        .build()
        return _marsStrokeUp!!
    }

private var _marsStrokeUp: ImageVector? = null
