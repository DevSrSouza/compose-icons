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

public val ThinGroup.Barricade: ImageVector
    get() {
        if (_barricade != null) {
            return _barricade!!
        }
        _barricade = Builder(name = "Barricade", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 68.0f)
                lineTo(32.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 80.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(60.0f, 164.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(68.0f, 164.0f)
                lineTo(188.0f, 164.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(196.0f, 164.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 68.0f)
                close()
                moveTo(228.0f, 80.0f)
                verticalLineToRelative(58.3f)
                lineTo(165.7f, 76.0f)
                lineTo(224.0f, 76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 80.0f)
                close()
                moveTo(32.0f, 76.0f)
                lineTo(82.3f, 76.0f)
                lineToRelative(80.0f, 80.0f)
                lineTo(101.7f, 156.0f)
                lineTo(28.0f, 82.3f)
                lineTo(28.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 76.0f)
                close()
                moveTo(28.0f, 152.0f)
                lineTo(28.0f, 93.7f)
                lineTo(90.3f, 156.0f)
                lineTo(32.0f, 156.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 152.0f)
                close()
                moveTo(224.0f, 156.0f)
                lineTo(173.7f, 156.0f)
                lineToRelative(-80.0f, -80.0f)
                horizontalLineToRelative(60.6f)
                lineTo(228.0f, 149.7f)
                lineTo(228.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 224.0f, 156.0f)
                close()
            }
        }
        .build()
        return _barricade!!
    }

private var _barricade: ImageVector? = null
