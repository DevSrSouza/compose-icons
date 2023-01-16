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

public val MaterialDesignIcons.RecordRec: ImageVector
    get() {
        if (_recordRec != null) {
            return _recordRec!!
        }
        _recordRec = Builder(name = "RecordRec", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 5.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 5.0f, 12.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 12.5f, 20.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 20.0f, 12.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 12.5f, 5.0f)
                moveTo(7.0f, 10.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 11.0f)
                verticalLineTo(12.0f)
                curveTo(10.0f, 12.5f, 9.62f, 12.9f, 9.14f, 12.97f)
                lineTo(10.31f, 15.0f)
                horizontalLineTo(9.15f)
                lineTo(8.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                moveTo(12.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 14.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 10.0f)
                moveTo(16.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 14.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 10.0f)
                moveTo(8.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
            }
        }
        .build()
        return _recordRec!!
    }

private var _recordRec: ImageVector? = null
