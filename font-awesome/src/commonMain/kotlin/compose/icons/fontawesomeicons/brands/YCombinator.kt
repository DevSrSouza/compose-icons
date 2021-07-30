package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.YCombinator: ImageVector
    get() {
        if (_yCombinator != null) {
            return _yCombinator!!
        }
        _yCombinator = Builder(name = "YCombinator", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 32.0f)
                verticalLineToRelative(448.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(448.0f)
                close()
                moveTo(236.0f, 287.5f)
                lineTo(313.5f, 142.0f)
                horizontalLineToRelative(-32.7f)
                lineTo(235.0f, 233.0f)
                curveToRelative(-4.7f, 9.3f, -9.0f, 18.3f, -12.8f, 26.8f)
                lineTo(210.0f, 233.0f)
                lineToRelative(-45.2f, -91.0f)
                horizontalLineToRelative(-35.0f)
                lineToRelative(76.7f, 143.8f)
                verticalLineToRelative(94.5f)
                horizontalLineTo(236.0f)
                verticalLineToRelative(-92.8f)
                close()
            }
        }
        .build()
        return _yCombinator!!
    }

private var _yCombinator: ImageVector? = null
