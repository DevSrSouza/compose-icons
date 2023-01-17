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

public val TablerIcons.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.111f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.845f, -3.578f)
                lineToRelative(0.31f, -0.622f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.845f, -3.578f)
                verticalLineToRelative(-4.111f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(4.111f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.845f, 3.578f)
                lineToRelative(0.31f, 0.622f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.845f, 3.578f)
                verticalLineToRelative(4.111f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 8.0f)
                horizontalLineToRelative(10.0f)
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
