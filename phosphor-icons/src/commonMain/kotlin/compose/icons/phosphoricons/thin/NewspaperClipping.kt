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

public val ThinGroup.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) {
            return _newspaperClipping!!
        }
        _newspaperClipping = Builder(name = "NewspaperClipping", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 216.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.9f, 3.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.9f, 0.2f)
                lineTo(64.0f, 204.5f)
                lineToRelative(30.2f, 15.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.6f, 0.0f)
                lineTo(128.0f, 204.5f)
                lineToRelative(30.2f, 15.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.6f, 0.0f)
                lineTo(192.0f, 204.5f)
                lineToRelative(30.2f, 15.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 216.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 209.5f)
                lineTo(193.8f, 196.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.6f, 0.0f)
                lineTo(160.0f, 211.5f)
                lineToRelative(-30.2f, -15.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.6f, 0.0f)
                lineTo(96.0f, 211.5f)
                lineTo(65.8f, 196.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.6f, 0.0f)
                lineTo(36.0f, 209.5f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(196.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(144.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 112.0f)
                close()
                moveTo(196.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(144.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 144.0f)
                close()
                moveTo(112.0f, 92.0f)
                lineTo(64.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(116.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 112.0f, 92.0f)
                close()
                moveTo(108.0f, 156.0f)
                lineTo(68.0f, 156.0f)
                lineTo(68.0f, 100.0f)
                horizontalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null
