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

public val RegularGroup.Bandaids: ImageVector
    get() {
        if (_bandaids != null) {
            return _bandaids!!
        }
        _bandaids = Builder(name = "Bandaids", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(212.3f, 155.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -56.6f, 56.6f)
                lineTo(128.0f, 184.6f)
                lineToRelative(-27.7f, 27.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -56.6f, -56.6f)
                lineTo(71.4f, 128.0f)
                lineTo(43.7f, 100.3f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 56.6f, -56.6f)
                lineTo(128.0f, 71.4f)
                lineToRelative(27.7f, -27.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 56.6f, 56.6f)
                lineTo(184.6f, 128.0f)
                close()
                moveTo(139.3f, 82.7f)
                lineTo(173.3f, 116.7f)
                lineTo(201.0f, 89.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -34.0f, -34.0f)
                close()
                moveTo(128.0f, 94.1f)
                lineTo(94.1f, 128.0f)
                lineTo(128.0f, 161.9f)
                lineTo(161.9f, 128.0f)
                close()
                moveTo(82.7f, 116.7f)
                lineToRelative(34.0f, -34.0f)
                lineTo(89.0f, 55.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 55.0f, 89.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(116.7f, 173.3f)
                lineTo(82.7f, 139.3f)
                lineTo(55.0f, 167.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 34.0f, 34.0f)
                close()
                moveTo(208.0f, 184.0f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, false, -7.0f, -17.0f)
                lineToRelative(-27.7f, -27.7f)
                lineToRelative(-34.0f, 34.0f)
                lineTo(167.0f, 201.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 41.0f, -17.0f)
                close()
            }
        }
        .build()
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
