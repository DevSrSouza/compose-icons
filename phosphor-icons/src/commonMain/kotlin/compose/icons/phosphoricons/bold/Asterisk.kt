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

public val BoldGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.6f, 178.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.4f, 4.4f)
                lineTo(140.0f, 148.8f)
                verticalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(148.8f)
                lineTo(57.8f, 182.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -20.8f)
                lineTo(104.0f, 128.0f)
                lineTo(45.8f, 94.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -20.8f)
                lineTo(116.0f, 107.2f)
                verticalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(67.2f)
                lineToRelative(58.2f, -33.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 20.8f)
                lineTo(152.0f, 128.0f)
                lineToRelative(58.2f, 33.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 214.6f, 178.0f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
