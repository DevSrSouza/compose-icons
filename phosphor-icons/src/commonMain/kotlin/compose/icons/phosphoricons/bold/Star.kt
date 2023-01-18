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

public val BoldGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.3f, 236.0f)
                arcToRelative(20.6f, 20.6f, 0.0f, false, true, -10.9f, -3.2f)
                lineTo(128.0f, 202.1f)
                lineTo(83.1f, 230.6f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, true, -24.5f, -0.8f)
                arcTo(22.4f, 22.4f, 0.0f, false, true, 50.0f, 206.1f)
                lineToRelative(13.1f, -51.2f)
                lineTo(19.4f, 118.6f)
                arcTo(20.9f, 20.9f, 0.0f, false, true, 13.0f, 96.2f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 31.1f, 82.0f)
                lineToRelative(56.8f, -3.6f)
                lineToRelative(21.2f, -53.5f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, true, 37.8f, 0.0f)
                lineToRelative(21.2f, 53.5f)
                lineTo(224.9f, 82.0f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 243.0f, 96.2f)
                arcToRelative(20.9f, 20.9f, 0.0f, false, true, -6.4f, 22.4f)
                lineToRelative(-43.7f, 36.3f)
                lineTo(207.0f, 210.2f)
                arcToRelative(20.6f, 20.6f, 0.0f, false, true, -7.9f, 21.9f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 187.3f, 236.0f)
                close()
                moveTo(189.3f, 212.5f)
                close()
                moveTo(128.0f, 177.5f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 10.8f, 3.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(42.8f, 27.1f)
                lineToRelative(-12.4f, -48.9f)
                arcToRelative(20.9f, 20.9f, 0.0f, false, true, 6.8f, -21.1f)
                lineToRelative(38.8f, -32.3f)
                lineToRelative(-50.5f, -3.2f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, true, -17.6f, -12.9f)
                lineTo(128.0f, 42.3f)
                lineToRelative(-18.7f, 47.0f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, true, -17.6f, 12.9f)
                lineToRelative(-50.5f, 3.2f)
                lineTo(80.0f, 137.7f)
                arcToRelative(20.9f, 20.9f, 0.0f, false, true, 6.8f, 21.1f)
                lineTo(74.4f, 207.7f)
                lineToRelative(42.8f, -27.1f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 128.0f, 177.5f)
                close()
                moveTo(126.0f, 200.9f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
