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

public val TablerIcons.BrandTether: ImageVector
    get() {
        if (_brandTether != null) {
            return _brandTether!!
        }
        _brandTether = Builder(name = "BrandTether", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.08f, 20.188f)
                curveToRelative(-1.15f, 1.083f, -3.02f, 1.083f, -4.17f, 0.0f)
                lineToRelative(-6.93f, -6.548f)
                curveToRelative(-0.96f, -0.906f, -1.27f, -2.624f, -0.69f, -3.831f)
                lineToRelative(2.4f, -5.018f)
                curveToRelative(0.47f, -0.991f, 1.72f, -1.791f, 2.78f, -1.791f)
                horizontalLineToRelative(9.06f)
                curveToRelative(1.06f, 0.0f, 2.31f, 0.802f, 2.78f, 1.79f)
                lineToRelative(2.4f, 5.019f)
                curveToRelative(0.58f, 1.207f, 0.26f, 2.925f, -0.69f, 3.83f)
                curveToRelative(-3.453f, 3.293f, -3.466f, 3.279f, -6.94f, 6.549f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                verticalLineToRelative(-7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
            }
        }
        .build()
        return _brandTether!!
    }

private var _brandTether: ImageVector? = null
