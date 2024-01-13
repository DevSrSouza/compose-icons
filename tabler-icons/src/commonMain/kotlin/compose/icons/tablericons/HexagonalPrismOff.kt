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

public val TablerIcons.HexagonalPrismOff: ImageVector
    get() {
        if (_hexagonalPrismOff != null) {
            return _hexagonalPrismOff!!
        }
        _hexagonalPrismOff = Builder(name = "HexagonalPrismOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.792f, 6.996f)
                lineToRelative(-3.775f, 2.643f)
                arcToRelative(2.005f, 2.005f, 0.0f, false, true, -1.147f, 0.361f)
                horizontalLineToRelative(-1.87f)
                moveToRelative(-4.0f, 0.0f)
                horizontalLineToRelative(-1.87f)
                curveToRelative(-0.41f, 0.0f, -0.81f, -0.126f, -1.146f, -0.362f)
                lineToRelative(-3.774f, -2.641f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 10.0f)
                verticalLineToRelative(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 10.0f)
                verticalLineToRelative(2.0f)
                moveToRelative(0.0f, 4.0f)
                verticalLineToRelative(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.972f, 16.968f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, 0.028f, -0.337f)
                verticalLineToRelative(-9.262f)
                curveToRelative(0.0f, -0.655f, -0.318f, -1.268f, -0.853f, -1.643f)
                lineToRelative(-3.367f, -2.363f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.147f, -0.363f)
                horizontalLineToRelative(-7.266f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -1.066f, 0.309f)
                moveToRelative(-2.345f, 1.643f)
                lineToRelative(-1.103f, 0.774f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, false, -0.853f, 1.644f)
                verticalLineToRelative(9.261f)
                curveToRelative(0.0f, 0.655f, 0.318f, 1.269f, 0.853f, 1.644f)
                lineToRelative(3.367f, 2.363f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.147f, 0.362f)
                horizontalLineToRelative(7.265f)
                curveToRelative(0.41f, 0.0f, 0.811f, -0.126f, 1.147f, -0.363f)
                lineToRelative(2.26f, -1.587f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _hexagonalPrismOff!!
    }

private var _hexagonalPrismOff: ImageVector? = null
