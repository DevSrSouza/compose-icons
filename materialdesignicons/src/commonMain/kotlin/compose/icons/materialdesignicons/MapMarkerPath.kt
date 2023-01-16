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

public val MaterialDesignIcons.MapMarkerPath: ImageVector
    get() {
        if (_mapMarkerPath != null) {
            return _mapMarkerPath!!
        }
        _mapMarkerPath = Builder(name = "MapMarkerPath", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 21.0f)
                curveTo(16.69f, 21.0f, 15.58f, 20.17f, 15.17f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.17f)
                curveTo(15.58f, 15.83f, 16.69f, 15.0f, 18.0f, 15.0f)
                moveTo(18.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 17.0f)
                moveTo(18.0f, 8.0f)
                arcTo(1.43f, 1.43f, 0.0f, false, false, 19.43f, 6.57f)
                curveTo(19.43f, 5.78f, 18.79f, 5.14f, 18.0f, 5.14f)
                curveTo(17.21f, 5.14f, 16.57f, 5.78f, 16.57f, 6.57f)
                arcTo(1.43f, 1.43f, 0.0f, false, false, 18.0f, 8.0f)
                moveTo(18.0f, 2.57f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 6.57f)
                curveTo(22.0f, 9.56f, 18.0f, 14.0f, 18.0f, 14.0f)
                curveTo(18.0f, 14.0f, 14.0f, 9.56f, 14.0f, 6.57f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 2.57f)
                moveTo(8.83f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.83f)
                curveTo(8.42f, 20.17f, 7.31f, 21.0f, 6.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 18.0f)
                curveTo(3.0f, 16.69f, 3.83f, 15.58f, 5.0f, 15.17f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.17f)
                curveTo(7.85f, 15.47f, 8.53f, 16.15f, 8.83f, 17.0f)
                moveTo(6.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 17.0f)
                moveTo(6.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 6.0f)
                curveTo(9.0f, 7.31f, 8.17f, 8.42f, 7.0f, 8.83f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.83f)
                curveTo(3.83f, 8.42f, 3.0f, 7.31f, 3.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 3.0f)
                moveTo(6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.0f)
                moveTo(11.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _mapMarkerPath!!
    }

private var _mapMarkerPath: ImageVector? = null
