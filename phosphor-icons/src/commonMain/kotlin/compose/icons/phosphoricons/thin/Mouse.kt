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

public val ThinGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(200.0f, 88.0f)
                verticalLineToRelative(20.0f)
                lineTo(132.0f, 108.0f)
                lineTo(132.0f, 36.0f)
                horizontalLineToRelative(16.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 200.0f, 88.0f)
                close()
                moveTo(108.0f, 36.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(72.0f)
                lineTo(56.0f, 108.0f)
                lineTo(56.0f, 88.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 108.0f, 36.0f)
                close()
                moveTo(148.0f, 220.0f)
                lineTo(108.0f, 220.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, -52.0f)
                lineTo(56.0f, 116.0f)
                lineTo(200.0f, 116.0f)
                verticalLineToRelative(52.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 148.0f, 220.0f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
