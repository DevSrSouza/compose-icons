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

public val MaterialDesignIcons.ScrewRoundTop: ImageVector
    get() {
        if (_screwRoundTop != null) {
            return _screwRoundTop!!
        }
        _screwRoundTop = Builder(name = "ScrewRoundTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 17.0f)
                verticalLineTo(19.0f)
                lineTo(12.0f, 22.0f)
                lineTo(10.5f, 19.0f)
                lineTo(13.5f, 17.0f)
                moveTo(14.5f, 6.3f)
                lineTo(13.5f, 7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.0f)
                lineTo(9.5f, 9.7f)
                verticalLineTo(10.7f)
                lineTo(14.5f, 7.4f)
                verticalLineTo(6.3f)
                moveTo(14.5f, 10.3f)
                lineTo(13.5f, 11.0f)
                verticalLineTo(9.0f)
                lineTo(10.5f, 11.0f)
                verticalLineTo(13.0f)
                lineTo(9.5f, 13.7f)
                verticalLineTo(14.7f)
                lineTo(14.5f, 11.4f)
                verticalLineTo(10.3f)
                moveTo(14.5f, 14.3f)
                lineTo(13.5f, 15.0f)
                verticalLineTo(13.0f)
                lineTo(10.5f, 15.0f)
                verticalLineTo(17.0f)
                lineTo(9.5f, 17.7f)
                verticalLineTo(18.7f)
                lineTo(14.5f, 15.4f)
                verticalLineTo(14.3f)
                moveTo(7.0f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 5.0f, 16.0f, 2.0f, 12.0f, 2.0f)
                curveTo(8.0f, 2.0f, 7.0f, 5.0f, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _screwRoundTop!!
    }

private var _screwRoundTop: ImageVector? = null
