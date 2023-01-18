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

public val LightGroup.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table = Builder(name = "Table", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 50.0f)
                lineTo(32.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 50.0f)
                close()
                moveTo(38.0f, 110.0f)
                lineTo(82.0f, 110.0f)
                verticalLineToRelative(36.0f)
                lineTo(38.0f, 146.0f)
                close()
                moveTo(94.0f, 110.0f)
                lineTo(218.0f, 110.0f)
                verticalLineToRelative(36.0f)
                lineTo(94.0f, 146.0f)
                close()
                moveTo(218.0f, 62.0f)
                lineTo(218.0f, 98.0f)
                lineTo(38.0f, 98.0f)
                lineTo(38.0f, 62.0f)
                close()
                moveTo(38.0f, 192.0f)
                lineTo(38.0f, 158.0f)
                lineTo(82.0f, 158.0f)
                verticalLineToRelative(36.0f)
                lineTo(40.0f, 194.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 192.0f)
                close()
                moveTo(216.0f, 194.0f)
                lineTo(94.0f, 194.0f)
                lineTo(94.0f, 158.0f)
                lineTo(218.0f, 158.0f)
                verticalLineToRelative(34.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 194.0f)
                close()
            }
        }
        .build()
        return _table!!
    }

private var _table: ImageVector? = null
