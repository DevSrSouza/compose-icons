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

public val MaterialDesignIcons.ClipboardFlowOutline: ImageVector
    get() {
        if (_clipboardFlowOutline != null) {
            return _clipboardFlowOutline!!
        }
        _clipboardFlowOutline = Builder(name = "ClipboardFlowOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                moveTo(12.0f, 3.0f)
                curveTo(12.55f, 3.0f, 13.0f, 3.45f, 13.0f, 4.0f)
                reflectiveCurveTo(12.55f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(11.0f, 4.55f, 11.0f, 4.0f)
                reflectiveCurveTo(11.45f, 3.0f, 12.0f, 3.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                moveTo(10.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                lineTo(9.0f, 8.0f)
                lineTo(12.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                moveTo(14.0f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(12.0f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _clipboardFlowOutline!!
    }

private var _clipboardFlowOutline: ImageVector? = null
