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

public val LightGroup.Martini: ImageVector
    get() {
        if (_martini != null) {
            return _martini!!
        }
        _martini = Builder(name = "Martini", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 44.2f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 1.3f, -6.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 34.0f)
                lineTo(24.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.5f, 3.7f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 1.3f, 6.5f)
                lineTo(122.0f, 146.5f)
                lineTo(122.0f, 210.0f)
                lineTo(88.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 210.0f)
                lineTo(134.0f, 146.5f)
                close()
                moveTo(70.5f, 78.0f)
                horizontalLineToRelative(115.0f)
                lineTo(128.0f, 135.5f)
                close()
                moveTo(217.5f, 46.0f)
                lineTo(197.5f, 66.0f)
                lineTo(58.5f, 66.0f)
                lineToRelative(-20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _martini!!
    }

private var _martini: ImageVector? = null
