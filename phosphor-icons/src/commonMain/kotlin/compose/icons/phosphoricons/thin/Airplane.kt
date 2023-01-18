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

public val ThinGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 132.4f)
                lineTo(156.2f, 93.5f)
                lineTo(156.2f, 48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                lineTo(100.2f, 93.5f)
                lineTo(22.2f, 132.4f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 20.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.5f, 3.1f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 3.3f, 0.8f)
                lineToRelative(75.2f, -15.0f)
                verticalLineToRelative(25.4f)
                lineTo(85.2f, 197.2f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 84.0f, 200.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.8f, 3.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.7f, 0.4f)
                lineTo(128.0f, 220.3f)
                lineToRelative(38.5f, 15.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.5f, 0.3f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 2.2f, -0.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 172.0f, 232.0f)
                lineTo(172.0f, 200.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -1.2f, -2.8f)
                lineToRelative(-14.6f, -14.8f)
                lineTo(156.2f, 156.9f)
                lineToRelative(75.2f, 15.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.4f, -0.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.4f, -3.1f)
                lineTo(236.2f, 136.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.0f, 132.4f)
                close()
                moveTo(228.2f, 163.1f)
                lineTo(153.0f, 148.1f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -3.3f, 0.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -1.5f, 3.1f)
                verticalLineToRelative(32.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 1.2f, 2.8f)
                lineTo(164.0f, 201.6f)
                verticalLineToRelative(24.5f)
                lineToRelative(-34.5f, -13.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(92.0f, 226.1f)
                lineTo(92.0f, 201.7f)
                lineToRelative(14.8f, -14.9f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 108.0f, 184.0f)
                lineTo(108.0f, 152.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.5f, -3.1f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -3.3f, -0.8f)
                lineTo(28.0f, 163.1f)
                lineTo(28.0f, 138.5f)
                lineToRelative(77.8f, -38.9f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 108.0f, 96.0f)
                lineTo(108.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                lineTo(148.0f, 96.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.2f, 3.6f)
                lineToRelative(77.8f, 38.9f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
