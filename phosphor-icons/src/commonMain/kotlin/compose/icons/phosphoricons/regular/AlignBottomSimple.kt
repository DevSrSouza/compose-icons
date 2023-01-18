package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) {
            return _alignBottomSimple!!
        }
        _alignBottomSimple = Builder(name = "AlignBottomSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(56.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(200.0f, 224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 232.0f)
                close()
                moveTo(80.0f, 192.0f)
                lineTo(80.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(176.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(96.0f, 208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 192.0f)
                close()
                moveTo(96.0f, 192.0f)
                horizontalLineToRelative(64.0f)
                lineTo(160.0f, 40.0f)
                lineTo(96.0f, 40.0f)
                close()
            }
        }
        .build()
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
