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

public val TablerIcons.BrandLeetcode: ImageVector
    get() {
        if (_brandLeetcode != null) {
            return _brandLeetcode!!
        }
        _brandLeetcode = Builder(name = "BrandLeetcode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.424f, 7.268f)
                lineToRelative(4.999f, -4.999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.633f, 16.644f)
                lineToRelative(-2.402f, 2.415f)
                arcToRelative(3.189f, 3.189f, 0.0f, false, true, -4.524f, 0.0f)
                lineToRelative(-3.77f, -3.787f)
                arcToRelative(3.223f, 3.223f, 0.0f, false, true, 0.0f, -4.544f)
                lineToRelative(3.77f, -3.787f)
                arcToRelative(3.189f, 3.189f, 0.0f, false, true, 4.524f, 0.0f)
                lineToRelative(2.302f, 2.313f)
            }
        }
        .build()
        return _brandLeetcode!!
    }

private var _brandLeetcode: ImageVector? = null
