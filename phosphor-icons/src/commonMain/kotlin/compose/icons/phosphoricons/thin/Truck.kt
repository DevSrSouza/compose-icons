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

public val ThinGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.1f, 120.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.1f, -0.7f)
                verticalLineToRelative(-0.2f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -0.2f, -0.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-14.0f, -34.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 218.7f, 76.0f)
                lineTo(180.1f, 76.0f)
                lineTo(180.1f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(24.1f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(12.1f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(40.4f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.4f, 0.0f)
                horizontalLineToRelative(64.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.4f, 0.0f)
                horizontalLineToRelative(16.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(244.1f, 120.0f)
                close()
                moveTo(218.7f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.7f, 2.5f)
                lineTo(234.2f, 116.0f)
                lineTo(180.1f, 116.0f)
                lineTo(180.1f, 84.0f)
                close()
                moveTo(24.1f, 68.0f)
                horizontalLineToRelative(148.0f)
                verticalLineToRelative(72.0f)
                lineTo(20.1f, 140.0f)
                lineTo(20.1f, 72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.1f, 68.0f)
                close()
                moveTo(20.1f, 184.0f)
                lineTo(20.1f, 148.0f)
                horizontalLineToRelative(152.0f)
                verticalLineToRelative(21.0f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, false, -11.7f, 19.0f)
                lineTo(95.8f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.4f, 0.0f)
                lineTo(24.1f, 188.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.1f, 184.0f)
                close()
                moveTo(68.1f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 68.1f, 212.0f)
                close()
                moveTo(188.1f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 188.1f, 212.0f)
                close()
                moveTo(236.1f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(215.8f, 188.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -27.7f, -24.0f)
                arcToRelative(26.3f, 26.3f, 0.0f, false, false, -8.0f, 1.2f)
                lineTo(180.1f, 124.0f)
                horizontalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
