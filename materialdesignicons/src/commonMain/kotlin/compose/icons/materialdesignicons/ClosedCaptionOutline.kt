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

public val MaterialDesignIcons.ClosedCaptionOutline: ImageVector
    get() {
        if (_closedCaptionOutline != null) {
            return _closedCaptionOutline!!
        }
        _closedCaptionOutline = Builder(name = "ClosedCaptionOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                curveTo(4.45f, 4.0f, 4.0f, 4.18f, 3.59f, 4.57f)
                curveTo(3.2f, 4.96f, 3.0f, 5.44f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 18.56f, 3.2f, 19.04f, 3.59f, 19.43f)
                curveTo(4.0f, 19.82f, 4.45f, 20.0f, 5.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5f, 20.0f, 20.0f, 19.81f, 20.39f, 19.41f)
                curveTo(20.8f, 19.0f, 21.0f, 18.53f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 5.47f, 20.8f, 5.0f, 20.39f, 4.59f)
                curveTo(20.0f, 4.19f, 19.5f, 4.0f, 19.0f, 4.0f)
                horizontalLineTo(5.0f)
                moveTo(4.5f, 5.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(5.5f)
                moveTo(7.0f, 9.0f)
                curveTo(6.7f, 9.0f, 6.47f, 9.09f, 6.28f, 9.28f)
                curveTo(6.09f, 9.47f, 6.0f, 9.7f, 6.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 14.3f, 6.09f, 14.53f, 6.28f, 14.72f)
                curveTo(6.47f, 14.91f, 6.7f, 15.0f, 7.0f, 15.0f)
                horizontalLineTo(10.0f)
                curveTo(10.27f, 15.0f, 10.5f, 14.91f, 10.71f, 14.72f)
                curveTo(10.91f, 14.53f, 11.0f, 14.3f, 11.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                curveTo(11.0f, 9.7f, 10.91f, 9.47f, 10.71f, 9.28f)
                curveTo(10.5f, 9.09f, 10.27f, 9.0f, 10.0f, 9.0f)
                horizontalLineTo(7.0f)
                moveTo(14.0f, 9.0f)
                curveTo(13.73f, 9.0f, 13.5f, 9.09f, 13.29f, 9.28f)
                curveTo(13.09f, 9.47f, 13.0f, 9.7f, 13.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(13.0f, 14.3f, 13.09f, 14.53f, 13.29f, 14.72f)
                curveTo(13.5f, 14.91f, 13.73f, 15.0f, 14.0f, 15.0f)
                horizontalLineTo(17.0f)
                curveTo(17.3f, 15.0f, 17.53f, 14.91f, 17.72f, 14.72f)
                curveTo(17.91f, 14.53f, 18.0f, 14.3f, 18.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 9.7f, 17.91f, 9.47f, 17.72f, 9.28f)
                curveTo(17.53f, 9.09f, 17.3f, 9.0f, 17.0f, 9.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _closedCaptionOutline!!
    }

private var _closedCaptionOutline: ImageVector? = null
