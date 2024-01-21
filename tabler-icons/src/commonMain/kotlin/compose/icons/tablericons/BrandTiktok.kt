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

public val TablerIcons.BrandTiktok: ImageVector
    get() {
        if (_brandTiktok != null) {
            return _brandTiktok!!
        }
        _brandTiktok = Builder(name = "BrandTiktok", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 7.917f)
                verticalLineToRelative(4.034f)
                arcToRelative(9.948f, 9.948f, 0.0f, false, true, -5.0f, -1.951f)
                verticalLineToRelative(4.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -8.0f, -6.326f)
                verticalLineToRelative(4.326f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.0f, 2.0f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(4.083f)
                arcToRelative(6.005f, 6.005f, 0.0f, false, false, 4.917f, 4.917f)
                close()
            }
        }
        .build()
        return _brandTiktok!!
    }

private var _brandTiktok: ImageVector? = null
