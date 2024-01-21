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

public val SolidGroup.KipSign: ImageVector
    get() {
        if (_kipSign != null) {
            return _kipSign!!
        }
        _kipSign = Builder(name = "KipSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.8f, 88.3f)
                curveToRelative(13.4f, -11.5f, 15.0f, -31.7f, 3.5f, -45.1f)
                reflectiveCurveToRelative(-31.7f, -15.0f, -45.1f, -3.5f)
                lineTo(128.0f, 186.4f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(64.0f, 46.3f, 64.0f, 64.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(325.6f)
                lineTo(299.2f, 472.3f)
                curveToRelative(13.4f, 11.5f, 33.6f, 9.9f, 45.1f, -3.5f)
                reflectiveCurveToRelative(9.9f, -33.6f, -3.5f, -45.1f)
                lineTo(182.5f, 288.0f)
                horizontalLineTo(352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(182.5f)
                lineTo(340.8f, 88.3f)
                close()
            }
        }
        .build()
        return _kipSign!!
    }

private var _kipSign: ImageVector? = null
