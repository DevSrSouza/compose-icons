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

public val MaterialDesignIcons.BullhornVariant: ImageVector
    get() {
        if (_bullhornVariant != null) {
            return _bullhornVariant!!
        }
        _bullhornVariant = Builder(name = "BullhornVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(4.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                lineTo(6.0f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(6.0f, 20.4f, 7.6f, 22.0f, 9.5f, 22.0f)
                reflectiveCurveTo(13.0f, 20.4f, 13.0f, 18.5f)
                verticalLineTo(18.3f)
                lineTo(20.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                moveTo(11.0f, 18.5f)
                curveTo(11.0f, 19.3f, 10.3f, 20.0f, 9.5f, 20.0f)
                reflectiveCurveTo(8.0f, 19.3f, 8.0f, 18.5f)
                verticalLineTo(17.0f)
                lineTo(11.0f, 17.8f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _bullhornVariant!!
    }

private var _bullhornVariant: ImageVector? = null
