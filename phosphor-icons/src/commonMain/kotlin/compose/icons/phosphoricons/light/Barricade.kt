package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Barricade: ImageVector
    get() {
        if (_barricade != null) {
            return _barricade!!
        }
        _barricade = Builder(name = "Barricade", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 66.0f)
                lineTo(32.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 80.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(58.0f, 166.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(70.0f, 166.0f)
                lineTo(186.0f, 166.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(198.0f, 166.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 66.0f)
                close()
                moveTo(226.0f, 80.0f)
                verticalLineToRelative(53.5f)
                lineTo(170.5f, 78.0f)
                lineTo(224.0f, 78.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 226.0f, 80.0f)
                close()
                moveTo(32.0f, 78.0f)
                lineTo(81.5f, 78.0f)
                lineToRelative(76.0f, 76.0f)
                horizontalLineToRelative(-55.0f)
                lineTo(30.0f, 81.5f)
                lineTo(30.0f, 80.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 32.0f, 78.0f)
                close()
                moveTo(30.0f, 152.0f)
                lineTo(30.0f, 98.5f)
                lineTo(85.5f, 154.0f)
                lineTo(32.0f, 154.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 152.0f)
                close()
                moveTo(224.0f, 154.0f)
                lineTo(174.5f, 154.0f)
                lineToRelative(-76.0f, -76.0f)
                horizontalLineToRelative(55.0f)
                lineTo(226.0f, 150.5f)
                lineTo(226.0f, 152.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 224.0f, 154.0f)
                close()
            }
        }
        .build()
        return _barricade!!
    }

private var _barricade: ImageVector? = null
