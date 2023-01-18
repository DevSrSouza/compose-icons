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

public val ThinGroup.Rug: ImageVector
    get() {
        if (_rug != null) {
            return _rug!!
        }
        _rug = Builder(name = "Rug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(196.0f, 44.0f)
                lineTo(156.0f, 44.0f)
                lineTo(156.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(148.0f, 44.0f)
                lineTo(108.0f, 44.0f)
                lineTo(108.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(100.0f, 44.0f)
                lineTo(60.0f, 44.0f)
                lineTo(60.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(52.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(60.0f, 212.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(108.0f, 212.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(156.0f, 212.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(204.0f, 24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 20.0f)
                close()
                moveTo(60.0f, 52.0f)
                lineTo(196.0f, 52.0f)
                lineTo(196.0f, 204.0f)
                lineTo(60.0f, 204.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.4f, -1.9f)
                lineToRelative(24.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -4.2f)
                lineToRelative(-24.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.8f, 0.0f)
                lineToRelative(-24.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.2f)
                lineToRelative(24.0f, 40.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 128.0f, 172.0f)
                close()
                moveTo(128.0f, 95.8f)
                lineTo(147.3f, 128.0f)
                lineTo(128.0f, 160.2f)
                lineTo(108.7f, 128.0f)
                close()
            }
        }
        .build()
        return _rug!!
    }

private var _rug: ImageVector? = null
