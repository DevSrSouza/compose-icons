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

public val TablerIcons.BrandTiktokFilled: ImageVector
    get() {
        if (_brandTiktokFilled != null) {
            return _brandTiktokFilled!!
        }
        _brandTiktokFilled = Builder(name = "BrandTiktokFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.083f, 2.0f)
                horizontalLineToRelative(-4.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.519f, -1.1f)
                lineToRelative(0.12f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.399f, -0.8f)
                verticalLineToRelative(-4.326f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.23f, -0.974f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 1.73f, 14.8f)
                lineToRelative(0.243f, -0.005f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 7.257f, -7.495f)
                verticalLineToRelative(-2.7f)
                lineToRelative(0.311f, 0.153f)
                curveToRelative(1.122f, 0.53f, 2.333f, 0.868f, 3.59f, 0.993f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.099f, -0.996f)
                verticalLineToRelative(-4.033f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.834f, -0.986f)
                arcToRelative(5.005f, 5.005f, 0.0f, false, true, -4.097f, -4.096f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.986f, -0.835f)
                close()
            }
        }
        .build()
        return _brandTiktokFilled!!
    }

private var _brandTiktokFilled: ImageVector? = null
