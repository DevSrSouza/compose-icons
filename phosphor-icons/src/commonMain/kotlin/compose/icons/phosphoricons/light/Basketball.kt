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

public val LightGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.6f, 199.6f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 0.0f, -143.2f)
                curveToRelative(-0.1f, -0.1f, -0.2f, -0.3f, -0.4f, -0.4f)
                lineToRelative(-0.4f, -0.3f)
                arcToRelative(101.6f, 101.6f, 0.0f, false, false, -143.6f, 0.0f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-0.4f, 0.4f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 0.0f, 143.2f)
                lineToRelative(0.4f, 0.4f)
                lineToRelative(0.3f, 0.3f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 143.8f, 0.0f)
                lineToRelative(0.3f, -0.3f)
                curveTo(200.4f, 199.9f, 200.5f, 199.7f, 200.6f, 199.6f)
                close()
                moveTo(38.2f, 134.0f)
                lineTo(81.8f, 134.0f)
                arcTo(89.3f, 89.3f, 0.0f, false, true, 60.0f, 186.9f)
                arcTo(89.2f, 89.2f, 0.0f, false, true, 38.2f, 134.0f)
                close()
                moveTo(60.0f, 69.1f)
                arcTo(89.3f, 89.3f, 0.0f, false, true, 81.8f, 122.0f)
                lineTo(38.2f, 122.0f)
                arcTo(89.2f, 89.2f, 0.0f, false, true, 60.0f, 69.1f)
                close()
                moveTo(217.8f, 122.0f)
                lineTo(174.2f, 122.0f)
                arcTo(89.3f, 89.3f, 0.0f, false, true, 196.0f, 69.1f)
                arcTo(89.2f, 89.2f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(162.2f, 122.0f)
                lineTo(134.0f, 122.0f)
                lineTo(134.0f, 38.2f)
                arcToRelative(90.5f, 90.5f, 0.0f, false, true, 53.5f, 22.3f)
                arcTo(100.9f, 100.9f, 0.0f, false, false, 162.2f, 122.0f)
                close()
                moveTo(122.0f, 122.0f)
                lineTo(93.8f, 122.0f)
                arcTo(100.9f, 100.9f, 0.0f, false, false, 68.5f, 60.5f)
                arcTo(90.5f, 90.5f, 0.0f, false, true, 122.0f, 38.2f)
                close()
                moveTo(93.8f, 134.0f)
                lineTo(122.0f, 134.0f)
                verticalLineToRelative(83.8f)
                arcToRelative(90.5f, 90.5f, 0.0f, false, true, -53.5f, -22.3f)
                arcTo(100.9f, 100.9f, 0.0f, false, false, 93.8f, 134.0f)
                close()
                moveTo(134.0f, 134.0f)
                horizontalLineToRelative(28.2f)
                arcToRelative(100.9f, 100.9f, 0.0f, false, false, 25.3f, 61.5f)
                arcTo(90.5f, 90.5f, 0.0f, false, true, 134.0f, 217.8f)
                close()
                moveTo(174.2f, 134.0f)
                horizontalLineToRelative(43.6f)
                arcTo(89.2f, 89.2f, 0.0f, false, true, 196.0f, 186.9f)
                arcTo(89.3f, 89.3f, 0.0f, false, true, 174.2f, 134.0f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
