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

public val ThinGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 136.0f)
                lineTo(220.0f, 88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -52.0f, -52.0f)
                lineTo(88.0f, 36.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 36.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.0f, 52.0f)
                horizontalLineToRelative(49.3f)
                curveToRelative(25.4f, -8.5f, 74.0f, -57.1f, 82.5f, -82.5f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.1f, -0.3f)
                verticalLineToRelative(-0.3f)
                arcTo(1.7f, 1.7f, 0.0f, false, false, 220.0f, 136.0f)
                close()
                moveTo(44.0f, 168.0f)
                lineTo(44.0f, 88.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 88.0f, 44.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 44.0f, 44.0f)
                verticalLineToRelative(44.0f)
                lineTo(184.0f, 132.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -52.0f, 52.0f)
                verticalLineToRelative(28.0f)
                lineTo(88.0f, 212.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 44.0f, 168.0f)
                close()
                moveTo(140.0f, 210.0f)
                lineTo(140.0f, 184.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 44.0f, -44.0f)
                horizontalLineToRelative(26.0f)
                curveTo(198.9f, 162.2f, 162.2f, 198.9f, 140.0f, 210.0f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
