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

public val BoldGroup.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) {
            return _mouseSimple!!
        }
        _mouseSimple = Builder(name = "MouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 20.0f)
                lineTo(108.0f, 20.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 40.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 68.0f, 68.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, 68.0f, -68.0f)
                lineTo(216.0f, 88.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 148.0f, 20.0f)
                close()
                moveTo(192.0f, 168.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, 44.0f)
                lineTo(108.0f, 212.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(64.0f, 88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 44.0f, -44.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 44.0f, 44.0f)
                close()
                moveTo(140.0f, 76.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
