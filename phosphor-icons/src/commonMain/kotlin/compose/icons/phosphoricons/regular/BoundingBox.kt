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

public val RegularGroup.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) {
            return _boundingBox!!
        }
        _boundingBox = Builder(name = "BoundingBox", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(176.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                lineTo(96.0f, 56.0f)
                lineTo(96.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 96.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(64.0f)
                lineTo(48.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(80.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(200.0f, 96.0f)
                close()
                moveTo(176.0f, 48.0f)
                horizontalLineToRelative(32.0f)
                lineTo(208.0f, 80.0f)
                lineTo(176.0f, 80.0f)
                close()
                moveTo(48.0f, 48.0f)
                lineTo(80.0f, 48.0f)
                lineTo(80.0f, 63.9f)
                horizontalLineToRelative(0.0f)
                lineTo(80.0f, 80.0f)
                lineTo(48.0f, 80.0f)
                close()
                moveTo(80.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 176.0f)
                lineTo(80.0f, 176.0f)
                verticalLineToRelative(15.9f)
                horizontalLineToRelative(0.0f)
                lineTo(80.0f, 208.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(176.0f, 208.0f)
                lineTo(176.0f, 176.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(184.0f, 160.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                lineTo(96.0f, 184.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(72.0f, 160.0f)
                lineTo(72.0f, 96.0f)
                horizontalLineToRelative(8.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 80.0f)
                lineTo(96.0f, 72.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
