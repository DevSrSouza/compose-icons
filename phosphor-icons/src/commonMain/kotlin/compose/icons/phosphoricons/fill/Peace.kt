package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.6f, 186.9f)
                arcTo(102.9f, 102.9f, 0.0f, false, false, 232.0f, 128.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -208.0f, 0.0f)
                arcToRelative(102.9f, 102.9f, 0.0f, false, false, 18.4f, 58.9f)
                lineToRelative(0.4f, 0.8f)
                lineToRelative(0.4f, 0.4f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, 169.6f, 0.0f)
                lineToRelative(0.4f, -0.4f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 213.6f, 186.9f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, -11.6f, 43.7f)
                lineTo(136.0f, 123.8f)
                verticalLineTo(40.4f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(120.0f, 40.4f)
                verticalLineToRelative(83.4f)
                lineTo(51.6f, 171.7f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 120.0f, 40.4f)
                close()
                moveTo(60.8f, 184.8f)
                lineTo(120.0f, 143.4f)
                verticalLineToRelative(72.2f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 60.8f, 184.8f)
                close()
                moveTo(136.0f, 215.6f)
                verticalLineTo(143.4f)
                lineToRelative(59.2f, 41.4f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 136.0f, 215.6f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
