package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandDrops: ImageVector
    get() {
        if (_brandDrops != null) {
            return _brandDrops!!
        }
        _brandDrops = Builder(name = "BrandDrops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.637f, 7.416f)
                arcToRelative(7.907f, 7.907f, 0.0f, false, true, 1.76f, 8.666f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.397f, 4.918f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.396f, -4.918f)
                arcToRelative(7.907f, 7.907f, 0.0f, false, true, 1.759f, -8.666f)
                lineToRelative(5.637f, -5.416f)
                lineToRelative(5.637f, 5.416f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.466f, 10.923f)
                arcToRelative(3.595f, 3.595f, 0.0f, false, true, 0.77f, 3.877f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.236f, 2.2f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.236f, -2.2f)
                arcToRelative(3.595f, 3.595f, 0.0f, false, true, 0.77f, -3.877f)
                lineToRelative(2.466f, -2.423f)
                lineToRelative(2.466f, 2.423f)
                close()
            }
        }
        .build()
        return _brandDrops!!
    }

private var _brandDrops: ImageVector? = null
