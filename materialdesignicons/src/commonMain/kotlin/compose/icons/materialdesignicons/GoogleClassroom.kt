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

public val MaterialDesignIcons.GoogleClassroom: ImageVector
    get() {
        if (_googleClassroom != null) {
            return _googleClassroom!!
        }
        _googleClassroom = Builder(name = "GoogleClassroom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 2.0f)
                horizontalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 22.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 21.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 2.0f)
                moveTo(22.0f, 20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                moveTo(10.29f, 9.71f)
                arcTo(1.71f, 1.71f, 0.0f, false, true, 12.0f, 8.0f)
                curveTo(12.95f, 8.0f, 13.71f, 8.77f, 13.71f, 9.71f)
                curveTo(13.71f, 10.66f, 12.95f, 11.43f, 12.0f, 11.43f)
                curveTo(11.05f, 11.43f, 10.29f, 10.66f, 10.29f, 9.71f)
                moveTo(5.71f, 11.29f)
                curveTo(5.71f, 10.58f, 6.29f, 10.0f, 7.0f, 10.0f)
                arcTo(1.29f, 1.29f, 0.0f, false, true, 8.29f, 11.29f)
                curveTo(8.29f, 12.0f, 7.71f, 12.57f, 7.0f, 12.57f)
                curveTo(6.29f, 12.57f, 5.71f, 12.0f, 5.71f, 11.29f)
                moveTo(15.71f, 11.29f)
                arcTo(1.29f, 1.29f, 0.0f, false, true, 17.0f, 10.0f)
                arcTo(1.29f, 1.29f, 0.0f, false, true, 18.29f, 11.29f)
                curveTo(18.29f, 12.0f, 17.71f, 12.57f, 17.0f, 12.57f)
                curveTo(16.29f, 12.57f, 15.71f, 12.0f, 15.71f, 11.29f)
                moveTo(20.0f, 15.14f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                lineTo(14.0f, 16.0f)
                horizontalLineTo(10.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.14f)
                curveTo(4.0f, 14.2f, 5.55f, 13.43f, 7.0f, 13.43f)
                curveTo(7.55f, 13.43f, 8.11f, 13.54f, 8.6f, 13.73f)
                curveTo(9.35f, 13.04f, 10.7f, 12.57f, 12.0f, 12.57f)
                curveTo(13.3f, 12.57f, 14.65f, 13.04f, 15.4f, 13.73f)
                curveTo(15.89f, 13.54f, 16.45f, 13.43f, 17.0f, 13.43f)
                curveTo(18.45f, 13.43f, 20.0f, 14.2f, 20.0f, 15.14f)
                close()
            }
        }
        .build()
        return _googleClassroom!!
    }

private var _googleClassroom: ImageVector? = null
