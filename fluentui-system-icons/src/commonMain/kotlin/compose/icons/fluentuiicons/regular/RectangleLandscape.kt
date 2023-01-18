package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.RectangleLandscape: ImageVector
    get() {
        if (_rectangleLandscape != null) {
            return _rectangleLandscape!!
        }
        _rectangleLandscape = Builder(name = "RectangleLandscape", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.4551f, 3.4551f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 4.0f, 22.0f, 5.4551f, 22.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.5449f, 20.5449f, 20.0f, 18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0f, 2.0f, 18.5449f, 2.0f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(5.25f, 5.5f)
                curveTo(4.2835f, 5.5f, 3.5f, 6.2835f, 3.5f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.7165f, 4.2835f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 18.5f, 20.5f, 17.7165f, 20.5f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(20.5f, 6.2835f, 19.7165f, 5.5f, 18.75f, 5.5f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _rectangleLandscape!!
    }

private var _rectangleLandscape: ImageVector? = null
