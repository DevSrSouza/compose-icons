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

public val MaterialDesignIcons.SelectionMultiple: ImageVector
    get() {
        if (_selectionMultiple != null) {
            return _selectionMultiple!!
        }
        _selectionMultiple = Builder(name = "SelectionMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                moveTo(6.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 4.89f, 6.9f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                moveTo(8.0f, 18.0f)
                curveTo(6.89f, 18.0f, 6.0f, 17.1f, 6.0f, 16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                moveTo(18.0f, 4.0f)
                curveTo(19.11f, 4.0f, 20.0f, 4.9f, 20.0f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                moveTo(15.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                moveTo(20.0f, 16.0f)
                curveTo(20.0f, 17.11f, 19.1f, 18.0f, 18.0f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                moveTo(3.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                curveTo(16.0f, 21.54f, 15.57f, 22.0f, 15.03f, 22.0f)
                horizontalLineTo(15.0f)
                lineTo(3.0f, 22.0f)
                curveTo(2.45f, 22.0f, 2.0f, 21.55f, 2.0f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 8.45f, 2.45f, 8.0f, 3.0f, 8.0f)
                close()
            }
        }
        .build()
        return _selectionMultiple!!
    }

private var _selectionMultiple: ImageVector? = null
