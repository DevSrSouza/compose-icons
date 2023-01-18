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

public val LightGroup.ArrowFatLineUp: ImageVector
    get() {
        if (_arrowFatLineUp != null) {
            return _arrowFatLineUp!!
        }
        _arrowFatLineUp = Builder(name = "ArrowFatLineUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.2f, 115.8f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -1.3f, 6.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 126.0f)
                lineTo(74.0f, 126.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(182.0f, 126.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.5f, -3.7f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 228.2f, 115.8f)
                close()
                moveTo(176.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(58.0f)
                lineTo(86.0f, 178.0f)
                lineTo(86.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(46.5f, 114.0f)
                lineTo(128.0f, 32.5f)
                lineTo(209.5f, 114.0f)
                close()
                moveTo(182.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(80.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 216.0f)
                close()
            }
        }
        .build()
        return _arrowFatLineUp!!
    }

private var _arrowFatLineUp: ImageVector? = null
