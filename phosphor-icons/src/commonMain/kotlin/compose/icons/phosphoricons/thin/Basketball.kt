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

public val ThinGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.2f, 198.2f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 0.0f, -140.4f)
                lineToRelative(-0.4f, -0.4f)
                lineToRelative(-0.4f, -0.3f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, -140.8f, 0.0f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-0.4f, 0.4f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 0.0f, 140.4f)
                curveToRelative(0.1f, 0.1f, 0.2f, 0.3f, 0.4f, 0.4f)
                lineToRelative(0.4f, 0.3f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 140.8f, 0.0f)
                lineToRelative(0.4f, -0.3f)
                curveTo(199.0f, 198.5f, 199.1f, 198.3f, 199.2f, 198.2f)
                close()
                moveTo(36.1f, 132.0f)
                lineTo(83.9f, 132.0f)
                arcTo(91.1f, 91.1f, 0.0f, false, true, 60.0f, 189.9f)
                arcTo(90.9f, 90.9f, 0.0f, false, true, 36.1f, 132.0f)
                close()
                moveTo(60.0f, 66.1f)
                arcTo(91.1f, 91.1f, 0.0f, false, true, 83.9f, 124.0f)
                lineTo(36.1f, 124.0f)
                arcTo(90.9f, 90.9f, 0.0f, false, true, 60.0f, 66.1f)
                close()
                moveTo(219.9f, 124.0f)
                lineTo(172.1f, 124.0f)
                arcTo(91.1f, 91.1f, 0.0f, false, true, 196.0f, 66.1f)
                arcTo(90.9f, 90.9f, 0.0f, false, true, 219.9f, 124.0f)
                close()
                moveTo(164.1f, 124.0f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 36.1f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, 58.3f, 24.3f)
                arcTo(98.9f, 98.9f, 0.0f, false, false, 164.1f, 124.0f)
                close()
                moveTo(124.0f, 124.0f)
                lineTo(91.9f, 124.0f)
                arcTo(98.9f, 98.9f, 0.0f, false, false, 65.7f, 60.4f)
                arcTo(91.8f, 91.8f, 0.0f, false, true, 124.0f, 36.1f)
                close()
                moveTo(91.9f, 132.0f)
                lineTo(124.0f, 132.0f)
                verticalLineToRelative(87.9f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, -58.3f, -24.3f)
                arcTo(98.9f, 98.9f, 0.0f, false, false, 91.9f, 132.0f)
                close()
                moveTo(132.0f, 132.0f)
                horizontalLineToRelative(32.1f)
                arcToRelative(98.9f, 98.9f, 0.0f, false, false, 26.2f, 63.6f)
                arcTo(91.8f, 91.8f, 0.0f, false, true, 132.0f, 219.9f)
                close()
                moveTo(172.1f, 132.0f)
                horizontalLineToRelative(47.8f)
                arcTo(90.9f, 90.9f, 0.0f, false, true, 196.0f, 189.9f)
                arcTo(91.1f, 91.1f, 0.0f, false, true, 172.1f, 132.0f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
