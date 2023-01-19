package compose.icons.lineaicons.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.ArrowsGroup

public val ArrowsGroup.KeyboardCmd29: ImageVector
    get() {
        if (_keyboardCmd29 != null) {
            return _keyboardCmd29!!
        }
        _keyboardCmd29 = Builder(name = "KeyboardCmd29", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF231F20)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 1.0f)
                horizontalLineToRelative(62.0f)
                verticalLineToRelative(62.0f)
                horizontalLineToRelative(-62.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF231F20)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 1.0f)
                horizontalLineToRelative(62.0f)
                verticalLineToRelative(62.0f)
                horizontalLineToRelative(-62.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF231F20)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 27.0f)
                curveToRelative(-2.762f, 0.0f, -5.0f, -2.238f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.238f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.238f, 5.0f, 5.0f)
                verticalLineToRelative(20.0f)
                curveToRelative(0.0f, 2.762f, -2.238f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.238f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.238f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(2.762f, 0.0f, 5.0f, 2.238f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.238f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.238f, -5.0f, -5.0f)
                verticalLineTo(22.0f)
                curveToRelative(0.0f, -2.762f, 2.238f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.238f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.238f, 5.0f, -5.0f, 5.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _keyboardCmd29!!
    }

private var _keyboardCmd29: ImageVector? = null
