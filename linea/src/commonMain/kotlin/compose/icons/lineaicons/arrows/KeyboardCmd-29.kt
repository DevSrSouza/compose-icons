package compose.icons.lineaicons.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.ArrowsGroup

public val ArrowsGroup.`KeyboardCmd-29`: ImageVector
    get() {
        if (`_keyboardCmd-29` != null) {
            return `_keyboardCmd-29`!!
        }
        `_keyboardCmd-29` = Builder(name = "KeyboardCmd-29", defaultWidth = 64.0.dp, defaultHeight =
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
        return `_keyboardCmd-29`!!
    }

private var `_keyboardCmd-29`: ImageVector? = null
