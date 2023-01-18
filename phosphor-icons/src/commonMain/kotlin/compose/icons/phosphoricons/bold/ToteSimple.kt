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

public val BoldGroup.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) {
            return _toteSimple!!
        }
        _toteSimple = Builder(name = "ToteSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 66.7f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 223.1f, 60.0f)
                lineTo(178.6f, 60.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 77.4f, 60.0f)
                lineTo(32.9f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 18.0f, 66.7f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, -4.9f, 15.5f)
                lineToRelative(14.2f, 128.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 47.2f, 228.0f)
                lineTo(208.8f, 228.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 19.9f, -17.8f)
                lineToRelative(14.2f, -128.0f)
                arcTo(19.6f, 19.6f, 0.0f, false, false, 238.0f, 66.7f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 25.3f, 16.0f)
                lineTo(102.7f, 60.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(205.3f, 204.0f)
                lineTo(50.7f, 204.0f)
                lineTo(37.4f, 84.0f)
                lineTo(218.6f, 84.0f)
                close()
            }
        }
        .build()
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null
