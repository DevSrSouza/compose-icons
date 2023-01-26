package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FoodBank: ImageVector
    get() {
        if (_foodBank != null) {
            return _foodBank!!
        }
        _foodBank = Builder(name = "FoodBank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                lineToRelative(6.0f, 4.5f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-9.0f)
                lineTo(12.0f, 5.5f)
                moveTo(12.0f, 3.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 3.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(11.5f, 9.5f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(11.5f)
                close()
                moveTo(13.0f, 11.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.5f)
                curveTo(13.9f, 9.5f, 13.0f, 10.4f, 13.0f, 11.5f)
                close()
            }
        }
        .build()
        return _foodBank!!
    }

private var _foodBank: ImageVector? = null
