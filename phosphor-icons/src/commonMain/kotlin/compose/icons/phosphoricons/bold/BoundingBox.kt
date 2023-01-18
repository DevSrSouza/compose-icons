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

public val BoldGroup.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) {
            return _boundingBox!!
        }
        _boundingBox = Builder(name = "BoundingBox", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 100.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(176.0f, 28.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(100.0f, 52.0f)
                lineTo(100.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 80.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 80.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(56.0f)
                lineTo(48.0f, 156.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 176.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(204.0f, 100.0f)
                close()
                moveTo(180.0f, 52.0f)
                horizontalLineToRelative(24.0f)
                lineTo(204.0f, 76.0f)
                lineTo(180.0f, 76.0f)
                close()
                moveTo(52.0f, 52.0f)
                lineTo(76.0f, 52.0f)
                lineTo(76.0f, 76.0f)
                lineTo(52.0f, 76.0f)
                close()
                moveTo(76.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 180.0f)
                lineTo(76.0f, 180.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(180.0f, 204.0f)
                lineTo(180.0f, 180.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(180.0f, 156.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(100.0f, 180.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(76.0f, 156.0f)
                lineTo(76.0f, 100.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(100.0f, 76.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
