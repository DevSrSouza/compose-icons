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

public val MaterialDesignIcons.PaperRollOutline: ImageVector
    get() {
        if (_paperRollOutline != null) {
            return _paperRollOutline!!
        }
        _paperRollOutline = Builder(name = "PaperRollOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                curveTo(5.69f, 3.0f, 3.14f, 5.69f, 3.0f, 9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.46f)
                curveTo(13.1f, 14.45f, 14.5f, 15.0f, 16.0f, 15.0f)
                curveTo(19.31f, 15.0f, 22.0f, 12.31f, 22.0f, 9.0f)
                curveTo(22.0f, 5.69f, 19.31f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 5.0f)
                horizontalLineTo(11.54f)
                curveTo(10.55f, 6.1f, 10.0f, 7.5f, 10.0f, 9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 6.79f, 6.79f, 5.0f, 9.0f, 5.0f)
                moveTo(16.0f, 5.0f)
                curveTo(18.21f, 5.0f, 20.0f, 6.79f, 20.0f, 9.0f)
                curveTo(20.0f, 11.21f, 18.21f, 13.0f, 16.0f, 13.0f)
                curveTo(13.79f, 13.0f, 12.0f, 11.21f, 12.0f, 9.0f)
                curveTo(12.0f, 6.79f, 13.79f, 5.0f, 16.0f, 5.0f)
                moveTo(16.0f, 7.25f)
                curveTo(15.03f, 7.25f, 14.25f, 8.03f, 14.25f, 9.0f)
                curveTo(14.25f, 9.97f, 15.03f, 10.75f, 16.0f, 10.75f)
                curveTo(16.97f, 10.75f, 17.75f, 9.97f, 17.75f, 9.0f)
                curveTo(17.75f, 8.03f, 16.97f, 7.25f, 16.0f, 7.25f)
                moveTo(7.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _paperRollOutline!!
    }

private var _paperRollOutline: ImageVector? = null
