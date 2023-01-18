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

public val BoldGroup.Barricade: ImageVector
    get() {
        if (_barricade != null) {
            return _barricade!!
        }
        _barricade = Builder(name = "Barricade", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 60.0f)
                lineTo(32.0f, 60.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 12.0f, 80.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(52.0f, 172.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(76.0f, 172.0f)
                lineTo(180.0f, 172.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(204.0f, 172.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 80.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 224.0f, 60.0f)
                close()
                moveTo(220.0f, 119.0f)
                lineTo(185.0f, 84.0f)
                horizontalLineToRelative(35.0f)
                close()
                moveTo(177.0f, 148.0f)
                lineTo(113.0f, 84.0f)
                horizontalLineToRelative(38.0f)
                lineToRelative(64.0f, 64.0f)
                close()
                moveTo(105.0f, 148.0f)
                lineTo(41.0f, 84.0f)
                lineTo(79.0f, 84.0f)
                lineToRelative(64.0f, 64.0f)
                close()
                moveTo(36.0f, 113.0f)
                lineToRelative(35.0f, 35.0f)
                lineTo(36.0f, 148.0f)
                close()
            }
        }
        .build()
        return _barricade!!
    }

private var _barricade: ImageVector? = null
