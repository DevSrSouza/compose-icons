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

public val RegularGroup.SunDim: ImageVector
    get() {
        if (_sunDim != null) {
            return _sunDim!!
        }
        _sunDim = Builder(name = "SunDim", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 60.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, 68.0f, 68.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 128.0f, 60.0f)
                close()
                moveTo(128.0f, 180.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 128.0f, 180.0f)
                close()
                moveTo(120.0f, 36.0f)
                lineTo(120.0f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(51.6f, 62.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 62.9f, 51.6f)
                lineToRelative(5.7f, 5.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.3f, 0.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(28.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(68.6f, 187.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                lineToRelative(-5.7f, 5.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, 2.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, -2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.3f)
                lineToRelative(5.7f, -5.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 68.6f, 187.4f)
                close()
                moveTo(136.0f, 220.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(204.4f, 193.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, -2.3f)
                lineToRelative(-5.7f, -5.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.3f)
                close()
                moveTo(236.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(187.4f, 68.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.3f)
                lineToRelative(5.7f, -5.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.3f, 11.3f)
                lineToRelative(-5.7f, 5.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.3f, 0.0f)
                close()
            }
        }
        .build()
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
