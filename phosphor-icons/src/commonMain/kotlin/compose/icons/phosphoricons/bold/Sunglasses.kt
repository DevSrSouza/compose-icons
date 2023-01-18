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

public val BoldGroup.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                lineTo(44.0f, 128.0f)
                lineTo(44.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 20.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 96.0f, 0.0f)
                lineTo(116.0f, 152.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 96.0f, 0.0f)
                lineTo(236.0f, 72.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(211.2f, 170.2f)
                lineTo(193.0f, 152.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(12.0f)
                arcTo(25.7f, 25.7f, 0.0f, false, true, 211.2f, 170.2f)
                close()
                moveTo(44.0f, 164.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(30.2f, 30.2f)
                arcToRelative(25.7f, 25.7f, 0.0f, false, true, -6.2f, 0.8f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 44.0f, 164.0f)
                close()
                moveTo(92.0f, 164.0f)
                arcToRelative(25.7f, 25.7f, 0.0f, false, true, -0.8f, 6.2f)
                lineTo(73.0f, 152.0f)
                lineTo(92.0f, 152.0f)
                close()
                moveTo(164.0f, 164.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(30.2f, 30.2f)
                arcToRelative(25.7f, 25.7f, 0.0f, false, true, -6.2f, 0.8f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 164.0f, 164.0f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
