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

public val MaterialDesignIcons.FormatTextRotationAngleDown: ImageVector
    get() {
        if (_formatTextRotationAngleDown != null) {
            return _formatTextRotationAngleDown!!
        }
        _formatTextRotationAngleDown = Builder(name = "FormatTextRotationAngleDown", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 21.0f)
                horizontalLineTo(10.03f)
                lineTo(11.44f, 19.59f)
                lineTo(2.58f, 10.73f)
                lineTo(4.03f, 9.33f)
                lineTo(12.84f, 18.19f)
                lineTo(14.25f, 16.78f)
                moveTo(12.61f, 8.0f)
                lineTo(15.23f, 10.64f)
                lineTo(17.43f, 5.77f)
                moveTo(19.41f, 4.92f)
                lineTo(14.95f, 16.03f)
                lineTo(13.5f, 14.58f)
                lineTo(14.39f, 12.38f)
                lineTo(10.88f, 8.81f)
                lineTo(8.68f, 9.75f)
                lineTo(7.22f, 8.25f)
                lineTo(18.33f, 3.84f)
                close()
            }
        }
        .build()
        return _formatTextRotationAngleDown!!
    }

private var _formatTextRotationAngleDown: ImageVector? = null
