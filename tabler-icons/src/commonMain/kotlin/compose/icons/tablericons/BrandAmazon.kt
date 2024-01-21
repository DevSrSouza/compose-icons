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

public val TablerIcons.BrandAmazon: ImageVector
    get() {
        if (_brandAmazon != null) {
            return _brandAmazon!!
        }
        _brandAmazon = Builder(name = "BrandAmazon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 12.5f)
                arcToRelative(15.198f, 15.198f, 0.0f, false, true, -7.37f, 1.44f)
                arcToRelative(14.62f, 14.62f, 0.0f, false, true, -6.63f, -2.94f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 15.0f)
                curveToRelative(0.907f, -1.411f, 1.451f, -3.323f, 1.5f, -5.0f)
                curveToRelative(-1.197f, -0.773f, -2.577f, -0.935f, -4.0f, -1.0f)
            }
        }
        .build()
        return _brandAmazon!!
    }

private var _brandAmazon: ImageVector? = null
