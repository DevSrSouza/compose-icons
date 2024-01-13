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

public val TablerIcons.Coins: ImageVector
    get() {
        if (_coins != null) {
            return _coins!!
        }
        _coins = Builder(name = "Coins", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                curveToRelative(0.0f, 1.657f, 2.686f, 3.0f, 6.0f, 3.0f)
                reflectiveCurveToRelative(6.0f, -1.343f, 6.0f, -3.0f)
                reflectiveCurveToRelative(-2.686f, -3.0f, -6.0f, -3.0f)
                reflectiveCurveToRelative(-6.0f, 1.343f, -6.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.656f, 2.686f, 3.0f, 6.0f, 3.0f)
                reflectiveCurveToRelative(6.0f, -1.344f, 6.0f, -3.0f)
                verticalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveToRelative(0.0f, 1.072f, 1.144f, 2.062f, 3.0f, 2.598f)
                reflectiveCurveToRelative(4.144f, 0.536f, 6.0f, 0.0f)
                curveToRelative(1.856f, -0.536f, 3.0f, -1.526f, 3.0f, -2.598f)
                curveToRelative(0.0f, -1.072f, -1.144f, -2.062f, -3.0f, -2.598f)
                reflectiveCurveToRelative(-4.144f, -0.536f, -6.0f, 0.0f)
                curveToRelative(-1.856f, 0.536f, -3.0f, 1.526f, -3.0f, 2.598f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.888f, 0.772f, 1.45f, 2.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                curveToRelative(0.0f, 0.888f, 0.772f, 1.45f, 2.0f, 2.0f)
            }
        }
        .build()
        return _coins!!
    }

private var _coins: ImageVector? = null
