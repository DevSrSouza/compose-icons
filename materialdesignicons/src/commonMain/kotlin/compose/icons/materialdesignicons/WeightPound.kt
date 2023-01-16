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

public val MaterialDesignIcons.WeightPound: ImageVector
    get() {
        if (_weightPound != null) {
            return _weightPound!!
        }
        _weightPound = Builder(name = "WeightPound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 7.0f)
                curveTo(16.0f, 7.73f, 15.81f, 8.41f, 15.46f, 9.0f)
                horizontalLineTo(18.0f)
                curveTo(18.95f, 9.0f, 19.75f, 9.67f, 19.95f, 10.56f)
                curveTo(21.96f, 18.57f, 22.0f, 18.78f, 22.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 19.0f)
                curveTo(2.0f, 18.78f, 2.04f, 18.57f, 4.05f, 10.56f)
                curveTo(4.25f, 9.67f, 5.05f, 9.0f, 6.0f, 9.0f)
                horizontalLineTo(8.54f)
                curveTo(8.19f, 8.41f, 8.0f, 7.73f, 8.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 3.0f)
                moveTo(12.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 5.0f)
                moveTo(6.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 19.0f, 18.0f, 18.11f, 18.0f, 17.0f)
                verticalLineTo(16.5f)
                curveTo(18.0f, 15.93f, 17.75f, 15.38f, 17.32f, 15.0f)
                curveTo(17.75f, 14.62f, 18.0f, 14.07f, 18.0f, 13.5f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 11.89f, 17.11f, 11.0f, 16.0f, 11.0f)
                horizontalLineTo(13.0f)
                moveTo(15.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                moveTo(15.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _weightPound!!
    }

private var _weightPound: ImageVector? = null
