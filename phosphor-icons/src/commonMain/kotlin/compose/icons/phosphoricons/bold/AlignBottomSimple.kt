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

public val BoldGroup.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) {
            return _alignBottomSimple!!
        }
        _alignBottomSimple = Builder(name = "AlignBottomSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(56.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(200.0f, 220.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 232.0f)
                close()
                moveTo(76.0f, 184.0f)
                lineTo(76.0f, 40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 96.0f, 20.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                lineTo(180.0f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(96.0f, 204.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 76.0f, 184.0f)
                close()
                moveTo(100.0f, 180.0f)
                horizontalLineToRelative(56.0f)
                lineTo(156.0f, 44.0f)
                lineTo(100.0f, 44.0f)
                close()
            }
        }
        .build()
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
