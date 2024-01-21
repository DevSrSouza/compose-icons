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

public val TablerIcons.BrandShopee: ImageVector
    get() {
        if (_brandShopee != null) {
            return _brandShopee!!
        }
        _brandShopee = Builder(name = "BrandShopee", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                lineToRelative(0.867f, 12.143f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 1.857f)
                horizontalLineToRelative(10.276f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -1.857f)
                lineToRelative(0.867f, -12.143f)
                horizontalLineToRelative(-16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 7.0f)
                curveToRelative(0.0f, -1.653f, 1.5f, -4.0f, 3.5f, -4.0f)
                reflectiveCurveToRelative(3.5f, 2.347f, 3.5f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 17.0f)
                curveToRelative(0.413f, 0.462f, 1.0f, 1.0f, 2.5f, 1.0f)
                reflectiveCurveToRelative(2.5f, -0.897f, 2.5f, -2.0f)
                reflectiveCurveToRelative(-1.0f, -1.5f, -2.5f, -2.0f)
                reflectiveCurveToRelative(-2.0f, -1.47f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.104f, 1.0f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(1.5f, 0.0f, 2.5f, 1.0f)
            }
        }
        .build()
        return _brandShopee!!
    }

private var _brandShopee: ImageVector? = null
