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

public val BoldGroup.Rug: ImageVector
    get() {
        if (_rug != null) {
            return _rug!!
        }
        _rug = Builder(name = "Rug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(188.0f, 36.0f)
                lineTo(164.0f, 36.0f)
                lineTo(164.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(140.0f, 36.0f)
                lineTo(116.0f, 36.0f)
                lineTo(116.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(92.0f, 36.0f)
                lineTo(68.0f, 36.0f)
                lineTo(68.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(44.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(68.0f, 220.0f)
                lineTo(92.0f, 220.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(116.0f, 220.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(164.0f, 220.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(212.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 12.0f)
                close()
                moveTo(68.0f, 60.0f)
                lineTo(188.0f, 60.0f)
                lineTo(188.0f, 196.0f)
                lineTo(68.0f, 196.0f)
                close()
                moveTo(128.0f, 180.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.3f, -5.8f)
                lineToRelative(24.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -12.4f)
                lineToRelative(-24.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.6f, 0.0f)
                lineToRelative(-24.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.4f)
                lineToRelative(24.0f, 40.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 128.0f, 180.0f)
                close()
                moveTo(128.0f, 111.3f)
                lineTo(138.0f, 128.0f)
                lineToRelative(-10.0f, 16.7f)
                lineTo(118.0f, 128.0f)
                close()
            }
        }
        .build()
        return _rug!!
    }

private var _rug: ImageVector? = null
