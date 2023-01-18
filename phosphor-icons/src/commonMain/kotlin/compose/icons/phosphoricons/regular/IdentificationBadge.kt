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

public val RegularGroup.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) {
            return _identificationBadge!!
        }
        _identificationBadge = Builder(name = "IdentificationBadge", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.2f, 198.4f)
                arcTo(7.7f, 7.7f, 0.0f, false, false, 80.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.4f, -3.2f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 83.2f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 11.2f, 1.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.6f, -11.2f)
                arcTo(67.8f, 67.8f, 0.0f, false, false, 155.0f, 165.5f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -54.0f, 0.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, false, -27.4f, 21.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 75.2f, 198.4f)
                close()
                moveTo(128.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 128.0f, 112.0f)
                close()
                moveTo(200.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 40.0f)
                lineTo(200.0f, 40.0f)
                close()
                moveTo(88.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 64.0f)
                close()
            }
        }
        .build()
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
