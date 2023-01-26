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

public val OutlineGroup.NoFood: ImageVector
    get() {
        if (_noFood != null) {
            return _noFood!!
        }
        _noFood = Builder(name = "NoFood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 21.0f)
                horizontalLineToRelative(15.01f)
                verticalLineToRelative(0.98f)
                curveToRelative(0.0f, 0.56f, -0.45f, 1.01f, -1.01f, 1.01f)
                horizontalLineTo(2.01f)
                curveTo(1.45f, 22.99f, 1.0f, 22.54f, 1.0f, 21.98f)
                verticalLineTo(21.0f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(16.0f, 18.83f)
                verticalLineTo(19.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(13.17f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(1.0f)
                curveToRelative(0.0f, -3.24f, 2.46f, -5.17f, 5.38f, -5.79f)
                lineToRelative(-5.7f, -5.7f)
                lineTo(2.1f, 2.1f)
                lineTo(13.0f, 13.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(6.9f, 6.9f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(10.17f, 13.0f)
                lineToRelative(-2.0f, -2.0f)
                curveToRelative(-1.42f, 0.06f, -3.52f, 0.56f, -4.55f, 2.0f)
                horizontalLineTo(10.17f)
                close()
                moveTo(23.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(0.23f, 2.0f)
                horizontalLineToRelative(9.56f)
                lineToRelative(-1.0f, 9.97f)
                lineToRelative(1.83f, 1.83f)
                lineTo(23.0f, 5.0f)
                close()
            }
        }
        .build()
        return _noFood!!
    }

private var _noFood: ImageVector? = null
