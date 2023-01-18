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

public val LightGroup.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) {
            return _toteSimple!!
        }
        _toteSimple = Builder(name = "ToteSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.5f, 70.7f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 223.1f, 66.0f)
                lineTo(173.6f, 66.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -91.2f, 0.0f)
                lineTo(32.9f, 66.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 19.0f, 81.5f)
                lineToRelative(14.2f, 128.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 14.0f, 12.5f)
                lineTo(208.8f, 222.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 14.0f, -12.5f)
                lineTo(237.0f, 81.5f)
                arcTo(14.2f, 14.2f, 0.0f, false, false, 233.5f, 70.7f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, true, 33.5f, 28.0f)
                horizontalLineToRelative(-67.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(210.8f, 208.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.8f)
                lineTo(47.2f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.8f)
                lineTo(31.0f, 80.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.4f, -1.5f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.5f, -0.7f)
                lineTo(223.1f, 78.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.5f, 0.7f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.4f, 1.5f)
                close()
            }
        }
        .build()
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null
