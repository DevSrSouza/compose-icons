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

public val SolidGroup.Chair: ImageVector
    get() {
        if (_chair != null) {
            return _chair!!
        }
        _chair = Builder(name = "Chair", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 48.0f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(58.7f)
                curveToRelative(23.9f, 13.8f, 40.0f, 39.7f, 40.0f, 69.3f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(128.0f)
                curveTo(384.0f, 57.3f, 326.7f, 0.0f, 256.0f, 0.0f)
                horizontalLineTo(192.0f)
                curveTo(121.3f, 0.0f, 64.0f, 57.3f, 64.0f, 128.0f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(128.0f)
                curveToRelative(0.0f, -29.6f, 16.1f, -55.5f, 40.0f, -69.3f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(48.0f, 288.0f)
                curveToRelative(-12.1f, 0.0f, -23.2f, 6.8f, -28.6f, 17.7f)
                lineToRelative(-16.0f, 32.0f)
                curveToRelative(-5.0f, 9.9f, -4.4f, 21.7f, 1.4f, 31.1f)
                reflectiveCurveTo(20.9f, 384.0f, 32.0f, 384.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(384.0f)
                horizontalLineTo(352.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(384.0f)
                curveToRelative(11.1f, 0.0f, 21.4f, -5.7f, 27.2f, -15.2f)
                reflectiveCurveToRelative(6.4f, -21.2f, 1.4f, -31.1f)
                lineToRelative(-16.0f, -32.0f)
                curveTo(423.2f, 294.8f, 412.1f, 288.0f, 400.0f, 288.0f)
                horizontalLineTo(48.0f)
                close()
            }
        }
        .build()
        return _chair!!
    }

private var _chair: ImageVector? = null
