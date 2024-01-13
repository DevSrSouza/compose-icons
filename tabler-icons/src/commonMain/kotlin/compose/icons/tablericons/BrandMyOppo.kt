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

public val TablerIcons.BrandMyOppo: ImageVector
    get() {
        if (_brandMyOppo != null) {
            return _brandMyOppo!!
        }
        _brandMyOppo = Builder(name = "BrandMyOppo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.316f, 5.0f)
                horizontalLineToRelative(-12.632f)
                lineToRelative(-3.418f, 4.019f)
                arcToRelative(1.089f, 1.089f, 0.0f, false, false, 0.019f, 1.447f)
                lineToRelative(9.714f, 10.534f)
                lineToRelative(9.715f, -10.49f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, 0.024f, -1.444f)
                lineToRelative(-3.422f, -4.066f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
            }
        }
        .build()
        return _brandMyOppo!!
    }

private var _brandMyOppo: ImageVector? = null
