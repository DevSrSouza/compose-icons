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

public val TablerIcons.RectangularPrismOff: ImageVector
    get() {
        if (_rectangularPrismOff != null) {
            return _rectangularPrismOff!!
        }
        _rectangularPrismOff = Builder(name = "RectangularPrismOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.18f, 8.18f)
                lineToRelative(-4.18f, 2.093f)
                curveToRelative(-0.619f, 0.355f, -1.0f, 1.01f, -1.0f, 1.718f)
                verticalLineToRelative(5.018f)
                curveToRelative(0.0f, 0.709f, 0.381f, 1.363f, 1.0f, 1.717f)
                lineToRelative(4.0f, 2.008f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, 2.0f, 0.0f)
                lineToRelative(7.146f, -3.578f)
                moveToRelative(2.67f, -1.337f)
                lineToRelative(0.184f, -0.093f)
                curveToRelative(0.619f, -0.355f, 1.0f, -1.01f, 1.0f, -1.718f)
                verticalLineToRelative(-5.018f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, -1.0f, -1.717f)
                lineToRelative(-4.0f, -2.008f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, -2.0f, 0.0f)
                lineToRelative(-3.146f, 1.575f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 21.0f)
                verticalLineToRelative(-7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 13.5f)
                lineToRelative(3.048f, -1.458f)
                moveToRelative(2.71f, -1.296f)
                lineToRelative(5.742f, -2.746f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 11.0f)
                lineToRelative(5.5f, 2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _rectangularPrismOff!!
    }

private var _rectangularPrismOff: ImageVector? = null
