package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) {
            return _mouseSimple!!
        }
        _mouseSimple = Builder(name = "MouseSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 28.0f)
                lineTo(108.0f, 28.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 48.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 60.0f, 60.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 60.0f, -60.0f)
                lineTo(208.0f, 88.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 148.0f, 28.0f)
                close()
                moveTo(200.0f, 168.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, 52.0f)
                lineTo(108.0f, 220.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, -52.0f)
                lineTo(56.0f, 88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 52.0f, -52.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 52.0f, 52.0f)
                close()
                moveTo(132.0f, 72.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
