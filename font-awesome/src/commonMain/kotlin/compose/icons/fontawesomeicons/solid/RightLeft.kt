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

public val SolidGroup.RightLeft: ImageVector
    get() {
        if (_rightLeft != null) {
            return _rightLeft!!
        }
        _rightLeft = Builder(name = "RightLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 96.0f)
                lineToRelative(320.0f, 0.0f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -12.9f, 7.8f, -24.6f, 19.8f, -29.6f)
                reflectiveCurveToRelative(25.7f, -2.2f, 34.9f, 6.9f)
                lineToRelative(96.0f, 96.0f)
                curveToRelative(6.0f, 6.0f, 9.4f, 14.1f, 9.4f, 22.6f)
                reflectiveCurveToRelative(-3.4f, 16.6f, -9.4f, 22.6f)
                lineToRelative(-96.0f, 96.0f)
                curveToRelative(-9.2f, 9.2f, -22.9f, 11.9f, -34.9f, 6.9f)
                reflectiveCurveToRelative(-19.8f, -16.6f, -19.8f, -29.6f)
                verticalLineTo(160.0f)
                lineTo(32.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(480.0f, 352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(160.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 12.9f, -7.8f, 24.6f, -19.8f, 29.6f)
                reflectiveCurveToRelative(-25.7f, 2.2f, -34.9f, -6.9f)
                lineToRelative(-96.0f, -96.0f)
                curveToRelative(-6.0f, -6.0f, -9.4f, -14.1f, -9.4f, -22.6f)
                reflectiveCurveToRelative(3.4f, -16.6f, 9.4f, -22.6f)
                lineToRelative(96.0f, -96.0f)
                curveToRelative(9.2f, -9.2f, 22.9f, -11.9f, 34.9f, -6.9f)
                reflectiveCurveToRelative(19.8f, 16.6f, 19.8f, 29.6f)
                lineToRelative(0.0f, 64.0f)
                horizontalLineTo(480.0f)
                close()
            }
        }
        .build()
        return _rightLeft!!
    }

private var _rightLeft: ImageVector? = null
