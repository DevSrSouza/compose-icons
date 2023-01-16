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

public val MaterialDesignIcons.StretchToPageOutline: ImageVector
    get() {
        if (_stretchToPageOutline != null) {
            return _stretchToPageOutline!!
        }
        _stretchToPageOutline = Builder(name = "StretchToPageOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 2.0f, 2.0f, 2.89f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.89f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.89f, 21.11f, 2.0f, 20.0f, 2.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                moveTo(8.83f, 10.25f)
                lineTo(7.29f, 8.71f)
                lineTo(6.0f, 10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                lineTo(8.71f, 7.29f)
                lineTo(10.25f, 8.83f)
                moveTo(13.75f, 8.83f)
                lineTo(15.29f, 7.29f)
                lineTo(14.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                lineTo(16.71f, 8.71f)
                lineTo(15.17f, 10.25f)
                moveTo(15.17f, 13.75f)
                lineTo(16.71f, 15.29f)
                lineTo(18.0f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                lineTo(15.29f, 16.71f)
                lineTo(13.75f, 15.17f)
                moveTo(10.25f, 15.17f)
                lineTo(8.71f, 16.71f)
                lineTo(10.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                lineTo(7.29f, 15.29f)
                lineTo(8.83f, 13.75f)
            }
        }
        .build()
        return _stretchToPageOutline!!
    }

private var _stretchToPageOutline: ImageVector? = null
