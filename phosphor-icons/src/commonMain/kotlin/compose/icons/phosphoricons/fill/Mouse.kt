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

public val FillGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 24.0f)
                lineTo(108.0f, 24.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 44.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(212.0f, 88.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 148.0f, 24.0f)
                close()
                moveTo(196.0f, 88.0f)
                verticalLineToRelative(16.0f)
                lineTo(136.0f, 104.0f)
                lineTo(136.0f, 40.0f)
                horizontalLineToRelative(12.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 196.0f, 88.0f)
                close()
                moveTo(108.0f, 40.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(64.0f)
                lineTo(60.0f, 104.0f)
                lineTo(60.0f, 88.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 108.0f, 40.0f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
