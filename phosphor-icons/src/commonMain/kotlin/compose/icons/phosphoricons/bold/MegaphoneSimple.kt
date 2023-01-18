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

public val BoldGroup.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) {
            return _megaphoneSimple!!
        }
        _megaphoneSimple = Builder(name = "MegaphoneSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.6f, 82.8f)
                lineToRelative(-82.0f, -23.9f)
                horizontalLineToRelative(-0.1f)
                lineTo(45.6f, 31.5f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 50.7f)
                lineTo(20.0f, 189.3f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 8.0f, 16.0f)
                arcToRelative(19.4f, 19.4f, 0.0f, false, false, 11.9f, 4.0f)
                arcToRelative(18.7f, 18.7f, 0.0f, false, false, 5.7f, -0.8f)
                lineTo(124.0f, 185.7f)
                lineTo(124.0f, 192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(196.0f, 164.7f)
                lineToRelative(25.6f, -7.5f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 236.0f, 138.0f)
                lineTo(236.0f, 102.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 221.6f, 82.8f)
                close()
                moveTo(44.0f, 184.0f)
                lineTo(44.0f, 56.0f)
                lineToRelative(80.0f, 23.3f)
                verticalLineToRelative(81.4f)
                close()
                moveTo(172.0f, 188.0f)
                lineTo(148.0f, 188.0f)
                verticalLineToRelative(-9.3f)
                lineToRelative(24.0f, -7.0f)
                close()
                moveTo(212.0f, 135.0f)
                lineTo(180.5f, 144.2f)
                horizontalLineToRelative(-0.1f)
                lineTo(148.0f, 153.7f)
                lineTo(148.0f, 86.3f)
                lineTo(212.0f, 105.0f)
                close()
            }
        }
        .build()
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
