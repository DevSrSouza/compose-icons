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

public val BoldGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.0f, 189.2f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, -178.0f, 0.0f)
                lineToRelative(0.5f, 0.7f)
                lineToRelative(0.4f, 0.5f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, false, 176.2f, 0.0f)
                lineToRelative(0.4f, -0.5f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, true, -9.0f, 37.8f)
                lineToRelative(-63.0f, -44.0f)
                verticalLineTo(44.9f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 212.0f, 128.0f)
                close()
                moveTo(116.0f, 44.9f)
                verticalLineToRelative(76.9f)
                lineToRelative(-63.0f, 44.0f)
                arcTo(83.9f, 83.9f, 0.0f, false, true, 116.0f, 44.9f)
                close()
                moveTo(66.8f, 185.5f)
                lineTo(116.0f, 151.1f)
                verticalLineToRelative(60.0f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 66.8f, 185.5f)
                close()
                moveTo(140.0f, 211.1f)
                verticalLineToRelative(-60.0f)
                lineToRelative(49.2f, 34.4f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 140.0f, 211.1f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
