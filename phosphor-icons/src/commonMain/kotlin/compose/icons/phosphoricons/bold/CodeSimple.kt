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

public val BoldGroup.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = Builder(name = "CodeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 73.0f)
                lineTo(34.1f, 128.0f)
                lineTo(96.0f, 183.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 1.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 1.0f)
                lineTo(8.0f, 137.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 0.0f, -18.0f)
                lineTo(80.0f, 55.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 73.0f)
                close()
                moveTo(248.0f, 119.0f)
                lineTo(176.0f, 55.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -16.0f, 18.0f)
                lineToRelative(61.9f, 55.0f)
                lineTo(160.0f, 183.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -1.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 1.0f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, -18.0f)
                close()
            }
        }
        .build()
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
