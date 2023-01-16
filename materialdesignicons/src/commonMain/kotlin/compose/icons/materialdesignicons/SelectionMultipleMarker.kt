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

public val MaterialDesignIcons.SelectionMultipleMarker: ImageVector
    get() {
        if (_selectionMultipleMarker != null) {
            return _selectionMultipleMarker!!
        }
        _selectionMultipleMarker = Builder(name = "SelectionMultipleMarker", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 4.45f, 6.45f, 4.0f, 7.0f, 4.0f)
                moveTo(19.0f, 4.0f)
                curveTo(19.55f, 4.0f, 20.0f, 4.45f, 20.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                moveTo(11.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 18.0f)
                curveTo(6.45f, 18.0f, 6.0f, 17.55f, 6.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                moveTo(6.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                moveTo(3.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.58f)
                lineTo(16.03f, 22.0f)
                lineTo(3.0f, 22.0f)
                curveTo(2.45f, 22.0f, 2.0f, 21.55f, 2.0f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 8.45f, 2.45f, 8.0f, 3.0f, 8.0f)
                moveTo(18.5f, 12.0f)
                curveTo(20.4f, 12.0f, 22.0f, 13.6f, 22.0f, 15.5f)
                curveTo(22.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                curveTo(18.5f, 22.0f, 15.0f, 18.1f, 15.0f, 15.5f)
                curveTo(15.0f, 13.6f, 16.6f, 12.0f, 18.5f, 12.0f)
                moveTo(18.5f, 16.8f)
                curveTo(19.2f, 16.8f, 19.8f, 16.2f, 19.7f, 15.6f)
                curveTo(19.7f, 15.0f, 19.1f, 14.4f, 18.5f, 14.4f)
                curveTo(17.9f, 14.4f, 17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                moveTo(11.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                curveTo(13.09f, 16.66f, 13.27f, 17.33f, 13.5f, 18.0f)
                horizontalLineTo(11.0f)
                moveTo(20.0f, 9.0f)
                verticalLineTo(10.23f)
                curveTo(19.5f, 10.08f, 19.0f, 10.0f, 18.5f, 10.0f)
                lineTo(18.0f, 10.03f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _selectionMultipleMarker!!
    }

private var _selectionMultipleMarker: ImageVector? = null
