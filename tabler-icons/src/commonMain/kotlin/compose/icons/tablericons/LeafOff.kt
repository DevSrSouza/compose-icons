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

public val TablerIcons.LeafOff: ImageVector
    get() {
        if (_leafOff != null) {
            return _leafOff!!
        }
        _leafOff = Builder(name = "LeafOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                curveToRelative(0.475f, -4.27f, 2.3f, -7.64f, 6.331f, -9.683f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.618f, 6.623f)
                curveToRelative(-1.874f, 1.625f, -2.625f, 3.877f, -2.632f, 6.377f)
                curveToRelative(0.0f, 1.0f, 0.0f, 3.0f, 2.0f, 5.0f)
                horizontalLineToRelative(3.014f)
                curveToRelative(2.733f, 0.0f, 5.092f, -0.635f, 6.92f, -2.087f)
                moveToRelative(1.899f, -2.099f)
                curveToRelative(1.224f, -1.872f, 1.987f, -4.434f, 2.181f, -7.814f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.014f)
                curveToRelative(-2.863f, 0.0f, -5.118f, 0.405f, -6.861f, 1.118f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _leafOff!!
    }

private var _leafOff: ImageVector? = null
