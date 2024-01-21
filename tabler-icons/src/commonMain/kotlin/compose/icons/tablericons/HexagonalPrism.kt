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

public val TablerIcons.HexagonalPrism: ImageVector
    get() {
        if (_hexagonalPrism != null) {
            return _hexagonalPrism!!
        }
        _hexagonalPrism = Builder(name = "HexagonalPrism", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.792f, 6.996f)
                lineToRelative(-3.775f, 2.643f)
                arcToRelative(2.005f, 2.005f, 0.0f, false, true, -1.147f, 0.361f)
                horizontalLineToRelative(-7.74f)
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
                verticalLineToRelative(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.853f, 18.274f)
                lineToRelative(3.367f, 2.363f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.147f, 0.363f)
                horizontalLineToRelative(7.265f)
                curveToRelative(0.41f, 0.0f, 0.811f, -0.126f, 1.147f, -0.363f)
                lineToRelative(3.367f, -2.363f)
                curveToRelative(0.536f, -0.375f, 0.854f, -0.99f, 0.854f, -1.643f)
                verticalLineToRelative(-9.262f)
                curveToRelative(0.0f, -0.655f, -0.318f, -1.268f, -0.853f, -1.643f)
                lineToRelative(-3.367f, -2.363f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.147f, -0.363f)
                horizontalLineToRelative(-7.266f)
                curveToRelative(-0.41f, 0.0f, -0.811f, 0.126f, -1.147f, 0.363f)
                lineToRelative(-3.367f, 2.363f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, false, -0.853f, 1.644f)
                verticalLineToRelative(9.261f)
                curveToRelative(0.0f, 0.655f, 0.318f, 1.269f, 0.853f, 1.644f)
                close()
            }
        }
        .build()
        return _hexagonalPrism!!
    }

private var _hexagonalPrism: ImageVector? = null
