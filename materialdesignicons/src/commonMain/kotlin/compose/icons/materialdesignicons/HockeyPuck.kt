package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.HockeyPuck: ImageVector
    get() {
        if (_hockeyPuck != null) {
            return _hockeyPuck!!
        }
        _hockeyPuck = Builder(name = "HockeyPuck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(6.5f, 5.0f, 2.0f, 6.57f, 2.0f, 8.5f)
                curveTo(2.0f, 10.43f, 6.5f, 12.0f, 12.0f, 12.0f)
                curveTo(17.5f, 12.0f, 22.0f, 10.43f, 22.0f, 8.5f)
                curveTo(22.0f, 6.57f, 17.5f, 5.0f, 12.0f, 5.0f)
                moveTo(2.0f, 11.76f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 18.43f, 6.5f, 20.0f, 12.0f, 20.0f)
                curveTo(17.5f, 20.0f, 22.0f, 18.43f, 22.0f, 16.5f)
                verticalLineTo(11.76f)
                curveTo(21.33f, 12.22f, 20.58f, 12.57f, 19.73f, 12.86f)
                curveTo(17.62f, 13.6f, 14.95f, 14.0f, 12.0f, 14.0f)
                curveTo(9.05f, 14.0f, 6.38f, 13.6f, 4.27f, 12.86f)
                curveTo(3.42f, 12.57f, 2.67f, 12.22f, 2.0f, 11.76f)
                close()
            }
        }
        .build()
        return _hockeyPuck!!
    }

private var _hockeyPuck: ImageVector? = null
