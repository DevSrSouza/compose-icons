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

public val BoldGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.7f, 138.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 0.1f, -0.5f)
                curveToRelative(0.0f, -0.2f, 0.1f, -0.5f, 0.1f, -0.7f)
                verticalLineToRelative(-0.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.1f, -1.1f)
                lineTo(228.0f, 88.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -60.0f, -60.0f)
                lineTo(88.0f, 28.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 28.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 60.0f, 60.0f)
                horizontalLineToRelative(50.6f)
                lineToRelative(0.6f, -0.2f)
                horizontalLineToRelative(0.6f)
                curveToRelative(27.6f, -9.2f, 78.4f, -60.0f, 87.6f, -87.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.1f, -0.5f)
                arcTo(1.7f, 1.7f, 0.0f, false, false, 227.7f, 138.7f)
                close()
                moveTo(52.0f, 168.0f)
                lineTo(52.0f, 88.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 88.0f, 52.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                verticalLineToRelative(36.0f)
                lineTo(184.0f, 124.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -60.0f, 60.0f)
                verticalLineToRelative(20.0f)
                lineTo(88.0f, 204.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 52.0f, 168.0f)
                close()
                moveTo(148.0f, 195.6f)
                lineTo(148.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                horizontalLineToRelative(11.6f)
                curveTo(184.0f, 164.1f, 164.1f, 184.0f, 148.0f, 195.6f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
