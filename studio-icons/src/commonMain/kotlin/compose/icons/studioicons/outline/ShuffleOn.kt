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

public val OutlineGroup.ShuffleOn: ImageVector
    get() {
        if (_shuffleOn != null) {
            return _shuffleOn!!
        }
        _shuffleOn = Builder(name = "ShuffleOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(23.0f, 1.9f, 22.1f, 1.0f, 21.0f, 1.0f)
                close()
                moveTo(5.41f, 4.0f)
                lineToRelative(5.18f, 5.17f)
                lineToRelative(-1.41f, 1.42f)
                lineTo(4.0f, 5.42f)
                lineTo(5.41f, 4.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.61f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(3.13f, 3.13f)
                lineTo(18.0f, 16.55f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(20.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.42f)
                lineTo(5.41f, 20.0f)
                lineTo(4.0f, 18.59f)
                lineTo(16.58f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _shuffleOn!!
    }

private var _shuffleOn: ImageVector? = null
