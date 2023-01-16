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

public val MaterialDesignIcons.CheckbookArrowLeft: ImageVector
    get() {
        if (_checkbookArrowLeft != null) {
            return _checkbookArrowLeft!!
        }
        _checkbookArrowLeft = Builder(name = "CheckbookArrowLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 14.0f)
                horizontalLineTo(15.53f)
                curveTo(15.25f, 14.31f, 15.0f, 14.64f, 14.8f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                moveTo(21.0f, 8.0f)
                verticalLineTo(12.08f)
                curveTo(21.72f, 12.2f, 22.39f, 12.45f, 23.0f, 12.8f)
                verticalLineTo(5.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.08f)
                curveTo(14.03f, 18.68f, 14.0f, 18.34f, 14.0f, 18.0f)
                curveTo(14.0f, 17.66f, 14.03f, 17.33f, 14.08f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                moveTo(5.0f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                moveTo(16.0f, 18.0f)
                lineTo(19.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                lineTo(16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _checkbookArrowLeft!!
    }

private var _checkbookArrowLeft: ImageVector? = null
