package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.WineBar: ImageVector
    get() {
        if (_wineBar != null) {
            return _wineBar!!
        }
        _wineBar = Builder(name = "WineBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineToRelative(0.0f, 6.0f)
                curveToRelative(0.0f, 2.97f, 2.16f, 5.43f, 5.0f, 5.91f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.09f)
                curveToRelative(2.84f, -0.48f, 5.0f, -2.94f, 5.0f, -5.91f)
                lineToRelative(0.0f, -6.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineTo(8.0f)
                lineToRelative(0.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                curveTo(16.0f, 5.0f, 16.0f, 8.0f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _wineBar!!
    }

private var _wineBar: ImageVector? = null
