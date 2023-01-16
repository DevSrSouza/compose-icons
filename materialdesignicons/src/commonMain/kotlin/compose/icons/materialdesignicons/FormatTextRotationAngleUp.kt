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

public val MaterialDesignIcons.FormatTextRotationAngleUp: ImageVector
    get() {
        if (_formatTextRotationAngleUp != null) {
            return _formatTextRotationAngleUp!!
        }
        _formatTextRotationAngleUp = Builder(name = "FormatTextRotationAngleUp", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.58f, 9.33f)
                verticalLineTo(13.55f)
                lineTo(19.17f, 12.14f)
                lineTo(10.31f, 21.0f)
                lineTo(8.91f, 19.59f)
                lineTo(17.72f, 10.73f)
                lineTo(16.31f, 9.33f)
                moveTo(7.59f, 11.0f)
                lineTo(10.22f, 8.39f)
                lineTo(5.34f, 6.14f)
                moveTo(4.5f, 4.22f)
                lineTo(15.61f, 8.63f)
                lineTo(14.16f, 10.13f)
                lineTo(11.96f, 9.19f)
                lineTo(8.39f, 12.75f)
                lineTo(9.33f, 14.91f)
                lineTo(7.83f, 16.41f)
                lineTo(3.42f, 5.25f)
                close()
            }
        }
        .build()
        return _formatTextRotationAngleUp!!
    }

private var _formatTextRotationAngleUp: ImageVector? = null
