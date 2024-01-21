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

public val SolidGroup.NotEqual: ImageVector
    get() {
        if (_notEqual != null) {
            return _notEqual!!
        }
        _notEqual = Builder(name = "NotEqual", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.8f, 37.4f)
                curveToRelative(14.7f, 9.8f, 18.7f, 29.7f, 8.9f, 44.4f)
                lineTo(337.1f, 144.0f)
                horizontalLineTo(400.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(294.5f)
                lineToRelative(-64.0f, 96.0f)
                horizontalLineTo(400.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(187.8f)
                lineToRelative(-65.2f, 97.7f)
                curveToRelative(-9.8f, 14.7f, -29.7f, 18.7f, -44.4f, 8.9f)
                reflectiveCurveToRelative(-18.7f, -29.7f, -8.9f, -44.4f)
                lineTo(110.9f, 368.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(153.5f)
                lineToRelative(64.0f, -96.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(260.2f)
                lineToRelative(65.2f, -97.7f)
                curveToRelative(9.8f, -14.7f, 29.7f, -18.7f, 44.4f, -8.9f)
                close()
            }
        }
        .build()
        return _notEqual!!
    }

private var _notEqual: ImageVector? = null
