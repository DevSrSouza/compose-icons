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

public val TablerIcons.IrregularPolyhedronOff: ImageVector
    get() {
        if (_irregularPolyhedronOff != null) {
            return _irregularPolyhedronOff!!
        }
        _irregularPolyhedronOff = Builder(name = "IrregularPolyhedronOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.706f, 4.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.458f, 1.14f)
                lineToRelative(1.752f, 6.13f)
                lineToRelative(-1.752f, 6.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.592f, 1.205f)
                lineToRelative(6.282f, 2.503f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, false, 1.756f, 0.0f)
                lineToRelative(6.282f, -2.503f)
                curveToRelative(0.04f, -0.016f, 0.079f, -0.035f, 0.116f, -0.055f)
                moveToRelative(-0.474f, -4.474f)
                lineToRelative(-0.802f, -2.806f)
                lineToRelative(1.752f, -6.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.592f, -1.205f)
                lineToRelative(-6.282f, -2.503f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, false, -1.756f, 0.0f)
                lineToRelative(-3.544f, 1.412f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 5.5f)
                curveToRelative(0.661f, 0.214f, 1.161f, 0.38f, 1.5f, 0.5f)
                moveToRelative(6.0f, 2.0f)
                curveToRelative(0.29f, -0.003f, 0.603f, -0.06f, 0.878f, -0.17f)
                lineToRelative(6.622f, -2.33f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                lineToRelative(5.21f, 1.862f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, 1.58f, 0.0f)
                lineToRelative(0.742f, -0.265f)
                moveToRelative(2.956f, -1.057f)
                curveToRelative(0.312f, -0.11f, 0.816f, -0.291f, 1.512f, -0.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineToRelative(-10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _irregularPolyhedronOff!!
    }

private var _irregularPolyhedronOff: ImageVector? = null
