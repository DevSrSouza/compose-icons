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

public val RegularGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.3f, 144.0f)
                lineTo(205.7f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.8f, -26.9f)
                lineTo(139.8f, 32.9f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -23.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(38.5f, 117.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 50.3f, 144.0f)
                close()
                moveTo(128.0f, 43.8f)
                lineTo(205.7f, 128.0f)
                lineTo(50.3f, 128.0f)
                close()
                moveTo(208.0f, 160.0f)
                lineTo(48.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 160.0f)
                close()
                moveTo(208.0f, 200.0f)
                lineTo(48.0f, 200.0f)
                lineTo(48.0f, 176.0f)
                lineTo(208.0f, 176.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
