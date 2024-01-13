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

public val TablerIcons.BrandCouchsurfing: ImageVector
    get() {
        if (_brandCouchsurfing != null) {
            return _brandCouchsurfing!!
        }
        _brandCouchsurfing = Builder(name = "BrandCouchsurfing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1f, 13.0f)
                curveToRelative(3.267f, 0.0f, 5.9f, -0.167f, 7.9f, -0.5f)
                curveToRelative(3.0f, -0.5f, 4.0f, -2.0f, 4.0f, -3.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                curveToRelative(0.0f, 1.554f, 1.807f, 3.0f, 3.0f, 4.0f)
                curveToRelative(1.193f, 1.0f, 2.0f, 2.5f, 2.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                curveToRelative(0.0f, -2.0f, 4.0f, -3.5f, 7.0f, -3.5f)
                horizontalLineToRelative(2.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-9.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -18.0f, 0.0f)
            }
        }
        .build()
        return _brandCouchsurfing!!
    }

private var _brandCouchsurfing: ImageVector? = null
