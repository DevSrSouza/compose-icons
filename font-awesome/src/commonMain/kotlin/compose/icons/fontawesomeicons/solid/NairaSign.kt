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

public val SolidGroup.NairaSign: ImageVector
    get() {
        if (_nairaSign != null) {
            return _nairaSign!!
        }
        _nairaSign = Builder(name = "NairaSign", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.6f, 46.3f)
                curveToRelative(-7.8f, -11.7f, -22.4f, -17.0f, -35.9f, -12.9f)
                reflectiveCurveTo(64.0f, 49.9f, 64.0f, 64.0f)
                verticalLineTo(256.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(228.2f)
                lineToRelative(97.2f, 145.8f)
                curveToRelative(7.8f, 11.7f, 22.4f, 17.0f, 35.9f, 12.9f)
                reflectiveCurveToRelative(22.7f, -16.5f, 22.7f, -30.6f)
                verticalLineTo(320.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(384.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineTo(256.0f)
                horizontalLineTo(262.5f)
                lineTo(122.6f, 46.3f)
                close()
                moveTo(305.1f, 320.0f)
                horizontalLineTo(320.0f)
                verticalLineToRelative(22.3f)
                lineTo(305.1f, 320.0f)
                close()
                moveTo(185.5f, 256.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(169.7f)
                lineTo(185.5f, 256.0f)
                close()
            }
        }
        .build()
        return _nairaSign!!
    }

private var _nairaSign: ImageVector? = null
