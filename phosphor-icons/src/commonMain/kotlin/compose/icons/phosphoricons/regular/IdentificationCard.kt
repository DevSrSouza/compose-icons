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

public val RegularGroup.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) {
            return _identificationCard!!
        }
        _identificationCard = Builder(name = "IdentificationCard", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(152.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 112.0f)
                close()
                moveTo(192.0f, 136.0f)
                lineTo(152.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(130.8f, 166.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.7f, 9.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.8f, -5.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -46.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.8f, 6.0f)
                lineToRelative(-2.0f, -0.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.7f, -9.7f)
                arcToRelative(40.2f, 40.2f, 0.0f, false, true, 16.3f, -23.2f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 44.8f, 0.0f)
                arcTo(40.2f, 40.2f, 0.0f, false, true, 130.8f, 166.0f)
                close()
                moveTo(92.1f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 92.1f, 136.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(216.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 200.0f)
                close()
            }
        }
        .build()
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
