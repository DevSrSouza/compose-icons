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

public val MaterialDesignIcons.EmoticonSick: ImageVector
    get() {
        if (_emoticonSick != null) {
            return _emoticonSick!!
        }
        _emoticonSick = Builder(name = "EmoticonSick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                curveTo(19.9f, 9.0f, 19.0f, 8.1f, 19.0f, 7.0f)
                reflectiveCurveTo(21.0f, 3.0f, 21.0f, 3.0f)
                reflectiveCurveTo(23.0f, 5.9f, 23.0f, 7.0f)
                reflectiveCurveTo(22.1f, 9.0f, 21.0f, 9.0f)
                moveTo(17.5f, 7.0f)
                curveTo(17.5f, 6.27f, 17.91f, 5.29f, 18.42f, 4.34f)
                curveTo(16.68f, 2.88f, 14.44f, 2.0f, 12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.47f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5f, 22.0f, 22.0f, 17.5f, 22.0f, 12.0f)
                curveTo(22.0f, 11.45f, 21.94f, 10.91f, 21.86f, 10.38f)
                curveTo(21.58f, 10.45f, 21.3f, 10.5f, 21.0f, 10.5f)
                curveTo(19.07f, 10.5f, 17.5f, 8.93f, 17.5f, 7.0f)
                moveTo(15.62f, 7.38f)
                lineTo(16.68f, 8.44f)
                lineTo(15.62f, 9.5f)
                lineTo(16.68f, 10.56f)
                lineTo(15.62f, 11.62f)
                lineTo(13.5f, 9.5f)
                lineTo(15.62f, 7.38f)
                moveTo(7.32f, 8.44f)
                lineTo(8.38f, 7.38f)
                lineTo(10.5f, 9.5f)
                lineTo(8.38f, 11.62f)
                lineTo(7.32f, 10.56f)
                lineTo(8.38f, 9.5f)
                lineTo(7.32f, 8.44f)
                moveTo(15.44f, 17.0f)
                curveTo(14.75f, 15.81f, 13.47f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(9.25f, 15.81f, 8.56f, 17.0f)
                horizontalLineTo(6.88f)
                curveTo(7.18f, 16.24f, 7.64f, 15.57f, 8.22f, 15.0f)
                lineTo(5.24f, 13.3f)
                curveTo(4.79f, 13.56f, 4.23f, 13.58f, 3.75f, 13.3f)
                curveTo(3.03f, 12.89f, 2.79f, 11.97f, 3.2f, 11.25f)
                reflectiveCurveTo(4.53f, 10.29f, 5.25f, 10.7f)
                curveTo(5.73f, 11.0f, 6.0f, 11.5f, 6.0f, 12.0f)
                lineTo(9.57f, 14.06f)
                curveTo(10.3f, 13.7f, 11.12f, 13.5f, 12.0f, 13.5f)
                curveTo(14.33f, 13.5f, 16.32f, 14.95f, 17.12f, 17.0f)
                horizontalLineTo(15.44f)
                close()
            }
        }
        .build()
        return _emoticonSick!!
    }

private var _emoticonSick: ImageVector? = null
