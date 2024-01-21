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

public val SolidGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 238.1f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(9.8f, 19.6f)
                curveToRelative(12.5f, 25.1f, 42.2f, 36.4f, 68.3f, 26.0f)
                curveToRelative(20.5f, -8.2f, 33.9f, -28.0f, 33.9f, -50.1f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -19.1f, -8.4f, -36.3f, -21.7f, -48.0f)
                horizontalLineTo(560.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(480.0f)
                horizontalLineTo(448.0f)
                curveTo(377.3f, 0.0f, 320.0f, 57.3f, 320.0f, 128.0f)
                horizontalLineTo(224.0f)
                horizontalLineTo(203.2f)
                horizontalLineTo(148.8f)
                curveToRelative(-30.7f, 0.0f, -57.6f, 16.3f, -72.5f, 40.8f)
                curveTo(33.2f, 174.5f, 0.0f, 211.4f, 0.0f, 256.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(256.0f)
                curveToRelative(0.0f, -13.4f, 6.6f, -25.2f, 16.7f, -32.5f)
                curveToRelative(1.6f, 13.0f, 6.3f, 25.4f, 13.6f, 36.4f)
                lineToRelative(28.2f, 42.4f)
                curveToRelative(8.3f, 12.4f, 6.4f, 28.7f, -1.2f, 41.6f)
                curveToRelative(-16.5f, 28.0f, -20.6f, 62.2f, -10.0f, 93.9f)
                lineToRelative(17.5f, 52.4f)
                curveToRelative(4.4f, 13.1f, 16.6f, 21.9f, 30.4f, 21.9f)
                horizontalLineToRelative(33.7f)
                curveToRelative(21.8f, 0.0f, 37.3f, -21.4f, 30.4f, -42.1f)
                lineToRelative(-20.8f, -62.5f)
                curveToRelative(-2.1f, -6.4f, -0.5f, -13.4f, 4.3f, -18.2f)
                lineToRelative(12.7f, -12.7f)
                curveToRelative(13.2f, -13.2f, 20.6f, -31.1f, 20.6f, -49.7f)
                curveToRelative(0.0f, -2.3f, -0.1f, -4.6f, -0.3f, -6.9f)
                lineToRelative(84.0f, 24.0f)
                curveToRelative(4.1f, 1.2f, 8.2f, 2.1f, 12.3f, 2.8f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(315.7f)
                curveToRelative(19.2f, -19.2f, 31.5f, -45.7f, 32.0f, -75.7f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-1.9f)
                close()
                moveTo(496.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
