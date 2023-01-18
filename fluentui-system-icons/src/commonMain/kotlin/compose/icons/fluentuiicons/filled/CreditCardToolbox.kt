package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CreditCardToolbox: ImageVector
    get() {
        if (_creditCardToolbox != null) {
            return _creditCardToolbox!!
        }
        _creditCardToolbox = Builder(name = "CreditCardToolbox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.25f)
                curveTo(2.0f, 6.4551f, 3.4551f, 5.0f, 5.25f, 5.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 5.0f, 22.0f, 6.4551f, 22.0f, 8.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.25f)
                close()
                moveTo(15.75f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.75f)
                curveTo(2.0f, 17.5449f, 3.4551f, 19.0f, 5.25f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.25f)
                curveTo(11.0f, 15.0405f, 11.8589f, 14.0316f, 13.0f, 13.8f)
                verticalLineTo(13.75f)
                curveTo(13.0f, 12.2312f, 14.2312f, 11.0f, 15.75f, 11.0f)
                close()
                moveTo(13.5f, 14.75f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.75f)
                curveTo(14.0f, 12.7835f, 14.7835f, 12.0f, 15.75f, 12.0f)
                horizontalLineTo(19.25f)
                curveTo(20.2165f, 12.0f, 21.0f, 12.7835f, 21.0f, 13.75f)
                verticalLineTo(14.75f)
                horizontalLineTo(21.5f)
                curveTo(22.3284f, 14.75f, 23.0f, 15.4216f, 23.0f, 16.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.5f)
                curveTo(20.0f, 17.2239f, 19.7761f, 17.0f, 19.5f, 17.0f)
                curveTo(19.2239f, 17.0f, 19.0f, 17.2239f, 19.0f, 17.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.5f)
                curveTo(16.0f, 17.2239f, 15.7761f, 17.0f, 15.5f, 17.0f)
                curveTo(15.2239f, 17.0f, 15.0f, 17.2239f, 15.0f, 17.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.25f)
                curveTo(12.0f, 15.4216f, 12.6716f, 14.75f, 13.5f, 14.75f)
                close()
                moveTo(15.75f, 13.5f)
                curveTo(15.6119f, 13.5f, 15.5f, 13.6119f, 15.5f, 13.75f)
                verticalLineTo(14.75f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.75f)
                curveTo(19.5f, 13.6119f, 19.3881f, 13.5f, 19.25f, 13.5f)
                horizontalLineTo(15.75f)
                close()
                moveTo(19.0f, 19.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.5f)
                curveTo(16.0f, 19.7761f, 15.7761f, 20.0f, 15.5f, 20.0f)
                curveTo(15.2239f, 20.0f, 15.0f, 19.7761f, 15.0f, 19.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.5f)
                curveTo(12.0f, 22.3284f, 12.6716f, 23.0f, 13.5f, 23.0f)
                horizontalLineTo(21.5f)
                curveTo(22.3284f, 23.0f, 23.0f, 22.3284f, 23.0f, 21.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.5f)
                curveTo(20.0f, 19.7761f, 19.7761f, 20.0f, 19.5f, 20.0f)
                curveTo(19.2239f, 20.0f, 19.0f, 19.7761f, 19.0f, 19.5f)
                close()
            }
        }
        .build()
        return _creditCardToolbox!!
    }

private var _creditCardToolbox: ImageVector? = null
