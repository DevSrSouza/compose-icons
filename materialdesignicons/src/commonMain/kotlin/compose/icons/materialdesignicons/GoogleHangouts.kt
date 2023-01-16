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

public val MaterialDesignIcons.GoogleHangouts: ImageVector
    get() {
        if (_googleHangouts != null) {
            return _googleHangouts!!
        }
        _googleHangouts = Builder(name = "GoogleHangouts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                lineTo(14.0f, 13.0f)
                horizontalLineTo(12.5f)
                lineTo(13.5f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 11.0f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(8.5f)
                lineTo(9.5f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                moveTo(11.5f, 2.0f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 3.0f, 10.5f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 11.5f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(22.5f)
                curveTo(16.86f, 20.15f, 20.0f, 15.0f, 20.0f, 10.5f)
                curveTo(20.0f, 5.8f, 16.19f, 2.0f, 11.5f, 2.0f)
                close()
            }
        }
        .build()
        return _googleHangouts!!
    }

private var _googleHangouts: ImageVector? = null
