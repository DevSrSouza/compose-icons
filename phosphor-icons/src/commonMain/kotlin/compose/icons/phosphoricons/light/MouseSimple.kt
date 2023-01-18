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

public val LightGroup.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) {
            return _mouseSimple!!
        }
        _mouseSimple = Builder(name = "MouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 26.0f)
                lineTo(108.0f, 26.0f)
                arcTo(62.1f, 62.1f, 0.0f, false, false, 46.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, false, 62.0f, 62.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(62.1f, 62.1f, 0.0f, false, false, 62.0f, -62.0f)
                lineTo(210.0f, 88.0f)
                arcTo(62.1f, 62.1f, 0.0f, false, false, 148.0f, 26.0f)
                close()
                moveTo(198.0f, 168.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -50.0f, 50.0f)
                lineTo(108.0f, 218.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -50.0f, -50.0f)
                lineTo(58.0f, 88.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 50.0f, -50.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 50.0f, 50.0f)
                close()
                moveTo(134.0f, 72.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
