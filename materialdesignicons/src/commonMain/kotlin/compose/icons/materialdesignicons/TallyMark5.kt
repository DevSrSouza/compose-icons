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

public val MaterialDesignIcons.TallyMark5: ImageVector
    get() {
        if (_tallyMark5 != null) {
            return _tallyMark5!!
        }
        _tallyMark5 = Builder(name = "TallyMark5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.73f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.36f)
                lineTo(15.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.62f)
                lineTo(11.0f, 13.26f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.89f)
                lineTo(7.0f, 14.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.15f)
                lineTo(2.57f, 15.92f)
                lineTo(2.0f, 14.0f)
                lineTo(5.0f, 13.05f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.42f)
                lineTo(9.0f, 11.79f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.16f)
                lineTo(13.0f, 10.53f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.9f)
                lineTo(17.0f, 9.26f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.63f)
                lineTo(21.0f, 8.0f)
                lineTo(21.57f, 9.92f)
                lineTo(19.0f, 10.73f)
                close()
            }
        }
        .build()
        return _tallyMark5!!
    }

private var _tallyMark5: ImageVector? = null
