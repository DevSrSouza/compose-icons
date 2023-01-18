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

public val ThinGroup.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(220.0f, 92.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 92.0f)
                lineTo(192.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(212.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(220.0f, 84.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 88.0f)
                close()
                moveTo(152.0f, 44.0f)
                horizontalLineToRelative(12.0f)
                lineTo(164.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(172.0f, 44.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(172.0f, 36.0f)
                lineTo(172.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(164.0f, 36.0f)
                lineTo(152.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(220.5f, 151.4f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 0.0f, 2.4f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 102.2f, 35.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.6f, 0.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.5f, 4.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.1f, 0.9f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 215.4f, 148.8f)
                lineToRelative(1.2f, -0.2f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 220.5f, 151.4f)
                close()
                moveTo(210.7f, 158.2f)
                arcTo(96.1f, 96.1f, 0.0f, false, true, 97.8f, 45.3f)
                arcTo(88.0f, 88.0f, 0.0f, true, false, 210.7f, 158.2f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
