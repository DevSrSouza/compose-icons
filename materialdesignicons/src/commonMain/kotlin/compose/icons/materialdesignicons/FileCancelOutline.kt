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

public val MaterialDesignIcons.FileCancelOutline: ImageVector
    get() {
        if (_fileCancelOutline != null) {
            return _fileCancelOutline!!
        }
        _fileCancelOutline = Builder(name = "FileCancelOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                moveTo(11.5f, 10.0f)
                curveTo(14.0f, 10.0f, 16.0f, 12.0f, 16.0f, 14.5f)
                curveTo(16.0f, 17.0f, 14.0f, 19.0f, 11.5f, 19.0f)
                curveTo(9.0f, 19.0f, 7.0f, 17.0f, 7.0f, 14.5f)
                curveTo(7.0f, 12.0f, 9.0f, 10.0f, 11.5f, 10.0f)
                moveTo(11.5f, 11.5f)
                curveTo(10.94f, 11.5f, 10.42f, 11.65f, 10.0f, 11.92f)
                lineTo(14.08f, 16.0f)
                curveTo(14.35f, 15.58f, 14.5f, 15.06f, 14.5f, 14.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.5f, 11.5f)
                moveTo(8.5f, 14.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.5f, 17.5f)
                curveTo(12.06f, 17.5f, 12.58f, 17.35f, 13.0f, 17.08f)
                lineTo(8.92f, 13.0f)
                curveTo(8.65f, 13.42f, 8.5f, 13.94f, 8.5f, 14.5f)
                close()
            }
        }
        .build()
        return _fileCancelOutline!!
    }

private var _fileCancelOutline: ImageVector? = null
