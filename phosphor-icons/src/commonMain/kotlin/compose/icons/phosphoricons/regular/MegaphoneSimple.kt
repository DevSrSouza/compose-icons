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

public val RegularGroup.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) {
            return _megaphoneSimple!!
        }
        _megaphoneSimple = Builder(name = "MegaphoneSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.5f, 86.6f)
                lineTo(138.4f, 62.7f)
                horizontalLineToRelative(-0.1f)
                lineTo(44.5f, 35.3f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, -14.1f, 2.6f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 24.0f, 50.7f)
                lineTo(24.0f, 189.3f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 6.4f, 12.8f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 9.6f, 3.2f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, false, 4.5f, -0.6f)
                lineTo(128.0f, 180.3f)
                lineTo(128.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(192.0f, 161.7f)
                lineToRelative(28.5f, -8.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 232.0f, 138.0f)
                lineTo(232.0f, 102.0f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 220.5f, 86.6f)
                close()
                moveTo(40.0f, 189.3f)
                lineTo(40.0f, 50.7f)
                lineToRelative(88.0f, 25.6f)
                verticalLineToRelative(87.4f)
                close()
                moveTo(176.0f, 192.0f)
                lineTo(144.0f, 192.0f)
                lineTo(144.0f, 175.7f)
                lineToRelative(32.0f, -9.4f)
                close()
                moveTo(216.0f, 138.0f)
                lineTo(181.6f, 148.0f)
                horizontalLineToRelative(0.0f)
                lineTo(144.0f, 159.0f)
                lineTo(144.0f, 81.0f)
                lineToRelative(72.0f, 21.0f)
                close()
            }
        }
        .build()
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
