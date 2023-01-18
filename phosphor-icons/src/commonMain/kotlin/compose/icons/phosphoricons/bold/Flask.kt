package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.0f, 197.7f)
                lineToRelative(-63.0f, -105.0f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(92.7f)
                lineToRelative(-39.6f, 66.0f)
                verticalLineToRelative(0.2f)
                lineTo(29.0f, 197.7f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 46.1f, 228.0f)
                horizontalLineTo(209.9f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 227.0f, 197.7f)
                close()
                moveTo(113.1f, 104.1f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 116.0f, 93.8f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(93.8f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 2.9f, 10.3f)
                lineTo(179.4f, 165.0f)
                curveToRelative(-14.3f, 5.2f, -32.3f, -0.9f, -46.0f, -7.7f)
                curveToRelative(-17.9f, -9.0f, -32.7f, -12.3f, -44.8f, -12.3f)
                close()
                moveTo(53.2f, 204.0f)
                lineToRelative(18.3f, -30.6f)
                curveToRelative(15.0f, -9.1f, 35.9f, -2.3f, 51.1f, 5.3f)
                curveToRelative(17.9f, 9.0f, 32.8f, 12.3f, 45.0f, 12.3f)
                arcToRelative(56.3f, 56.3f, 0.0f, false, false, 24.3f, -5.2f)
                lineTo(202.8f, 204.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
