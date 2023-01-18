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

public val BoldGroup.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) {
            return _identificationBadge!!
        }
        _identificationBadge = Builder(name = "IdentificationBadge", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 36.0f, 40.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 200.0f, 20.0f)
                close()
                moveTo(196.0f, 212.0f)
                lineTo(60.0f, 212.0f)
                lineTo(60.0f, 44.0f)
                lineTo(196.0f, 44.0f)
                close()
                moveTo(84.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 56.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(96.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 68.0f)
                close()
                moveTo(92.8f, 195.4f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, true, 70.4f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 180.8f, 179.0f)
                arcToRelative(73.4f, 73.4f, 0.0f, false, false, -19.2f, -14.6f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -67.2f, 0.0f)
                arcTo(73.4f, 73.4f, 0.0f, false, false, 75.2f, 179.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.6f, 16.4f)
                close()
                moveTo(108.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 108.0f, 136.0f)
                close()
            }
        }
        .build()
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
