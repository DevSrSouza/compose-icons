package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerDoubleRightDown: ImageVector
    get() {
        if (_cornerDoubleRightDown != null) {
            return _cornerDoubleRightDown!!
        }
        _cornerDoubleRightDown = Builder(name = "CornerDoubleRightDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.694f, 12.705f)
                lineTo(2.638f, 7.864f)
                lineTo(7.478f, 2.808f)
                lineTo(8.923f, 4.191f)
                lineTo(6.566f, 6.653f)
                lineTo(12.6f, 6.491f)
                curveTo(15.25f, 6.419f, 17.456f, 8.51f, 17.527f, 11.16f)
                lineTo(17.686f, 17.086f)
                lineTo(19.934f, 14.792f)
                lineTo(21.362f, 16.192f)
                lineTo(16.464f, 21.192f)
                lineTo(11.463f, 16.294f)
                lineTo(12.863f, 14.865f)
                lineTo(15.29f, 17.243f)
                lineTo(15.128f, 11.224f)
                curveTo(15.093f, 9.899f, 13.99f, 8.854f, 12.665f, 8.89f)
                lineTo(6.767f, 9.048f)
                lineTo(9.077f, 11.26f)
                lineTo(7.694f, 12.705f)
                close()
            }
        }
        .build()
        return _cornerDoubleRightDown!!
    }

private var _cornerDoubleRightDown: ImageVector? = null
