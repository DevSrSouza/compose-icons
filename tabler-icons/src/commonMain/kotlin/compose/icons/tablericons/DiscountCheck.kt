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

public val TablerIcons.DiscountCheck: ImageVector
    get() {
        if (_discountCheck != null) {
            return _discountCheck!!
        }
        _discountCheck = Builder(name = "DiscountCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 7.2f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.2f, -2.2f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 1.55f, -0.64f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 3.12f, 0.0f)
                lineToRelative(0.7f, 0.7f)
                curveToRelative(0.412f, 0.41f, 0.97f, 0.64f, 1.55f, 0.64f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.2f, 2.2f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.58f, 0.23f, 1.138f, 0.64f, 1.55f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.0f, 3.12f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.64f, 1.55f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.2f, 2.2f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -1.55f, 0.64f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.12f, 0.0f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -1.55f, -0.64f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.2f, -2.2f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.64f, -1.55f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.0f, -3.12f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 0.64f, -1.55f)
                verticalLineToRelative(-1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(4.0f, -4.0f)
            }
        }
        .build()
        return _discountCheck!!
    }

private var _discountCheck: ImageVector? = null
