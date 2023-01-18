package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(195.9f, 169.1f)
                close()
                moveTo(216.7f, 203.9f)
                lineTo(195.9f, 169.1f)
                curveToRelative(-11.4f, 9.7f, -32.2f, 16.8f, -67.9f, -1.1f)
                curveToRelative(-33.3f, -16.6f, -53.6f, -11.7f, -65.4f, -3.0f)
                horizontalLineToRelative(0.0f)
                lineTo(39.3f, 203.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 46.1f, 216.0f)
                lineTo(209.9f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.7f, 203.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.6f, 199.8f)
                lineTo(160.0f, 93.8f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(93.8f)
                lineTo(55.8f, 160.7f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                lineTo(32.4f, 199.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 46.1f, 224.0f)
                horizontalLineTo(209.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.7f, -24.2f)
                close()
                moveTo(109.7f, 102.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 2.3f, -8.2f)
                verticalLineTo(40.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(93.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 2.3f, 8.2f)
                lineToRelative(38.8f, 64.8f)
                curveToRelative(-13.1f, 7.1f, -31.4f, 5.1f, -53.5f, -6.0f)
                curveToRelative(-14.3f, -7.1f, -32.7f, -13.5f, -50.3f, -11.4f)
                close()
                moveTo(46.1f, 208.0f)
                lineToRelative(22.5f, -37.4f)
                curveToRelative(13.2f, -8.7f, 32.4f, -7.1f, 55.8f, 4.6f)
                curveToRelative(17.3f, 8.6f, 31.5f, 11.8f, 43.2f, 11.8f)
                arcToRelative(51.4f, 51.4f, 0.0f, false, false, 25.8f, -6.5f)
                lineTo(209.9f, 208.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
