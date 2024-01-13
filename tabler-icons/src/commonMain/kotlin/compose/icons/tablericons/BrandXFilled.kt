package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandXFilled: ImageVector
    get() {
        if (_brandXFilled != null) {
            return _brandXFilled!!
        }
        _brandXFilled = Builder(name = "BrandXFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.267f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.73f, 0.317f)
                lineToRelative(0.076f, 0.092f)
                lineToRelative(4.274f, 5.828f)
                lineToRelative(5.946f, -5.944f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.497f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-6.163f, 6.162f)
                lineToRelative(6.262f, 8.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.697f, 1.585f)
                lineToRelative(-0.109f, 0.006f)
                horizontalLineToRelative(-4.267f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.73f, -0.317f)
                lineToRelative(-0.076f, -0.092f)
                lineToRelative(-4.276f, -5.829f)
                lineToRelative(-5.944f, 5.945f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(6.161f, -6.163f)
                lineToRelative(-6.26f, -8.539f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.697f, -1.585f)
                lineToRelative(0.109f, -0.006f)
                horizontalLineToRelative(4.267f)
                close()
            }
        }
        .build()
        return _brandXFilled!!
    }

private var _brandXFilled: ImageVector? = null
