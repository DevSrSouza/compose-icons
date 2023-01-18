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

public val BoldGroup.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) {
            return _newspaperClipping!!
        }
        _newspaperClipping = Builder(name = "NewspaperClipping", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.7f, 10.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.7f, 0.5f)
                lineTo(64.0f, 213.4f)
                lineToRelative(26.6f, 13.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.8f, 0.0f)
                lineTo(128.0f, 213.4f)
                lineToRelative(26.6f, 13.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.8f, 0.0f)
                lineTo(192.0f, 213.4f)
                lineToRelative(26.6f, 13.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.7f, -0.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 216.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 196.6f)
                lineTo(197.4f, 189.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -10.8f, 0.0f)
                lineTo(160.0f, 202.6f)
                lineToRelative(-26.6f, -13.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -10.8f, 0.0f)
                lineTo(96.0f, 202.6f)
                lineTo(69.4f, 189.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -10.8f, 0.0f)
                lineTo(44.0f, 196.6f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
                moveTo(136.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(148.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 108.0f)
                close()
                moveTo(136.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(148.0f, 160.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 148.0f)
                close()
                moveTo(72.0f, 172.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(124.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(72.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 172.0f)
                close()
                moveTo(84.0f, 108.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(40.0f)
                lineTo(84.0f, 148.0f)
                close()
            }
        }
        .build()
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null
