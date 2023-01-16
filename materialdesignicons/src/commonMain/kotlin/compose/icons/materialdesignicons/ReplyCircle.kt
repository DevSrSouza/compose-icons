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

public val MaterialDesignIcons.ReplyCircle: ImageVector
    get() {
        if (_replyCircle != null) {
            return _replyCircle!!
        }
        _replyCircle = Builder(name = "ReplyCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.5f, 2.0f, 12.0f)
                moveTo(5.0f, 11.0f)
                lineTo(10.0f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(15.06f, 9.73f, 17.28f, 13.33f, 18.0f, 17.0f)
                curveTo(16.19f, 14.43f, 13.61f, 13.0f, 10.0f, 13.0f)
                verticalLineTo(16.0f)
                lineTo(5.0f, 11.0f)
                close()
            }
        }
        .build()
        return _replyCircle!!
    }

private var _replyCircle: ImageVector? = null
