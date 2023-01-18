package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.9f, 200.8f)
                lineToRelative(-63.6f, -106.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.3f, -1.0f)
                verticalLineTo(38.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(98.0f)
                verticalLineTo(93.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.3f, 1.0f)
                lineToRelative(-40.2f, 67.0f)
                verticalLineToRelative(0.2f)
                lineTo(34.1f, 200.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.0f, 21.2f)
                horizontalLineTo(209.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.0f, -21.2f)
                close()
                moveTo(108.0f, 101.0f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, 2.0f, -7.2f)
                verticalLineTo(38.0f)
                horizontalLineToRelative(36.0f)
                verticalLineTo(93.8f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, 2.0f, 7.2f)
                lineToRelative(39.9f, 66.5f)
                curveToRelative(-13.8f, 8.7f, -33.5f, 7.0f, -57.2f, -4.9f)
                reflectiveCurveToRelative(-40.5f, -13.1f, -53.4f, -10.5f)
                close()
                moveTo(211.6f, 209.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.7f, 1.0f)
                horizontalLineTo(46.1f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.7f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineToRelative(22.7f, -37.8f)
                curveToRelative(13.8f, -9.4f, 33.9f, -8.0f, 58.2f, 4.2f)
                curveToRelative(17.0f, 8.4f, 30.9f, 11.6f, 42.2f, 11.6f)
                arcToRelative(49.4f, 49.4f, 0.0f, false, false, 26.6f, -7.2f)
                lineTo(211.6f, 207.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 211.6f, 209.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
