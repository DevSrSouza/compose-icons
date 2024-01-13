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

public val TablerIcons.Businessplan: ImageVector
    get() {
        if (_businessplan != null) {
            return _businessplan!!
        }
        _businessplan = Builder(name = "Businessplan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                moveToRelative(-5.0f, 0.0f)
                arcToRelative(5.0f, 3.0f, 0.0f, true, false, 10.0f, 0.0f)
                arcToRelative(5.0f, 3.0f, 0.0f, true, false, -10.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.657f, 2.239f, 3.0f, 5.0f, 3.0f)
                reflectiveCurveToRelative(5.0f, -1.343f, 5.0f, -3.0f)
                verticalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.657f, 2.239f, 3.0f, 5.0f, 3.0f)
                reflectiveCurveToRelative(5.0f, -1.343f, 5.0f, -3.0f)
                verticalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.657f, 2.239f, 3.0f, 5.0f, 3.0f)
                reflectiveCurveToRelative(5.0f, -1.343f, 5.0f, -3.0f)
                verticalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                verticalLineToRelative(1.0f)
                moveToRelative(0.0f, -8.0f)
                verticalLineToRelative(1.0f)
            }
        }
        .build()
        return _businessplan!!
    }

private var _businessplan: ImageVector? = null
