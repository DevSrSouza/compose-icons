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

public val MaterialDesignIcons.Cordova: ImageVector
    get() {
        if (_cordova != null) {
            return _cordova!!
        }
        _cordova = Builder(name = "Cordova", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.18f, 21.55f)
                horizontalLineTo(16.94f)
                lineTo(17.17f, 18.82f)
                horizontalLineTo(15.58f)
                lineTo(15.35f, 21.55f)
                horizontalLineTo(8.65f)
                lineTo(8.42f, 18.82f)
                horizontalLineTo(6.83f)
                lineTo(7.06f, 21.55f)
                horizontalLineTo(3.82f)
                lineTo(2.0f, 9.73f)
                lineTo(6.55f, 2.45f)
                horizontalLineTo(17.45f)
                lineTo(22.0f, 9.73f)
                lineTo(20.18f, 21.55f)
                moveTo(16.55f, 6.09f)
                horizontalLineTo(13.62f)
                lineTo(13.82f, 7.45f)
                horizontalLineTo(10.18f)
                lineTo(10.38f, 6.09f)
                horizontalLineTo(7.45f)
                lineTo(5.64f, 9.73f)
                lineTo(6.55f, 17.0f)
                horizontalLineTo(17.45f)
                lineTo(18.36f, 9.73f)
                lineTo(16.55f, 6.09f)
                moveTo(14.95f, 14.59f)
                curveTo(14.7f, 14.59f, 14.5f, 13.83f, 14.5f, 12.9f)
                curveTo(14.5f, 11.96f, 14.7f, 11.2f, 14.95f, 11.2f)
                curveTo(15.21f, 11.2f, 15.41f, 11.96f, 15.41f, 12.9f)
                curveTo(15.41f, 13.83f, 15.21f, 14.59f, 14.95f, 14.59f)
                moveTo(9.22f, 14.73f)
                curveTo(8.96f, 14.73f, 8.76f, 13.97f, 8.76f, 13.04f)
                curveTo(8.76f, 12.1f, 8.96f, 11.35f, 9.22f, 11.35f)
                curveTo(9.47f, 11.35f, 9.67f, 12.1f, 9.67f, 13.04f)
                curveTo(9.67f, 13.97f, 9.47f, 14.73f, 9.22f, 14.73f)
                close()
            }
        }
        .build()
        return _cordova!!
    }

private var _cordova: ImageVector? = null
